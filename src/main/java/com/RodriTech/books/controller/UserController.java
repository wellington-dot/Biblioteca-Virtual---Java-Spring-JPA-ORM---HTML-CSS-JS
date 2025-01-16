package com.RodriTech.books.controller;

import com.RodriTech.books.dto.UserDTO;
import com.RodriTech.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping
    public ResponseEntity<UserDTO> cadasUser (@RequestBody UserDTO user) {
         user = service.cadasUser(user);
         return ResponseEntity.ok(user);
     }
}
