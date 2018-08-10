package org.sparago.security.question.service.model;

import lombok.Data;

@Data
public class SecurityQuestion {
    private String questionText;
    private int[] numbers;
    private int answer;
}
