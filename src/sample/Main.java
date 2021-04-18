package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main extends Application {
    static Scene sc, scene1, scene2, scene3, scene4,scene5;
    static Stage window;
    static Scene mainScene;
    static Scene login, signup;
    static String username;
    static int U_id;
    private static database myserver = new database();
    private static final Connection conn = myserver.main();
    Rectangle2D r = Screen.getPrimary().getBounds();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // loginPage
        GridPane pane1 = new GridPane();
        HBox cPane1 = new HBox();
        HBox hb11 = new HBox();
        VBox hb12 = new VBox();

        Label heading1 = new Label("Login Page");
        heading1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 32));
        heading1.setPadding(new Insets(10));
        heading1.setTextFill(Color.ANTIQUEWHITE);
        pane1.setAlignment(Pos.CENTER);

        Image image1 = new Image(new FileInputStream("Resources/iamge.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setPreserveRatio(true);


        Label luser = new Label("Email");
        TextField username = new TextField();
        username.setPromptText("email");
        Label lpass = new Label("Password");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");
        Label Lmsg = new Label("");
        Lmsg.setTextFill(Color.RED);

        Button bLogin = new Button("Login");
        Button bSignUp = new Button("SignUp");
        HBox h13 =new HBox();h13.getChildren().addAll(bLogin,bSignUp);h13.setSpacing(10);h13.setAlignment(Pos.CENTER);

        hb12.setAlignment(Pos.CENTER);
        hb11.getChildren().addAll(imageView1);
        hb12.getChildren().addAll(heading1, luser, username, lpass, password,Lmsg, h13);
        hb12.setSpacing(2.5);
        cPane1.getChildren().addAll(hb11, hb12);
        pane1.getChildren().addAll(cPane1);

        cPane1.setPadding(new Insets(50));
        BackgroundFill b_fill1 = new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY);
        Background bground1 = new Background(b_fill1);
        cPane1.setBackground(bground1);

        BackgroundFill background_fill1 = new BackgroundFill(Color.rgb(48, 71, 94), CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(background_fill1);
        pane1.setBackground(background1);
        //activePanee = login();
        login = new Scene(pane1, 0.9*r.getWidth(), 0.9*r.getHeight());


        //signUP Page
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        GridPane pane2 = new GridPane();
        HBox cPane2 = new HBox();
        HBox hb21 = new HBox();
        VBox hb22 = new VBox();


        Label heading2 = new Label("Register");
        heading2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 32));
        heading2.setPadding(new Insets(10));
        heading2.setTextFill(Color.RED);
        pane2.setAlignment(Pos.CENTER);


        Image image2 = new Image(new FileInputStream("Resources/iamge.png"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setPreserveRatio(true);


        Label Lemail = new Label("Email");
        TextField Temail = new TextField();
        Temail.setPromptText("Email");
        Label LPassword = new Label("Password");
        PasswordField pass1 = new PasswordField();
        pass1.setPromptText("Password");
        Label LcPassword = new Label(" Confirm Password");
        PasswordField pass2 = new PasswordField();
        pass2.setPromptText("Confirm Password");
        Button bRegister = new Button("Register");
        Button bback = new Button("Back to SignIn");bback.setOnAction(e->{primaryStage.setScene(login);});
        HBox h23 =new HBox();h23.getChildren().addAll(bRegister,bback);h23.setSpacing(10);
        Label Smsg = new Label("");
        Smsg.setTextFill(Color.RED);

        hb22.setAlignment(Pos.CENTER);
        hb21.getChildren().addAll(imageView2);
        hb22.getChildren().addAll(heading2, Lemail, Temail, LPassword, pass1, LcPassword, pass2,Smsg, h23);
        hb22.setSpacing(2.5);
        cPane2.getChildren().addAll(hb21, hb22);
        pane2.getChildren().addAll(cPane2);

        cPane2.setPadding(new Insets(50));
        BackgroundFill b_fill2 = new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY);
        Background bground2 = new Background(b_fill2);
        cPane2.setBackground(bground2);

        BackgroundFill background_fill2 = new BackgroundFill(Color.rgb(48, 71, 94), CornerRadii.EMPTY, Insets.EMPTY);
        Background background2 = new Background(background_fill2);
        pane2.setBackground(background2);

        signup = new Scene(pane2, 0.9*r.getWidth(), 0.9*r.getHeight());


        //OnLOGin
        BorderPane root = new BorderPane();

//background image
        FileInputStream input = new FileInputStream("Resources/backkground.jpg");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100, 100, TRUE, TRUE, TRUE, FALSE));
        Background background = new Background(backgroundimage);
        root.setBackground(background);

//logout button
        FileInputStream inputlogout = new FileInputStream("Resources/logout.png");
        Image ilo = new Image(inputlogout);
        ImageView imlo = new ImageView(ilo);
        imlo.setFitWidth(25);
        imlo.setFitHeight(25);
        Button logout=new Button();logout.setOnAction(e->{primaryStage.setScene(login);});
        logout.setGraphic(imlo);
        root.setRight(logout);


        GridPane info = new GridPane();
        info.setMaxHeight(r.getHeight() * 0.75);
        info.setMaxWidth(r.getWidth() * 0.50);
        info.setStyle("-fx-background-color: transparent;");
        info.setAlignment(Pos.CENTER);
        info.setHgap(10);
        info.setVgap(10);
        //info.setGridLinesVisible(TRUE);



//personal information
        FileInputStream input1 = new FileInputStream("Resources/personal.png");
        Image i1 = new Image(input1);
        ImageView im1 = new ImageView(i1);
        im1.setFitWidth(150);
        im1.setFitHeight(150);
        Button B1 = new Button();
        B1.setText("Personal Informtion");
        VBox v1 = new VBox();
        v1.getChildren().addAll(im1, B1);

//education experience
        FileInputStream input2 = new FileInputStream("Resources/education.png");
        Image i2 = new Image(input2);
        ImageView im2 = new ImageView(i2);
        im2.setFitWidth(150);
        im2.setFitHeight(150);
        Button B2 = new Button();
        B2.setText("Education");
        VBox v2 = new VBox();
        v2.getChildren().addAll(im2, B2);
//experience
        FileInputStream input3 = new FileInputStream("Resources/education.png");
        Image i3 = new Image(input3);
        ImageView im3 = new ImageView(i3);
        im3.setFitWidth(150);
        im3.setFitHeight(150);
        Button B3 = new Button();
        B3.setText("Work experience");
        VBox v3 = new VBox();
        v3.getChildren().addAll(im3, B3);

//Projects and PR
        FileInputStream input4 = new FileInputStream("Resources/experience.png");
        Image i4 = new Image(input4);
        ImageView im4 = new ImageView(i4);
        im4.setFitWidth(150);
        im4.setFitHeight(150);
        Button B4 = new Button();
        B4.setText("Projects and Positions\n of Responsibilities");
        VBox v4 = new VBox();
        v4.getChildren().addAll(im4, B4);


//skills and ECA
        FileInputStream input5 = new FileInputStream("Resources/experience.png");
        Image i5 = new Image(input5);
        ImageView im5 = new ImageView(i5);
        im5.setFitWidth(150);
        im5.setFitHeight(150);
        Button B5 = new Button();
        B5.setText("Skills and Extra\nCurricular Activities");
        VBox v5 = new VBox();
        v5.getChildren().addAll(im5, B5);


        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER);
        v4.setAlignment(Pos.CENTER);
        v5.setAlignment(Pos.CENTER);
        info.add(v1, 0, 0);
        info.add(v2, 1, 0);
        info.add(v3, 2, 0);
        info.add(v4, 3, 0);
        info.add(v5, 4, 0);
        root.setCenter(info);
        sc = new Scene(root, 0.90 * r.getWidth(), 0.90 * r.getHeight());





//Scene of personal information
        //About
        VBox about = new VBox();
        Label Alabel = new Label("About");
        Alabel.setStyle("-fx-font-size: 30px");
        GridPane Ainfo = new GridPane();

        Label AFname = new Label("First Name: ");
        TextField AFnameinput = new TextField();
        AFnameinput.setPromptText("FirstName");
        Label ALname = new Label("Last Name: ");
        TextField ALnameinput = new TextField();
        ALnameinput.setPromptText("LastName");
        Label ADOB = new Label("Date of birth");
        TextField ADOBinput = new TextField();
        Label Agender = new Label("Gender");
        TextField Agenderinput = new TextField();
        Label Acategory = new Label("Category");
        TextField Acategoryinput = new TextField();

        Ainfo.add(AFname, 0, 0);
        Ainfo.add(AFnameinput, 1, 0);
        Ainfo.add(ALname, 0, 1);
        Ainfo.add(ALnameinput, 1, 1);
        Ainfo.add(ADOB, 0, 2);
        Ainfo.add(ADOBinput, 1, 2);
        Ainfo.add(Agender, 0, 3);
        Ainfo.add(Agenderinput, 1, 3);
        Ainfo.add(Acategory, 0, 4);
        Ainfo.add(Acategoryinput, 1, 4);

        about.getChildren().addAll(Alabel, Ainfo);


        //Contact Details
        VBox contact = new VBox();
        Label CDlabel = new Label("Contact Details");
        CDlabel.setStyle("-fx-font-size: 30px");
        GridPane CDinfo = new GridPane();

        Label CDmobile = new Label("Mobile No.");
        TextField CDmobileinput = new TextField();
        Label CDemail = new Label("Email: ");
        TextField CDemailinput = new TextField();


        CDinfo.add(CDmobile, 0, 0);
        CDinfo.add(CDmobileinput, 1, 0);
        CDinfo.add(CDemail, 0, 1);
        CDinfo.add(CDemailinput, 1, 1);
        contact.getChildren().addAll(CDlabel, CDinfo);

        //Location
        VBox location = new VBox();
        Label Llabel = new Label("Address");
        Llabel.setStyle("-fx-font-size: 30px");
        GridPane Linfo = new GridPane();

        Label Lhouse = new Label("H.No: ");
        TextField Lhouseinput = new TextField();
        Label LStreet = new Label("Street: ");
        TextField LStreetInput = new TextField();
        Label LCity = new Label("City: ");
        TextField LCityInput = new TextField();
        Label Lpincode = new Label("Pin code: ");
        TextField Lpincodeinput = new TextField();
        Label LCountry = new Label("Country: ");
        TextField LCountryinput = new TextField();

        Linfo.add(Lhouse, 0, 0);
        Linfo.add(Lhouseinput, 1, 0);
        Linfo.add(LStreet, 0, 1);
        Linfo.add(LStreetInput, 1, 1);
        Linfo.add(LCity, 0, 2);
        Linfo.add(LCityInput, 1, 2);
        Linfo.add(Lpincode, 0, 3);
        Linfo.add(Lpincodeinput, 1, 3);
        Linfo.add(LCountry, 0, 4);
        Linfo.add(LCountryinput, 1, 4);
        location.getChildren().addAll(Llabel, Linfo);


        //Guardian Details
        VBox guardian = new VBox();
        Label Glabel = new Label("Guardian Details");
        Glabel.setStyle("-fx-font-size: 30px");
        GridPane Ginfo = new GridPane();

        Label Gfname = new Label("Father's Name");
        TextField Gfnameinput = new TextField();
        Label Gmname = new Label("Mother's Name");
        TextField Gmnameinput = new TextField();
        Label Gfnumber = new Label("Father's number");
        TextField Gfnumberinput = new TextField();
        Label Gmnumber = new Label("Mother's number");
        TextField Gmnumberinput = new TextField();
        Label Gfoccupation = new Label("Father's Occupation");
        TextField Gfoccupationinput = new TextField();
        Label Gmoccupation = new Label("Mother's Occupation");
        TextField Gmoccupationinput = new TextField();

        Ginfo.add(Gfname, 0, 0);
        Ginfo.add(Gfnameinput, 1, 0);
        Ginfo.add(Gmname, 0, 1);
        Ginfo.add(Gmnameinput, 1, 1);
        Ginfo.add(Gfnumber, 0, 2);
        Ginfo.add(Gfnumberinput, 1, 2);
        Ginfo.add(Gmnumber, 0, 3);
        Ginfo.add(Gmnumberinput, 1, 3);
        Ginfo.add(Gfoccupation, 0, 4);
        Ginfo.add(Gfoccupationinput, 1, 4);
        Ginfo.add(Gmoccupation, 0, 5);
        Ginfo.add(Gmoccupationinput, 1, 5);
        guardian.getChildren().addAll(Glabel, Ginfo);


        VBox PIleft = new VBox();
        PIleft.setPadding(new Insets(10));
        PIleft.getChildren().addAll(about, contact, location);

        VBox PIright = new VBox();
        PIright.getChildren().addAll(guardian);

        HBox PI = new HBox(PIleft, PIright);
        PI.setAlignment(Pos.CENTER);
        //PI.setAlignment(Pos.TOP_LEFT);
        PI.setSpacing(400);
        BorderPane PIfinal=new BorderPane();


        HBox PIbottom=new HBox();
        Button PInext=new Button("Next");PInext.setOnAction(e->{primaryStage.setScene(scene2);});
        Button PIback=new Button("Back");PIback.setOnAction(e->{primaryStage.setScene(sc);});
        Button PIsave=new Button("Save changes");

        PIbottom.getChildren().addAll(PIback,PInext,PIsave);
        PIbottom.setAlignment(Pos.BASELINE_RIGHT);
        PIbottom.setBackground(new Background(new BackgroundFill(Color.rgb(23,148,23), CornerRadii.EMPTY, Insets.EMPTY)));

        PIfinal.setCenter(PI);
        PIfinal.setBottom(PIbottom);
        PIfinal.setBackground(new Background(new BackgroundFill(Color.rgb(157,200,141), CornerRadii.EMPTY, Insets.EMPTY)));
        scene1 = new Scene(PIfinal, 0.90 * r.getWidth(), 0.90 * r.getHeight());







//Scene of Education
        //College
        VBox university = new VBox();
        Label Ulabel = new Label("Professional degrees");
        Ulabel.setStyle("-fx-font-size: 30px");
        Button addcompany=new Button("+");
        HBox Uhead=new HBox(Ulabel,addcompany);
        GridPane Uinfo = new GridPane();


        ArrayList<Label> Ularray1=new ArrayList<>();
        ArrayList<TextField> Utarray1=new ArrayList<>();
        ArrayList<Label> Ularray2=new ArrayList<>();
        ArrayList<TextField> Utarray2=new ArrayList<>();
        ArrayList<Label> Ularray3=new ArrayList<>();
        ArrayList<TextField> Utarray3=new ArrayList<>();
        ArrayList<Label> Ularray4=new ArrayList<>();
        ArrayList<TextField> Utarray4=new ArrayList<>();
        ArrayList<Label> Ularray5=new ArrayList<>();
        ArrayList<TextField> Utarray5=new ArrayList<>();

        addcompany.setOnAction(e->{
            Ularray1.add(new Label("Degree"));
            Utarray1.add(new TextField());
            Ularray2.add(new Label("Instituion "));
            Utarray2.add(new TextField());
            Ularray3.add(new Label("Board"));
            Utarray3.add(new TextField());
            Ularray4.add(new Label("CGPA/Percentage"));
            Utarray4.add(new TextField());
            Ularray5.add(new Label("Year Passed:"));
            Utarray5.add(new TextField());


            Uinfo.add(Ularray1.get(Ularray1.size()-1),0,(Ularray1.size()-1)*5);
            Uinfo.add(Utarray1.get(Utarray1.size()-1),1,(Utarray1.size()-1)*5);
            Uinfo.add(Ularray2.get(Ularray2.size()-1),0,(Ularray2.size()-1)*5+1);
            Uinfo.add(Utarray2.get(Utarray2.size()-1),1,(Utarray2.size()-1)*5+1);
            Uinfo.add(Ularray3.get(Ularray3.size()-1),0,(Ularray3.size()-1)*5+2);
            Uinfo.add(Utarray3.get(Utarray3.size()-1),1,(Utarray3.size()-1)*5+2);
            Uinfo.add(Ularray4.get(Ularray4.size()-1),0,(Ularray4.size()-1)*5+3);
            Uinfo.add(Utarray4.get(Utarray4.size()-1),1,(Utarray4.size()-1)*5+3);
            Uinfo.add(Ularray5.get(Ularray5.size()-1),0,(Ularray5.size()-1)*5+4);
            Uinfo.add(Utarray5.get(Utarray5.size()-1),1,(Utarray5.size()-1)*5+4);

        });



        university.getChildren().addAll(Uhead, Uinfo);


        //Twelvth
        VBox twelvth = new VBox();
        Label TWlabel = new Label("12th class");
        TWlabel.setStyle("-fx-font-size: 30px");
        GridPane TWinfo = new GridPane();

        Label TWschool = new Label("School Name:");
        TextField TWschoolinput = new TextField();
        Label TWboard = new Label("Board Name");
        TextField TWboardinput = new TextField();
        Label TWyear = new Label("Year Passed");
        TextField TWyearinput = new TextField();
        Label TWpercentage = new Label("Percentage");
        TextField TWpercentageinput = new TextField();

        TWinfo.add(TWschool, 0, 0);
        TWinfo.add(TWschoolinput, 1, 0);
        TWinfo.add(TWboard, 0, 1);
        TWinfo.add(TWboardinput, 1, 1);
        TWinfo.add(TWpercentage, 0, 2);
        TWinfo.add(TWpercentageinput, 1, 2);
        TWinfo.add(TWyear, 0, 3);
        TWinfo.add(TWyearinput, 1, 3);
        twelvth.getChildren().addAll(TWlabel, TWinfo);


        //Tenth
        VBox tenth = new VBox();
        Label TElabel = new Label("10th class");
        TElabel.setStyle("-fx-font-size: 30px");
        GridPane TEinfo = new GridPane();

        Label TEschool = new Label("School Name:");
        TextField TEschoolinput = new TextField();
        Label TEboard = new Label("Board Name");
        TextField TEboardinput = new TextField();
        Label TEyear = new Label("Year Passed");
        TextField TEyearinput = new TextField();
        Label TEpercentage = new Label("Percentage");
        TextField TEpercentageinput = new TextField();

        TEinfo.add(TEschool, 0, 0);
        TEinfo.add(TEschoolinput, 1, 0);
        TEinfo.add(TEboard, 0, 1);
        TEinfo.add(TEboardinput, 1, 1);
        TEinfo.add(TEpercentage, 0, 2);
        TEinfo.add(TEpercentageinput, 1, 2);
        TEinfo.add(TEyear, 0, 3);
        TEinfo.add(TEyearinput, 1, 3);
        tenth.getChildren().addAll(TElabel, TEinfo);



        VBox EEleft = new VBox();
        EEleft.getChildren().addAll(twelvth, tenth);
        VBox EEright = new VBox();
        EEright.getChildren().addAll(university);
        HBox EE = new HBox(EEleft,EEright);
        EE.setAlignment(Pos.TOP_LEFT);
        EE.setSpacing(200);
        BorderPane EEfinal=new BorderPane();
        HBox EEbottom=new HBox();
        Button EEnext=new Button("Next");EEnext.setOnAction(e->{primaryStage.setScene(scene3);});
        Button EEback=new Button("Back");EEback.setOnAction(e->{primaryStage.setScene(scene1);});
        Button EEsave=new Button("Save changes");

        EEbottom.getChildren().addAll(EEback,EEnext,EEsave);
        EEbottom.setAlignment(Pos.BASELINE_RIGHT);
        EEfinal.setCenter(EE);
        EEfinal.setBottom(EEbottom);

        scene2 = new Scene(EEfinal, 0.90 * r.getWidth(), 0.90 * r.getHeight());





//Scene Work Experience information
        //Company
        VBox company = new VBox();
        Label Clabel = new Label("Company");
        Clabel.setStyle("-fx-font-size: 30px");
        Button addcompanies=new Button("+");
        HBox Chead=new HBox(Clabel,addcompanies);
        GridPane Cinfo = new GridPane();


        ArrayList<Label> Clarray1=new ArrayList<>();
        ArrayList<TextField> Ctarray1=new ArrayList<>();
        ArrayList<Label> Clarray2=new ArrayList<>();
        ArrayList<TextField> Ctarray2=new ArrayList<>();
        ArrayList<Label> Clarray3=new ArrayList<>();
        ArrayList<TextField> Ctarray3=new ArrayList<>();
        ArrayList<Label> Clarray4=new ArrayList<>();
        ArrayList<TextField> Ctarray4=new ArrayList<>();
        ArrayList<Label> Clarray5=new ArrayList<>();
        ArrayList<TextArea> Ctarray5=new ArrayList<>();



        addcompanies.setOnAction(e->{
            Clarray1.add(new Label("Company Name"));
            Ctarray1.add(new TextField());
            Clarray2.add(new Label("Position"));
            Ctarray2.add(new TextField());
            Clarray3.add(new Label("Period"));
            Ctarray3.add(new TextField());
            Clarray4.add(new Label("Salary"));
            Ctarray4.add(new TextField());
            Clarray5.add(new Label("Description :"));
            Ctarray5.add(new TextArea());

            Ctarray5.get(Ctarray5.size()-1).setPrefWidth(200);
            Ctarray5.get(Ctarray5.size()-1).setPrefHeight(75);


            Cinfo.add(Clarray1.get(Clarray1.size()-1),0,(Clarray1.size()-1)*5);
            Cinfo.add(Ctarray1.get(Ctarray1.size()-1),1,(Ctarray1.size()-1)*5);
            Cinfo.add(Clarray2.get(Clarray2.size()-1),0,(Clarray2.size()-1)*5+1);
            Cinfo.add(Ctarray2.get(Ctarray2.size()-1),1,(Ctarray2.size()-1)*5+1);
            Cinfo.add(Clarray3.get(Clarray3.size()-1),0,(Clarray3.size()-1)*5+2);
            Cinfo.add(Ctarray3.get(Ctarray3.size()-1),1,(Ctarray3.size()-1)*5+2);
            Cinfo.add(Clarray4.get(Clarray4.size()-1),0,(Clarray4.size()-1)*5+3);
            Cinfo.add(Ctarray4.get(Ctarray4.size()-1),1,(Ctarray4.size()-1)*5+3);
            Cinfo.add(Clarray5.get(Clarray5.size()-1),0,(Clarray5.size()-1)*5+4);
            Cinfo.add(Ctarray5.get(Ctarray5.size()-1),1,(Ctarray5.size()-1)*5+4);

        });

        company.getChildren().addAll(Chead, Cinfo);


        //Internship
        VBox internship = new VBox();
        Label Ilabel = new Label("Internship");
        Ilabel.setStyle("-fx-font-size: 30px");
        Button addinternship=new Button("+");
        GridPane Iinfo = new GridPane();
        HBox Ihead=new HBox(Ilabel,addinternship);
 


        ArrayList<Label> Ilarray1=new ArrayList<>();
        ArrayList<TextField> Itarray1=new ArrayList<>();
        ArrayList<Label> Ilarray2=new ArrayList<>();
        ArrayList<TextField> Itarray2=new ArrayList<>();
        ArrayList<Label> Ilarray3=new ArrayList<>();
        ArrayList<TextField> Itarray3=new ArrayList<>();
        ArrayList<Label> Ilarray4=new ArrayList<>();
        ArrayList<TextField> Itarray4=new ArrayList<>();
        ArrayList<Label> Ilarray5=new ArrayList<>();
        ArrayList<TextArea> Itarray5=new ArrayList<>();



        addinternship.setOnAction(e->{
            Ilarray1.add(new Label("Company Name"));
            Itarray1.add(new TextField());
            Ilarray2.add(new Label("Position"));
            Itarray2.add(new TextField());
            Ilarray3.add(new Label("Period"));
            Itarray3.add(new TextField());
            Ilarray4.add(new Label("Stipend"));
            Itarray4.add(new TextField());
            Ilarray5.add(new Label("Description :"));
            Itarray5.add(new TextArea());

            Itarray5.get(Itarray5.size()-1).setPrefWidth(200);
            Itarray5.get(Itarray5.size()-1).setPrefHeight(75);


            Iinfo.add(Ilarray1.get(Ilarray1.size()-1),0,(Ilarray1.size()-1)*5);
            Iinfo.add(Itarray1.get(Itarray1.size()-1),1,(Itarray1.size()-1)*5);
            Iinfo.add(Ilarray2.get(Ilarray2.size()-1),0,(Ilarray2.size()-1)*5+1);
            Iinfo.add(Itarray2.get(Itarray2.size()-1),1,(Itarray2.size()-1)*5+1);
            Iinfo.add(Ilarray3.get(Ilarray3.size()-1),0,(Ilarray3.size()-1)*5+2);
            Iinfo.add(Itarray3.get(Itarray3.size()-1),1,(Itarray3.size()-1)*5+2);
            Iinfo.add(Ilarray4.get(Ilarray4.size()-1),0,(Ilarray4.size()-1)*5+3);
            Iinfo.add(Itarray4.get(Itarray4.size()-1),1,(Itarray4.size()-1)*5+3);
            Iinfo.add(Ilarray5.get(Ilarray5.size()-1),0,(Ilarray5.size()-1)*5+4);
            Iinfo.add(Itarray5.get(Itarray5.size()-1),1,(Itarray5.size()-1)*5+4);

        });

        internship.getChildren().addAll(Ihead, Iinfo);



        HBox EX = new HBox(company,internship);
        EX.setAlignment(Pos.TOP_LEFT);
        EX.setSpacing(400);
        BorderPane EXfinal=new BorderPane();
        HBox EXbottom=new HBox();
        Button EXnext=new Button("Next");EXnext.setOnAction(e->{primaryStage.setScene(scene4);});
        Button EXback=new Button("Back");EXback.setOnAction(e->{primaryStage.setScene(scene2);});
        Button EXsave=new Button("Save changes");
        EXbottom.getChildren().addAll(EXback,EXnext,EXsave);
        EXbottom.setAlignment(Pos.BASELINE_RIGHT);
        EXfinal.setCenter(EX);
        EXfinal.setBottom(EXbottom);

        scene3 = new Scene(EXfinal, 0.90 * r.getWidth(), 0.90 * r.getHeight());


//Projects and positions of responsibility
        //project
        VBox project = new VBox();
        Label Plabel = new Label("Projects");
        Plabel.setStyle("-fx-font-size: 30px");
        Button addproject=new Button("+");
        GridPane Pinfo = new GridPane();
        HBox Phead=new HBox(Plabel,addproject);

        ArrayList<Label> Plarray1=new ArrayList<>();
        ArrayList<TextField> Ptarray1=new ArrayList<>();
        ArrayList<Label> Plarray2=new ArrayList<>();
        ArrayList<TextField> Ptarray2=new ArrayList<>();
        ArrayList<Label> Plarray3=new ArrayList<>();
        ArrayList<TextField> Ptarray3=new ArrayList<>();
        ArrayList<Label> Plarray4=new ArrayList<>();
        ArrayList<TextArea> Ptarray4=new ArrayList<>();


        addproject.setOnAction(e->{
            Plarray1.add(new Label("Project name"));
            Ptarray1.add(new TextField());
            Plarray2.add(new Label("Project Domain "));
            Ptarray2.add(new TextField());
            Plarray3.add(new Label("Company/Institution"));
            Ptarray3.add(new TextField());
            Plarray4.add(new Label("Description"));
            Ptarray4.add(new TextArea());

            Ptarray4.get(Ptarray4.size()-1).setPrefWidth(200);
            Ptarray4.get(Ptarray4.size()-1).setPrefHeight(75);



            Pinfo.add(Plarray1.get(Plarray1.size()-1),0,(Plarray1.size()-1)*4);
            Pinfo.add(Ptarray1.get(Ptarray1.size()-1),1,(Ptarray1.size()-1)*4);
            Pinfo.add(Plarray2.get(Plarray2.size()-1),0,(Plarray2.size()-1)*4+1);
            Pinfo.add(Ptarray2.get(Ptarray2.size()-1),1,(Ptarray2.size()-1)*4+1);
            Pinfo.add(Plarray3.get(Plarray3.size()-1),0,(Plarray3.size()-1)*4+2);
            Pinfo.add(Ptarray3.get(Ptarray3.size()-1),1,(Ptarray3.size()-1)*4+2);
            Pinfo.add(Plarray4.get(Plarray4.size()-1),0,(Plarray4.size()-1)*4+3);
            Pinfo.add(Ptarray4.get(Ptarray4.size()-1),1,(Ptarray4.size()-1)*4+3);
        });


        project.getChildren().addAll(Phead, Pinfo);


        //Position and resposibilities
        VBox positionandresponsibilities = new VBox();
        Label PRlabel = new Label("Positions and responsibilities");
        PRlabel.setStyle("-fx-font-size: 30px");
        GridPane PRinfo = new GridPane();
        Button addresponsibilities=new Button("+");
        HBox PRhead=new HBox(PRlabel,addresponsibilities);

        ArrayList<Label> PRlarray1=new ArrayList<>();
        ArrayList<TextField> PRtarray1=new ArrayList<>();
        ArrayList<Label> PRlarray2=new ArrayList<>();
        ArrayList<TextField> PRtarray2=new ArrayList<>();
        ArrayList<Label> PRlarray3=new ArrayList<>();
        ArrayList<TextArea> PRtarray3=new ArrayList<>();


        addresponsibilities.setOnAction(e->{
            PRlarray1.add(new Label("Position name "));
            PRtarray1.add(new TextField());
            PRlarray2.add(new Label("Position held at "));
            PRtarray2.add(new TextField());
            PRlarray3.add(new Label("Position description"));
            PRtarray3.add(new TextArea());

            PRtarray3.get(PRtarray3.size()-1).setPrefWidth(200);
            PRtarray3.get(PRtarray3.size()-1).setPrefHeight(75);


            PRinfo.add(PRlarray1.get(PRlarray1.size()-1),0,(PRlarray1.size()-1)*3);
            PRinfo.add(PRtarray1.get(PRtarray1.size()-1),1,(PRtarray1.size()-1)*3);
            PRinfo.add(PRlarray2.get(PRlarray2.size()-1),0,(PRlarray2.size()-1)*3+1);
            PRinfo.add(PRtarray2.get(PRtarray2.size()-1),1,(PRtarray2.size()-1)*3+1);
            PRinfo.add(PRlarray3.get(PRlarray3.size()-1),0,(PRlarray3.size()-1)*3+2);
            PRinfo.add(PRtarray3.get(PRtarray3.size()-1),1,(PRtarray3.size()-1)*3+2);
        });


        positionandresponsibilities.getChildren().addAll(PRhead, PRinfo);

        HBox PPR = new HBox(project, positionandresponsibilities);
        PPR.setAlignment(Pos.TOP_LEFT);
        PPR.setSpacing(400);
        BorderPane PPRfinal=new BorderPane();
        HBox PPRbottom=new HBox();
        Button PPRnext=new Button("Next");PPRnext.setOnAction(e->{primaryStage.setScene(scene5);});
        Button PPRback=new Button("Back");PPRback.setOnAction(e->{primaryStage.setScene(scene3);});
        Button PPRsave=new Button("Save changes");
        PPRbottom.getChildren().addAll(PPRback,PPRnext,PPRsave);
        PPRbottom.setAlignment(Pos.BASELINE_RIGHT);
        PPRfinal.setCenter(PPR);
        PPRfinal.setBottom(PPRbottom);

        scene4 = new Scene(PPRfinal, 0.90 * r.getWidth(), 0.90 * r.getHeight());
        //Skills and Extra curricular
        //Skills
        VBox skills = new VBox();
        Label Slabel = new Label("Skills ");
        Slabel.setStyle("-fx-font-size: 30px");
        GridPane Sinfo = new GridPane();
        Button addskill=new Button("+");
        HBox Shead=new HBox(Slabel,addskill);


        ArrayList<Label> Slarray1=new ArrayList<>();
        ArrayList<TextField> Starray1=new ArrayList<>();
        ArrayList<Label> Slarray2=new ArrayList<>();
        ArrayList<TextField> Starray2=new ArrayList<>();



        addskill.setOnAction(e->{
            Slarray1.add(new Label("skill"));
            Starray1.add(new TextField());
            Slarray2.add(new Label("Proficiency"));
            Starray2.add(new TextField());
            Sinfo.add(Slarray1.get(Slarray1.size()-1),0,(Slarray1.size()-1)*2);
            Sinfo.add(Starray1.get(Starray1.size()-1),1,(Starray1.size()-1)*2);
            Sinfo.add(Slarray2.get(Slarray2.size()-1),0,(Slarray2.size()-1)*2+1);
            Sinfo.add(Starray2.get(Starray2.size()-1),1,(Starray2.size()-1)*2+1);
        });

        skills.getChildren().addAll(Shead, Sinfo);

        //Extracurricular
        VBox extracurricular = new VBox();
        Label ECAlabel = new Label("Extra Curricular Activities");
        ECAlabel.setStyle("-fx-font-size: 30px");
        GridPane ECAinfo = new GridPane();
        Button addECA=new Button("+");
        HBox ECAhead=new HBox(ECAlabel,addECA);


        ArrayList<Label> ECAlarray1=new ArrayList<>();
        ArrayList<TextField> ECAtarray1=new ArrayList<>();
        ArrayList<Label> ECAlarray2=new ArrayList<>();
        ArrayList<TextArea> ECAtarray2=new ArrayList<>();


        addECA.setOnAction(e->{
            ECAlarray1.add(new Label("ECA name"));
            ECAtarray1.add(new TextField());
            ECAlarray2.add(new Label("ECA decription"));
            ECAtarray2.add(new TextArea());

            ECAtarray2.get(ECAtarray2.size()-1).setPrefWidth(200);
            ECAtarray2.get(ECAtarray2.size()-1).setPrefHeight(75);

            ECAinfo.add(ECAlarray1.get(ECAlarray1.size()-1),0,(ECAlarray1.size()-1)*2);
            ECAinfo.add(ECAtarray1.get(ECAtarray1.size()-1),1,(ECAtarray1.size()-1)*2);
            ECAinfo.add(ECAlarray2.get(ECAlarray2.size()-1),0,(ECAlarray2.size()-1)*2+1);
            ECAinfo.add(ECAtarray2.get(ECAtarray2.size()-1),1,(ECAtarray2.size()-1)*2+1);
        });


        extracurricular.getChildren().addAll(ECAhead, ECAinfo);

        HBox SECA = new HBox(skills, extracurricular);
        SECA.setAlignment(Pos.TOP_LEFT);
        SECA.setSpacing(400);
        BorderPane SECAfinal=new BorderPane();
        HBox SECAbottom=new HBox();
        Button SECAnext=new Button("Next");SECAnext.setOnAction(e->{primaryStage.setScene(sc);});
        Button SECAback=new Button("Back");SECAback.setOnAction(e->{primaryStage.setScene(scene4);});
        Button SECAsave=new Button("Save changes");
        SECAbottom.getChildren().addAll(SECAback,SECAnext,SECAsave);
        SECAbottom.setAlignment(Pos.BASELINE_RIGHT);
        SECAfinal.setCenter(SECA);
        SECAfinal.setBottom(SECAbottom);

        scene5 = new Scene(SECAfinal, 0.90 * r.getWidth(), 0.90 * r.getHeight());

//Button Actions on Onlogin Page
        B1.setOnAction(e -> {
            try{
                String fetchSQL = "Select * from personaldetails where UID = " + U_id;
                ResultSet rs = stmt.executeQuery(fetchSQL);
                rs.absolute(1);
                AFnameinput.setText(rs.getString(2));
                ALnameinput.setText(rs.getString(3));
                ADOBinput.setText(rs.getString("DOB"));
                Agenderinput.setText(rs.getString("gender"));
                Acategoryinput.setText(rs.getString("category"));
                CDemailinput.setText(rs.getString("email"));
                CDmobileinput.setText(rs.getString("mobile"));
                Lhouseinput.setText(rs.getString("HNO"));
                LStreetInput.setText(rs.getString("Street"));
                LCityInput.setText(rs.getString("city"));
                LCountryinput.setText(rs.getString("country"));
                Lpincodeinput.setText(rs.getString("pincode"));

                fetchSQL = "Select * from guardiandetails where UID = " + U_id;
                rs = stmt.executeQuery(fetchSQL);
                rs.absolute(1);
                Gfnameinput.setText(rs.getString(2));
                Gmnameinput.setText(rs.getString(3));
                Gfnumberinput.setText(rs.getString(4));
                Gmnumberinput.setText(rs.getString(5));
                Gfoccupationinput.setText(rs.getString(6));
                Gmoccupationinput.setText(rs.getString(7));

            }catch(SQLException exception){
                exception.getStackTrace();
            }
            primaryStage.setScene(scene1);
        });
        B2.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });
        B3.setOnAction(e -> {
            primaryStage.setScene(scene3);
        });
        B4.setOnAction(e -> {
            primaryStage.setScene(scene4);
        });
        B5.setOnAction(e -> {
            primaryStage.setScene(scene5);
        });



        bSignUp.setOnAction(e -> {
            Temail.setText("");
            pass1.setText("");
            pass2.setText("");
            username.setText("");
            password.setText("");
            Lmsg.setText("");
            primaryStage.setScene(signup);
        });


        bRegister.setOnAction(e -> {

            String email = Temail.getText();
            String p1 = pass1.getText();
            String p2 = pass2.getText();

            try{
                if (email.contains("@gmail.com")) {
                   if (p1.length() > 0 && p2.length() > 0) {

                        if (p1.equals(p2)) {
                            String sql2 = "select username from credentials";
                            ResultSet rs = stmt.executeQuery(sql2);
                            boolean profileCheck =TRUE;

                            //while to check if user already registered
                            while(profileCheck && rs.next()){
                                if(rs.getString("username").equals(email))
                                    profileCheck = FALSE;
                            }

                            //if not registered then
                            if(profileCheck){
                                String sql1 = "Insert into credentials(username,password) values('" + email + "','" + p1 + "')";
                                System.out.println(sql1);
                                stmt.executeUpdate(sql1);
                                primaryStage.setScene(login);
                                Smsg.setText("");
                            }else {
                                Smsg.setText("email already registered");
                                System.out.println("user already registered");
                            }

                        } else {
                            Smsg.setText("password confirmation failed");
                            System.out.println("Check password");
                        }
                    } else {
                        Smsg.setText("enter a paassword");
                        System.out.println("Enter a valid password");
                    }
                } else {
                    Smsg.setText("invalid email");
                    System.out.println("Please enter a valid email");
                }
            }catch (SQLException a){
                a.printStackTrace();
            }

        });

        bLogin.setOnAction(e -> {
            try {
                String email = username.getText();
                String pass = password.getText();
                ResultSet rs = stmt.executeQuery("select * from credentials where username = '" + email + "'");

                boolean checkuser = FALSE;
                while(rs.next()){
                    if(rs.getString("username").equals(email)){
                        U_id = rs.getInt(1);
                        System.out.println("userID: " + U_id);
                        checkuser = TRUE;
                        break;
                    }
                }
                rs.absolute(1);
                if(checkuser && rs.getString("password").equals(pass)){
                    primaryStage.setScene(sc);
                    Lmsg.setText("");
                }else if(checkuser && !rs.getString("password").equals(pass)){
                    Lmsg.setText("Incorrect password");
                    System.out.println("Incorrect password");
                }else {
                    Lmsg.setText("Signup first!");
                    System.out.println("User not registered");
                }

            }catch(SQLException exception){
                exception.printStackTrace();
            }

        });


        PIsave.setOnAction(e->{
            try{
                String UAsql = "Update personaldetails set fName = '"
                        + AFnameinput.getText() + "' ,lName= '"
                        + ALnameinput.getText() + "' ,DOB="
                        + ADOBinput.getText() + " ,email= '"
                        + CDemailinput.getText() + "' ,category = '"
                        + Acategoryinput.getText() + "' ,gender = '"
                        + Agenderinput.getText() + "' ,mobile="
                        + CDmobileinput.getText() + ", HNO ="
                        + Lhouseinput.getText() + " ,Street='"
                        + LStreetInput.getText() + "' ,city='"
                        + LCityInput.getText() + "', pincode = "
                        + Lpincodeinput.getText() + ", country = '"
                        + LCountryinput.getText() + "' where UID = " + U_id;

                String UGsql = "Update guardiandetails set fatherName = '"
                        +Gfnameinput.getText() + "', motherName ='"
                        +Gmnameinput.getText() + "', fatherNumber ="
                        +Gfnumberinput.getText() + ", motherNumber = "
                        +Gmnumberinput.getText() + ", fatherOcc = '"
                        +Gfoccupationinput.getText() + "', motherOcc = '"
                        +Gmoccupationinput.getText() + "' where UID = " + U_id;

                stmt.executeUpdate(UAsql);
                System.out.println("Changes saved");
                stmt.executeUpdate(UGsql);
                System.out.println("Changes saved");
            }catch(SQLException exception){
                exception.printStackTrace();
            }
        });



        primaryStage.setTitle("CV Builder");
        primaryStage.setScene(login);
        primaryStage.show();

    }
}


//ayushjagga7@gmail.com
//Utarray1.get(0)= Pehli degree ka naam
//Utarray1.get(1)= Doosri degree ka naam
//Utarray2.get(0)= Pehli INSTitution ka naam
//Utarray2.get(1)= Doosri Institution ka naam