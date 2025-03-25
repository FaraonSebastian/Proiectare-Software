import java.util.*;

public class StudentManager {
    private List<Student> studenti;

    public StudentManager() {
        studenti = new ArrayList<>();
    }

    public void adaugaStudent(Student student) {
        student.genereazaNoteAleatorii();
        studenti.add(student);
    }

    public void afisareAlfabeticaPeGrupe() {
        studenti.sort(Comparator.comparing((Student s) -> s.grupa).thenComparing(s -> s.nume));
        studenti.forEach(System.out::println);
    }

    public void afisareDescrescatorMedieIntegrali() {
        studenti.stream()
                .filter(s -> s.getRestante() == 0)
                .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                .forEach(System.out::println);
    }

    public void afisareCrescatorRestante() {
        studenti.stream()
                .filter(s -> s.getRestante() > 0)
                .sorted(Comparator.comparingInt(Student::getRestante))
                .forEach(System.out::println);
    }
}
