package com.ana.todo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ana.todo.domain.Todo;
import com.ana.todo.services.TodoService;

@RestController // requisiçoes do tipo http
@RequestMapping(value = "/todos")//eindpoint
public class TodoResource {

	@Autowired
	private TodoService service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id){
		Todo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
