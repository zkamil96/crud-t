package com.example.crud.Dto;

import com.example.crud.Model.Post;

import java.util.List;
import java.util.stream.Collectors;

public class PostDtoMapper {
    public PostDtoMapper(){

    }

    public static List<PostDto> mapToPostDtos(List<Post> posts) {
        return posts.stream()
                .map(post -> mapToPostDtos(post))
                .collect(Collectors.toList());
    }

    public static PostDto mapToPostDtos(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .created(post.getCreated())
                .build();
    }
}
