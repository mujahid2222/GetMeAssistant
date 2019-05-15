
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

public class LoginController  {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    private Object Close;
   

    
        @FXML
    public void Signup(ActionEvent event) throws IOException
    { 
        
        Parent sign_up = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene SignUp_scene = new Scene(sign_up);
        Stage SignUp_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SignUp_stage.setScene(SignUp_scene);
        SignUp_stage.show();
       
    }
     @FXML
    public void Profile(ActionEvent event) throws IOException
    { 
        Parent Profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene Profile_scene = new Scene(Profile);
        Stage Profile_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Profile_stage.setScene(Profile_scene);
        Profile_stage.show();
       
    }
    
    
    public void Login(ActionEvent event) throws IOException
{
         if  (txtUsername.getText().equals("Batman") && txtPassword.getText().equals("ironmansucks")) {
             lblStatus.setText("Login Success ");
        Parent home_parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene home_scene = new Scene(home_parent);
        Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        home_stage.setScene(home_scene);
        home_stage.show();
            
             
        } 
         else 
         {
              lblStatus.setText("Intruders");
      
    }
       
        } 
   public void Reset(ActionEvent event)
   { 
       txtUsername.setText(null);
       txtPassword.setText(null);
       lblStatus.setText("Status");
   }
}
 
  
   
   
  

   
   
   
   

