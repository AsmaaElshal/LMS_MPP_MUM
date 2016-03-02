package ui;
import java.io.Serializable;
import java.lang.Thread.State;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public final  class ScreenManager implements Serializable {


	Stage stage;
	Parent root;
	public static final String Login = "/ui/Login.fxml" ;
	public static final String AddMember = "/ui/AddMember.fxml";
	public static final String AdminView = "/ui/AdminScreen.fxml";
	public static final String LibrarianView = "/ui/LibrarianScreen.fxml";
	
	
//	public static void goToScreen(String screen , Button btn ,  )
//	{
// 		Stage  stage = (Stage) btn.getScene().getWindow();
// 		root = FXMLLoader.load(getClass().getResource(ScreenManager.AddMember));
//     	Scene scene = new Scene(root);
//     	stage.setScene(scene);
//     	stage.show();
//	}
	 

}
