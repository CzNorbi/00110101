package hu.unideb.inf.model;

public class Crash {
    private Person personA;
    private Person personB;
    private Car carA;
    private Car carB;
    // TODO: DateTimePicker mezőt felvenni, ha megvan
    private String commentA;
    private String commentB;

    public Crash(Person personA, Person personB, Car carA, Car carB, String commentA, String commentB) {
        this.personA = personA;
        this.personB = personB;
        this.carA = carA;
        this.carB = carB;
        this.commentA = commentA;
        this.commentB = commentB;
    }

    public Person getPersonA() {
        return personA;
    }

    public void setPersonA(Person personA) {
        this.personA = personA;
    }

    public Person getPersonB() {
        return personB;
    }

    public void setPersonB(Person personB) {
        this.personB = personB;
    }

    public Car getCarA() {
        return carA;
    }

    public void setCarA(Car carA) {
        this.carA = carA;
    }

    public Car getCarB() {
        return carB;
    }

    public void setCarB(Car carB) {
        this.carB = carB;
    }

    public String getCommentA() {
        return commentA;
    }

    public void setCommentA(String commentA) {
        this.commentA = commentA;
    }

    public String getCommentB() {
        return commentB;
    }

    public void setCommentB(String commentB) {
        this.commentB = commentB;
    }

    @Override
    public String toString() {
        return String.format("%s %s - Dátum: %s", personA.getName(), personB.getName(), "TODO datepicker");
    }
}
