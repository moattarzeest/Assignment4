package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewParty {

	Main objMain= new Main();
    @FXML
    private Button partySubmitID;

    @FXML
    private TextField partyName;
    
    @FXML
    void choosePartyName(MouseEvent event) {
    	

    }
    
    @FXML
    void choosePartysubmit(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("administrator.fxml");

    }

}
