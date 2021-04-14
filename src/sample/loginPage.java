package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class loginPage {
//    static Pane login() throws FileNotFoundException {
//        GridPane pane = new GridPane();
//        HBox cPane = new HBox();
//        HBox hb1 = new HBox();
//        VBox hb2 = new VBox();
//
//        Label heading = new Label("Login Page");
//        heading.setFont(Font.font("Times New Roman", FontWeight.BOLD,32));
//        heading.setPadding(new Insets(10));
//        heading.setTextFill(Color.ANTIQUEWHITE);
//        pane.setAlignment(Pos.CENTER);
//
//        Image image = new Image(new FileInputStream("F:\\cvBuilder\\Resources\\iamge.png"));
//        ImageView imageView = new ImageView(image);
//        imageView.setPreserveRatio(true);
//
//
//        Label luser = new Label("Username");
//        TextField username = new TextField();
//        Label lpass = new Label("Password");
//        TextField password = new TextField();
//        Button bLogin = new Button("Login");
//        Button bSignUp = new Button("SignUp");
//
//        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent e) {
//
//            }
//        };
//
//        bSignUp.setOnAction(event);
//
//        hb2.setAlignment(Pos.CENTER);
//        hb1.getChildren().addAll(imageView);
//        hb2.getChildren().addAll(heading,luser,username,lpass,password,bSignUp,bLogin);
//        cPane.getChildren().addAll(hb1,hb2);
//        pane.getChildren().addAll(cPane);
//
//        cPane.setPadding(new Insets(50));
//        BackgroundFill b_fill = new BackgroundFill(Color.rgb(255,255,255), CornerRadii.EMPTY, Insets.EMPTY);
//        Background bground = new Background(b_fill);
//        cPane.setBackground(bground);
//
//        BackgroundFill background_fill = new BackgroundFill(Color.rgb(48,71,94), CornerRadii.EMPTY, Insets.EMPTY);
//        Background background = new Background(background_fill);
//        pane.setBackground(background);
//
//        return pane;
//    }
//


}
