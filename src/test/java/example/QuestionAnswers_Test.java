package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionAnswers_Test {
    private QuestionAnswers qa;

    @BeforeEach
    void setup () {
        qa = new QuestionAnswers();
    }

    @Test
    void testGetAnswers () {
        String q1 = "What is Peters favorite food?";
        List<String> a1 = List.of("Pizza", "Spaghetti", "Ice Cream");
        String q2 = "What are Ninas favorite colors?";
        List<String> a2 = List.of("Magenta", "Purple", "Lila");
        String q3 = "What are Dans favorite sports?";
        List<String> a3 = List.of("Soccer", "Swimming", "Biking", "Handball");

        qa.addQuestionAnswers(q1, a1);
        qa.addQuestionAnswers(q2, a2);
        qa.addQuestionAnswers(q3, a3);

        List<String> answer1 = qa.getAnswers(q1);
        Assertions.assertIterableEquals(answer1, a1);

        List<String> answer2 = qa.getAnswers(q2);
        Assertions.assertIterableEquals(answer2, a2);

        List<String> answer3 = qa.getAnswers(q3);
        Assertions.assertIterableEquals(answer3, a3);

    }

    @Test
    void testGetAllQuestions () {
        String q1 = "What is Peters favorite food?";
        List<String> a1 = List.of("Pizza", "Spaghetti", "Ice Cream");
        String q2 = "What are Ninas favorite colors?";
        List<String> a2 = List.of("Magenta", "Purple", "Lila");
        String q3 = "What are Dans favorite sports?";
        List<String> a3 = List.of("Soccer", "Swimming", "Biking", "Handball");

        qa.addQuestionAnswers(q1, a1);
        qa.addQuestionAnswers(q2, a2);
        qa.addQuestionAnswers(q3, a3);

        Set<String> questions = qa.getAllQuestions();
        Assertions.assertEquals(questions, Set.of(q1, q2, q3));

    }

    @Test
    void testContainsQuestion () {
        String q1 = "What is Peters favorite food?";
        List<String> a1 = List.of("Pizza", "Spaghetti", "Ice Cream");
        String q2 = "What are Ninas favorite colors?";
        List<String> a2 = List.of("Magenta", "Purple", "Lila");
        String q3 = "What are Dans favorite sports?";
        List<String> a3 = List.of("Soccer", "Swimming", "Biking", "Handball");

        qa.addQuestionAnswers(q1, a1);
        qa.addQuestionAnswers(q2, a2);
        qa.addQuestionAnswers(q3, a3);

        boolean answer1 = qa.containsQuestion(q1);
        assertEquals(answer1, true);

        boolean answer2 = qa.containsQuestion(q1);
        assertEquals(answer2, true);

        boolean answer3 = qa.containsQuestion(q1);
        assertEquals(answer3, true);

        boolean answer4 = qa.containsQuestion("What is Peters favorite city?");
        assertEquals(answer4, false);

    }

    @Test
    void testUniversalAnswer () {
        String universalAnswer = "the answer to life, universe and everything is 42";

        String answer1 = qa.getUniversalAnswer();
        assertEquals(answer1, universalAnswer);
    }


}
