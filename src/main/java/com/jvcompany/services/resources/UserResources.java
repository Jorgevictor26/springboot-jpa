package com.jvcompany.services.resources;

import com.jvcompany.services.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findaAll(){
        User firstUser = new User(1L, "Jorge Victor", "jv@gmail.com","930296746", "123456");
        return ResponseEntity.ok().body(firstUser);
    }
}
