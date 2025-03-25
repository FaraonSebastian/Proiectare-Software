//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberOperations operations = new NumberOperations();
        operations.generateNumbers();
        operations.printResults();

        StudentManager manager = new StudentManager();
        manager.adaugaStudent(new Student("Popescu Ion", "A1"));
        manager.adaugaStudent(new Student("Ionescu Maria", "A2"));
        manager.adaugaStudent(new Student("Georgescu Andrei", "A1"));
        manager.adaugaStudent(new Student("Dumitrescu Elena", "A3"));
        manager.adaugaStudent(new Student("Vasilescu Mihai", "A2"));

        System.out.println("\nAfisare alfabetică pe grupe:");
        manager.afisareAlfabeticaPeGrupe();

        System.out.println("\nAfisare descrescătoare medie pentru integraliști:");
        manager.afisareDescrescatorMedieIntegrali();

        System.out.println("\nAfisare crescătoare a numărului de restanțe pentru restanțieri:");
        manager.afisareCrescatorRestante();
    }
}
