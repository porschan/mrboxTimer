package task;

import static kit.alertKit.oneAlert.portAlertSend;
import static kit.alertKit.oneAlert.portSuccessAlertSend;
import static kit.httpKit.CheckHttp.isHostConnectable;
import static kit.httpKit.CheckHttp.isHostReachable;

/**
 * @author:porschan
 * @description:
 * @date: Created in 14:27 2018/7/27
 * @modified By:
 */

public class PortTask implements Runnable {

    static Integer sendNumber = 0;

    @Override
    public void run() {

        boolean hostConnectable = isHostConnectable("120.24.242.146", 8680);
        boolean hostReachable = isHostReachable("120.24.242.146", 8680);

        if(!hostConnectable && hostReachable){
            if(sendNumber <= 5){
                portAlertSend();
            }
            sendNumber++;
        }

        if(hostConnectable && !hostReachable){
            if(sendNumber > 0){
                portSuccessAlertSend();
            }
            sendNumber = 0;
        }

        System.out.println("hostConnectable:" + hostConnectable);
        System.out.println("hostReachable:" + hostReachable);

    }
}
