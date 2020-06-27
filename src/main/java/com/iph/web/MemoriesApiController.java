package com.iph.web;

import com.iph.service.posts.MemoriesService;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoriesApiController {

    private final MemoriesService memoriesService;

    @PostMapping("/api/v1/memories")
    public Long save(@RequestBody MemoriesSaveRequestDto requestDto) {
        return memoriesService.save(requestDto);
    }

    @PutMapping("/api/v1/memories/{id}")
    public Long update(@PathVariable Long id, @RequestBody MemoriesUpdateRequestDto requestDto) {
        return memoriesService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/memories/{id}")
    public Long delete(@PathVariable Long id) {
        memoriesService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/memories/{id}")
    public MemoriesResponseDto findById(@PathVariable Long id) {
        return memoriesService.findById(id);
    }

    @GetMapping("/api/v1/memories/list")
    public List<MemoriesListResponseDto> findAll() {
        return memoriesService.findAllDesc();
    }
}
