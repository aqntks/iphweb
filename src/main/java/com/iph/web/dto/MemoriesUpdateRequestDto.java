package com.iph.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemoriesUpdateRequestDto {
    private String date;
    private String place;
    private String content;

    @Builder
    public MemoriesUpdateRequestDto(String date, String place, String content){
        this.date = date;
        this.place = place;
        this.content = content;
    }
}
