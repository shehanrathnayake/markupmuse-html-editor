package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class SplashSceneController {
    public AnchorPane root;

    public void initialize() throws InterruptedException, IOException {

//        Thread.sleep(2500);

        PauseTransition pause = new PauseTransition(Duration.millis(2500));

        pause.setOnFinished(event -> {

            try {
                callMainScene();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        pause.play();
    }

    public void callMainScene() throws IOException {

        AnchorPane sceneRoot = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene scene = new Scene(sceneRoot);

//        Stage stage = (Stage) root.getScene().getWindow();
//        Thread.sleep(5000);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("MarkupMuse HTML Editor");
        stage.setMaximized(true);
        stage.show();

        FadeTransition fade = new FadeTransition(Duration.millis(500),sceneRoot);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();

        closeSplashScreen();
    }

    private void closeSplashScreen() {
        Stage splashStage = (Stage) root.getScene().getWindow();
        splashStage.close();
    }
}
