package org.scoula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 싱글톤으로 만들고 스프링에 이 클래스가 컨트롤러라고 등록
public class HomeController {
    // 요청 하나당 함수 하나

    @GetMapping("/") // 루트 주소로 get 요청이 들어왔을 때 호출
    public String home(){
        // 주소와 방법에 따라 정해진 호출해야 할 컨트롤러와 메서드의 종류를
        // 스프링이 핸들러 매퍼에 자동으로 등록
        System.out.println("==== HomeController ====");
        return "index"; // view 파일 이름을 프론트 컨틀롤러에게 리턴함

        // 뷰 리졸버가 /WEB-INF/views/ + index + .jsp 형식으로
        // 프론트 컨트롤러가 불러야 하는 파일명으로 변환해줌(랜더링)
    }
}
