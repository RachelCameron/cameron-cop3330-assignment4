package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

public class RemoveExistingListController {

    @FXML
    private Button backToStartupMenuButton;

    @FXML
    void backToStartupMenuButtonClicked(ActionEvent event) {
        //takes the user back to the startup menu
    }

    @FXML
    private SplitMenuButton listSelect;

    @FXML
    void listSelectClicked(ActionEvent event) {
        //allows user to select one or more lists
    }

    @FXML
    private Button removeListButton;

    @FXML
    void removeListButtonClicked(ActionEvent event) {
        //calls removeExistingList()
    }

    //7. A user shall be able to remove an existing to-do list
    public void removeExistingList(String listName) {
        //removes the list(s) selected by the user
    }

}
