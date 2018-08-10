package org.sparago.security.question.service.core;

import org.sparago.security.question.service.model.SecurityQuestion;

public class QuestionService {

    public SecurityQuestion createQuestion() {
        SecurityQuestion question = new SecurityQuestion();
        return question;
    }

    public boolean validateAnswer(SecurityQuestion question) {
        return true;
    }

}
