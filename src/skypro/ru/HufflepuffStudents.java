package skypro.ru;

public class HufflepuffStudents extends HogwartsStudents {

    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String name, String surName, int power, int transgression, int diligence, int loyalty, int honesty) {
        super(name, surName, power, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuff(HufflepuffStudents HufflepuffStudents) {
        int student1 = ability();
        int student2 = HufflepuffStudents.ability();
        if (student1 > student2) {
            System.out.println("Студент " + getName() + " " + getSurName() + " лучший Пуффендуец, чем " + HufflepuffStudents.getName() + " " + HufflepuffStudents.getSurName());
        } else if (student1 < student2) {
            System.out.println("Студент " + HufflepuffStudents.getName() + " " + HufflepuffStudents.getSurName() + " лучший Пуффендуец, чем " + getName() + " " + getSurName());
        } else {
            System.out.println("Студент " + getName() + " " + getSurName() + " равен по характерристикам студенту " + HufflepuffStudents.getName() + " " + HufflepuffStudents.getSurName());
        }
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " + getSurName()
                + "; Мощность заклинания: " + getPower()
                + "; Расстояние трансгрессии: " + getTransgression()
                + "; Трудолюбие: " + diligence
                + "; Верность: " + loyalty
                + "; Честность: " + honesty;
    }
}
