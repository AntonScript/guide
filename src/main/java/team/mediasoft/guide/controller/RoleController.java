package team.mediasoft.guide.controller;

import team.mediasoft.guide.controller.dto.CreateRoleRequestDto;
import team.mediasoft.guide.controller.dto.MessageDto;
import team.mediasoft.guide.controller.dto.RoleResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<RoleResponseDto> getAllRole(){
        return new ArrayList<>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDto createRole(@RequestBody CreateRoleRequestDto role){
        return new MessageDto("k");
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto updateRole(@PathVariable Long id, @RequestBody RoleResponseDto role){
        return new MessageDto("k");
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto deleteRole(@PathVariable Long id){
        return new MessageDto("k");
    }

}
