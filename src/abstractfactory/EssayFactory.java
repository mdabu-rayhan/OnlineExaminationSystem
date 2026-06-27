package abstractfactory;
import model.Question;
import strategy.QuestionSource;

// Concrete sub-factory [cite: 60]
public class EssayFactory implements QuestionFactory {
    private QuestionSource source;

    public EssayFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() { return source.getQuestion("Essay"); }

    @Override
    public QuestionRenderer createRenderer() { return q -> System.out.println("Rendering Essay text box..."); }

    @Override
    public QuestionEvaluator createEvaluator() { return (q, ans) -> 1; }
}
