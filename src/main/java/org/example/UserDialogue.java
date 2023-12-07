package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserDialogue {
    public void runDialogue() {
        QuestionAnswers qa = new QuestionAnswers();

        String input;
        Scanner sc = new Scanner(System.in);

        StringBuilder userDialogue = new StringBuilder();
        userDialogue.append("Please select Mode: \n");
        userDialogue.append("[Add] .... Add a new questtion \n");
        userDialogue.append("[Ask] .... Ask an existing question \n");
        userDialogue.append("[PrintAll] Print all stored questions \n");
        userDialogue.append("[Q] ...... Quit \n");

        System.out.println(userDialogue);
        input = sc.nextLine();

        while (!input.equals("Q")) {

            switch (input) {
                case "Add" -> {
                    System.out.println("Please add a question and the answers: ");
                    input = sc.nextLine();
                    String[] inputArr = input.split("\\? ");
                    String[] inputAnswers = inputArr[1].split("\" \"");
                    List<String> answers = new ArrayList<>();
                    for (int i = 0; i < inputAnswers.length; i++) {
                        answers.add(inputAnswers[i].replace("\"", ""));
                    }
                    qa.addQuestionAnswers(inputArr[0] + "?", answers);
                }
                case "Ask" -> {
                    System.out.println("Please enter your question: ");
                    input = sc.nextLine();
                    if (qa.containsQuestion(input)) {
                        qa.getAnswers(input).forEach(a -> {
                            System.out.println("  •  " + a);
                        });
                    } else {
                        System.out.println("  •  " + qa.getUniversalAnswer());
                    }
                }
                case "PrintAll" -> qa.getAllQuestions().forEach(q -> {
                    System.out.println(q);
                });
                default -> System.out.println("Your input was not a valid option.");
            }
            System.out.println();
            System.out.println(userDialogue);
            input = sc.nextLine();
        }
    }
}
