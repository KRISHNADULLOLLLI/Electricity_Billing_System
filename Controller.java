package Dashboard;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {
    @FXML
    private Button home;
    @FXML
    private Button aboutus;
    @FXML
    private Button profile;
    @FXML
    private Button newconnection;
    @FXML
    private Button bill;
    @FXML
    private Button logout;
    @FXML
    private Button login;
    @FXML
    private Button signup;
    @FXML
    private Button loginFromSignup;
    @FXML
    private Button update;
    @FXML
    private Button save;



    public void aboutus() throws IOException{
        Stage stage = (Stage) aboutus.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
        primaryStage.setTitle("ABOUT US");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }

    public void home() throws IOException{
        Stage stage = (Stage) home.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }

    public void newconnection() throws IOException{
        Stage stage = (Stage) newconnection.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("newconnection.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }

    public void profile() throws IOException{
        Stage stage = (Stage) profile.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void bill() throws IOException{
        Stage stage = (Stage) bill.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("bill.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void logout() throws IOException{
        Stage stage = (Stage) logout.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void login() throws IOException{
        Stage stage = (Stage) login.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void signup() throws IOException{
        Stage stage = (Stage) signup.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void loginfromsignup() throws IOException{
        Stage stage = (Stage) loginFromSignup.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void signupfromsignup() throws IOException{
        Stage stage = (Stage) signup.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void profileupdate() throws IOException{
        Stage stage = (Stage) update.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("profileupdate.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }
    public void saveupdates() throws IOException{
        Stage stage = (Stage) save.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));
        primaryStage.setTitle("KARNATAKA ELECTRIC SUPPLY COMPANY");
        primaryStage.setScene(new Scene(root,821,609));
        primaryStage.show();
    }


}
