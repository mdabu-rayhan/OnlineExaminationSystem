package strategy;
import model.*;

// Fetches from pre-populated storage [cite: 30, 80]
public class BankQuestionSource implements QuestionSource {
    @Override
    public Question getQuestion(String type) {
        switch(type) {
            case "MCQ": return new MCQQuestion("Medium", 2);
            case "Essay": return new EssayQuestion("Hard", 10);
            case "Programming": return new ProgrammingQuestion("Hard", 20);
            case "True/False": return new TrueFalseQuestion("Easy", 1);
            default: return new MCQQuestion("Easy", 2);
        }
    }

    @Override
    public String getStrategyName() { return "Question Bank Mode"; }
}
