package avia.user_service.controller;

import avia.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class UserController {

    private UserService userService;

    @GetMapping
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok("1");
    }
}
