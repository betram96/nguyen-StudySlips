import java.util.ArrayList;

public class Set {
    private String name;
    private ArrayList<Set> subsets;
    private ArrayList<Flashcard> flashcards;

    public Set() {

    }

    public Set(String name) {

    }

    public void addFlashcard(Flashcard card) {

    }

    public boolean removeFlashcard(int index) {
        return true;
    }

    public void addSet(Set set) {
    }

    public Set getSet(int index) {
        return new Set();
    }

    public boolean removeSet(int index) {
        return true;
    }

    public void setName(String name) {
    }

    public String getName() {
        return name;
    }

    public ArrayList<Flashcard> generateQuiz() {
        return new ArrayList<Flashcard>();
    }

    public ArrayList<Flashcard> generateQuiz(int numOfQuestions) {
        return new ArrayList<Flashcard>();
    }

    public ArrayList<Flashcard> generateQuiz(ArrayList<Integer> selections) {
        return new ArrayList<Flashcard>();
    }

    public ArrayList<Flashcard> sortByConfLevel(boolean asc) {
        return new ArrayList<>();
    }

    public ArrayList<Flashcard> sortByType(boolean asc) {
        return new ArrayList<>();
    }

    public ArrayList<Flashcard> FilterByType(String type) {
        return new ArrayList<>();
    }

}
