package org.example;

import java.util.*;

public class QuestionAnswers {

    private Map<String, List<String>> map = new HashMap<>();


    public void addQuestionAnswers (String question, List<String> answers){
        map.put(question, answers);
    }

    public List<String> getAnswers (String question) {
        return map.get(question);
    }

    public Set<String> getAllQuestions () {
        return map.keySet();
    }

    public boolean containsQuestion (String question) {
        return map.containsKey(question);
    }

    public String getUniversalAnswer () {
        return "the answer to life, universe and everything is 42";
    }

}
