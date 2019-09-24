package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean(value = "person1")
    public Person person() {
        return new Person("zhang", 12);
    }
}
