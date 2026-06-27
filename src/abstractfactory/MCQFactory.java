package abstractfactory;
import model.Question;
import strategy.QuestionSource;

// Concrete sub-factory [cite: 60]
public class MCQFactory implements QuestionFactory {
    private QuestionSource source;

    public MCQFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() { return source.getQuestion("MCQ"); }

    @Override
    public QuestionRenderer createRenderer() { return q -> System.out.println("Rendering MCQ UI..."); }

    @Override
    public QuestionEvaluator createEvaluator() { return (q, ans) -> 1; }
}
