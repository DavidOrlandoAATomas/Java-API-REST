package me.david.java_bootcamp.controller;

import me.david.java_bootcamp.domain.model.User;
import me.david.java_bootcamp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> FindById(@PathVariable Long id){
        var user = userService.FindById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/{id}")
    public ResponseEntity<User> FindById(@RequestBody User usertoCreat){
        var userCreated = userService.create(usertoCreat);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId()).
                toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
