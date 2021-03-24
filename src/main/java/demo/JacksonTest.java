package demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo.domain.Person;

public class JacksonTest {

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setName("張三");
        person.setAge(18);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(person);
        System.out.println(s);
    }
}

