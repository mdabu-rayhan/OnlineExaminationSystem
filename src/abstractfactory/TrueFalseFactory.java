package abstractfactory;
import model.Question;
import strategy.QuestionSource;

// Concrete sub-factory [cite: 60]
public class TrueFalseFactory implements QuestionFactory {
    private QuestionSource source;

    public TrueFalseFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() { return source.getQuestion("True/False"); }

    @Override
    public QuestionRenderer createRenderer() { return q -> System.out.println("Rendering T/F toggles..."); }

    @Override
    public QuestionEvaluator createEvaluator() { return (q, ans) -> 1; }
}
