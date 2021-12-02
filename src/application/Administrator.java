package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Administrator {

	Main objMain= new Main();
    @FXML
    private Button newPartyId;

    @FXML
    private Button newCandidateID;

    @FXML
    void chooseCandidate(MouseEvent event) throws IOException {
    	objMain.changeScene("NewCandidate.fxml");
    	

    }

    @FXML
    void chooseParty(MouseEvent event) throws IOException {
    	objMain.changeScene("NewParty.fxml");
    }
    
    @FXML
    void chooseOkayID(MouseEvent event) throws IOException {
    	objMain.changeScene("vm3.fxml");
    }

}
