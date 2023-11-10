package com.example.Spring_Boot_tutorial.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    //페이지를 추가하는 함수의 대략적인 개발흐름.
    //첫번째로 Controller에 함수를 만든다.
    @GetMapping("/hi") // "~~"를 지정해준다.
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "jmk"); //이거는 일단 비워둔다. (view template 만들면서 필요하면 추가)
        return "greetings"; //view template의 이름을 지정해준다. 그다음 view 템플릿 생성을 이 이름으로 한다.
    }

    //전체 적인 코드 흐름은 main -> Controller -> Mdoel 설정하면 Model 이 뭔가 작업을 하는가/ 아니면 이제 이 다음에 실행되는 template에서 가져오는 데 가져올때 그 객체 안에 저장돼있는것인가. -> viewtemplate이 반환되면서 실행.
    @GetMapping("/bye")
    public String GoodBye(Model model){
        model.addAttribute("username", "사이클리스트로 성장한 jmk님");
        return "ByeBye";
    }


}
