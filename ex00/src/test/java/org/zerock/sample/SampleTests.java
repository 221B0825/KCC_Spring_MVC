package org.zerock.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {

	@Autowired
	private Restaurant restaurant;
	
	// Junit 이 Test 어노테이션 무조건 호출
	@Test
	public void test() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info(restaurant.getChef());
		
	}

}
