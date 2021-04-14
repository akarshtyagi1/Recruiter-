//package sample;
//
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Handler;
//
//
//public class SignUP {
//    private static database myserver = new database();
//    private static Connection conn = myserver.main();
////    static Pane signUp() throws FileNotFoundException, SQLException {
////        Statement stmt = conn.createStatement();
////        GridPane pane = new GridPane();
////        HBox cPane = new HBox();
////        HBox hb1 = new HBox();
////        VBox hb2 = new VBox();
////
////        Label heading = new Label("Register");
////        heading.setFont(Font.font("Times New Roman", FontWeight.BOLD,32));
////        heading.setPadding(new Insets(10));
////        heading.setTextFill(Color.RED);
////        pane.setAlignment(Pos.CENTER);
////
////        Image image = new Image(new FileInputStream("F:\\cvBuilder\\Resources\\iamge.png"));
////        ImageView imageView = new ImageView(image);
////        imageView.setPreserveRatio(true);
////
////
////        Label Lemail = new Label("Email");
////        TextField Temail = new TextField();
////        Temail.setPromptText("Email");
////        Label LPassword = new Label("Password");
////        PasswordField pass1 = new PasswordField();
////        pass1.setPromptText("Password");
////        Label LcPassword = new Label(" Confirm Password");
////        PasswordField pass2 = new PasswordField();
////        pass2.setPromptText("Confirm Password");
////
////        Button bRegister = new Button("Register");
////        EventHandler<ActionEvent> regHandler = new EventHandler<ActionEvent>(){
////            public void handle(ActionEvent e){
////                String email = Temail.getText();
////                String p1 = pass1.getText();
////                String p2 = pass1.getText();
////
////                if(email.contains("@gmail.com")){
////                      if(p1.length()>0 && p2.length()>0){
////                            if(p1.equals(p2)){
////                                String sql = "Insert into credentials(username,password) values('" + email + "','" + p1 + "')";
////                                System.out.println(sql);
////                                try {
////                                    stmt.executeUpdate(sql);
////                                } catch (SQLException throwables) {
////                                    System.out.println("something went wrong!!");
////                                }
////                            }else{
////                                System.out.println("Check password");
////                            }
////                      }else{
////                          System.out.println("Enter a valid password");
////                      }
////                } else
////                    System.out.println("Please enter a valid email");
////            }
////        };
////        bRegister.setOnAction(regHandler);
////
////
////
////
////        hb2.setAlignment(Pos.CENTER);
////        hb1.getChildren().addAll(imageView);
////        hb2.getChildren().addAll(heading,Lemail,Temail,LPassword,pass1,LcPassword,pass2,bRegister);
////        cPane.getChildren().addAll(hb1,hb2);
////        pane.getChildren().addAll(cPane);
////
////        cPane.setPadding(new Insets(50));
////        BackgroundFill b_fill = new BackgroundFill(Color.rgb(255,255,255), CornerRadii.EMPTY, Insets.EMPTY);
////        Background bground = new Background(b_fill);
////        cPane.setBackground(bground);
////
////        BackgroundFill background_fill = new BackgroundFill(Color.rgb(48,71,94), CornerRadii.EMPTY, Insets.EMPTY);
////        Background background = new Background(background_fill);
////        pane.setBackground(background);
////
////        return pane;
////    }
//}
