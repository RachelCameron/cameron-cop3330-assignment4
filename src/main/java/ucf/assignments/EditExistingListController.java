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

public class EditExistingListController {

    @FXML
    private Button backToStartupMenuButton;

    @FXML
    void backToStartupMenuButtonClicked(ActionEvent event) {
        //takes the user back to the startup menu
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
    private Button editItemButton;

    @FXML
    void editItemButtonClicked(ActionEvent event) {
        //allows user to edit an item in an existing list populated with the above criteria (description, due date, name)
    }

    //8. A user shall be able to edit the title of an existing to-do list
    public void editListTitle() {
        //test
    }

    //11. A user shall be able to edit the description of an item within an existing to-do list
    public void editItemDescription() {
        //test
    }

    //12. A user shall be able to edit the due date of an item within an existing to-do list
    public void editItemDueDate() {
        //test
    }

    //2. A to-do list shall have a title
    @FXML
    private TextField listNameField;
    //requires user to give their list a name

    @FXML
    private Button editListNameButton;

    @FXML
    void editListNameButtonClicked(ActionEvent event) {
        //edits an existing list with the given name entered
    }

    @FXML
    private Button markItemCompleted;

    @FXML
    void markItemCompletedClicked(ActionEvent event) {

    }

    //13. A user shall be able to mark an item in a to-do list as complete
    public void markItemCompleted() {
        //test
    }

    @FXML
    private Button removeItem;

    @FXML
    void removeItemClicked(ActionEvent event) {
        //removes an item from an existing list
    }

    //10. A user shall be able to remove an item from an existing to-do list
    public void removeItem() {
        //test
    }

    //1. The application shall be able to manage at least 100 unique to-do lists
    //3. A to-do list shall have the capacity to store at least 100 unique items
    @FXML
    private TitledPane yourList;
    //holds all the currently existing lists the user is able to interact with
    //able to hold 100+ unique lists with room for 100+ unique items per list

}
