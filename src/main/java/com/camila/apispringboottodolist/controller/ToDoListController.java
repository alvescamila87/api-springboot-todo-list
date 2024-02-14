package com.camila.apispringboottodolist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toDoList")
public class ToDoListController {

    @GetMapping("/todo")
    public ResponseEntity getToDoList() {
        return ResponseEntity.ok("OK");
    }
}
