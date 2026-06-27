package model;

// Supported variation [cite: 22]
public class ProgrammingQuestion implements Question {
    private String diff;
    private int pts;

    public ProgrammingQuestion(String diff, int pts) {
        this.diff = diff;
        this.pts = pts;
    }

    @Override
    public String getType() { return "Programming"; }

    @Override
    public String getDetails() { return "[Type: Programming] Points: " + pts + " Difficulty: " + diff; }
}
