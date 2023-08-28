package lk.ijse.dep11;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import static javafx.scene.paint.Color.TRANSPARENT;

public class AboutSceneController {
    public AnchorPane root;
    public AnchorPane rootPane;
    public Button btnClose;

    double xOffset, yOffset;

    public void initialize() {
        Platform.runLater(()->{
            Stage stage = (Stage) root.getScene().getWindow();
            rootPane.setLayoutX(stage.getX() + (stage.getWidth() - rootPane.getWidth())/2);
            rootPane.setLayoutY(stage.getY() + (stage.getHeight() - rootPane.getHeight())/2);
        });
    }

    public void rootPaneOnMouseDragged(MouseEvent mouseEvent) {
        rootPane.setLayoutX(mouseEvent.getSceneX()-xOffset);
        rootPane.setLayoutY(mouseEvent.getSceneY()-yOffset);

    }

    public void rootPaneOnMousePressed(MouseEvent mouseEvent) {
        xOffset = mouseEvent.getX();
        yOffset = mouseEvent.getY();
    }

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage currentStage = (Stage) root.getScene().getWindow();
        currentStage.close();
    }
}
