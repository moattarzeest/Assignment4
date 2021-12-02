package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewCandidate {
	
	Main objMain=new Main();
    @FXML
    private TextField cnicID;

    @FXML
    private TextField nameID;

    @FXML
    private Button submitID;

    @FXML
    void chooseSubmit(MouseEvent event) throws IOException {
    	objMain.changeScene("administrator.fxml");

    }

    @FXML
    void enterCnic(MouseEvent event) {

    }

    @FXML
    void enterName(MouseEvent event) {

    }

}
