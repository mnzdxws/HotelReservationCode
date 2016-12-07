package ui.login;

import java.net.URL;
import java.util.ResourceBundle;

import bl.userbl.LoginInputController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import ui.UILaunch;
import util.UserType;

public class loginViewController implements Initializable{
	private UILaunch application;
	
	private LoginInputController login;
	
	@FXML
	private ImageView iv1;
	
	@FXML
	private TextField userid;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Button btn_login;
	
	public void setApp(UILaunch application){
		this.application= application;
	}
	
	@FXML
	public void btn_loginAction(ActionEvent event){
		login=new LoginInputController();
		String id=userid.getText();
		UserType type=login.getType(id);
		switch(type){
		case Customer:    application.gotocustomerGuide();break;
		case HotelStuff:  application.gotohotelStuffGuide();break;
		case WebStuff:    application.gotowebSalesmanGuide();break;
		case WebManager:  application.gotowebManagerGuide();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		

	}

}