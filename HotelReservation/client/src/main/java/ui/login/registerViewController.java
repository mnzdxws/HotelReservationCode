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
import ui.UILaunch;
import util.UserType;
import vo.UserInfoVO;

public class registerViewController implements Initializable{
	private UILaunch application;
	
	private LoginInputController register;
	
	@FXML
	private TextField userID;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField contact;
	
	@FXML
	private Button btn_cancel;
	
	@FXML
	private Button btn_register;
	
	public void setApp(UILaunch application){
		this.application= application;
	}
	
	@FXML
	public void btn_cancelAction(ActionEvent event){
		application.gotologin();
	}
	
	@FXML
	public void btn_registerAction(ActionEvent event){
		UserInfoVO user=new UserInfoVO(userID.getText(),password.getText(),name.getText(),contact.getText());
		user.setType(UserType.Customer);
		register.Register(user);//TODO 判断结果，返回值是注册的ID，需改变界面，不输入ID，由系统自动返回
		application.gotologin();
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
