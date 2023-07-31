package com.hsgroup.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 스프링부트의 컨트롤러 역할
public class MainController {

    @GetMapping("/sbb") 
    // 요청된 URL과 매핑, 즉 이 주소로 접속하면 매핑되는 인덱스 메서드를 찾아 실행
    @ResponseBody // URL 요청에 대한 응답으로 문자열을 리턴하라는 의미
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}