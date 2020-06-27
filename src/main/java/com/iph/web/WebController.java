package com.iph.web;

import com.iph.service.posts.MemoriesService;
import com.iph.service.posts.PostsService;
import com.iph.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class WebController {

    private final MemoriesService memoriesService;

    @GetMapping("/memories/save")
    public String memoriesSave(){
        return "memories-save";
    }

    @GetMapping("/plan")
    public String plan(Model model) {
        model.addAttribute("memories", memoriesService.findAllDesc());
        return "plan";
    }

    @GetMapping("/memory")
    public String memory(Model model) {
        model.addAttribute("memories", memoriesService.findAllDesc());
        return "memory";
    }
}
