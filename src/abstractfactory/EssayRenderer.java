package abstractfactory;

import model.Question;

public class EssayRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("Rendering Essay text box... " + q.getDetails());
    }
}