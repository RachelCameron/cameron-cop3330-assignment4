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
        //takes the user back to the startup menu
    }

    @FXML
    private Button importListButton;

    @FXML
    void importListButtonClicked(ActionEvent event) {
        //call loadSingleList or loadMultipleLists depending on how many lists are to be loaded
    }

    //19. A user shall be able to load a single to-do list that was previously saved to external storage
    public void loadSingleList(String fileName) {
        //imports list selected by user
    }

    //20. A user shall be able to load multiple to-do lists that were previous saved to external storage
    public void loadMultipleLists(String fileName) {
        //import lists selected by user
    }

    //4. An item shall have a description
    @FXML
    private TextField itemDescriptionField;
    //allows user to optionally give their item a description

    //5. An item shall have a due date, formatted as YYYY-MM-DD
    @FXML
    private TextField itemDueDateField;
    //requires user to give their item a due date in the format of YYYY-MM-DD

    @FXML
    private TextField itemNameField;
    //requires user to give their item a name

    @FXML
    private Button addItemButton;

    @FXML
    void addItemButtonClicked(ActionEvent event) {
        //calls addNewItem()
    }

    //9. A user shall be able to add a new item to an existing to-do list
    public void addNewItem(String itemName, String itemDescription, String itemDueDate, Object list) {
        //allows user to add an item to their list populated with the above criteria (description, due date, name)
    }

    //2. A to-do list shall have a title
    @FXML
    private TextField listNameField;
    //requires user to give their list a name

    @FXML
    private Button nameListButton;

    @FXML
    void nameListButtonClicked(ActionEvent event) {
        //calls addNewList()
    }

    //6. A user shall be able to add a new to-do list
    public void addNewList(String listName) {
        //creates a new list with the given name entered
    }

    //1. The application shall be able to manage at least 100 unique to-do lists
    //3. A to-do list shall have the capacity to store at least 100 unique items
    @FXML
    private TitledPane yourList;
    //holds all the currently existing lists the user is able to interact with
    // able to hold 100+ unique lists with room for 100+ unique items per list

}
