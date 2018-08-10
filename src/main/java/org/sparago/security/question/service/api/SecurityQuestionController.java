package org.sparago.security.question.service.api;

import org.sparago.security.question.service.core.QuestionService;
import org.sparago.security.question.service.model.SecurityQuestion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SecurityQuestionController {

    private final QuestionService questionService;

    public SecurityQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(value = "")
    public SecurityQuestion getQuestion(){
        SecurityQuestion question = questionService.createQuestion();
        return question;
    }

    @PatchMapping(value = "")
    public SecurityQuestion answerQuestion(@RequestBody SecurityQuestion question) {
        if (questionService.validateAnswer(question)) {

        } else {

        }
        return question;
    }

}
