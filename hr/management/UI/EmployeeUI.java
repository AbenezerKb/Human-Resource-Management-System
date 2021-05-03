/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm;


import hrm.Models.Employee;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dtpic
 */
public class EmployeeUI {
     Button addNewButton,editButton,removeButton,searchButton;
    TextField searchField,typeField,amountField;
    TableView<Employee> mainTable;
    Label typeLabel,typeAmount;
     Employee getEmp;
     Stage Removewindows;
    HBox box1,box2;
    GridPane box3;
    VBox list_box;
    TableColumn<Employee,String> column_id1,column_role,column_firstname,column_lastname,column_sex,column_address,column_age;
    public VBox employee_UI(){
        
        searchField=new TextField();
        searchField.setPromptText("Search");
        searchButton=new Button("Search");
        searchButton.setId("search_btn");
        mainTable=new TableView<>();
        
            column_id1=new TableColumn<>("ID");
            column_firstname=new TableColumn<>("FIRST NAME");
            column_lastname=new TableColumn<>("LAST NAME");
            column_sex=new TableColumn<>("SEX");
            column_address=new TableColumn<>("ADDRESS");
            column_age=new TableColumn<>("AGE");
            column_role=new TableColumn<>("ROLE");
            
         DbConnection db=new DbConnection();
         Search search_employee=new Search();
         getEmp=search_employee.getAllEmployee();
         
                    column_id1.setCellValueFactory(new PropertyValueFactory<>("empID"));
                column_firstname.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                column_lastname.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                column_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
                column_address.setCellValueFactory(new PropertyValueFactory<>("address"));
                column_age.setCellValueFactory(new PropertyValueFactory<>("age"));
                column_role.setCellValueFactory(new PropertyValueFactory<>("role"));
                mainTable.getItems().add(getEmp);
        searchButton.setOnAction(e->{         
                getEmp=search_employee.searchEmployee(searchField.getText());  
                column_id1.setCellValueFactory(new PropertyValueFactory<>("empID"));
                column_firstname.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                column_lastname.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                column_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
                column_address.setCellValueFactory(new PropertyValueFactory<>("address"));
                column_age.setCellValueFactory(new PropertyValueFactory<>("age"));
                column_role.setCellValueFactory(new PropertyValueFactory<>("role"));
                mainTable.getItems().add(getEmp);
   
        });

        box1=new HBox(20);
        box1.getChildren().addAll(searchField,searchButton);
                 mainTable.setId("mainTable");
              column_id1.setId("column_id1");
              column_firstname.setId("column_firstname");
              column_lastname.setId("column_lastname");
              column_sex.setId("column_sex");
              column_address.setId("column_address");
              column_age.setId("column_age");
              column_role.setId("column_role");
              mainTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        mainTable.getColumns().addAll(column_id1,column_firstname,column_lastname,column_sex,column_age,column_address,column_role);
        box2=new HBox(20);
            addNewButton=new Button("Add New");
            AddNewEmp addnewemp=new AddNewEmp();
            addNewButton.setOnAction(e->{
                
            });
            editButton=new Button("Edit");
            removeButton=new Button("Remove");
            Delete delete=new Delete();
            removeButton.setOnAction(e->{
                  delete.deleteEmployee(searchField.getText());
                  JOptionPane.showMessageDialog(null,"Deleted successfully!");
            });
            addNewButton.setId("addNewButton");
            editButton.setId("search_btn");
            removeButton.setId("search_btn");
        box2.getChildren().addAll(addNewButton,editButton,removeButton);
        list_box=new VBox(20);
        list_box.setAlignment(Pos.CENTER);
        list_box.setMaxWidth(600);
        list_box.setMaxHeight(500);
        list_box.getChildren().addAll(box1,mainTable,box2);
        list_box.getStylesheets().add(getClass().getResource("employeeui.css").toExternalForm());
        searchField.setId("searchField");
        list_box.setId("list-box");
        return list_box;
    }
   }
