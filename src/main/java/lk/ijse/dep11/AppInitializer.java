package lk.ijse.dep11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane splashSceneRoot = FXMLLoader.load(getClass().getResource("/view/SplashScene.fxml"));
        Scene splashScene = new Scene(splashSceneRoot);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        splashSceneRoot.setBackground(Background.fill(Color.TRANSPARENT));
        splashScene.setFill(Color.TRANSPARENT);

        primaryStage.setScene(splashScene);
        primaryStage.setTitle("Splash Screen");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
