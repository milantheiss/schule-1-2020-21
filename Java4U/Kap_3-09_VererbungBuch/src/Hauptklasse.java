public class Hauptklasse {
    public static void main(String[] args) {
        Lehrer1 teacher = new Lehrer1();
        Person1 anonym = teacher;
        teacher.name = "Boeck";
        System.out.println("Aktueller anonymer Name: "+anonym.name);
        Schueler1 student1 = new Schueler1();
        Schueler1 student2 = new Schueler1();
        student1.name = "Max";
        student2.name = "Moritz";
        System.out.println("Aktueller anonymer Name: " + anonym.name);
        System.out.println(teacher.kennung() + teacher.name);
        System.out.println(student1.kennung()+ student1.name);
        System.out.println(student1.kennung()+ student2.name);
        System.out.println("Programmende.");

    }
}
