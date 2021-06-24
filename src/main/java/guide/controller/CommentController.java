package guide.controller;

import guide.controller.dto.Message;
import guide.model.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> getAllComment(@RequestParam Long id){
        return new ArrayList<Comment>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Message createComment(@RequestBody Comment comment){
        return new Message("k");
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Message updateComment(@RequestParam Long id){
        return new Message("k");
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public Message deleteComment(@RequestParam Long id){
        return new Message("k");
    }
}
