package abstractfactory;

import model.Question;

public class TrueFalseEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        System.out.println("Evaluating True/False boolean match...");
        return 1; // Mock score
    }
}