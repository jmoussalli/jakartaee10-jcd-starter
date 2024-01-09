package com.demo.todolist;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "TodoListServletMVC", urlPatterns = {"/todolistMVC"})
public class TodoListServletMVC extends HttpServlet {

    private final TodoList todoList = new TodoList();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("tasks", todoList.getTasks());
        request.getRequestDispatcher("WEB-INF/todoList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newTask = request.getParameter("task");
        if (newTask != null && !newTask.isEmpty()) {
            todoList.addTask(newTask);
        }
        doGet(request, response);
    }
}
