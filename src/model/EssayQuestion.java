package model;

// Supported variation [cite: 22]
public class EssayQuestion implements Question {
    private String diff;
    private int pts;

    public EssayQuestion(String diff, int pts) {
        this.diff = diff;
        this.pts = pts;
    }

    @Override
    public String getType() { return "Essay"; }

    @Override
    public String getDetails() { return "[Type: Essay] Points: " + pts + " Difficulty: " + diff; }
}
