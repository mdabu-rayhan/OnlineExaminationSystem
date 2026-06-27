package factory;
import builder.ExamConfiguration;
import model.Question;
import java.util.List;

// Core Exam interface [cite: 36]
public interface Exam {
    String getType();
    void displayInfo(ExamConfiguration config, String sourcingStrategy, List<Question> questions);
}
