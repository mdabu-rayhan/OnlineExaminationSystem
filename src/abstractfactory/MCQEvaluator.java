package abstractfactory;

import model.Question;

public class MCQEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        System.out.println("Evaluating MCQ answer...");
        return 1; // Mock score
    }
}