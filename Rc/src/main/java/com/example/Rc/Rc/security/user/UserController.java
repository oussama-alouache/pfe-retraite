package com.example.Rc.Rc.security.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<User> getAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findAll()).getBody();
    }
    @GetMapping ("/{id}")
    public User findById( @PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findbyID(id)).getBody();
    }
    @PutMapping ()
    public User Update (@RequestBody User user ){



        return ResponseEntity.status(HttpStatus.OK)
                .body(service.update(user)).getBody();
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    @GetMapping("/user")
    @ResponseBody


    public String getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User userPrincipal = (User) authentication.getPrincipal();
        return "Logged-in user: " + userPrincipal.getFirstname();
    }
    @GetMapping("/time")
    @ResponseBody
    public String onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User userPrincipal = (User) authentication.getPrincipal();
        return "Logged-in user: " + userPrincipal.getFirstname()  + new Date();
    }



    @PatchMapping
    public ResponseEntity<?> changePassword(
          @RequestBody ChangePasswordRequest request,
          Principal connectedUser
    ) {
        service.changePassword(request, connectedUser);
        return ResponseEntity.ok().build();
    }
}
