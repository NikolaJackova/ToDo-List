package com.upce.todo.service;

import com.upce.todo.entity.TodoItem;
import com.upce.todo.repository.ToDoItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {
    private final ToDoItemRepository toDoItemRepository;

    public ToDoItemServiceImpl(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    @Override
    public List<TodoItem> getToDoItems() {
        return toDoItemRepository.findAll();
    }

    @Override
    public TodoItem createItem(TodoItem todoItem) {
        return toDoItemRepository.save(todoItem);
    }

    @Override
    public void removeItem(Integer id) {
        toDoItemRepository.deleteById(id);
    }

    @Override
    public TodoItem updateItem(TodoItem todoItem) {
        return toDoItemRepository.save(todoItem);
    }
}
