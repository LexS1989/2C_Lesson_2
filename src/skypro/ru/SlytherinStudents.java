package skypro.ru;

public class SlytherinStudents extends HogwartsStudents{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudents(String name, String surName,  int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surName, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int ability() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareSlytherin(SlytherinStudents SlytherinStudents) {
        int student1 = ability();
        int student2 = SlytherinStudents.ability();
        if (student1 > student2) {
            System.out.println("Студент " + getName() + " " + getSurName() + " лучший Слизеринец, чем " + SlytherinStudents.getName() +  " " + SlytherinStudents.getSurName() );
        } else if (student1 < student2) {
            System.out.println("Студент " + SlytherinStudents.getName() + " " + SlytherinStudents.getSurName() + " лучший Слизеринец, чем " + getName() +  " " + getSurName() );
        } else {
            System.out.println("Студент " + getName() + " " + getSurName() + " равен по характерристикам студенту " + SlytherinStudents.getName() + " " + SlytherinStudents.getSurName());
        }
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " + getSurName()
                + "; Мощность заклинания: " + getPower()
                + "; Расстояние трансгрессии: " + getTransgression()
                + "; Хитрость: " + cunning
                + "; Решительность: " + determination
                + "; Амбициозность: " + ambition
                + "; Находчивость: " + resourcefulness
                + "; Жажда власти: " + lustForPower;
    }
}
