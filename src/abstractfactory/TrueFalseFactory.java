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
    public QuestionRenderer createRenderer() { return new TrueFalseRenderer(); }

    @Override
    public QuestionEvaluator createEvaluator() { return new ProgrammingEvaluator(); }
}
