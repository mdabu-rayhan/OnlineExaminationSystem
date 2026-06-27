package abstractfactory;
import model.Question;

// Abstract factory interface [cite: 55]
public interface QuestionFactory {
    // Methods to create questions
    Question createQuestion();
    QuestionRenderer createRenderer();
    QuestionEvaluator createEvaluator();
}
