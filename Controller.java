import java.util.ArrayList;

public class Controller {
    private ArrayList<Set> setlist;
    private int currentSet;
    private ArrayList<Quiz> quizlist;

    public int getCurrentSet() {
        return currentSet;
    }

    public void setCurrentSet(int currentSet) {
        this.currentSet = currentSet;
    }

    public void displaySet() {
    	for (Set set: setlist)
    		System.out.println(set.getName());
    }

    public void displayQuiz() {
    	for (Quiz quiz: quizlist)
    		System.out.println(quiz.getName());
    }

    public void loadData() {
    }

    public void saveData() {
    }

    public void removeSet(int index) {
    	setlist.remove(index);
    	//System.out.println("Set "+index+" has been removed");
    }

    public void addSet(String name) {
    	Set newSet = new Set(name);
    	setlist.add(newSet);
    	//System.out.println("Set "+name+" has been added");
    }

    public void addFlashCard(int currentSet, String type, String desc, String answer) {
    	Flashcard newCard = new Flashcard(type,desc,answer);
    	setlist.get(currentSet).addFlashcard(newCard);
    }

    public void addFIBFlashcard(int currentSet, String type, String desc, String answer) {
    	FIBFlashcard newFIB = new FIBFlashcard(type,desc,answer);
    	setlist.get(currentSet).addFlashcard(newFIB);
    }

    public void addMCQFlashcard(int currentSet, String type, String desc, String answer, ArrayList<String> answers) {
    	MCQFlashcard newMCQ = new MCQFlashcard(type,desc,answer,answers);
    	setlist.get(currentSet).addFlashcard(newMCQ);
    }

    public void addTFFlashcard(String type, String desc, String answer) {
    	TFFlashcard newTF = new TFFlashcard(type,desc,answer);
    	setlist.get(currentSet).addFlashcard(newTF);
    }

    public void removeFlashcard(int currentSet, int index) {
    	setlist.get(currentSet).removeFlashcard(index);
    }

}
