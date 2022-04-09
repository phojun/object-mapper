package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("hello");

		var objectMapper = new ObjectMapper();

		// object -> text  => objectmapper가 get 메서드를 활용한다

		var user = new User("steve", 21,"010-0000-0000");

		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);


		// text -> object
		
		// object mapper는 default 생성자가 반드시 필요하다
		var objectUser = objectMapper.readValue(text,User.class);
		System.out.println(objectUser);
	}

}
