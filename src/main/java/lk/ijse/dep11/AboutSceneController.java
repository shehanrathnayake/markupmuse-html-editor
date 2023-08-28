package lk.ijse.dep11;

import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AboutSceneController {
    public AnchorPane root;

    double xOffset, yOffset;

    public void initialize() {

//        Scene aboutScene = root.getScene();
//        Stage primaryStage = (Stage) root.getScene().getWindow();
        root.setOnMousePressed(e -> {
            xOffset = e.getSceneX() - e.getX();
            yOffset = e.getSceneY() - e.getY();
        });

        root.setOnMouseDragged(e->{
//            System.out.printf("x=%.2f, y=%.2f \n",e.getX(),e.getY());
            root.setLayoutX(xOffset + e.getX());
            root.setLayoutY(xOffset + e.getY());
        });

    }
    public void rootOnMouseDragOver(MouseDragEvent mouseDragEvent) {





//        int x = root.getLayoutX() -
    }
}
