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
}
