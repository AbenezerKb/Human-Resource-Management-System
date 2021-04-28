/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.management.UI;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

import javafx.scene.shape.*;


/**
 *
 * @author hp
 */
public class Home {
    
    
    public VBox pane = new VBox();
    public TextField tf = new TextField();
    public Button tbnSearch = new Button("Search");
    public Pane box = new Pane();
    public Button attend = new Button("Set Entry Time");
    
    
    public Home(){
    
    
    
    Pane gp = new Pane();
    pane.setMinSize( 700, 300);
    pane.setMaxSize(700, 400);
    pane.setLayoutX(100);
    pane.setLayoutY(250);
    
    tf.setLayoutX(50);
    tf.setLayoutY(50);
    tf.setMinWidth(300);
    tf.setMinHeight(37);
    tf.setStyle("-fx-background-color:white; -fx-border-color: white; -fx-border-radius: 5px;");
    
    tbnSearch.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; -fx-font: sans-serif;");
    tbnSearch.setLayoutX(400);
    tbnSearch.setLayoutY(50);
    tbnSearch.setMinWidth(100);
    tbnSearch.setMinHeight(37);
    
    
    
    box.setStyle("-fx-border-color: white;");
    box.setLayoutX(50);
    box.setLayoutY(100);
    box.setMinWidth(600);
    box.setMinHeight(100);
    
    
    Line line = new Line(150, 200, 150, 100);
    line.setStrokeWidth(2);
    line.setFill(Color.WHITE);
    line.setStroke(Color.WHITE);
    
    
    Line line2 = new Line(50, 150, 650, 150);
    line2.setStrokeWidth(2);
    line2.setFill(Color.WHITE);
    line2.setStroke(Color.WHITE);
    
    
    Label IDlbl = new Label("ID");
    Label Namelbl = new Label("Name");
    Label ID = new Label("UUUU");
    Label Name = new Label("Abene");
    
    IDlbl.setLayoutX(75);
    IDlbl.setLayoutY(125);
    Namelbl.setLayoutX(175);
    Namelbl.setLayoutY(125);
    
    IDlbl.setStyle("-fx-text-fill:white ");
    Namelbl.setStyle("-fx-text-fill:white ");
    
    ID.setStyle("-fx-text-fill:white ");
    Name.setStyle("-fx-text-fill:white ");
    
    ID.setLayoutX(75);
    ID.setLayoutY(175);
    Name.setLayoutX(175);
    Name.setLayoutY(175);
    
    attend.setLayoutX(550);
    attend.setLayoutY(220);
    attend.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; -fx-font: sans-serif;");
    attend.setMinWidth(100);
    attend.setMinHeight(37);
    
    gp.getChildren().add(tf);
    gp.getChildren().add(tbnSearch);
    gp.getChildren().add(box);    
    gp.getChildren().add(line);
    gp.getChildren().add(line2);
    gp.getChildren().add(IDlbl);
    gp.getChildren().add(Namelbl);
    gp.getChildren().add(ID);
    gp.getChildren().add(Name);
    gp.getChildren().add(attend);
   
    pane.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;");
    pane.getChildren().add(gp);
    
}
}
