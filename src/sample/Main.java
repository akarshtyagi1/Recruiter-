package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane activePanee;
        activePanee = loginPage.login();
        activePanee = SignUP.signUp();
        //activePanee = SignUp.signUP();

        primaryStage.setTitle("CV Builder");
        primaryStage.setScene(new Scene(activePanee, 900, 650));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//C:\\Users\\DELL\\Desktop\\cv\\Resources\\