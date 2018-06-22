package config;

import com.jfinal.core.Controller;

/**
 * @author:porschan
 * @description:
 * @date: Created in 14:38 2018/6/20
 * @modified By:
 */

public class AppController extends Controller{

    public void index(){
        renderText("Hello Maven JFinal");
    }

}
