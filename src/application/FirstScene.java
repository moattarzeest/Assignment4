package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FirstScene {

	Main objMain=new Main();
    @FXML
    private Button helpId;

    @FXML
    private Button voteId;
    
    @FXML
    private Button exitID;

    @FXML
    void ChooseHelp(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("help.fxml");
    }

    @FXML
    void ChooseVote(MouseEvent event) throws IOException {
    	objMain.changeScene("vm3.fxml");

    }
    @FXML
    void ChooseExit(MouseEvent event) {

    	System.exit(1);
    }


}
