package com.practice.webservice.web;

import com.practice.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
