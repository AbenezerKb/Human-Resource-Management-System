/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.management.UI;

import hr.management.Create;
import hr.management.Models.Employee;
import hr.management.Models.Finance;
import hr.management.Search;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
    public DatePicker holidayDate = new DatePicker();
    public ComboBox type = new ComboBox();
    public Button setholiday = new Button("Set Public Holiday Leave");
    TableView tableview = new TableView();
    TableColumn<Finance,String> IDcolumn = new TableColumn<>("ID");
    
    TableColumn<Finance,String> Startcolumn = new TableColumn<>("StartDate");
    TableColumn<Finance,String> Endcolumn = new TableColumn<>("EndDate");
    TableColumn<Finance,String> Typecolumn = new TableColumn<>("Type");
    
    
    
    
    
    public Leave(){
    
    
        IDcolumn.setCellValueFactory(new PropertyValueFactory<Finance, String>("ID"));
        Startcolumn.setCellValueFactory(new PropertyValueFactory<Finance, String>("StartDate"));
        Endcolumn.setCellValueFactory(new PropertyValueFactory<Finance, String>("EndDate"));
        Typecolumn.setCellValueFactory(new PropertyValueFactory<Finance, String>("Type"));
        
        tableview.getColumns().add(IDcolumn);
        tableview.getColumns().add(Startcolumn);
        tableview.getColumns().add(Endcolumn);
        tableview.getColumns().add(Typecolumn);
        
       
    
    Pane gp = new Pane();
    pane.setMinSize( 800, 550);
    pane.setMaxSize(800, 550);
    pane.setLayoutX(75);
    pane.setLayoutY(100);
    
    Pane publicH = new Pane();
    publicH.setMinSize(270, 270);
    publicH.setMaxSize(270, 270);
    publicH.setLayoutX(500);
    publicH.setLayoutY(230);
    publicH.toBack();
    
    publicH.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;");
    
    tf.setLayoutX(50);
    tf.setLayoutY(50);
    tf.setMinWidth(300);
    tf.setMinHeight(37);
    tf.setStyle("-fx-background-color:white; -fx-border-color: white; -fx-border-radius: 5px;");
    
    tbnSearch.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
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
    Label ID = new Label("");
    Label Name = new Label("");
    
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
    
    attend.setLayoutX(320);
    attend.setLayoutY(440);
    attend.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
    attend.setMinWidth(100);
    attend.setMinHeight(37);
    
    
    start.setLayoutX(190);
    start.setLayoutY(240);
    start.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
    start.setMinWidth(240);
    start.setMinHeight(37);
    
    
    end.setLayoutX(190);
    end.setLayoutY(305);
    end.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
    end.setMinWidth(240);
    end.setMinHeight(37);
    
    
    holidayDate.setLayoutX(510);
    holidayDate.setLayoutY(305);
    holidayDate.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
    holidayDate.setMinWidth(240);
    holidayDate.setMinHeight(37);
    
    setholiday.setLayoutX(604);
    setholiday.setLayoutY(370);
    setholiday.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
    setholiday.setMinWidth(100);
    setholiday.setMinHeight(37);
    
    type.setLayoutX(190);
    type.setLayoutY(370);
    type.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;  -fx-text-fill: white; ");
    
    
    type.setMinWidth(240);
    type.setMinHeight(37);
   type.applyCss();
    
    
    type.getItems().addAll("Sick","Annual");
    
    
    Label startlbl = new Label("Start Date");
    Label endlbl = new Label("End Date");
    Label typelbl = new Label("Type");
    Label holiday = new Label("Public Holiday");
    
    
    
    holiday.setLayoutX(560);
    holiday.setLayoutY(260);
    holiday.setStyle(" -fx-text-fill: white; -fx-family:19;");
    
    
    
    startlbl.setLayoutX(75);
    startlbl.setLayoutY(250);
    endlbl.setLayoutX(75);
    endlbl.setLayoutY(315);
    typelbl.setLayoutX(75);
    typelbl.setLayoutY(380);
    
    startlbl.setStyle("-fx-text-fill:white ");
    endlbl.setStyle("-fx-text-fill:white ");
    typelbl.setStyle("-fx-text-fill:white ");
    
    
    gp.getChildren().addAll(tf,tbnSearch,box,line,line2,IDlbl,Namelbl,ID,Name,attend,start,startlbl,end,endlbl,type,typelbl,holiday,holidayDate, setholiday,publicH);
   
    
    pane.setStyle("-fx-background-color:#006070; -fx-border-color: white; -fx-border-radius: 5px;");
    pane.getChildren().add(gp);
    publicH.toBack();
     tbnSearch.setOnAction(e ->{
    try{
        
        Alert searchAlert = new Alert(Alert.AlertType.WARNING);
       
        if((Search.searchEmployee(tf.getText()))==null)
        {
        tf.setText("");    
        searchAlert.setContentText("Nothing Found");        
        searchAlert.show();
        }    
         
        else{
    Employee emp=Search.searchEmployee(tf.getText());
    Employee eee = new Employee();
        
    
    ID.setText(emp.getempID());
    Name.setText(emp.getfirstName());
    
    
     ObservableList<hr.management.Models.Leave> leave=  FXCollections.observableArrayList();
        try{
            ResultSet set =Create.insertLeaveForAll();
            while(set.next()){
            hr.management.Models.Leave ll =new hr.management.Models.Leave(set.getString("ID"), set.getString("start"), set.getString("end"), set.getString("type"));
           if(ll.getEmpID().contains(tf.getText()))
                   {
                       leave.add(ll);
                   }
            }
            
            tableview.setItems(leave);
        
        }
        
        catch(Exception except){
    System.out.print(except.getMessage());
     except.getStackTrace();
    }
    
        }
    }
    catch(Exception exception){
    System.out.print(exception.getMessage());
   
    }
    });
    
    attend.setOnAction(e->{
           
    
   
try{
     Alert attendAlert = new Alert(Alert.AlertType.CONFIRMATION);
     
     System.out.print(type.getSelectionModel().getSelectedItem().toString());
     
    if(ID.getText().equals("") || start.getValue() == null ||  end.getValue() == null || type.getSelectionModel().getSelectedItem() == null)
    {
        Alert notfoundAlert = new Alert(Alert.AlertType.WARNING);
        if(ID.getText().equals(""))
        {
     notfoundAlert.setContentText("Please Search First");        
        notfoundAlert.show();
        }
        else{
            notfoundAlert.setContentText("Please Insert into all the fields");        
        notfoundAlert.show();
        }
    }
    
    else
    {
             

       if(!Create.insertLeave(ID.getText()+start.getValue().toString(), start.getValue().toString(), end.getValue().toString(), type.getSelectionModel().getSelectedItem().toString()))                        
        {
        ID.setText("");
    Name.setText("");
    tf.setText("");
    attendAlert.setContentText("Succefull");
    attendAlert.show();
        }
        else
        {                        
        ID.setText("");
    Name.setText("");
    tf.setText("");
    
    attendAlert = new Alert(Alert.AlertType.ERROR);
    attendAlert.setContentText("Not Succefull");
    attendAlert.show();
        }     
        
    
    }
}

catch(Exception exception){
System.out.println(exception.getMessage());
  ID.setText("");
    Name.setText("");
    tf.setText("");
    
    Alert attendAlert = new Alert(Alert.AlertType.ERROR);
    attendAlert.setContentText("Not Succefull");
    attendAlert.show();
}
    
    
    });
    
    
    
    setholiday.setOnAction(
    e ->{
        
        try{
            
    Create.insertLeaveForAll(holidayDate.getValue().toString());
        }
        
        catch(Exception exception1){
        System.out.print(exception1.getMessage());
        exception1.printStackTrace();
        }
    });
}
}
