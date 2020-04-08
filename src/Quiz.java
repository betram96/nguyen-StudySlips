import java.util.ArrayList;

public class Quiz {
    private String name;

    private ArrayList<Set> sets;

    public Quiz() {
    }

    public Quiz(String name, ArrayList<Set> sets) {
        this.name = name;
        this.sets = sets;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
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
