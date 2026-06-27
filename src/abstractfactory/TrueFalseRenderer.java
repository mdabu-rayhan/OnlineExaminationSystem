package abstractfactory;

import model.Question;

public class TrueFalseRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("Rendering T/F radio toggles... " + q.getDetails());
    }
}