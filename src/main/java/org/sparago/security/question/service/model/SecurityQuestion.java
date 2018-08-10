package org.sparago.security.question.service.model;

import lombok.Data;
import java.util.List;

@Data
public class SecurityQuestion {
    private final String questionText;

    private final List<Integer> numbers;

    private final int answer;
}
