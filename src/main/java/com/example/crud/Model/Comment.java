package com.example.crud.Model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes ="Comment id", example = "1", required = false, hidden = true)
    private long id;
    @ApiModelProperty(notes ="Post id", example = "1", required = false, hidden = true)
    private long postId;
    @ApiModelProperty(notes ="Comment content", example = "Comment content", required = true)
    private String content;
    private LocalDateTime created;
}
