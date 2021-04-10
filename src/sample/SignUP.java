package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SignUP {
    static Pane signUp() throws FileNotFoundException {
        GridPane pane = new GridPane();
        HBox cPane = new HBox();
        HBox hb1 = new HBox();
        VBox hb2 = new VBox();

        Label heading = new Label("Register");
        heading.setFont(Font.font("Times New Roman", FontWeight.BOLD,32));
        heading.setPadding(new Insets(10));
        heading.setTextFill(Color.RED);
        pane.setAlignment(Pos.CENTER);

        Image image = new Image(new FileInputStream("F:\\cvBuilder\\Resources\\iamge.png"));
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);


        Label L_Fname = new Label("First Name");
        TextField T_Fname = new TextField();
        Label L_LName = new Label("Last Name");
        TextField t_Lname = new TextField();
        Label Lemail = new Label("Email");
        TextField Temail = new TextField();
        Label LPassword = new Label("Password");
        TextField TPassword = new TextField();
        Label LcPassword = new Label(" Confirm Password");
        TextField TcPassword = new TextField();


        Button bRegister = new Button("Register");


        hb2.setAlignment(Pos.CENTER);
        hb1.getChildren().addAll(imageView);
        hb2.getChildren().addAll(heading,L_Fname,T_Fname,L_LName,t_Lname,Lemail,Temail,LPassword,TPassword,LcPassword,TcPassword,bRegister);
        cPane.getChildren().addAll(hb1,hb2);
        pane.getChildren().addAll(cPane);

        cPane.setPadding(new Insets(50));
        BackgroundFill b_fill = new BackgroundFill(Color.rgb(255,255,255), CornerRadii.EMPTY, Insets.EMPTY);
        Background bground = new Background(b_fill);
        cPane.setBackground(bground);

        BackgroundFill background_fill = new BackgroundFill(Color.rgb(48,71,94), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        pane.setBackground(background);

        return pane;
    }
}
