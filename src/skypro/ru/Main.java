package skypro.ru;


import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    private static int generate() {
        return RANDOM.nextInt(100);
    }

    public static void main(String[] args) {

        GryffindorStudents Granger = new GryffindorStudents("Гермиона", "Грейнджер", generate(), generate(), generate(), generate(), generate());
        GryffindorStudents Weasley = new GryffindorStudents("Рональд", "Уизли", generate(), generate(), generate(), generate(), generate());
        GryffindorStudents Potter = new GryffindorStudents("Гарри", "Поттер", generate(), generate(), generate(), generate(), generate());

        SlytherinStudents Malfoy = new SlytherinStudents("Драко", "Малфой", generate(), generate(), generate(), generate(), generate(), generate(), generate());
        SlytherinStudents Montagu = new SlytherinStudents("Грэхэм", "Монтегю", generate(), generate(), generate(), generate(), generate(), generate(), generate());
        SlytherinStudents Goyle = new SlytherinStudents("Грегори", "Гойл", generate(), generate(), generate(), generate(), generate(), generate(), generate());

        HufflepuffStudents Smith = new HufflepuffStudents("Захария", "Смит", generate(), generate(), generate(), generate(), generate());
        HufflepuffStudents Diggory = new HufflepuffStudents("Седрик", "Диггори", generate(), generate(), generate(), generate(), generate());
        HufflepuffStudents Finch_Fletchley = new HufflepuffStudents("Джастин", "Финч-Флетчли", generate(), generate(), generate(), generate(), generate());

        RavenclawStudents Chang = new RavenclawStudents("Чжоу", "Чанг", generate(), generate(), generate(), generate(), generate(), generate());
        RavenclawStudents Patil = new RavenclawStudents("Падма", "Патил", generate(), generate(), generate(), generate(), generate(), generate());
        RavenclawStudents Belby = new RavenclawStudents("Маркус", "Белби", generate(), generate(), generate(), generate(), generate(), generate());

        System.out.println(Potter);
        System.out.println(Malfoy);
        System.out.println(Diggory);
        System.out.println(Chang);

        System.out.println();

        Granger.compareGryffindor(Potter);
        Malfoy.compareSlytherin(Goyle);
        Smith.compareHufflepuff(Diggory);
        Chang.compareRavenclaw(Patil);

        System.out.println();

        Potter.compareHogwarts(Malfoy);
        Diggory.compareHogwarts(Chang);
    }
}
