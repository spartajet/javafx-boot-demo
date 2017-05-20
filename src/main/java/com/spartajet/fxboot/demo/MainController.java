package com.spartajet.fxboot.demo;

import com.spartajet.fxboot.demo.view.MainStageView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Main controller.
 *
 * @description
 * @create 2017 -05-20 下午1:45
 * @email spartajet.guo @gmail.com
 */
@SpringBootApplication
public class MainController extends AbstractJavaFxApplicationSupport {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launchApp(MainController.class, MainStageView.class, args);
    }

    /**
     * Start.
     *
     * @param stage the stage
     *
     * @exception Exception the exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }
}
