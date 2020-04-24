import java.util.ArrayList;


public class TFFlashcard extends Flashcard {

    public TFFlashcard() {
    }

    public TFFlashcard(String type, String desc, String answer) {
        super(type, desc, answer);
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>();
    }
}
