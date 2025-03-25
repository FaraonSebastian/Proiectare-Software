import java.util.*;

public class Student {
    String nume;
    String grupa;
    int[] note;

    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new int[5];
    }

    public void genereazaNoteAleatorii() {
        Random rand = new Random();
        for (int i = 0; i < note.length; i++) {
            note[i] = rand.nextInt(7) + 4; // Note între 4 și 10
        }
    }

    public double getMedie() {
        return Arrays.stream(note).average().orElse(0);
    }

    public int getRestante() {
        return (int) Arrays.stream(note).filter(n -> n < 5).count();
    }

    @Override
    public String toString() {
        return nume + " - " + grupa + " - " + Arrays.toString(note);
    }
}
