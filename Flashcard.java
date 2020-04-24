import java.util.ArrayList;

public class Flashcard {

    protected String type;
    protected String desc;
    protected String answer;
    protected int confidenceLevel;

    public Flashcard() {
    }

    public Flashcard(String type, String desc, String answer) {
        this.type = type;
        this.desc = desc;
        this.answer = answer;
    }

    public String getType() {
        return new String();
    }

    public void setType(String type) {

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc() {

    }

    public String getAnswer() {
        return new String();
    }

    public void setAnswer(String answer) {

    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>();
    }

    public void setAnswers(ArrayList<String> answers) {
    }

    public boolean checkAnswer(int answer) {
        return true;
    }

    public boolean checkAnswer(String answer) {
        return true;
    }
}

