package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AdminCredentials {
	String s1, s2;
	Main objMain=new Main();
	SQLCredentials objSQL=new SQLCredentials();

    @FXML
    private PasswordField AdminPassID;

    @FXML
    private TextField AdminNameId;

   // @FXML
   // private Button SubmitID;

    @FXML
    void chooseAdminName(MouseEvent event) {

    	
    }

    @FXML
    void chooseAdminPass(MouseEvent event) {
    	
    }
    String returnName()
    {
    	s1=AdminNameId.getText();
    	return s1;
    }

    String returnPass()
    {
    	s2=AdminPassID.getText();
    	return s2;

    }
    
    @FXML
    void chooseSubmit(MouseEvent event) throws IOException, ClassNotFoundException {	
    	
    	objSQL.Admin();
    	objMain.changeScene("administrator.fxml");
    	
    
    	
    }

}
