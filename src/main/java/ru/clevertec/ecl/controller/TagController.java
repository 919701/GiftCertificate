package ru.clevertec.ecl.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.clevertec.ecl.dto.tagDto.TagResponseDto;
import ru.clevertec.ecl.service.TagService;

import java.util.List;

@RestController
@RequestMapping("/tags")
@AllArgsConstructor
public class TagController {

    private final TagService tagService;

    @GetMapping("{/id")
    public ResponseEntity<TagResponseDto> findById(Long id){
        return ResponseEntity.ok(tagService.findById(id));
    }

    public ResponseEntity<List<TagResponseDto>> findAll(){
        return ResponseEntity.ok(tagService.findAll());

    }
}
