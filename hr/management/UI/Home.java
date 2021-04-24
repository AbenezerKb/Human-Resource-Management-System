/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.management.UI;


import hr.management.Models.Employee;
import hr.management.Search;
import java.awt.Insets;
import java.io.FileInputStream;
import java.util.HashSet;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */

public class Home {
    
    HBox box;
    FileInputStream input;
    Image img;
    ImageView imgview;
    TextField searchtf;
    Button searchtbn;
    TableView tableView = new TableView();
    Label attendance;

    
   
    Button homebtn = new Button("Home");
    Button employeebtn = new Button("Employee");
    Button financbtn  = new Button("Finance");
    Button leavebtn  = new Button("Leave");
    Button configbtn  = new Button("Configuration");
    TitledPane tp;
    HBox hb;
    SplitPane sp;
    
    GridPane gp = new GridPane();
    GridPane gp1 = new GridPane();
    
    
   public Home() throws Exception{
        
    input = new FileInputStream("C:\\Users\\hp\\Documents\\java projects\\logo.png");    
    img = new Image(input);     
    imgview= new ImageView(img);
    imgview.setFitWidth(290);
    imgview.setFitHeight(295);
    
    homebtn.setMaxWidth(350);
    homebtn.setMinHeight(80);
    homebtn.getStyleClass().add("homebtn");
       
    employeebtn.setMaxWidth(350);
    employeebtn.setMinHeight(80);
    employeebtn.getStyleClass().add("employeebtn");
    
    financbtn.setMaxWidth(350);
    financbtn.setMinHeight(80);
    financbtn.getStyleClass().add("financbtn");
    
    leavebtn.setMaxWidth(350);
    leavebtn.setMinHeight(80);
    leavebtn.getStyleClass().add("leavebtn");
    
    configbtn.setMaxWidth(350);
    configbtn.setMinHeight(80);
    configbtn.getStyleClass().add("configbtn");
    
     
    GridPane.setConstraints(homebtn, 0, 1);
    GridPane.setConstraints(employeebtn, 0, 2);
    GridPane.setConstraints(financbtn, 0, 3);
    GridPane.setConstraints(leavebtn, 0, 4);
    GridPane.setConstraints(configbtn, 0, 5);
    
    gp.getChildren().addAll( homebtn, employeebtn, financbtn, leavebtn, configbtn, imgview);
    
    box= new HBox(gp);
     box.setMaxWidth(270);
   
  //   box.getStyleClass().add("box");
    hb = new HBox();
    hb.getStyleClass().add("hb");
 
    
    sp = new SplitPane();

    sp.getItems().addAll(box,hb);
    sp.setMaxHeight(20);
    
   String css= this.getClass().getResource("Style.css").toExternalForm();
    
     Scene scene = new Scene(sp, 1200, 700);
     scene.getStylesheets().add(css);
     Stage ps = new Stage();
        ps.setTitle("HR system");
        ps.setScene(scene);
        ps.show();

    }
}

