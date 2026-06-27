package builder;

// Holds the complex configuration state [cite: 63]
public class ExamConfiguration {
    String title;
    int duration;
    int passingScore;
    boolean negativeMarking;
    boolean questionShuffle;
    boolean autoSubmit;
    boolean calculatorAllowed;

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
               "Duration: " + duration + " minutes\n" +
               "Passing Score: " + passingScore + " Marks\n\n" +
               "Configuration Profiles:\n" +
               (negativeMarking ? "✓" : "X") + " Negative Marking Enabled\n" +
               (questionShuffle ? "✓" : "X") + " Question Shuffle Activated\n" +
               (calculatorAllowed ? "✓" : "X") + " Embedded Calculator Allowed\n" +
               (autoSubmit ? "✓" : "X") + " Auto-Submit On Timeout\n";
    }
}
