package org.scoula.ex06;

import org.scoula.ex06.command.Command;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/")
public class FrontControllerServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    @Override
    public void init() throws ServletException {
        getMap = new HashMap<>();
        postMap = new HashMap<>();
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private String getCommandName (HttpServletRequest req) {

    }

    private Command getCommand (HttpServletRequest req) {

    }

    private void execute(Command command, HttpServletRequest request, HttpServletResponse response){

    }
}
