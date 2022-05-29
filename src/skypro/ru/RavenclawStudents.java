package skypro.ru;

public class RavenclawStudents extends HogwartsStudents {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public RavenclawStudents(String name, String surName, int power, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, surName, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int ability() {
        return mind + wisdom + wit + creation;
    }

    public void compareRavenclaw(RavenclawStudents RavenclawStudents) {
        int student1 = ability();
        int student2 = RavenclawStudents.ability();
        if (student1 > student2) {
            System.out.println("Студент " + getName() + " " + getSurName() + " лучший Когтевранец, чем " + RavenclawStudents.getName() + " " + RavenclawStudents.getSurName());
        } else if (student1 < student2) {
            System.out.println("Студент " + RavenclawStudents.getName() + " " + RavenclawStudents.getSurName() + " лучший Когтевранец, чем " + getName() + " " + getSurName());
        } else {
            System.out.println("Студент " + getName() + " " + getSurName() + " равен по характерристикам студенту " + RavenclawStudents.getName() + " " + RavenclawStudents.getSurName());
        }
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " + getSurName()
                + "; Мощность заклинания: " + getPower()
                + "; Расстояние трансгрессии: " + getTransgression()
                + "; Ум: " + mind
                + "; Мудрость: " + wisdom
                + "; Остроумие: " + wit
                + "; Творчество: " + creation;
    }
}
