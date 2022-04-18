package com.upce.todo.repository;

import com.upce.todo.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemRepository extends JpaRepository<TodoItem, Integer> {
}
