package controller;

import com.jfinal.core.Controller;
import model.LigentUser;

/**
 * @author:porschan
 * @description:
 * @date: Created in 15:00 2018/6/20
 * @modified By:
 */

public class HelloController extends Controller {
    public void index() {

        renderText(new LigentUser().dao().findById(2).toString());
//        renderText("Hello JFinal World.");
    }
}
