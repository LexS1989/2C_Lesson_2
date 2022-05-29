package skypro.ru;

public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents(String name, String surName, int power, int transgression, int nobility, int honor, int bravery) {
        super(name, surName, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compareGryffindor(GryffindorStudents GryffindorStudents) {
        int student1 = ability();
        int student2 = GryffindorStudents.ability();
        if (student1 > student2) {
            System.out.println("Студент " + getName() + " " + getSurName() + " лучший Гриффиндорец, чем " + GryffindorStudents.getName() +  " " + GryffindorStudents.getSurName() );
        } else if (student1 < student2) {
            System.out.println("Студент " + GryffindorStudents.getName() + " " + GryffindorStudents.getSurName() + " лучший Гриффиндорец, чем " + getName() +  " " + getSurName() );
        } else {
            System.out.println("Студент " + getName() + " " + getSurName() + " равен по характерристикам студенту " + GryffindorStudents.getName() + " " + GryffindorStudents.getSurName());
        }
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " + getSurName()
                + "; Мощность заклинания: " + getPower()
                + "; Расстояние трансгрессии: " + getTransgression()
                + "; Благородство: " + nobility
                + "; Честь: " + honor
                + "; Храбрость: " + bravery;
    }
}
