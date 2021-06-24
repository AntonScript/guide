package guide.controller;

import guide.controller.dto.Message;
import guide.model.Place;
import guide.model.TypePlace;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/type-place")
public class TypePlaceController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TypePlace> getAllType(){
        return new ArrayList<TypePlace>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Message createTypePlace(@RequestBody TypePlace typePlace){
        System.out.println(typePlace);
        return new Message("ok");
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Message updateTypePlace(@RequestBody TypePlace typePlace){
        return new Message("ok");
    }

    @DeleteMapping
    public Message deleteTypePlace(@RequestParam Long id){
        return new Message("Deleted");
    }
}
