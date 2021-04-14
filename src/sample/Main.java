package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main extends Application {
    private static database myserver = new database();
    private static Connection conn = myserver.main();

    static Scene sc, scene1, scene2, scene3, scene4;
    static Stage window;
    static Scene mainScene;
    static Scene login, signup;

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane1 = new GridPane();
        HBox cPane1 = new HBox();
        HBox hb11 = new HBox();
        VBox hb12 = new VBox();

        Label heading1 = new Label("Login Page");
        heading1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 32));
        heading1.setPadding(new Insets(10));
        heading1.setTextFill(Color.ANTIQUEWHITE);
        pane1.setAlignment(Pos.CENTER);

        Image image1 = new Image(new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\iamge.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setPreserveRatio(true);


        Label luser = new Label("Username");
        TextField username = new TextField();
        Label lpass = new Label("Password");
        TextField password = new TextField();
        Button bLogin = new Button("Login");
        Button bSignUp = new Button("SignUp");

        hb12.setAlignment(Pos.CENTER);
        hb11.getChildren().addAll(imageView1);
        hb12.getChildren().addAll(heading1, luser, username, lpass, password, bSignUp, bLogin);
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
        login = new Scene(pane1, 900, 650);


        //vwewjhviqbdeuiwdbeuiqdbqikbd
        Statement stmt = conn.createStatement();
        GridPane pane2 = new GridPane();
        HBox cPane2 = new HBox();
        HBox hb21 = new HBox();
        VBox hb22 = new VBox();


        Label heading2 = new Label("Register");
        heading2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 32));
        heading2.setPadding(new Insets(10));
        heading2.setTextFill(Color.RED);
        pane2.setAlignment(Pos.CENTER);


        Image image2 = new Image(new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\iamge.png"));
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

        hb22.setAlignment(Pos.CENTER);
        hb21.getChildren().addAll(imageView2);
        hb22.getChildren().addAll(heading2, Lemail, Temail, LPassword, pass1, LcPassword, pass2, bRegister);
        cPane2.getChildren().addAll(hb21, hb22);
        pane2.getChildren().addAll(cPane2);

        cPane2.setPadding(new Insets(50));
        BackgroundFill b_fill2 = new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY);
        Background bground2 = new Background(b_fill2);
        cPane2.setBackground(bground2);

        BackgroundFill background_fill2 = new BackgroundFill(Color.rgb(48, 71, 94), CornerRadii.EMPTY, Insets.EMPTY);
        Background background2 = new Background(background_fill2);
        pane2.setBackground(background2);

        signup = new Scene(pane2, 900, 650);


//inrejiv3nvvwidn3cxhuweicw
        window = primaryStage;
        BorderPane root = new BorderPane();
        Rectangle2D r = Screen.getPrimary().getBounds();

//background image
        FileInputStream input = new FileInputStream("D:\\shiv nadar university\\Projects\\cv\\backkground.jpg");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100, 100, TRUE, TRUE, TRUE, FALSE));
        Background background = new Background(backgroundimage);
        root.setBackground(background);


        GridPane info = new GridPane();
        info.setMaxHeight(r.getHeight() * 0.5);
        info.setMaxWidth(r.getWidth() * 0.7);
        info.setStyle("-fx-background-color: #FFFFFF;");
        info.setAlignment(Pos.CENTER);
        info.setHgap(20);
        info.setVgap(10);
        info.setGridLinesVisible(TRUE);

//personal information
        FileInputStream input1 = new FileInputStream("D:\\shiv nadar university\\Projects\\cv\\personal.png");
        Image i1 = new Image(input1);
        ImageView im1 = new ImageView(i1);
        im1.setFitWidth(125);
        im1.setFitHeight(125);
        Button B1 = new Button();
        B1.setText("Personal Informtion");
        VBox v1 = new VBox();
        v1.getChildren().addAll(im1, B1);

//education and experience
        FileInputStream input2 = new FileInputStream("D:\\shiv nadar university\\Projects\\cv\\education.png");
        Image i2 = new Image(input2);
        ImageView im2 = new ImageView(i2);
        im2.setFitWidth(125);
        im2.setFitHeight(125);
        Button B2 = new Button();
        B2.setText("Education And work experience");
        B2.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });
        VBox v2 = new VBox();
        v2.getChildren().addAll(im2, B2);

//Projects and PR
        FileInputStream input3 = new FileInputStream("D:\\shiv nadar university\\Projects\\cv\\experience.png");
        Image i3 = new Image(input3);
        ImageView im3 = new ImageView(i3);
        im3.setFitWidth(125);
        im3.setFitHeight(125);
        Button B3 = new Button();
        B3.setText("Projects and Positions of Responsibilities");
        B3.setOnAction(e -> {
            primaryStage.setScene(scene3);
        });
        VBox v3 = new VBox();
        v3.getChildren().addAll(im3, B3);


//skills and ECA
        FileInputStream input4 = new FileInputStream("D:\\shiv nadar university\\Projects\\cv\\experience.png");
        Image i4 = new Image(input4);
        ImageView im4 = new ImageView(i4);
        im4.setFitWidth(125);
        im4.setFitHeight(125);
        Button B4 = new Button();
        B4.setText("Skills and Extra Curricular Activities");
        B4.setOnAction(e -> {
            primaryStage.setScene(scene3);
        });
        VBox v4 = new VBox();
        v4.getChildren().addAll(im4, B4);


        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER);
        v4.setAlignment(Pos.CENTER);
        info.add(v1, 0, 0);
        info.add(v2, 1, 0);
        info.add(v3, 2, 0);
        info.add(v4, 3, 0);
        root.setCenter(info);
        sc = new Scene(root, 0.90 * r.getWidth(), 0.90 * r.getHeight());


//Button Actions on Onlogin Page
        B1.setOnAction(e -> {
            window.setScene(scene1);
        });
        B2.setOnAction(e -> {
            window.setScene(scene2);
        });
        B3.setOnAction(e -> {
            window.setScene(scene3);
        });
        B4.setOnAction(e -> {
            window.setScene(scene4);
        });


//Scene of personal information
        //About
        VBox about = new VBox();
        Label Alabel = new Label("About");
        Alabel.setStyle("-fx-font-size: 30px");
        GridPane Ainfo = new GridPane();

        Label Aname = new Label("Name");
        TextField Anameinput = new TextField();
        Label ADOB = new Label("Date of birth");
        TextField ADOBinput = new TextField();
        Label Agender = new Label("Gender");
        TextField Agenderinput = new TextField();
        Label Acategory = new Label("Category");
        TextField Acategoryinput = new TextField();

        Ainfo.add(Aname, 0, 0);
        Ainfo.add(Anameinput, 1, 0);
        Ainfo.add(ADOB, 0, 1);
        Ainfo.add(ADOBinput, 1, 1);
        Ainfo.add(Agender, 0, 2);
        Ainfo.add(Agenderinput, 1, 2);
        Ainfo.add(Acategory, 0, 3);
        Ainfo.add(Acategoryinput, 1, 3);

        about.getChildren().addAll(Alabel, Ainfo);


        //Contact Details
        VBox contact = new VBox();
        Label CDlabel = new Label("Contact Details");
        CDlabel.setStyle("-fx-font-size: 30px");
        GridPane CDinfo = new GridPane();

        Label CDmobile = new Label("Mobile No.");
        TextField CDmobileinput = new TextField();
        Label CDemail = new Label("Email adress");
        TextField CDemailinput = new TextField();
        Label CDlin = new Label("LinkedIn profile");
        TextField CDlininput = new TextField();

        CDinfo.add(CDmobile, 0, 0);
        CDinfo.add(CDmobileinput, 1, 0);
        CDinfo.add(CDemail, 0, 1);
        CDinfo.add(CDemailinput, 1, 1);
        CDinfo.add(CDlin, 0, 2);
        CDinfo.add(CDlininput, 1, 2);
        contact.getChildren().addAll(CDlabel, CDinfo);

        //Location
        VBox location = new VBox();
        Label Llabel = new Label("Adress");
        Llabel.setStyle("-fx-font-size: 30px");
        GridPane Linfo = new GridPane();

        Label LCountry = new Label("Country");
        TextField Lcountryinput = new TextField();
        Label Lstate = new Label("Date of birth");
        TextField Lstateinput = new TextField();
        Label Lpincode = new Label("Pincode");
        TextField Lpincodeinput = new TextField();
        Label Lhouse = new Label("House Adress");
        TextField Lhouseinput = new TextField();

        Linfo.add(LCountry, 0, 0);
        Linfo.add(Lcountryinput, 1, 0);
        Linfo.add(Lstate, 0, 1);
        Linfo.add(Lstateinput, 1, 1);
        Linfo.add(Lpincode, 0, 2);
        Linfo.add(Lpincodeinput, 1, 2);
        Linfo.add(Lhouse, 0, 3);
        Linfo.add(Lhouseinput, 1, 3);

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
        PIleft.getChildren().addAll(about, contact, location);
        VBox PIright = new VBox();
        PIright.getChildren().addAll(guardian);
        HBox PI = new HBox(PIleft, PIright);
        PI.setAlignment(Pos.TOP_LEFT);
        PI.setSpacing(400);
        scene1 = new Scene(PI, 0.90 * r.getWidth(), 0.90 * r.getHeight());


        //about.setAlignment(Pos.CENTER);

                /*Button Br1=new Button();
        Br1.setText("back");
        Br1.setOnAction(e->{
            window.setScene(sc);
        });
*/
//Scene of Education and Work Experience information
        //College
        VBox university = new VBox();
        Label Ulabel = new Label("University");
        Ulabel.setStyle("-fx-font-size: 30px");
        GridPane Uinfo = new GridPane();

        Label Uname = new Label("College Name:");
        TextField Unameinput = new TextField();
        Label Umajor = new Label("Major");
        TextField Umajorinput = new TextField();
        Label Uminor = new Label("Minor");
        TextField Uminorinput = new TextField();
        Label Ucgpa = new Label("CGPA");
        TextField Ucgpainput = new TextField();

        Uinfo.add(Uname, 0, 0);
        Uinfo.add(Unameinput, 1, 0);
        Uinfo.add(Umajor, 0, 1);
        Uinfo.add(Umajorinput, 1, 1);
        Uinfo.add(Uminor, 0, 2);
        Uinfo.add(Uminorinput, 1, 2);
        Uinfo.add(Ucgpa, 0, 3);
        Uinfo.add(Ucgpainput, 1, 3);

        university.getChildren().addAll(Ulabel, Uinfo);


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


        //Company
        VBox company = new VBox();
        Label Clabel = new Label("Company");
        Clabel.setStyle("-fx-font-size: 30px");
        GridPane Cinfo = new GridPane();

        Label Cname = new Label("Comapny Name:");
        TextField Cnameinput = new TextField();
        Label Cyear = new Label("Years Worked");
        TextField Cyearinput = new TextField();

        Cinfo.add(Cname, 0, 0);
        Cinfo.add(Cnameinput, 1, 0);
        Cinfo.add(Cyear, 0, 1);
        Cinfo.add(Cyearinput, 1, 1);
        company.getChildren().addAll(Clabel, Cinfo);


        //
        VBox internship = new VBox();
        Label Ilabel = new Label("Internship");
        Ilabel.setStyle("-fx-font-size: 30px");
        GridPane Iinfo = new GridPane();

        Label Iname = new Label("Company Name:");
        TextField Inameinput = new TextField();
        Label Iyear = new Label("Years Worked");
        TextField Iyearinput = new TextField();

        Iinfo.add(Iname, 0, 0);
        Iinfo.add(Inameinput, 1, 0);
        Iinfo.add(Iyear, 0, 1);
        Iinfo.add(Iyearinput, 1, 1);
        internship.getChildren().addAll(Ilabel, Iinfo);

        VBox EEleft = new VBox();
        EEleft.getChildren().addAll(university, twelvth, tenth);
        VBox EEright = new VBox();
        EEright.getChildren().addAll(company, internship);
        HBox EE = new HBox(EEleft, EEright);
        EE.setAlignment(Pos.TOP_LEFT);
        EE.setSpacing(400);
        scene2 = new Scene(EE, 0.90 * r.getWidth(), 0.90 * r.getHeight());


//Projects and positions of responsibility
        //project
        VBox project = new VBox();
        Label Plabel = new Label("Projects");
        Plabel.setStyle("-fx-font-size: 30px");
        GridPane Pinfo = new GridPane();

        Label Pname = new Label("Project Name:");
        TextField Pnameinput = new TextField();
        Label Pdescription = new Label("Project Description");
        TextField Pdescriptioninput = new TextField();
        Label Plang = new Label("Languages used");
        TextField Planginput = new TextField();

        Pinfo.add(Pname, 0, 0);
        Pinfo.add(Pnameinput, 1, 0);
        Pinfo.add(Pdescription, 0, 1);
        Pinfo.add(Pdescriptioninput, 1, 1);
        Pinfo.add(Plang, 0, 2);
        Pinfo.add(Planginput, 1, 2);

        project.getChildren().addAll(Plabel, Pinfo);


        //Position and resposibilities
        VBox positionandresponsibilities = new VBox();
        Label PRlabel = new Label("POsitions and responsibilities");
        PRlabel.setStyle("-fx-font-size: 30px");
        GridPane PRinfo = new GridPane();

        Label PRname = new Label("Position Name:");
        TextField PRnameinput = new TextField();
        Label PRdescription = new Label("Position Description");
        TextField PRdescriptioninput = new TextField();
        Label PRat = new Label("Position held at ");
        TextField PRatinput = new TextField();

        PRinfo.add(PRname, 0, 0);
        PRinfo.add(PRnameinput, 1, 0);
        PRinfo.add(PRdescription, 0, 1);
        PRinfo.add(PRdescriptioninput, 1, 1);
        PRinfo.add(PRat, 0, 2);
        PRinfo.add(PRatinput, 1, 2);

        positionandresponsibilities.getChildren().addAll(PRlabel, PRinfo);

        HBox PPR = new HBox(project, positionandresponsibilities);
        PPR.setAlignment(Pos.TOP_LEFT);
        PPR.setSpacing(400);
        scene3 = new Scene(PPR, 0.90 * r.getWidth(), 0.90 * r.getHeight());
//Skills and Extra curricular
        //Skills
        VBox skills = new VBox();
        Label Slabel = new Label("Skills ");
        Slabel.setStyle("-fx-font-size: 30px");
        GridPane Sinfo = new GridPane();

        Label Sname = new Label("Skill:");
        TextField Snameinput = new TextField();

        Sinfo.add(Sname, 0, 0);
        Sinfo.add(Snameinput, 1, 0);

        skills.getChildren().addAll(Slabel, Sinfo);


        //
        VBox extracurricular = new VBox();
        Label ECAlabel = new Label("Extra Curricular Activities");
        ECAlabel.setStyle("-fx-font-size: 30px");
        GridPane ECAinfo = new GridPane();

        Label ECAname = new Label("ECA Name:");
        TextField ECAnameinput = new TextField();
        ECAinfo.add(ECAname, 0, 0);
        ECAinfo.add(ECAnameinput, 1, 0);

        extracurricular.getChildren().addAll(ECAlabel, ECAinfo);

        HBox SECA = new HBox(skills, extracurricular);
        SECA.setAlignment(Pos.TOP_LEFT);
        SECA.setSpacing(400);
        scene4 = new Scene(SECA, 0.90 * r.getWidth(), 0.90 * r.getHeight());


        bSignUp.setOnAction(e -> primaryStage.setScene(signup));
        bRegister.setOnAction(e -> {
            String email = Temail.getText();
            String p1 = pass1.getText();
            String p2 = pass1.getText();

            if (email.contains("@gmail.com")) {
                if (p1.length() > 0 && p2.length() > 0) {
                    if (p1.equals(p2)) {
                        String sql = "Insert into credentials(username,password) values('" + email + "','" + p1 + "')";
                        System.out.println(sql);
                        try {
                            stmt.executeUpdate(sql);
                            primaryStage.setScene(login);
                        } catch (SQLException throwables) {
                            System.out.println("something went wrong!!");
                        }
//                            catch (FileNotFoundException fileNotFoundException) {
//                                fileNotFoundException.printStackTrace();
//                            }
                    } else {
                        System.out.println("Check password");
                    }
                } else {
                    System.out.println("Enter a valid password");
                }
            } else
                System.out.println("Please enter a valid email");
        });

        bLogin.setOnAction(e -> {
            primaryStage.setScene(sc);
        });

        primaryStage.setTitle("CV Builder");
        primaryStage.setScene(login);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}


//
//




























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
//        Image image = new Image(new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\iamge.png"));
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
//        EventHandler<ActionEvent> event2signUP = new EventHandler<ActionEvent>()  {
//            public void handle(ActionEvent e) {
//                try {
//                    mainScene = new Scene(signUp(pS), 900, 650);
//                    pS.setScene(mainScene);
//                } catch (FileNotFoundException fileNotFoundException) {
//                    fileNotFoundException.printStackTrace();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            }
//        };
//
//        EventHandler<ActionEvent> event2login = new EventHandler<ActionEvent>()  {
//            public void handle(ActionEvent e) {
//                try {
//                    mainScene = new Scene(onLogin(pS), 900, 650);
//                    pS.setScene(mainScene);
//                } catch (FileNotFoundException fileNotFoundException) {
//                    fileNotFoundException.printStackTrace();
//                }
//            }
//        };
//
//        bSignUp.setOnAction(event2signUP);
//        bLogin.setOnAction(event2login);
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










   // static Pane signUp(Stage primaryStage) throws FileNotFoundException, SQLException {
//        Statement stmt = conn.createStatement();
//        GridPane pane = new GridPane();
//        HBox cPane = new HBox();
//        HBox hb1 = new HBox();
//        VBox hb2 = new VBox();
//
//
//        Label heading = new Label("Register");
//        heading.setFont(Font.font("Times New Roman", FontWeight.BOLD,32));
//        heading.setPadding(new Insets(10));
//        heading.setTextFill(Color.RED);
//        pane.setAlignment(Pos.CENTER);
//
//
//        Image image = new Image(new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\iamge.png"));
//        ImageView imageView = new ImageView(image);
//        imageView.setPreserveRatio(true);
//
//
//        Label Lemail = new Label("Email");
//        TextField Temail = new TextField();
//        Temail.setPromptText("Email");
//        Label LPassword = new Label("Password");
//        PasswordField pass1 = new PasswordField();
//        pass1.setPromptText("Password");
//        Label LcPassword = new Label(" Confirm Password");
//        PasswordField pass2 = new PasswordField();
//        pass2.setPromptText("Confirm Password");
//
//        Button bRegister = new Button("Register");
//        EventHandler<ActionEvent> regHandler = new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent e){
//                String email = Temail.getText();
//                String p1 = pass1.getText();
//                String p2 = pass1.getText();
//
//                if(email.contains("@gmail.com")){
//                    if(p1.length()>0 && p2.length()>0){
//                        if(p1.equals(p2)){
//                            String sql = "Insert into credentials(username,password) values('" + email + "','" + p1 + "')";
//                            System.out.println(sql);
//                            try {
//                                stmt.executeUpdate(sql);
//                                //mainScene = login;
//                                primaryStage.setScene(login);
//                            } catch (SQLException throwables) {
//                                System.out.println("something went wrong!!");
//                            }
////                            catch (FileNotFoundException fileNotFoundException) {
////                                fileNotFoundException.printStackTrace();
////                            }
//                        }else{
//                            System.out.println("Check password");
//                        }
//                    }else{
//                        System.out.println("Enter a valid password");
//                    }
//                } else
//                    System.out.println("Please enter a valid email");
//            }
//        };
//        bRegister.setOnAction(regHandler);
//
//
//        hb2.setAlignment(Pos.CENTER);
//        hb1.getChildren().addAll(imageView);
//        hb2.getChildren().addAll(heading,Lemail,Temail,LPassword,pass1,LcPassword,pass2,bRegister);
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












    //static Pane onLogin(Stage primaryStage) throws FileNotFoundException{
//
//        Pane root = new Pane();
//        BorderPane root1 = new BorderPane();
//        Rectangle2D r = Screen.getPrimary().getBounds();
//
//        //background image
//        FileInputStream input = new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\backkground.jpg");
//        Image image = new Image(input);
//        BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100,100,TRUE,TRUE,TRUE,FALSE));
//        Background background = new Background(backgroundimage);
//        root1.setBackground(background);
//
//
//        GridPane info=new GridPane();
//        info.setMaxHeight(r.getHeight()*0.5);
//        info.setMaxWidth(r.getWidth()*0.5);
//        info.setStyle("-fx-background-color: #FFFFFF;");
//        info.setAlignment(Pos.CENTER);
//        info.setHgap(20);
//        info.setVgap(10);
//        info.setGridLinesVisible(TRUE);
//
//        //personal information
//        FileInputStream input1 = new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\personal.png");
//        Image i1=new Image(input1);
//        ImageView im1=new ImageView(i1);
//        im1.setFitWidth(125);im1.setFitHeight(125);
//        Button B1=new Button();
//        B1.setText("Personal Informtion");
//        VBox v1=new VBox();
//        v1.getChildren().addAll(im1,B1);
//
//        //education
//        FileInputStream input2 = new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\education.png");
//        Image i2=new Image(input2);
//        ImageView im2=new ImageView(i2);
//        im2.setFitWidth(125);im2.setFitHeight(125);
//        Button B2=new Button();
//        B2.setText("Education");
//        B2.setOnAction(e->{
//            primaryStage.setScene(scene2);
//        });
//        VBox v2=new VBox();
//        v2.getChildren().addAll(im2,B2);
//
//        //exxperience
//        FileInputStream input3 = new FileInputStream("C:\\Users\\DELL\\Desktop\\cv\\Resources\\experience.png");
//        Image i3=new Image(input3);
//        ImageView im3=new ImageView(i3);
//        im3.setFitWidth(125);im3.setFitHeight(125);
//        Button B3 =new Button();
//        B3.setText("Experience");
//        B1.setOnAction(e->{
//            primaryStage.setScene(scene3);
//        });
//        VBox v3=new VBox();
//        v3.getChildren().addAll(im3,B3);
//
//
//        v1.setAlignment(Pos.CENTER);
//        v2.setAlignment(Pos.CENTER);
//        v3.setAlignment(Pos.CENTER);
//        info.add(v1,0,0);
//        info.add(v2,1,0);
//        info.add(v3,2,0);
//        root1.setCenter(info);
//        sc = new Scene(root,0.90*r.getWidth(), 0.90*r.getHeight());
//
//
//        //Button Actions on Onlogin Page
//        B1.setOnAction(e->{
//            primaryStage.setScene(scene1);
//        });
//        B2.setOnAction(e->{
//            primaryStage.setScene(scene2);
//        });
//        B3.setOnAction(e->{
//            primaryStage.setScene(scene3);
//        });
//
//
//        //Scene of personal information
//        //About
//        VBox about=new VBox();
//        Label Alabel=new Label("About");
//        Alabel.setStyle("-fx-font-size: 30px");
//        GridPane Ainfo =new GridPane();
//
//        Label Aname=new Label("Name");
//        TextField Anameinput=new TextField();
//        Label ADOB=new Label("Date of birth");
//        TextField ADOBinput=new TextField();
//        Label Agender=new Label("Gender");
//        TextField Agenderinput=new TextField();
//        Label Acategory=new Label("Category");
//        TextField Acategoryinput=new TextField();
//
//        Ainfo.add(Aname,0,0);
//        Ainfo.add(Anameinput,1,0);
//        Ainfo.add(ADOB,0,1);
//        Ainfo.add(ADOBinput,1,1);
//        Ainfo.add(Agender,0,2);
//        Ainfo.add(Agenderinput,1,2);
//        Ainfo.add(Acategory,0,3);
//        Ainfo.add(Acategoryinput,1,3);
//
//        about.getChildren().addAll(Alabel,Ainfo);
//
//
//        //Contact Details
//        VBox contact=new VBox();
//        Label CDlabel=new Label("Contact Details");
//        CDlabel.setStyle("-fx-font-size: 30px");
//        GridPane CDinfo =new GridPane();
//
//        Label CDmobile=new Label("Mobile No.");
//        TextField CDmobileinput=new TextField();
//        Label CDemail=new Label("Email adress");
//        TextField CDemailinput=new TextField();
//        Label CDlin=new Label("LinkedIn profile");
//        TextField CDlininput=new TextField();
//
//        CDinfo.add(CDmobile,0,0);
//        CDinfo.add(CDmobileinput,1,0);
//        CDinfo.add(CDemail,0,1);
//        CDinfo.add(CDemailinput,1,1);
//        CDinfo.add(CDlin,0,2);
//        CDinfo.add(CDlininput,1,2);
//        contact.getChildren().addAll(CDlabel,CDinfo);
//
//        //Adress
//        VBox location=new VBox();
//        Label Llabel=new Label("Adress");
//        Llabel.setStyle("-fx-font-size: 30px");
//        GridPane Linfo =new GridPane();
//
//        Label LCountry=new Label("Country");
//        TextField Lcountryinput=new TextField();
//        Label Lstate=new Label("Date of birth");
//        TextField Lstateinput=new TextField();
//        Label Lpincode=new Label("Pincode");
//        TextField Lpincodeinput=new TextField();
//        Label Lhouse=new Label("House Adress");
//        TextField Lhouseinput=new TextField();
//
//        Linfo.add(LCountry,0,0);
//        Linfo.add(Lcountryinput,1,0);
//        Linfo.add(Lstate,0,1);
//        Linfo.add(Lstateinput,1,1);
//        Linfo.add(Lpincode,0,2);
//        Linfo.add(Lpincodeinput,1,2);
//        Linfo.add(Lhouse,0,3);
//        Linfo.add(Lhouseinput,1,3);
//
//        location.getChildren().addAll(Llabel,Linfo);
//
//
//
//        //Guardian Details
//        VBox guardian=new VBox();
//        Label Glabel=new Label("Guardian Details");
//        Glabel.setStyle("-fx-font-size: 30px");
//        GridPane Ginfo =new GridPane();
//
//        Label Gfname=new Label("Father's Name");
//        TextField Gfnameinput=new TextField();
//        Label Gmname=new Label("Mother's Name");
//        TextField Gmnameinput=new TextField();
//        Label Gfnumber=new Label("Father's number");
//        TextField Gfnumberinput=new TextField();
//        Label Gmnumber=new Label("Mother's number");
//        TextField Gmnumberinput=new TextField();
//        Label Gfoccupation=new Label("Father's Occupation");
//        TextField Gfoccupationinput=new TextField();
//        Label Gmoccupation=new Label("Mother's Occupation");
//        TextField Gmoccupationinput=new TextField();
//
//
//
//        Ginfo.add(Gfname,0,0);
//        Ginfo.add(Gfnameinput,1,0);
//        Ginfo.add(Gmname,0,1);
//        Ginfo.add(Gmnameinput,1,1);
//        Ginfo.add(Gfnumber,0,2);
//        Ginfo.add(Gfnumberinput,1,2);
//        Ginfo.add(Gmnumber,0,3);
//        Ginfo.add(Gmnumberinput,1,3);
//        Ginfo.add(Gfoccupation,0,4);
//        Ginfo.add(Gfoccupationinput,1,4);
//        Ginfo.add(Gmoccupation,0,5);
//        Ginfo.add(Gmoccupationinput,1,5);
//        guardian.getChildren().addAll(Glabel,Ginfo);
//
//        VBox PIleft=new VBox();
//        PIleft.getChildren().addAll(about,contact,location);
//        VBox PIright=new VBox();
//        PIright.getChildren().addAll(guardian);
//        HBox PI=new HBox(PIleft,PIright);
//        PI.setAlignment(Pos.TOP_LEFT);
//        PI.setSpacing(400);
//        scene1 = new Scene(PI,0.90*r.getWidth(), 0.90*r.getHeight());
//
//
//        //about.setAlignment(Pos.CENTER);
//
//                /*Button Br1=new Button();
//        Br1.setText("back");
//        Br1.setOnAction(e->{
//            window.setScene(sc);
//        });
//        */
//        //Scene of Education information
//
//        Button Br2=new Button();
//        Br2.setText("back");
//        Br2.setOnAction(e->{
//            primaryStage.setScene(sc);
//        });
//        VBox vr2=new VBox();
//        vr2.getChildren().addAll(Br2);
//        scene2 = new Scene(vr2,0.90*r.getWidth(), 0.90*r.getHeight());
//
//
//        //Scene of Experience
//        Button Br3=new Button();
//        Br3.setText("back");
//        Br3.setOnAction(e->{
//            primaryStage.setScene(sc);
//        });
//        VBox vr3=new VBox();
//        vr3.getChildren().addAll(Br3);
//        scene3 = new Scene(vr3,0.90*r.getWidth(), 0.90*r.getHeight());
//
//        root.getChildren().addAll(root1);
//        return root;
//    }
//
//}
////C:\\Users\\DELL\\Desktop\\cv\\Resources\\
//
//
//
//
//
//
//
//
//
//
//
//
