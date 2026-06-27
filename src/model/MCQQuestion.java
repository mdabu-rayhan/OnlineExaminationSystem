package model;

// Supported variation [cite: 22]
public class MCQQuestion implements Question {
    private String diff;
    private int pts;

    public MCQQuestion(String diff, int pts) {
        this.diff = diff;
        this.pts = pts;
    }

    @Override
    public String getType() { return "MCQ"; }

    @Override
    public String getDetails() { return "[Type: MCQ] Points: " + pts + " Difficulty: " + diff; }
}
