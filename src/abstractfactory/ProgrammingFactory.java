package abstractfactory;

import model.Question;
import strategy.QuestionSource;

// Concrete sub-factory [cite: 60]
public class ProgrammingFactory implements QuestionFactory {
    private QuestionSource source;

    public ProgrammingFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() { return source.getQuestion("Programming"); }

    @Override
    public QuestionRenderer createRenderer() { return new ProgrammingRenderer(); }

    @Override
    public QuestionEvaluator createEvaluator() { return new ProgrammingEvaluator(); }
}
