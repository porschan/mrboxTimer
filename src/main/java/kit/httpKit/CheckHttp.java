package kit.httpKit;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author:porschan
 * @description:
 *
 * isHostConnectable - 判断ip、端口是否可连接
 * isHostReachable - 判断ip是否可以连接 timeOut是超时时间
 *
 * @date: Created in 14:29 2018/7/27
 * @modified By:
 */

public class CheckHttp {

    //判断ip、端口是否可连接
    public static boolean isHostConnectable(String host, int port) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, port));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    //判断ip是否可以连接 timeOut是超时时间
    public static boolean isHostReachable(String host, Integer timeOut) {
        try {
            return InetAddress.getByName(host).isReachable(timeOut);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        //120.24.242.143:8680
        boolean hostConnectable = isHostConnectable("192.168.110.16", 4000);
        System.out.println("hostConnectable:" + hostConnectable);
        boolean hostReachable = isHostReachable("192.168.11.16", 4000);
        System.out.println("hostReachable:" + hostReachable);
    }
}
