package factory;

// Concrete creator [cite: 43]
public class MidtermExamFactory extends ExamFactory {
    @Override
    public Exam createExam() {
        return new MidtermExam();
    }
}
