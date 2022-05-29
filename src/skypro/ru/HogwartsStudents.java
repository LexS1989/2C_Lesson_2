package skypro.ru;

public class HogwartsStudents {
    private String name;
    private String surName;
    private int power;
    private int transgression;

    public HogwartsStudents(String name, String surName, int power, int transgression) {
        this.name = name;
        this.surName = surName;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int abilityHogwarts() {
        return power + transgression;
    }

    public void compareHogwarts(HogwartsStudents hogwartsStudents) {
        int student1 = abilityHogwarts();
        int student2 = hogwartsStudents.abilityHogwarts();
        if (student1 > student2) {
            System.out.println("Студент " + getName() + " " + getSurName() + " обладает большей мощностью магии, чем " + hogwartsStudents.getName() + " " + hogwartsStudents.getSurName());
        } else if (student1 < student2) {
            System.out.println("Студент " + hogwartsStudents.getName() + " " + hogwartsStudents.getSurName() + " обладает большей мощностью магии, чем " + getName() + " " + getSurName());
        } else {
            System.out.println("Студент " + getName() + " " + getSurName() + " равен по мощности магии студенту " + hogwartsStudents.getName() + " " + hogwartsStudents.getSurName());
        }
    }
}
