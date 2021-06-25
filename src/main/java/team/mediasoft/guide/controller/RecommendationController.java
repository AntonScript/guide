package team.mediasoft.guide.controller;

import team.mediasoft.guide.controller.dto.PlaceResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {
    @GetMapping
    public List<PlaceResponseDto> getRecommendation(@RequestParam String type, @RequestParam(required = false) Long count){
        return new ArrayList<PlaceResponseDto>();
    }


}
