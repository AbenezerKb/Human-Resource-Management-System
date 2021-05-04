/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.management.UI;
import hr.management.Create;
import hr.management.DbConnection;
import hr.management.Models.Employee;
import hr.management.Search;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
public class FinanceUI {
    Button saveButton,searchButton;
    TextField searchField,typeField;
    DatePicker dateField;
    TableView<Employee> mainTable;
    Label typeLabel,typeAmount;
    Employee getEmp;
    TableColumn<Employee,String> column_id,column_name;
    HBox box1,box2;
    GridPane box3;
    VBox list_box;
    public  FinanceUI(){
        searchField=new TextField();
        searchField.setPromptText("Search");
        
        searchButton=new Button("Search");
        searchButton.setId("search_btn");
        box1=new HBox(20);
        box1.getChildren().addAll(searchField,searchButton);
        mainTable=new TableView();
        
        TableColumn column_id=new TableColumn("ID");
        TableColumn column_name=new TableColumn("NAME");
        mainTable.setId("mainTable");
        column_id.setId("column_id");
        column_name.setId("column_name");
       DbConnection db=new DbConnection();
         //Search search_employee=new Search();
 
        searchButton.setOnAction(e->{         
            try{
                getEmp=Search.searchEmployee(searchField.getText());  
                column_id.setCellValueFactory(new PropertyValueFactory<>("empID"));
                column_name.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                mainTable.getItems().add(getEmp);
            }
            catch(Exception exception ){
                System.out.println(exception.getMessage());
                exception.getStackTrace();
            }
   
        });

        mainTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        mainTable.getColumns().addAll(column_id,column_name);
        
        typeLabel=new Label("Payment Reason");
        typeLabel.setId("typeLabel");
        typeField=new TextField();
        typeField.setPromptText("Type");
        box2=new HBox(20);
        box2.getChildren().addAll(typeLabel,typeField);
        typeAmount=new Label("Payment Date");
        typeAmount.setId("typeAmount");
        dateField=new DatePicker();
        dateField.setId("amountField");
        typeField.setId("typeField");
        dateField.setPromptText("date of reason");
        saveButton=new Button("Save");
        
        
        saveButton.setOnAction(e->{
            
            try {
        //        Create.insertFinance( searchField.getText(),dateField.getValue().toString(), typeField.getText());
            } catch (Exception ex) {
                Logger.getLogger(FinanceUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        saveButton.setId("saveButton");
        box3=new GridPane();
        box3.setVgap(15);
        box3.setHgap(15);
        box3.add(typeLabel,0,0);
        box3.add(typeField,1,0);
        box3.add(typeAmount,0,1);
        box3.add(dateField,1,1);
        box3.add(saveButton, 1, 2);
        list_box=new VBox(20);
        list_box.setAlignment(Pos.CENTER);
        list_box.setMaxWidth(600);
        list_box.setMaxHeight(500);
        list_box.getChildren().addAll(box1,mainTable,box2,box3);
        list_box.getStylesheets().add(getClass().getResource("financeui.css").toExternalForm());
        searchField.setId("searchField");
        list_box.setId("list-box");
        
        // list_box;
    }
    
    
}
