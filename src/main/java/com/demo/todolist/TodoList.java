package com.demo.todolist;

import java.util.ArrayList;

// Classe TodoList (Modèle)
public class TodoList {
    private final ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}
