package strategy;
import model.Question;

// Abstract inversion of control interface [cite: 75, 77]
public interface QuestionSource {
    // Methods to fetch questions
    Question getQuestion(String type);
    String getStrategyName();
}
