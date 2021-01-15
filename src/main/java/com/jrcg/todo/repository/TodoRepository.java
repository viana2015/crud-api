package com.jrcg.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrcg.todo.doman.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
