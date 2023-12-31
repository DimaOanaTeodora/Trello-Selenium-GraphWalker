// Generated by GraphWalker (http://www.graphwalker.org)
package com.company;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/company/LoginTrelloModel.json")
public interface LoginTrelloModel {

    @Vertex()
    void v_EnterPassword();

    @Vertex()
    void v_Trello();

    @Vertex()
    void v_ViewMainWorkspace();

    @Edge()
    void e_EnterBaseURL();

    @Vertex()
    void v_EnterUsername();

    @Edge()
    void e_gotoLoginState();

    @Edge()
    void e_submitLoginForm();

    @Edge()
    void e_gotoNextSection();

    @Vertex()
    void v_ViewFirstBoard();

    @Edge()
    void e_gotoFirstBoard();

    @Edge()
    void e_closeAddForm();

    @Edge()
    void e_selectToDoList();

    @Vertex()
    void v_VerifyTaskAdded();

    @Edge()
    void e_openAddForm();

    @Edge()
    void e_selectDoingList();

    @Edge()
    void e_deselectList();

    @Edge()
    void e_addNewTask();

    @Edge()
    void e_selectDoneList();

    @Vertex()
    void v_VerifyListSelected();

    @Vertex()
    void v_VerifyAddFormOpen();

    @Edge()
    void e_incrementTasks();
}
