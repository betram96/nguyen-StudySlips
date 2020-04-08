import java.util.ArrayList;

public class Controller {
    private ArrayList<Set> setlist;
    private int currentSet;

    public int getCurrentSet() {
        return currentSet;
    }

    public void setCurrentSet(int currentSet) {
        this.currentSet = currentSet;
    }

    private ArrayList<Quiz> quizlist;

    public void displaySet() {
    }

    public void displayQuiz() {
    }

    public void loadData() {
    }

    public void saveData() {
    }

    public void removeSet(int index) {
    }

    public void addSet(String name) {
    }

    public void addFlashCard(int currentSet, String type, String desc, String answer) {
    }

    public void addFIBFlashcard(int currentSet, String type, String desc, String answer) {
    }

    public void addMCQFlashcard(int currentSet, String type, String desc, String answer, ArrayList<String> answers) {
    }

    public void addTFFlashcard(String type, String desc, String answer) {
    }

    public void removeFlashcard(int currentSet, int index) {
    }

}
