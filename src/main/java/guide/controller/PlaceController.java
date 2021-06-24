package guide.controller;

import guide.controller.dto.Message;
import guide.controller.dto.CreatePlaceDto;
import guide.model.Place;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Place getById(@RequestParam Long id){
        return new Place();
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> getAllPlace(){
        return new ArrayList<Place>();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Message createPlace(@RequestBody CreatePlaceDto createPlaceDto){
        System.out.println(createPlaceDto);
        return new Message("ok");
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Message updatePlace(@RequestBody Place place){
        return new Message("ok");
    }

    @DeleteMapping
    public Message deletePlace(@RequestParam Long id){
        return new Message("Deleted");
    }


}
