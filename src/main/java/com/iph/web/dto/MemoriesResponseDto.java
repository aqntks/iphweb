package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import com.iph.domain.posts.Posts;
import lombok.Getter;

@Getter
public class MemoriesResponseDto {

    private Long id;
    private String date;
    private String place;
    private String content;

    public MemoriesResponseDto(Memories entity){
        this.id = entity.getId();
        this.date = entity.getDate();
        this.place = entity.getPlace();
        this.content = entity.getContent();

    }
}
