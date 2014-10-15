package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.Season;

import java.util.Date;

/**
 *
 */

public class Main extends Application {

    public static Date now= new Date();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Season mySeason=Season.getInstance();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Football manager");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
