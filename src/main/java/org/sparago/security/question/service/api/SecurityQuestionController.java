package org.sparago.security.question.service.api;

import org.sparago.security.question.service.model.SecurityQuestion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SecurityQuestionController {

    @GetMapping(value = "")
    public SecurityQuestion getQuestion(){
        SecurityQuestion question = new SecurityQuestion();
        return question;
    }

    @PatchMapping(value = "")
    public SecurityQuestion answerQuestion(@RequestBody SecurityQuestion question) {

        return question;
    }

}
