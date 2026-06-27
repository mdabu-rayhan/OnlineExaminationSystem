package factory;

import builder.ExamConfiguration;
import model.Question;
import java.util.List;

public class FinalExam implements Exam {
    @Override
    public String getType() { return "Final Exam"; }

    @Override
    public void displayInfo(ExamConfiguration config, String sourcingStrategy, List<Question> questions) {
        System.out.println("=========================================");
        System.out.println("        EXAM CREATED SUCCESSFULLY        ");
        System.out.println("=========================================");
        System.out.println("Type:\n" + getType());
        System.out.println(config.toString());
        System.out.println("Question Sourcing Strategy: " + sourcingStrategy);
        System.out.println("Compiled Structural Components:");
        for (Question q : questions) {
            System.out.println("- " + q.getDetails());
        }
        System.out.println("=========================================");
    }
}