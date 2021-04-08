import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.image.ImageView;

public class HelloWorld extends Application{
StackPane cent;
Label HRMtxt;
Scene scene1;
Image background_image;
ImageView vw;
@Override
public void start(Stage window) throws Exception{
	window.setTitle("Human resource management");
	cent=new StackPane();
	HRMtxt=new Label("Welcome to the Human Resource\n\t Management software");
	HRMtxt.setFont(Font.font("kanit",FontWeight.MEDIUM,30));
	cent.getChildren().add(HRMtxt);
	background_image=new Image(new FileInputStream("../images/backgroundIMAGE.jpg"));
	vw=new ImageView(background_image);
	scene1=new Scene(cent,800,400);
	window.setScene(scene1);
	window.show();
	}
public static void main(String []args){
	launch(args);
	}
	}
