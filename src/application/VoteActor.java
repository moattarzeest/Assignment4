package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class VoteActor {
	Main objMain=new Main();
    @FXML
    private Button AdministratorID;

    @FXML
    private Button candidateId;

    @FXML
    private Button voterId;
    
    @FXML
    private Button okID;

    @FXML
    void ChooseAdministrator(MouseEvent event) throws IOException {
    	objMain.changeScene("credentialsAdmin.fxml");
    	
    }


    @FXML
    void ChooseVoter(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("vote.fxml");

    }
    @FXML
    void chooseOK(MouseEvent event) throws IOException {
    	objMain.changeScene("vm.fxml");
    }

}
