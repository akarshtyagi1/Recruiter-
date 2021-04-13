package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;                    //D:\shiv nadar university\Projects\cv\ -- jagga's
import javafx.scene.layout.*;                           //F:\cvBuilder\Resources\  -- akarsh's
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.io.FileInputStream;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class onLogin extends Application {

    Scene sc,scene1,scene2,scene3;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        BorderPane root = new BorderPane();
        Rectangle2D r = Screen.getPrimary().getBounds();

//background image
        FileInputStream input = new FileInputStream("F:\\cvBuilder\\Resources\\backkground.jpg");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100,100,TRUE,TRUE,TRUE,FALSE));
        Background background = new Background(backgroundimage);
        root.setBackground(background);


        GridPane info=new GridPane();
        info.setMaxHeight(r.getHeight()*0.5);
        info.setMaxWidth(r.getWidth()*0.5);
        info.setStyle("-fx-background-color: #FFFFFF;");
        info.setAlignment(Pos.CENTER);
        info.setHgap(20);
        info.setVgap(10);
        info.setGridLinesVisible(TRUE);

//personal information
        FileInputStream input1 = new FileInputStream("F:\\cvBuilder\\Resources\\personal.png");
        Image i1=new Image(input1);
        ImageView im1=new ImageView(i1);
        im1.setFitWidth(125);im1.setFitHeight(125);
        Button B1=new Button();
        B1.setText("Personal Informtion");
        VBox v1=new VBox();
        v1.getChildren().addAll(im1,B1);

//education
        FileInputStream input2 = new FileInputStream("F:\\cvBuilder\\Resources\\education.png");
        Image i2=new Image(input2);
        ImageView im2=new ImageView(i2);
        im2.setFitWidth(125);im2.setFitHeight(125);
        Button B2=new Button();
        B2.setText("Education");
        B2.setOnAction(e->{
            primaryStage.setScene(scene2);
        });
        VBox v2=new VBox();
        v2.getChildren().addAll(im2,B2);

//exxperience
        FileInputStream input3 = new FileInputStream("F:\\cvBuilder\\Resources\\experience.png");
        Image i3=new Image(input3);
        ImageView im3=new ImageView(i3);
        im3.setFitWidth(125);im3.setFitHeight(125);
        Button B3 =new Button();
        B3.setText("Experience");
        B1.setOnAction(e->{
            primaryStage.setScene(scene3);
        });
        VBox v3=new VBox();
        v3.getChildren().addAll(im3,B3);


        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER);
        info.add(v1,0,0);
        info.add(v2,1,0);
        info.add(v3,2,0);
        root.setCenter(info);
        sc = new Scene(root,0.90*r.getWidth(), 0.90*r.getHeight());



//Button Actions on Onlogin Page
        B1.setOnAction(e->{
            window.setScene(scene1);
        });
        B2.setOnAction(e->{
            window.setScene(scene2);
        });
        B3.setOnAction(e->{
            window.setScene(scene3);
        });



//Scene of personal information
        //About
        VBox about=new VBox();
        Label Alabel=new Label("About");
        Alabel.setStyle("-fx-font-size: 30px");
        GridPane Ainfo =new GridPane();

        Label Aname=new Label("Name");
        TextField Anameinput=new TextField();
        Label ADOB=new Label("Date of birth");
        TextField ADOBinput=new TextField();
        Label Agender=new Label("Gender");
        TextField Agenderinput=new TextField();
        Label Acategory=new Label("Category");
        TextField Acategoryinput=new TextField();

        Ainfo.add(Aname,0,0);
        Ainfo.add(Anameinput,1,0);
        Ainfo.add(ADOB,0,1);
        Ainfo.add(ADOBinput,1,1);
        Ainfo.add(Agender,0,2);
        Ainfo.add(Agenderinput,1,2);
        Ainfo.add(Acategory,0,3);
        Ainfo.add(Acategoryinput,1,3);

        about.getChildren().addAll(Alabel,Ainfo);


        //Contact Details
        VBox contact=new VBox();
        Label CDlabel=new Label("Contact Details");
        CDlabel.setStyle("-fx-font-size: 30px");
        GridPane CDinfo =new GridPane();

        Label CDmobile=new Label("Mobile No.");
        TextField CDmobileinput=new TextField();
        Label CDemail=new Label("Email adress");
        TextField CDemailinput=new TextField();
        Label CDlin=new Label("LinkedIn profile");
        TextField CDlininput=new TextField();

        CDinfo.add(CDmobile,0,0);
        CDinfo.add(CDmobileinput,1,0);
        CDinfo.add(CDemail,0,1);
        CDinfo.add(CDemailinput,1,1);
        CDinfo.add(CDlin,0,2);
        CDinfo.add(CDlininput,1,2);
        contact.getChildren().addAll(CDlabel,CDinfo);

        //Adress
        VBox location=new VBox();
        Label Llabel=new Label("Adress");
        Llabel.setStyle("-fx-font-size: 30px");
        GridPane Linfo =new GridPane();

        Label LCountry=new Label("Country");
        TextField Lcountryinput=new TextField();
        Label Lstate=new Label("Date of birth");
        TextField Lstateinput=new TextField();
        Label Lpincode=new Label("Pincode");
        TextField Lpincodeinput=new TextField();
        Label Lhouse=new Label("House Adress");
        TextField Lhouseinput=new TextField();

        Linfo.add(LCountry,0,0);
        Linfo.add(Lcountryinput,1,0);
        Linfo.add(Lstate,0,1);
        Linfo.add(Lstateinput,1,1);
        Linfo.add(Lpincode,0,2);
        Linfo.add(Lpincodeinput,1,2);
        Linfo.add(Lhouse,0,3);
        Linfo.add(Lhouseinput,1,3);

        location.getChildren().addAll(Llabel,Linfo);



        //Guardian Details
        VBox guardian=new VBox();
        Label Glabel=new Label("Guardian Details");
        Glabel.setStyle("-fx-font-size: 30px");
        GridPane Ginfo =new GridPane();

        Label Gfname=new Label("Father's Name");
        TextField Gfnameinput=new TextField();
        Label Gmname=new Label("Mother's Name");
        TextField Gmnameinput=new TextField();
        Label Gfnumber=new Label("Father's number");
        TextField Gfnumberinput=new TextField();
        Label Gmnumber=new Label("Mother's number");
        TextField Gmnumberinput=new TextField();
        Label Gfoccupation=new Label("Father's Occupation");
        TextField Gfoccupationinput=new TextField();
        Label Gmoccupation=new Label("Mother's Occupation");
        TextField Gmoccupationinput=new TextField();



        Ginfo.add(Gfname,0,0);
        Ginfo.add(Gfnameinput,1,0);
        Ginfo.add(Gmname,0,1);
        Ginfo.add(Gmnameinput,1,1);
        Ginfo.add(Gfnumber,0,2);
        Ginfo.add(Gfnumberinput,1,2);
        Ginfo.add(Gmnumber,0,3);
        Ginfo.add(Gmnumberinput,1,3);
        Ginfo.add(Gfoccupation,0,4);
        Ginfo.add(Gfoccupationinput,1,4);
        Ginfo.add(Gmoccupation,0,5);
        Ginfo.add(Gmoccupationinput,1,5);
        guardian.getChildren().addAll(Glabel,Ginfo);

        VBox PIleft=new VBox();
        PIleft.getChildren().addAll(about,contact,location);
        VBox PIright=new VBox();
        PIright.getChildren().addAll(guardian);
        HBox PI=new HBox(PIleft,PIright);
        PI.setAlignment(Pos.TOP_LEFT);
        PI.setSpacing(400);
        scene1 = new Scene(PI,0.90*r.getWidth(), 0.90*r.getHeight());



        //about.setAlignment(Pos.CENTER);

                /*Button Br1=new Button();
        Br1.setText("back");
        Br1.setOnAction(e->{
            window.setScene(sc);
        });
*/
//Scene of Education information
        Button Br2=new Button();
        Br2.setText("back");
        Br2.setOnAction(e->{
            window.setScene(sc);
        });
        VBox vr2=new VBox();
        vr2.getChildren().addAll(Br2);
        scene2 = new Scene(vr2,0.90*r.getWidth(), 0.90*r.getHeight());


//Scene of Experience
        Button Br3=new Button();
        Br3.setText("back");
        Br3.setOnAction(e->{
            window.setScene(sc);
        });
        VBox vr3=new VBox();
        vr3.getChildren().addAll(Br3);
        scene3 = new Scene(vr3,0.90*r.getWidth(), 0.90*r.getHeight());

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(sc);
        primaryStage.show();
    }


}
