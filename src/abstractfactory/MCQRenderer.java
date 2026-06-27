package abstractfactory;

import model.Question;

public class MCQRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("Rendering MCQ UI... " + q.getDetails());
    }
}