package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ExitSceneController {
    public AnchorPane root;
    public Button btnExit;
    public Button btnCancel;

    public void btnExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();
    }
}
