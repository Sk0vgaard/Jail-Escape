import greenfoot.*;
/**
 * Write a description of class ILabelHandle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuizHandler  
{
    private String question;
    private String answer;
    private String hint;

    private static final int LABEL_X = 550;
    private static final int HINT_Y = 70;
    private static final int QUESTION_Y = 50;
    private static final int ANSWER_Y = 90;

    private Label hintLbl; 
    private Label questionLbl;
    private Label answerLbl; 

    private String answerLblText = "Answer: ";

    public QuizHandler(String question, String answer, String hint)
    {
        this.question = question;
        this.answer = answer;
        this.hint = hint;
        answerLbl = new Label(answerLblText, true, true);
        hintLbl = new Label("Hint: " + hint, false, true);
        questionLbl = new Label("Question: " + question, false, true);
    }

    public void showHintLabelInWorld(MyWorld world)
    {
        world.addObject(hintLbl, LABEL_X, HINT_Y);
    }

    public void showQuestionLabel(MyWorld world)
    {
        world.addObject(questionLbl, LABEL_X, QUESTION_Y);
    }

    public void showAnswerLabel(MyWorld world)
    {
        world.addObject(answerLbl, LABEL_X, ANSWER_Y);
    }

    public String getAnswer()
    {
        return answer;
    }
    
    //See if the answer the player has entered is correct
    public boolean isCorrectAnswer()
    {
        String lblText = answerLbl.getText();
        String answerText = lblText.substring(answerLblText.length(), lblText.length());
        if (answerText.equals(answer))
        {
            return true;
        }
        return false;
    }

}
