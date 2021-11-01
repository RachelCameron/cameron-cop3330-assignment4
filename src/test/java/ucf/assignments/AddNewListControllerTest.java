package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Test;

class AddNewListControllerTest {

    //6. A user shall be able to add a new to-do list
    @Test
    void addNewListTest() {
        //call addNewList
        //use assertions to verify actual list length against expected list length
        //if they match, passes test
    }

    //9. A user shall be able to add a new item to an existing to-do list
    @Test
    void addNewItemTest() {
        //call addNewItem
        //check to see if the item name/description/due date exists within list via loop
        //if the loop successfully finds item, passes test
    }

    //19. A user shall be able to load a single to-do list that was previously saved to external storage
    @Test
    void loadSingleListTest() {
        //call loadSingleList
        //use assertions to verify actual list output against expected list output
        //if they match, passes test
    }

    //20. A user shall be able to load multiple to-do lists that were previous saved to external storage
    @Test
    void loadMultipleListsTest() {
        //call loadMultipleLists
        //use loop to handle multiple lists
        //use assertions to verify actual list outputs against expected list outputs
        //if they match, passes test
    }

}