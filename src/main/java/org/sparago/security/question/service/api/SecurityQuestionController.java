package org.sparago.security.question.service.api;

import org.sparago.security.question.service.core.QuestionService;
import org.sparago.security.question.service.exception.IncorrectAnswerException;
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
        return questionService.createQuestion();
    }

    @PutMapping(value = "")
    public SecurityQuestion answerQuestion(@RequestBody SecurityQuestion question) {
        if (!questionService.validateAnswer(question)) {
            throw new IncorrectAnswerException();
        }
        return question;
    }

}
