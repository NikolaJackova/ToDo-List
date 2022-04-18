package com.upce.todo.controller;

import com.upce.todo.entity.TodoItem;
import com.upce.todo.service.ToDoItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ToDoItemController {
    private final ToDoItemService toDoItemService;

    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @GetMapping("/")
    public List<TodoItem> getToDoItems(){
        return toDoItemService.getToDoItems();
    }

    @PostMapping("/")
    public TodoItem createItem(@RequestBody TodoItem todoItem){
        return toDoItemService.createItem(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id){
        toDoItemService.removeItem(id);
    }
}
