package main;

import abstractfactory.*;
import builder.*;
import factory.*;
import model.*;
import strategy.*;

import java.util.ArrayList;
import java.util.List;

// Central orchestration driver client file [cite: 87]
public class Main {
    public static void main(String[] args) {
        // 1. Instantiate targeted Exam Factory
        ExamFactory examFactory = new MidtermExamFactory();
        Exam midterm = examFactory.createExam();

        // 2. Declare active Question Source
        QuestionSource bankSource = new BankQuestionSource();

        // 3. Initialize Abstract Factories with dependency injection
        QuestionFactory mcqFactory = new MCQFactory(bankSource);
        QuestionFactory essayFactory = new EssayFactory(bankSource);
        QuestionFactory programmingFactory = new ProgrammingFactory(bankSource);
        QuestionFactory tfFactory = new TrueFalseFactory(bankSource);

        // 4. Chain fluid API via Builder
        ExamBuilder builder = new ExamBuilder();
        ExamConfiguration config = builder
            .setTitle("OOP Midterm Exam")
            .setDuration(60)
            .setPassingScore(50)
            .setNegativeMarking(true)
            .setQuestionShuffle(true)
            .setCalculatorAllowed(false)
            .setAutoSubmit(true)
            .build();

        // Compiling questions for the exam
        List<Question> compiledQuestions = new ArrayList<>();
        compiledQuestions.add(mcqFactory.createQuestion());
        compiledQuestions.add(new MCQQuestion("Easy", 2));
        compiledQuestions.add(essayFactory.createQuestion());
        compiledQuestions.add(programmingFactory.createQuestion());
        compiledQuestions.add(tfFactory.createQuestion());

        // 5. Generate and log dashboard summary
        midterm.displayInfo(config, bankSource.getStrategyName(), compiledQuestions);
    }
}
