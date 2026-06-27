package abstractfactory;

import model.Question;

public class EssayEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        System.out.println("Evaluating Essay length and keywords...");
        return 10; // Mock score
    }
}
