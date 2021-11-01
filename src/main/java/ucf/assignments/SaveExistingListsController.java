package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

public class SaveExistingListsController {

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
    private Button saveListButton;

    @FXML
    void saveListButtonClicked(ActionEvent event) {
        //calls saveItemsSingleList() or saveItemsMultipleLists depending on user selection of list(s)
    }

    //17. A user shall be able to save all of the items in a single to-do list to external storage
    public void saveItemsSingleList() {
        //saves the list selected by the user
        //makes new file, formats file, and writes into file
    }

    //18. A user shall be able to save all of the items across all of the to-do lists to external storage
    public void saveItemsMultipleLists() {
        //save lists selected by the user
        //use loop to collect all the lists
        //makes new file, formats file, and writes into file
    }

}
