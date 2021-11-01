package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class AddNewListController {

    @FXML
    private Button backToStartupMenuButton;

    @FXML
    void backToStartupMenuButtonClicked(ActionEvent event) {

    }

    @FXML
    private Button importListButton;

    @FXML
    void importListButtonClicked(ActionEvent event) {

    }

    //19. A user shall be able to load a single to-do list that was previously saved to external storage
    public void loadSingleList() {
        //test
    }

    //20. A user shall be able to load multiple to-do lists that were previous saved to external storage
    public void loadMultipleLists() {
        //test
    }

    //4. An item shall have a description
    @FXML
    private TextField itemDescriptionField;

    //5. An item shall have a due date, formatted as YYYY-MM-DD
    @FXML
    private TextField itemDueDateField;

    @FXML
    private TextField itemNameField;

    @FXML
    private Button addItemButton;

    @FXML
    void addItemButtonClicked(ActionEvent event) {

    }

    //9. A user shall be able to add a new item to an existing to-do list
    public void addNewItem() {
        //test
    }

    //2. A to-do list shall have a title
    @FXML
    private TextField listNameField;

    @FXML
    private Button nameListButton;

    @FXML
    void nameListButtonClicked(ActionEvent event) {

    }

    //6. A user shall be able to add a new to-do list
    public void addNewList() {
        //test
    }

    //1. The application shall be able to manage at least 100 unique to-do lists
    //3. A to-do list shall have the capacity to store at least 100 unique items
    @FXML
    private TitledPane yourList;

}
