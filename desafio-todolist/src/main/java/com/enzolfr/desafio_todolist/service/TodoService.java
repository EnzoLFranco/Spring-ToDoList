package com.enzolfr.desafio_todolist.service;

import com.enzolfr.desafio_todolist.entity.Todo;
import com.enzolfr.desafio_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){

    }

    public List<Todo> list(){
    
    }

    public List<Todo> update(){

    }
    public List<Todo> delete(){

    }
}
