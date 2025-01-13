package com.enzolfr.desafio_todolist.repository;

import com.enzolfr.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
