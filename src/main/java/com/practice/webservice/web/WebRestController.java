package com.practice.webservice.web;

import com.practice.webservice.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor //bean의 생성자 역할을 해줌, autowired 따로 안해도 됨 (의존성 수정시 코드 변경 안해도된다는 장점)
public class WebRestController {

        private PostsRepository postsRepository;

    //@GetMapping("/hello")
    public String hello(){
        return "HelloWorld";}

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto ){  //requesstBody로 외부에서 데이터를 받음 (기본생성자+set메소드 필요)
        //절대로 entity클래스를 request나 response로 받으면 안됨. Entity클래스가 변경되면 여러 클래스에 영향을 주기 때문에
        // 따라서 DTO는 request/respose 용으로 "View를 위한 클래스"
        // 반드시 Entity클래스와 Controller에서 사용할 DTO 클래스 분리하기!!!!!
        postsRepository.save(dto.toEntity());
    }
}
