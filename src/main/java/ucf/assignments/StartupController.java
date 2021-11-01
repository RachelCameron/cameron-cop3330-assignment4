package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartupController {

    @FXML
    private Button addNewListButton;

    @FXML
    void addNewListButtonClicked(ActionEvent event) {
        //takes user to the AddNewList screen
    }

    @FXML
    private Button editExistingListButton;

    @FXML
    void editExistingListButtonClicked(ActionEvent event) {
        //takes user to the EditExistingList screen
    }

    @FXML
    private Button removeExistingListButton;

    @FXML
    void removeExistingListButtonClicked(ActionEvent event) {
        //takes user to the RemoveExistingList screen
    }

    @FXML
    private Button saveExistingListsButton;

    @FXML
    void saveExistingListsButtonClicked(ActionEvent event) {
        //takes user to the SaveExistingLists screen
    }

    @FXML
    private Button viewExistingListsButton;

    @FXML
    void viewExistingListsButtonClicked(ActionEvent event) {
        //takes user to the ViewExistingLists screen
    }

}
