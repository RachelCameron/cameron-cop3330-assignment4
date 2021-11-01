package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;

public class ViewExistingListsController {

    @FXML
    private Button backToStartupMenuButton;

    @FXML
    void backToStartupMenuButtonClicked(ActionEvent event) {

    }

    @FXML
    private Button showCompleteItemsOnly;

    @FXML
    void showCompleteItemsOnlyClicked(ActionEvent event) {

    }

    @FXML
    private Button showIncompleteItemsOnly;

    @FXML
    void showIncompleteItemsOnlyClicked(ActionEvent event) {

    }

    //1. The application shall be able to manage at least 100 unique todo lists
    //3. A todo list shall have the capacity to store at least 100 unique items
    @FXML
    private TitledPane yourList;

}
