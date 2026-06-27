package model;

// Supported variation [cite: 22]
public class TrueFalseQuestion implements Question {
    private String diff;
    private int pts;

    public TrueFalseQuestion(String diff, int pts) {
        this.diff = diff;
        this.pts = pts;
    }

    @Override
    public String getType() { return "True/False"; }

    @Override
    public String getDetails() { return "[Type: True/False] Points: " + pts + " Difficulty: " + diff; }
}
