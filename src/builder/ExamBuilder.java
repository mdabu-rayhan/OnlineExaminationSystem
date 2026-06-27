package builder;

// Fluid API pipeline to construct parameters [cite: 71, 92]
public class ExamBuilder {
    private ExamConfiguration config = new ExamConfiguration();

    public ExamBuilder setTitle(String title) {
        this.config.title = title;
        return this;
    }
    public ExamBuilder setDuration(int duration) {
        this.config.duration = duration;
        return this;
    }
    public ExamBuilder setPassingScore(int score) {
        this.config.passingScore = score;
        return this;
    }
    public ExamBuilder setNegativeMarking(boolean flag) {
        this.config.negativeMarking = flag;
        return this;
    }
    public ExamBuilder setQuestionShuffle(boolean flag) {
        this.config.questionShuffle = flag;
        return this;
    }
    public ExamBuilder setAutoSubmit(boolean flag) {
        this.config.autoSubmit = flag;
        return this;
    }
    public ExamBuilder setCalculatorAllowed(boolean flag) {
        this.config.calculatorAllowed = flag;
        return this;
    }
    public ExamConfiguration build() {
        return this.config;
    }
}
