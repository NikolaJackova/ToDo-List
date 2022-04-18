package com.upce.todo.service;

import com.upce.todo.entity.TodoItem;

import java.util.List;

public interface ToDoItemService {
    List<TodoItem> getToDoItems();
    TodoItem createItem(TodoItem todoItem);
    void removeItem(Integer id);
    TodoItem updateItem(TodoItem todoItem);
}
