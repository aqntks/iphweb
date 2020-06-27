package com.iph.domain.posts;

import com.iph.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Memories extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String date;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String place;

    @Column
    private String content;


    @Builder
    public Memories(String date, String place, String content){
        this.date = date;
        this.place = place;
        this.content = content;

    }

    public void update(String date, String place, String content){
        this.date = date;
        this.place = place;
        this.content = content;
    }
}
