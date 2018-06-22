package kit.codeAuto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author:porschan
 * @description:
 *
 * 读取配置文件,获取值
 *
 * @date: Created in 14:30 2018/6/22
 * @modified By:
 */

public class ConfigFile {
    protected static Logger logger = LoggerFactory.getLogger(ConfigFile.class);
    public static Properties getConfigFile(String FileName) {
        Properties prop = new Properties();
        try {
            InputStream inputStream = ConfigFile.class.getClass().getResourceAsStream("/"+FileName);
            if(inputStream!=null){//打包到jar里面使用
                prop.load(inputStream);
            }else { //WEB 使用 当前项目根路径
                String realPath = ConfigFile.class.getClassLoader().getResource("").getFile();
                prop.load(new FileInputStream(realPath + "/" + FileName));
            }
            return prop;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
