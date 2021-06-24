package guide.controller;

import guide.controller.dto.Message;
import guide.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public User getById(@RequestParam Long id){
        return new User();
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUser(){
        return new ArrayList<User>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Message createUser(@RequestBody User user){
        return new Message("k");
    }


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Message updateUser(@RequestBody User user){
        return new Message("k");

    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public Message deleteUser(@RequestParam Long id){
        return new Message("k");
    }
}
