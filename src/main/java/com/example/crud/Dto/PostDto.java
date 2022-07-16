package com.example.crud.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Builder
@Setter
public class PostDto {

    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}
