package org.zerock.controller;


import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@GetMapping("basic")
	public void basicGet() {
		log.info("basic");
	}
	
	@GetMapping("ex01")
	public String ex01(SampleDTO dto) {
		log.info("ex01::");
		log.info("dto: "+dto);
		return "ex01";
	}
	
	@GetMapping("ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("이름: "+name);
		log.info("나이: "+age);
		return "ex02";
		
	}
	
	@GetMapping("ex03")
	public String ex03(RedirectAttributes rttr) {
		rttr.addAttribute("name", "bbb");
		rttr.addAttribute("age", 30);
	
		rttr.addAttribute("page", 100);
		
		return "redirect:/sample/ex04";
	}
	
	//View => Controller => View
	//데이터를 가공하지 않고 그대로 전달하고 싶을 떄 sampleDTO.name 이렇게 접근 가능함(객체일 떄 !jsp에서)
	// 그래서 page라는 요소는 넘어가지 않음. 일반 변수는 안넘어감 !
	// 그래서 @ModelAttribute를 사용하
	@GetMapping("ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page")int page) {
		log.info("ex04::");
		log.info("dto: "+dto);
		log.info("page: " +page);
		return "ex04";
	}
	
	@GetMapping("ex05")
	public void ex05() {
		log.info("ex05::");
	}
	
	
	// 라이브러리 추가하고
	// @ResponseBody 어노테이션 설정하면 json으로 리턴
	@GetMapping("ex06")
	public @ResponseBody SampleDTO ex06() {
		SampleDTO dto = new SampleDTO();
		dto.setAge(20);
		dto.setName("홍길동");
		return dto; //json
	}
	
	@GetMapping("ex07")
	public ResponseEntity<String> ex07(){
		log.info("ex07::");
		//{"name": "홍길동"}
		String message = "{\"name\":\"홍길동\"}";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<String>(message, header, HttpStatus.OK);
		
	}
	
	@GetMapping("exUpload")
	public void exUpload() {
		
		log.info("exUpload");

	}
	
	@PostMapping("exUploadPost")
	public void exUploadPost(List<MultipartFile> files){
		files.forEach(file -> {
			log.info("----------------------------");
			log.info("name: "+file.getOriginalFilename());
			log.info("size: "+file.getSize());
		});
	}
}
