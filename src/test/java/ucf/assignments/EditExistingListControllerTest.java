package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Test;

class EditExistingListControllerTest {

    //8. A user shall be able to edit the title of an existing to-do list
    @Test
    void editListTitleTest() {
        //call editListTitle
        //use assertions to verify actual title string against expected title string
        //if they match, passes test
    }

    //10. A user shall be able to remove an item from an existing to-do list
    @Test
    void removeItemTest() {
        //call removeItem
        //convert list contents to string
        //loop to check and see if the item removed remains within the list
        //if it is no longer within the list, passes test
    }

    //11. A user shall be able to edit the description of an item within an existing to-do list
    @Test
    void editItemDescriptionTest() {
        //call editItemDescription
        //use assertions to verify actual item description string against expected item description string
        //if they match, passes test
    }

    //12. A user shall be able to edit the due date of an item within an existing to-do list
    @Test
    void editItemDueDateTest() {
        //call editItemDueDate
        //use assertions to verify actual item due date string against expected item due date string
        //if they match, passes test
    }

    //13. A user shall be able to mark an item in a to-do list as complete
    @Test
    void markItemCompletedTest() {
        //call markItemCompleted
        //use test array to assert actual vs expected outputs
        //if they match, passes test
    }
}