package kit.alertKit;

import com.jfinal.plugin.activerecord.Record;
import kit.httpKit.HttpClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.UUID;

/**
 * @author:porschan
 * @description:
 * @date: Created in 10:25 2018/7/27
 * @modified By:
 */

public class oneAlert {
    protected static Logger logger = LoggerFactory.getLogger(oneAlert.class);
    private static HttpClient httpClient = new HttpClient();

    public static void info(String msg) {
        logger.info(msg);
    }

    //接口地址
    private static String apiUrl = "http://api.onealert.com/alert/api/event";

    /*
    * URL参数方式
    *   参数	必须	备注
        app	必须	需要告警集成的应用KEY
        eventType	必须	触发告警trigger，解决告警resolve
        alarmName	trigger必须, resolve可选	告警标题，故障简述
        eventId	必须	外部事件id，告警关闭时用到
        alarmContent	可选	告警详情
        entityName	可选	告警对象名
        entityId	可选	告警对象id
        priority	可选	提醒 1，警告 2，严重 3
        details	可选	详情
        contexts	可选	上下文
    * ?app=7e384a39-8383-18f0-355a-785a92c0b48d&eventType=trigger&alarmName=主机192.168.0.232 CPU使用率过高&eventId=21946515-9eb2-4078-813f-a8420baf0dab-7&alarmContent=主机cpu使用率90%，请持续观察，30分钟内没有降下来需要重点关注&entityName=HostY192.168.0.100&entityId=123456&priority=1
    * */

    //发送警告
    public static Record oneAlertSend(String alarmName, String eventId, String alarmContent, String entityName) throws JSONException, IOException {
        JSONObject json = new JSONObject();
        json.put("app", "7e384a39被你发现了,数据保密785a92c0b48d");//应用 Key
        json.put("alarmName",alarmName != null ? alarmName : "");
        json.put("eventId",eventId != null ? eventId : "");
        json.put("alarmContent",alarmContent != null ? alarmContent : "");
        json.put("entityName",entityName != null ? entityName : "");
        Record record = httpClient.post(apiUrl, json.toString());
        return record;
    }

    //微信获取不到key的告警
    public static void opAlertSend(){
        try {
            Record record = oneAlertSend("operate获取不到微信key", UUID.randomUUID().toString(), "[内容]operate获取不到微信key", "operate告警");
            logger.info(record.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //mrbox获取数据端口问题
    public static void portAlertSend(){
        try {
            Record record = oneAlertSend("mrbox获取数据端口问题", UUID.randomUUID().toString(), "[内容]mrbox项目端口(120.24.242.143:8680)无法访问", "mrbox告警");
            logger.info(record.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //mrbox获取数据端口问题 - 正常
    public static void portSuccessAlertSend(){
        try {
            Record record = oneAlertSend("mrbox获取数据端口问题正常", UUID.randomUUID().toString(), "[内容]mrbox项目端口(120.24.242.143:8680)能正常访问", "mrbox告警");
            logger.info(record.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //@Test
    public static void main(String[] args) {
        opAlertSend();
    }
}
