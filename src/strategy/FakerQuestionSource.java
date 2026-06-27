package strategy;
import model.*;

// Procedurally auto-generates content [cite: 31, 83]
public class FakerQuestionSource implements QuestionSource {
    // Implementation for generating questions procedurally
    @Override
    public Question getQuestion(String type) {
        return new MCQQuestion("Random", 5);
    }

    @Override
    public String getStrategyName() { return "Auto/Faker Mode"; }
}
