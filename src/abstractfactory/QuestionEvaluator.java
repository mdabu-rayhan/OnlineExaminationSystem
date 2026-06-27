package abstractfactory;
import model.Question;

// Evaluator entity interface [cite: 21, 52]
public interface QuestionEvaluator {
    int evaluate(Question q, String answer);
}
