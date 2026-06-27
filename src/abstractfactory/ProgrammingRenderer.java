package abstractfactory;

import model.Question;

public class ProgrammingRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("Rendering IDE Editor... " + q.getDetails());
    }
}