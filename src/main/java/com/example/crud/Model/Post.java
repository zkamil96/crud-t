package com.example.crud.Model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes ="id", example = "1", required = false, hidden = true)
    private long id;
    @ApiModelProperty(notes ="Post title", example = "Post 1", required = true)
    private String title;
    @ApiModelProperty(notes ="Post content", example = "Post content", required = true)
    private String content;
    private LocalDateTime created;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "postId", updatable = false, insertable = false)
    @ApiModelProperty(notes ="Post comments", example = "Post comments", required = false, hidden = true)
    private List<Comment> comment;
}
