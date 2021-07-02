package team.mediasoft.guide.controller;

import team.mediasoft.guide.controller.dto.CreateUserRequestDto;
import team.mediasoft.guide.controller.dto.MessageDto;
import team.mediasoft.guide.controller.dto.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserResponseDto getById(@RequestParam Long idUser){
        return null;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponseDto> getAllUser(){
        return new ArrayList<UserResponseDto>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDto createUser(@RequestBody CreateUserRequestDto user){
        return new MessageDto("k");
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto updateUser(@PathVariable Long id,@RequestBody UserResponseDto user){
        return new MessageDto("k");

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto deleteUser(@PathVariable Long id){
        return new MessageDto("k");
    }
}
