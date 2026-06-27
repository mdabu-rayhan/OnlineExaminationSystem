package abstractfactory;

import model.Question;

public class ProgrammingEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        System.out.println("Running code against test cases...");
        return 20; // Mock score
    }
}