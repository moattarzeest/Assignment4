package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class SecondScene {

	Main objMain=new Main();
    @FXML
    private Button okId;

    @FXML
    void ChooseOk(MouseEvent event) throws IOException {
    	objMain.changeScene("vm.fxml");

    }

}
