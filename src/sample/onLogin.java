package sample;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Screen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class onLogin {
    static BorderPane signUP() throws FileNotFoundException {
        BorderPane root = new BorderPane();
        Rectangle2D r = Screen.getPrimary().getBounds();




        FileInputStream input = new FileInputStream("F:\\cvBuilder\\Resources\\backkground.jpg");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100,100,TRUE,TRUE,TRUE,FALSE));
        Background background = new Background(backgroundimage);
        root.setBackground(background);


//        BorderPane center=new BorderPane();
        GridPane info=new GridPane();
        info.setMaxHeight(r.getHeight()*0.5);
        info.setMaxWidth(r.getWidth()*0.5);
        info.setStyle("-fx-background-color: #FFFFFF;");
        info.setAlignment(Pos.CENTER);
        info.setHgap(20);
        info.setVgap(10);
        info.setGridLinesVisible(TRUE);

        FileInputStream input1 = new FileInputStream("F:\\cvBuilder\\Resources\\personal.png");
        Image i1=new Image(input1);
        ImageView im1=new ImageView(i1);
        im1.setFitWidth(125);im1.setFitHeight(125);
        Label l1=new Label();
        l1.setText("Personal Informtion");
        VBox v1=new VBox();
        v1.getChildren().addAll(im1,l1);
        FileInputStream input2 = new FileInputStream("F:\\cvBuilder\\Resources\\education.png");
        Image i2=new Image(input2);
        ImageView im2=new ImageView(i2);
        im2.setFitWidth(125);im2.setFitHeight(125);
        Label l2=new Label();
        l2.setText("Education");
        VBox v2=new VBox();
        v2.getChildren().addAll(im2,l2);
        FileInputStream input3 = new FileInputStream("F:\\cvBuilder\\Resources\\experience.png");
        Image i3=new Image(input3);
        ImageView im3=new ImageView(i3);
        im3.setFitWidth(125);im3.setFitHeight(125);
        Label l3 =new Label();
        l3.setText("Experience");
        VBox v3=new VBox();
        v3.getChildren().addAll(im3,l3);
        /*info.add(im1,0,0);
        info.add(im2,1,0);
        info.add(im3,2,0);
        info.add(l1,0,1);
        info.add(l2,1,1);
        info.add(l3,2,1);
*/
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER);
        info.add(v1,0,0);
        info.add(v2,1,0);
        info.add(v3,2,0);







        root.setCenter(info);



        // set the scene
        //Scene sc = new Scene(root,0.90*r.getWidth(), 0.90*r.getHeight());

        return root;
    }
}
