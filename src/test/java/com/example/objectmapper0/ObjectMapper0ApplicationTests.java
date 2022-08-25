package com.example.objectmapper0;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapper0ApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("hello");

        // text json -> object
        // object -> text json

        // controller request json(text) -> object
        // reponse object -> json(text)

        var objectMapper = new ObjectMapper();

        // Object -> text
        var user = new User("joohan", 37, "010-1234-5567");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text -> Object
        // object mapper 는 default  생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);

    }

}
