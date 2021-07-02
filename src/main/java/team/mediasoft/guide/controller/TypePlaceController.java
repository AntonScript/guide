package team.mediasoft.guide.controller;

import team.mediasoft.guide.controller.dto.CreateTypePlaceRequestDto;
import team.mediasoft.guide.controller.dto.MessageDto;
import team.mediasoft.guide.controller.dto.TypePlaceResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/type-place")
public class TypePlaceController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TypePlaceResponseDto> getAllType(){
        return new ArrayList<TypePlaceResponseDto>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDto createTypePlace(@RequestBody CreateTypePlaceRequestDto typePlace){
        System.out.println(typePlace);
        return new MessageDto("ok");
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto updateTypePlace(@PathVariable Long id, @RequestBody TypePlaceResponseDto typePlace){
        return new MessageDto("ok");
    }

    @DeleteMapping("/{id}")
    public MessageDto deleteTypePlace(@PathVariable Long id){
        return new MessageDto("Deleted");
    }
}
