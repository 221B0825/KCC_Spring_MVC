package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component //빈 등록
@Data // lombok
public class Chef {
	
	private String name;
}
