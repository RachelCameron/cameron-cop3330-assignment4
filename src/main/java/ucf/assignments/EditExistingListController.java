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

    }

    @FXML
    private TextField itemDescriptionField;

    @FXML
    private TextField itemDueDateField;

    @FXML
    private TextField itemNameField;

    @FXML
    private Button editItemButton;

    @FXML
    void editItemButtonClicked(ActionEvent event) {

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

    @FXML
    private TextField listNameField;

    @FXML
    private Button editListNameButton;

    @FXML
    void editListNameButtonClicked(ActionEvent event) {

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

    }

    //10. A user shall be able to remove an item from an existing to-do list
    public void removeItem() {
        //test
    }

    //1. The application shall be able to manage at least 100 unique to-do lists
    //3. A to-do list shall have the capacity to store at least 100 unique items
    @FXML
    private TitledPane yourList;

}
