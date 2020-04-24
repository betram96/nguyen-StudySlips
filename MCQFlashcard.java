import java.util.ArrayList;

public class MCQFlashcard extends Flashcard{
    ArrayList<String>answers;

    public MCQFlashcard(ArrayList<String> answers) {
        this.answers = answers;
    }

    public MCQFlashcard(String type, String desc, String answer, ArrayList<String> answers) {
        super(type, desc, answer);
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>();
    }

    public void setAnswers(ArrayList<String> answers) {
    }

    public boolean checkAnswer(int answer) {
        return true;
    }
}
