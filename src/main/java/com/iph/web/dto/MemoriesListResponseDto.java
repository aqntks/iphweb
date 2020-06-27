package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class MemoriesListResponseDto {
    private Long id;
    private String date;
    private String place;
    private String content;
    private LocalDateTime modifiedDate;

    public MemoriesListResponseDto(Memories entity) {
        this.id = entity.getId();
        this.date = entity.getDate();
        this.place = entity.getPlace();
        this.content = entity.getContent();
        this.modifiedDate = entity.getModifiedDate();
    }
}
