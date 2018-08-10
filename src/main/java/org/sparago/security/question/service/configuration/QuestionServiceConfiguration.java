package org.sparago.security.question.service.configuration;

import org.sparago.security.question.service.core.QuestionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionServiceConfiguration {

    @Bean
    QuestionService questionService() {
        return new QuestionService();
    }

}
