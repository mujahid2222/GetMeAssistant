
package getmeassistant.ui.GetMeAssistant;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignUpController  {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Object Close;
    
    
     @FXML
    public void Login(ActionEvent event) throws IOException
    { 
        Parent Login = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene Login_scene = new Scene(Login);
        Stage Login_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Login_stage.setScene(Login_scene);
        Login_stage.show();
       
    }
   
   
        
   
     public void Reset(ActionEvent event)
   { 
       txtUsername.setText(null);
       txtPassword.setText(null);
       lblStatus.setText("Status");
   }
}
