package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainSceneController {
    public AnchorPane root;
    public MenuItem menuItmNew;
    public MenuItem menuItmExit;
    public MenuItem menuItmUserGuide;
    public MenuItem menuItmAboutUs;

    public void menuItmNewOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene newScene = new Scene(newPane);

        Stage primaryStage = new Stage();
        primaryStage.setScene(newScene);
        primaryStage.setTitle("MarkupMuse HTML Editor");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void menuItmExit(ActionEvent actionEvent) throws IOException {
        AnchorPane exitPane = FXMLLoader.load(getClass().getResource("/view/ExitScene.fxml"));
        Scene userGuideScene = new Scene(exitPane);

        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.setScene(userGuideScene);
        primaryStage.setTitle("Exit");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void menuItmUserGuideOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane userGuidePane = FXMLLoader.load(getClass().getResource("/view/UserGuideScene.fxml"));
        Scene userGuideScene = new Scene(userGuidePane);

        Stage primaryStage = new Stage();
        primaryStage.setScene(userGuideScene);
        primaryStage.setTitle("User Guide");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void menuItmAboutUsOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane aboutUsPane = FXMLLoader.load(getClass().getResource("/view/AboutScene.fxml"));
        Scene aboutUsScene = new Scene(aboutUsPane);

        Stage primaryStage = new Stage();
        primaryStage.setScene(aboutUsScene);
        primaryStage.setTitle("About Us");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        root.setBackground(Background.fill(Color.TRANSPARENT));
        aboutUsScene.setFill(Color.TRANSPARENT);

        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
