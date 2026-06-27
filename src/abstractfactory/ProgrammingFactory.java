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
    public QuestionRenderer createRenderer() { return q -> System.out.println("Rendering IDE Editor..."); }

    @Override
    public QuestionEvaluator createEvaluator() { return (q, ans) -> 1; }
}
