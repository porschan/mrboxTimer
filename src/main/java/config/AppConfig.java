package config;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.cache.EhCache;
import com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.template.Engine;
import controller.HelloController;
import kit.codeAuto.ConfigFile;
import model._MappingKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import task.MyTask;
import task.PortTask;

import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @author:porschan
 * @description:
 * @date: Created in 14:36 2018/6/20
 * @modified By:
 */

public class AppConfig extends JFinalConfig{

    protected static Logger logger = LoggerFactory.getLogger(AppConfig.class);
    protected static Prop setting = PropKit.use("config.cfg");//读取配置文件

    //用于启动JFinal
    public static void main(String[] args) {
//        JFinal.start("src/main/webapp", 2018, "/", 5);
        JFinal.start("src/main/webapp", 2018, "/");
    }

    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }

    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {
//        String realPath = WebConfig.class.getClassLoader().getResource("").getFile();
//        me.add(new EhCachePlugin(realPath + "/ehcache.xml")); //使用缓存插件,提高访问webSite的速度
//        RedisPlugin redisPlugin = new RedisPlugin("bbs", "localhost");// 另外一种缓存,用于缓存bbs模块的redis服务
//        me.add(redisPlugin);
//        Properties config = ConfigFile.getConfigFile("config.cfg");
//        //组成数据库连接
//        String jdbcUrl = "jdbc:mysql://" + config.getProperty("db.server") + ":" + config.getProperty("db.port") + "/" + config.getProperty("db.name") + "?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
//        String username = config.getProperty("db.user");
//        String password = config.getProperty("db.passwd");
//        String driver = "com.mysql.jdbc.Driver";
//        C3p0Plugin cp = new C3p0Plugin(jdbcUrl, username, password, driver);
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            DriverManager.getConnection(jdbcUrl, username, password);
//        } catch (Exception e) {
//            logger.info("第一个数据库连接发生异常,使用地二个" + e.getMessage());
//            jdbcUrl = "jdbc:mysql://" + config.getProperty("db.server2") + ":" + config.getProperty("db.port2") + "/" + config.getProperty("db.name2") + "?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false";
//            username = config.getProperty("db.user2");
//            password = config.getProperty("db.passwd2");
//            cp = new C3p0Plugin(jdbcUrl, username, password, driver);
//        }
//        cp.setMaxIdleTime(Integer.MAX_VALUE);//最大空闲时间,25000 秒内未使用则连接被丢弃。若为 0 则永不丢弃。
//        cp.setInitialPoolSize(20);//初始化时获取三个连接，取值应在 minPoolSize 与 maxPoolSize 之间
//        cp.setMaxPoolSize(20);//连接池中保留的最大连接数
//        cp.setAcquireIncrement(2);//当连接池中的连接耗尽的时候 c3p0 一次同时获取的连接数。
//        cp.setDriverClass(driver);
//
//        me.add(cp);
//        ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
//        _MappingKit.mapping(arp);
//        me.add(arp);
//        arp.setCache(new EhCache());
//        arp.setDialect(new AnsiSqlDialect());// 关键：使用AnsiSqlDialect
//        arp.setShowSql(true);// 是/否显示sql语句


        System.out.println("run cron4jPlugin");

        Cron4jPlugin cpTask = new Cron4jPlugin();
//        cpTask.addTask("0-59/1 * * * *", new MyTask(
        cpTask.addTask("30 * * * *", new PortTask());
        me.add(cpTask);
    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
