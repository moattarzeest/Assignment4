package application;

import java.io.IOException;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Vote implements Initializable {

	Main objMain=new Main();
	mysql objSQL=new mysql();
	VoteRetrivel objRet= new VoteRetrivel();
	CandidateInfo objCandidate=new CandidateInfo();
	Results objResults=new Results();
	Boolean p1, p2, p3, p4, p5;
	String s1,s2,s3;
	int PMLNcount=0;
	int PPPcount=0;
	int PTIcount=0;
    @FXML
    private TextField voterID;

    @FXML
    private TextField voterCnicID;

    @FXML
    private ChoiceBox <String>partychoice;

    @FXML
    private Button submitvoteID;

    
    @FXML
    void chooseCNICvoter(MouseEvent event) {
    	
    }

    @FXML
    void chooseVoterName(MouseEvent event) {

    	

    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
    	/*
		p2=partychoice.getItems().add("PMLN");
		p3=partychoice.getItems().add("PPP");
		p4=partychoice.getItems().add("PMLQ");
		p5=partychoice.getItems().add("TLP");
		*/
    	p1=partychoice.getItems().addAll("PTI","PPP","PMLN");

		
	}

    @FXML
    void clickVoteSubmit(MouseEvent event) throws IOException, ClassNotFoundException {
    	
    	
    	s1=voterID.getText();
    	s2=voterCnicID.getText();
    	s3=partychoice.getValue();
    	
    	if(s3.equals("PTI"))
    	{
    		objCandidate.PTI(1);
    	}
    	else if(s3.equals("PPP"))
    	{
    		objCandidate.PPP(1);
    		
    	}
    	else if(s3.equals("PMLN"))
    	{
    		objCandidate.PMLN(1);
    	} 
    		
    	objSQL.vote(s1,s2,s3);
    	objRet.Pti();
    	objRet.Ppp();
    	objRet.Pmln();
    	objMain.changeScene("vm3.fxml");
    	//objResults.getResults(PTIcount, PMLNcount, PPPcount);

    }
    

	

}
