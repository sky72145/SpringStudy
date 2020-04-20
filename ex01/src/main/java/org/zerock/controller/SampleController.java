package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

//자동으로 스프링 객체로 등록된다.
//그 이유는 servlet-context.xml로 가보면 됨
//스프링MVC 어노테이션 
@Controller
//@RequestMapping은 현재 클래스의 모든 메서드들의 기본적인 URL 경로가 된다
// /sample/*라는 경로로 지정했기 때문에 /sample/aaa, /sample/bbb 같은 URL들은 모두 SampleController에서 처리됨
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	@RequestMapping("")
	public void basic() {
		log.info("basic..............");
	}
}
