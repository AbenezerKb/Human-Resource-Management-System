/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.management.UI;


import com.sun.javafx.css.StyleManager;
import hr.management.Models.Employee;
import hr.management.Search;
import java.awt.Insets;
import java.io.FileInputStream;
import java.util.HashSet;
import javafx.geometry.Orientation;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author hp
 */

public class DashBoard {
    
    HBox Menu;
    FileInputStream input;
    Image img;
    ImageView imgview;
    
    FileInputStream closeiconfile;
    Image closeimg;
    ImageView closeimgview;
    
    FileInputStream minimizeconfile;
    Image minimizeimg;
    ImageView minimizeimgview;
    
    TextField searchtf;
    Button searchtbn;
    TableView tableView = new TableView();
    Label attendance;

    
   
    Button homebtn = new Button("Home");
    Button employeebtn = new Button("Employee");
    Button financbtn  = new Button("Finance");
    Button leavebtn  = new Button("Leave");
    Button configbtn  = new Button("Configuration");
    Button announcebtn  = new Button("Activity");
    TitledPane tp;
    Pane Pages;
    Pane top;
    
    GridPane sp;
    
    GridPane gp = new GridPane();
    GridPane Top_and_Body = new GridPane();
    GridPane gp1 = new GridPane();
    GridPane grid= new GridPane();
    
    
   public DashBoard() throws Exception{
       
       
       
        String path = "C:\\Users\\hp\\Documents\\NetBeansProjects\\HR Management\\src\\hr\\management\\assets\\logo.png";
    input = new FileInputStream(path);    
    img = new Image(input);     
    imgview= new ImageView(img);
    imgview.setFitWidth(285);
    imgview.getStyleClass().add("imgview");
    imgview.setFitHeight(275);
    
    
     closeiconfile = new FileInputStream( "C:\\Users\\hp\\Documents\\NetBeansProjects\\HR Management\\src\\hr\\management\\assets\\close.png");    
    closeimg = new Image(closeiconfile);     
    closeimgview= new ImageView(closeimg);
    closeimgview.setFitWidth(290);
    closeimgview.setFitHeight(295);
    closeimgview.setFitWidth(15);
    closeimgview.setFitHeight(15);
    
    minimizeconfile = new FileInputStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\HR Management\\src\\hr\\management\\assets\\minimize.png");    
    minimizeimg = new Image(minimizeconfile);     
    minimizeimgview= new ImageView(minimizeimg);
    minimizeimgview.setFitWidth(15);
    minimizeimgview.setFitHeight(1);
    
    
    
    Button b = new Button();
    
    
    homebtn.setMaxWidth(350);
    homebtn.setMaxHeight(66);
    homebtn.setMinHeight(66);
    homebtn.getStyleClass().add("btn");
       
    employeebtn.setMaxWidth(350);
    employeebtn.setMaxHeight(66);
    employeebtn.setMinHeight(66);
    employeebtn.getStyleClass().add("btn");
    
    financbtn.setMaxWidth(350);
    financbtn.setMaxHeight(66);
    financbtn.setMinHeight(66);
    financbtn.getStyleClass().add("btn");
    
    leavebtn.setMaxWidth(350);
    leavebtn.setMaxHeight(66);
    leavebtn.setMinHeight(66);
    leavebtn.getStyleClass().add("btn");
    
    configbtn.setMaxWidth(350);
    configbtn.setMaxHeight(66);
    configbtn.setMinHeight(66);
    configbtn.getStyleClass().add("btn");
    
    
    announcebtn.setMaxWidth(350);
    announcebtn.setMaxHeight(66);
    announcebtn.setMinHeight(66);
    announcebtn.getStyleClass().add("btn");
     
    GridPane.setConstraints(homebtn, 0, 1);
    GridPane.setConstraints(employeebtn, 0, 2);
    GridPane.setConstraints(financbtn, 0, 3);
    GridPane.setConstraints(leavebtn, 0, 4);
    GridPane.setConstraints(configbtn, 0, 6);
    GridPane.setConstraints(announcebtn, 0, 5);
    
    gp.getChildren().addAll( homebtn, employeebtn, financbtn, leavebtn, configbtn, imgview,announcebtn);
    
    Menu= new HBox(gp);
     Menu.setMaxWidth(270);
    Menu.getStyleClass().add("Menu");
   
          
     top = new Pane();
     
     
     SplitPane sss = new SplitPane();
     
     sss.setOrientation(Orientation.VERTICAL);
     
       
    Pages = new Pane();
    Pages.getStyleClass().add("Pages");
    Pages.setMaxHeight(760);
    Pages.setMaxWidth(1665);
    Pages.setMinWidth(1665);
    
    sp = new GridPane();        
      GridPane.setConstraints(Menu, 0, 0);
    GridPane.setConstraints(Pages, 1, 0);

    sp.getChildren().addAll(Menu,Pages);
    sp.setMinHeight(200);
    sp.setMinWidth(300);
    sp.getStyleClass().add("sp");
    Button close = new Button();
    close.setGraphic(closeimgview);
    close.getStyleClass().add("closebtn");
    close.setMaxSize(40, 40);
    
    
     Button minimize = new Button();
    minimize.setGraphic(minimizeimgview);
    minimize.getStyleClass().add("minimizebtn");
    minimize.setMaxSize(40, 40);
    
    close.setLayoutX(1245);
    close.setLayoutY(5);
    
    minimize.setLayoutX(1205);
    minimize.setLayoutY(5);
    
    top.getChildren().addAll(close, minimize);
    
    GridPane.setConstraints(top, 0, 0);
    GridPane.setConstraints(sp, 0, 1);
    
    
    
    close.setOnAction(e -> {
    
    System.exit(0);
    
    });
    
   
    
    
    top.setMaxHeight(35);
    top.setMinHeight(35);
    
    top.getStyleClass().add("top-one");
    
    sss.getItems().addAll(top, sp);
    Top_and_Body.getChildren().addAll(top,sp);
   String css= this.getClass().getResource("Style.css").toExternalForm();
    
     Scene scene = new Scene(Top_and_Body, 1280, 714);
     
     scene.getStylesheets().add(css);
     Stage ps = new Stage();
     ps.initStyle(StageStyle.UNDECORATED);
     
      minimize.setOnAction(e -> {
     
    ps.setIconified(true);
    
    });
     ps.setResizable(true);
        ps.setTitle("HR system");
        ps.setScene(scene);
        ps.show();
        
        
        
        homebtn.setOnAction(x -> {
            
            Home home = new Home();      
            Pages.getChildren().clear();
        Pages.getChildren().addAll(home.pane);        
        
        });
        
leavebtn.setOnAction(x -> {
            
            Leave leave = new Leave();   
            Pages.getChildren().clear();
        Pages.getChildren().addAll(leave.pane);        
        
        });        
        
announcebtn.setOnAction(x ->{

                Activity anouncement = new Activity();   
            Pages.getChildren().clear();
        Pages.getChildren().addAll(anouncement.pane);        
    
});

employeebtn.setOnAction(e ->{

EmployeeUI empui= new EmployeeUI();
Pages.getChildren().clear();
Pages.getChildren().add(empui.employee_UI());



});

financbtn.setOnAction(e ->{
FinanceUI financeui = new FinanceUI();
Pages.getChildren().clear();
Pages.getChildren().add(financeui.list_box);
});


    }
}

