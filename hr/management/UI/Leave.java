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
public class Leave {
    
    
    public VBox pane = new VBox();
    public TextField tf = new TextField();
    public Button tbnSearch = new Button("Search");
    public Pane box = new Pane();
    public Button attend = new Button("Save");
    public DatePicker start = new DatePicker();
    public DatePicker end = new DatePicker();
    public ComboBox type = new ComboBox();
    public Button set = new Button("Set Leave");
    
    
    
    public Leave(){
    
    
    
    Pane gp = new Pane();
    pane.setMinSize( 700, 550);
    pane.setMaxSize(700, 550);
    pane.setLayoutX(100);
    pane.setLayoutY(100);
    
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
    
    attend.setLayoutX(360);
    attend.setLayoutY(440);
    attend.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; -fx-font: sans-serif;");
    attend.setMinWidth(100);
    attend.setMinHeight(37);
    
    
    start.setLayoutX(230);
    start.setLayoutY(240);
    start.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; -fx-font: sans-serif;");
    start.setMinWidth(240);
    start.setMinHeight(37);
    
    
    end.setLayoutX(230);
    end.setLayoutY(305);
    end.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; -fx-font: sans-serif;");
    end.setMinWidth(240);
    end.setMinHeight(37);
    
    
    type.setLayoutX(230);
    type.setLayoutY(370);
    type.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; -fx-font: sans-serif;");
    type.setMinWidth(240);
    type.setMinHeight(37);
    
    
    Label startlbl = new Label("Start Date");
    Label endlbl = new Label("End Date");
    Label typelbl = new Label("Type");
    
    
    startlbl.setLayoutX(75);
    startlbl.setLayoutY(250);
    endlbl.setLayoutX(75);
    endlbl.setLayoutY(315);
    typelbl.setLayoutX(75);
    typelbl.setLayoutY(380);
    
    startlbl.setStyle("-fx-text-fill:white ");
    endlbl.setStyle("-fx-text-fill:white ");
    typelbl.setStyle("-fx-text-fill:white ");
    
    
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
    gp.getChildren().add(start);
    gp.getChildren().add(startlbl);
    gp.getChildren().add(end);
    gp.getChildren().add(endlbl);
    gp.getChildren().add(type);
    gp.getChildren().add(typelbl);
   
    
    pane.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;");
    pane.getChildren().add(gp);
    
}
}
