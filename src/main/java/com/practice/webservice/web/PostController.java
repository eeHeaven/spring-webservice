package com.practice.webservice.web;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //테스트 Request 요청을 받아줌
public class PostController {

    @PostMapping("/group")
    public GroupDto post(@RequestBody GroupDto groupDto){
        return groupDto;
    }

    @Setter
    @Getter
    @NoArgsConstructor
    private static class GroupDto{
        private String groupName;
        private List<String> members;
        private DateObj date;

        @Setter
        @Getter
        @NoArgsConstructor
        private class DateObj{
            private int year;
            private int month;
            private int day;
        }
    }
}
