package team.mediasoft.guide.controller;

import team.mediasoft.guide.controller.dto.CommentResponseDto;
import team.mediasoft.guide.controller.dto.CreateCommentRequestDto;
import team.mediasoft.guide.controller.dto.MessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CommentResponseDto> getCommentsByPlace(@RequestParam Long idPlace){
        return new ArrayList<CommentResponseDto>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDto createComment(@RequestBody CreateCommentRequestDto comment){
        return new MessageDto("k");
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto updateComment(@PathVariable Long id, @RequestBody CreateCommentRequestDto comment){
        return new MessageDto("k");
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto deleteComment(@PathVariable Long id){
        return new MessageDto("k");
    }
}
