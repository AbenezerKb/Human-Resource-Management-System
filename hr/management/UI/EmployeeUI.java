package hr.management.UI;


import hr.management.Create;
import hr.management.DbConnection;
import hr.management.Delete;
import hr.management.Models.Employee;
import hr.management.Models.Finance;
import hr.management.Search;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
    GridPane add = new GridPane();
    Label IDlbl = new Label("ID");    
    Label firstnamelbl = new Label("First Name");
    Label lastnamelbl = new Label("Last Name");
    Label agelbl = new Label("Age");
    Label sexlbl = new Label("Sex");
    Label addresslbl = new Label("Address");
    Label emaillbl = new Label("E-mail");
    Label rolelbl = new Label("Role");
    
    TextField ID = new TextField();
    TextField firstname = new TextField();
    TextField lastname = new TextField();
    TextField age = new TextField();
    TextField sex = new TextField();
    TextField address = new TextField();
    TextField email = new TextField();
    TextField role = new TextField();
    
    Button save = new Button("Save");
    
    VBox list_box;
    TableColumn<Employee,String> column_id1,column_role,column_firstname,column_lastname,column_sex,column_address,column_age;
    public VBox employee_UI(){
        
        IDlbl.setStyle("-fx-text-fill: white;");
        firstnamelbl.setStyle("-fx-text-fill: white;");
        lastnamelbl.setStyle("-fx-text-fill: white;");
        agelbl.setStyle("-fx-text-fill: white;");
        sexlbl.setStyle("-fx-text-fill: white;");
        addresslbl.setStyle("-fx-text-fill: white;");
        emaillbl.setStyle("-fx-text-fill: white;");
        rolelbl.setStyle("-fx-text-fill: white;");
        
        ID.setMinSize(150, 35);
        ID.setMaxSize(150, 35);
        firstname.setMaxSize(150, 35);        
        firstname.setMinSize(150, 35);        
        lastname.setMinSize(150, 35);
        lastname.setMaxSize(150, 35);
        age.setMinSize(150, 35);
        age.setMaxSize(150, 35);
        sex.setMinSize(150, 35);
        sex.setMaxSize(150, 35);        
        address.setMinSize(150, 35);
        address.setMaxSize(150, 35);
        email.setMinSize(150,35);
        email.setMaxSize(150,35);
        role.setMinSize(150, 35);
        role.setMaxSize(150, 35);
        
        save.setMinSize(100,30);
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
         //Search search_employee=new Search();
        
                    column_id1.setCellValueFactory(new PropertyValueFactory<>("empID"));
                column_firstname.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                column_lastname.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                column_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
                column_address.setCellValueFactory(new PropertyValueFactory<>("address"));
                column_age.setCellValueFactory(new PropertyValueFactory<>("age"));
                column_role.setCellValueFactory(new PropertyValueFactory<>("role"));
                mainTable.getItems().add(getEmp);
                
                add.add(IDlbl, 0, 0);
                add.add(ID, 1, 0);
                  add.add(firstnamelbl, 0, 1);
                add.add(firstname, 1, 1);
                  add.add(lastnamelbl, 0, 2);
                add.add(lastname, 1, 2);
                  add.add(agelbl, 0, 3);
                add.add(age, 1, 3);
                add.add(sexlbl, 2, 0);
                add.add(sex, 3, 0);
                  add.add(addresslbl, 2, 1);
                add.add(address, 3, 1);
                  add.add(emaillbl, 2, 2);
                add.add(email, 3, 2);
                  add.add(rolelbl, 2, 3);
                add.add(role, 3, 3);
                add.add(save, 3, 4);
                
                
                add.setVgap(10);
                add.setHgap(15);
              
                
                
                
        searchButton.setOnAction(e->{        
             try{
         getEmp=Search.searchEmployee(searchField.getText());
         System.out.print(getEmp.getempID());
         }
         catch(Exception exception){
         System.out.print(exception.getMessage());
         exception.getStackTrace();
         }
             /*
               // getEmp=search_employee.searchEmployee(searchField.getText());  
                column_id1.setCellValueFactory(new PropertyValueFactory<>("empID"));
                column_firstname.setCellValueFactory(new PropertyValueFactory<>("firstName"));
                column_lastname.setCellValueFactory(new PropertyValueFactory<>("lastName"));
                column_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
                column_address.setCellValueFactory(new PropertyValueFactory<>("address"));
                column_age.setCellValueFactory(new PropertyValueFactory<>("age"));
                column_role.setCellValueFactory(new PropertyValueFactory<>("role"));
                mainTable.getItems().add(getEmp);
*/
             mainTable.getItems().set(0, getEmp);
   
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
        mainTable.setPrefHeight(50);
        
        box2=new HBox(20);
            addNewButton=new Button("Add New");
           // AddNewEmp addnewemp=new AddNewEmp();
           Pane ppp= new Pane();
           Button bbb = new Button();
           ppp.getChildren().add(bbb);
           
            addNewButton.setOnAction(e->{
                System.out.print(mainTable.getColumns().get(1).getCellObservableValue(5).getValue().toString()); 
                System.out.print(mainTable.getItems().get(1).getSex());
                //mainTable.getc//
                        
            });
            editButton=new Button("Edit");
            removeButton=new Button("Remove");
            //Delete delete=new Delete();
            removeButton.setOnAction(e->{
                try{
                  Delete.deleteEmployee(searchField.getText());
                  JOptionPane.showMessageDialog(null,"Deleted successfully!");
                }
                catch(Exception exception){
                    System.out.print(exception.getMessage());
                exception.getStackTrace();
                }
            });
            
              save.setOnAction(e ->{
                   try{
                  Create.insertEmployee(ID.getText(), firstname.getText(), lastname.getText(), sex.getText(), address.getText(), Integer.parseInt(age.getText()), email.getText(), role.getText());
                   }
                   catch(Exception exception){
                       System.out.print(exception.getMessage());
                       exception.getStackTrace();
                   }
                });
            
            addNewButton.setId("addNewButton");
            editButton.setId("search_btn");
            removeButton.setId("search_btn");
        box2.getChildren().addAll(addNewButton,editButton,removeButton);
        list_box=new VBox(20);
        list_box.setAlignment(Pos.CENTER);
        list_box.setMaxWidth(600);
        list_box.setMaxHeight(500);
        list_box.getChildren().addAll(box1,mainTable,box2,add);
        list_box.getStylesheets().add(getClass().getResource("employeeui.css").toExternalForm());
        searchField.setId("searchField");
        list_box.setId("list-box");
        return list_box;
    }
   }