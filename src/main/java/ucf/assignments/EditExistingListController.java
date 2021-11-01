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
    private Button editItemButton;

    @FXML
    void editItemButtonClicked(ActionEvent event) {

    }

    @FXML
    private Button editListNameButton;

    @FXML
    void editListNameButtonClicked(ActionEvent event) {

    }

    @FXML
    private TextField itemDescriptionField;

    @FXML
    private TextField itemDueDateField;

    @FXML
    private TextField itemNameField;

    @FXML
    private TextField listNameField;

    @FXML
    private Button markItemCompleted;

    @FXML
    void markItemCompletedClicked(ActionEvent event) {

    }

    @FXML
    private Button removeItem;

    @FXML
    void removeItemClicked(ActionEvent event) {

    }

    //1. The application shall be able to manage at least 100 unique todo lists
    //3. A todo list shall have the capacity to store at least 100 unique items
    @FXML
    private TitledPane yourList;

}
