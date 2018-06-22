package kit.codeAuto;

import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author:porschan
 * @description:
 *
 * 自动生成model类
 *
 * @date: Created in 14:21 2018/6/22
 * @modified By:
 */

public class ModelAutoMaker {
    protected static Logger logger = LoggerFactory.getLogger(ModelAutoMaker.class);
    /**
     * 自动生成 model 的数据库位置
     * @return
     */
    public static DataSource getDataSource() {
        Properties config = ConfigFile.getConfigFile("config.cfg");
        //组成数据库连接
        String jdbcUrl = "jdbc:mysql://" + config.getProperty("db.server") + ":" + config.getProperty("db.port") + "/" + config.getProperty("db.name") + "?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false";

        String username = config.getProperty("db.user");
        String password = config.getProperty("db.passwd");
        String driver = "com.mysql.jdbc.Driver";
        C3p0Plugin cp = new C3p0Plugin(jdbcUrl, username, password, driver);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(jdbcUrl, username, password);
        } catch (Exception e) {
            logger.info("第一个数据库连接发生异常,使用地二个" + e.getMessage());
            jdbcUrl = "jdbc:mysql://" + config.getProperty("db.server2") + ":" + config.getProperty("db.port2") + "/" + config.getProperty("db.name2") + "?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false";
            username = config.getProperty("db.user2");
            password = config.getProperty("db.passwd2");
            cp = new C3p0Plugin(jdbcUrl, username, password, driver);
        }
        cp.setMaxIdleTime(Integer.MAX_VALUE);//最大空闲时间,25000 秒内未使用则连接被丢弃。若为 0 则永不丢弃。
        cp.setInitialPoolSize(20);//初始化时获取三个连接，取值应在 minPoolSize 与 maxPoolSize 之间
        cp.setMaxPoolSize(20);//连接池中保留的最大连接数
        cp.setAcquireIncrement(2);//当连接池中的连接耗尽的时候 c3p0 一次同时获取的连接数。
        cp.start();
        return cp.getDataSource();
    }

    /**
     * 执行自动生成 model
     * @param args
     */
    public static void main(String[] args) {
        // base model 所使用的包名
        String baseModelPackageName = "model.base";
        String srcPath= PathKit.getWebRootPath() + "\\src\\main\\java";
//        String srcPath= PathKit.getWebRootPath().substring(0, PathKit.getWebRootPath().indexOf("out"))+"src";
        // base model 文件保存路径
        String baseModelOutputDir =srcPath + "/model/base";
        logger.info(baseModelOutputDir);
        // model 所使用的包名 (MappingKit 默认使用的包名)
        String modelPackageName = "model";
        // model 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
        String modelOutputDir = baseModelOutputDir.substring(0,baseModelOutputDir.indexOf("base"));
        // 创建生成器
        Generator gernerator = new Generator(getDataSource(), baseModelPackageName, baseModelOutputDir, modelPackageName, modelOutputDir);
        // 设置数据库方言
        gernerator.setDialect(new MysqlDialect());
        // 添加不需要生成的表名
        gernerator.addExcludedTable("adv");
        // 设置是否在 Model 中生成 dao 对象
        gernerator.setGenerateDaoInModel(true);
        // 设置是否生成字典文件
        gernerator.setGenerateDataDictionary(false);
        // 设置需要被移除的表名前缀用于生成modelName。例如表名 "osc_user"，移除前缀 "osc_"后生成的model名为 "User"而非 OscUser
        //gernerator.setRemovedTableNamePrefixes("gch_");
        // 生成
        gernerator.generate();
    }
}
