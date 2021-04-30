/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author dtpic
 */
public class EmployeeUI {
     Button saveButton,searchButton;
    TextField searchField,typeField,amountField;
    TableView<String> mainTable;
    Label typeLabel,typeAmount;
    TableColumn column_id,column_name;
    HBox box1,box2;
    GridPane box3;
    VBox list_box;
    TableColumn column_id1,column_role,column_firstname,column_lastname,column_sex,column_address,column_age;
    public VBox employee_UI(){
        
        searchField=new TextField();
        searchField.setPromptText("Search");
        searchButton=new Button("Search");
        searchButton.setId("search_btn");
         try {
             Search.searchEmployee(searchField.getText());
         } catch (Exception ex) {
             Logger.getLogger(EmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        searchButton.setOnAction(e->{
            
        });
        box1=new HBox(20);
        box1.getChildren().addAll(searchField,searchButton);
        mainTable=new TableView();
         column_id1=new TableColumn("ID");
         column_firstname=new TableColumn("FIRST NAME");
         column_lastname=new TableColumn("LAST NAME");
         column_sex=new TableColumn("SEX");
         column_address=new TableColumn("ADDRESS");
         column_age=new TableColumn("AGE");
         column_role=new TableColumn("ROLE");
                 mainTable.setId("mainTable");
              column_id1.setId("column_id1");
              column_firstname.setId("column_firstname");
              column_lastname.setId("column_lastname");
              column_sex.setId("column_sex");
              column_address.setId("column_address");
              column_age.setId("column_age");
              column_role.setId("column_role");
        mainTable.getColumns().addAll(column_id1,column_firstname,column_lastname,column_sex,column_age,column_address,column_role);
        
        list_box=new VBox(20);
        list_box.setAlignment(Pos.CENTER);
        list_box.setMaxWidth(600);
        list_box.setMaxHeight(500);
        list_box.getChildren().addAll(box1,mainTable);
        list_box.getStylesheets().add(getClass().getResource("employeeui.css").toExternalForm());
        searchField.setId("searchField");
        list_box.setId("list-box");
        return list_box;
    }
    
}
