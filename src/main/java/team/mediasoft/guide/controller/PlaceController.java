package team.mediasoft.guide.controller;

import team.mediasoft.guide.controller.dto.MessageDto;
import team.mediasoft.guide.controller.dto.CreatePlaceRequestDto;
import team.mediasoft.guide.controller.dto.PlaceResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PlaceResponseDto getById(@RequestParam Long idPlace){
        return null;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceResponseDto> getAllPlace(){
        return new ArrayList<PlaceResponseDto>();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDto createPlace(@RequestBody CreatePlaceRequestDto createPlaceRequestDto){
        System.out.println(createPlaceRequestDto);
        return new MessageDto("ok");
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto updatePlace(@PathVariable Long id, @RequestBody PlaceResponseDto  place){
        return new MessageDto("ok");
    }

    @DeleteMapping("/{id}")
    public MessageDto deletePlace(@PathVariable Long id){
        return new MessageDto("Deleted");
    }


}
