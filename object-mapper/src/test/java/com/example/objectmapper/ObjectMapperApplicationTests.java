package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-------------------------");

		/**
		 * Object mapper
		 * Text JSON -> Object
		 * Object -> Text JSON
		 *
		 * controller req json(text) -> object
		 * response object -> json(text)
		 */

		var objectMapper = new ObjectMapper();

		// object -> text
		// object mapper는 get method를 활용한다.

		var user = new User("willie", 36, "010-3258-5791");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		// text -> object
		// 정상적으로 작동하기 위해서는 default constructor가 필요하다.
		// object mapper를 쓰기 위해서는 get method가 아닌 method에는 get이라는 단어를 빼야 한다.
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);

	}

}
