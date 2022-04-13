package hu.unideb.inf.model;

public class Crash {
    private Person PersonA;
    private Person PersonB;
    private Car CarA;
    private Car CarB;
    // TODO: DateTimePicker mezőt felvenni, ha megvan
    private String CommentA;
    private String CommentB;

    public Crash(Person personA, Person personB, Car carA, Car carB, String commentA, String commentB) {
        PersonA = personA;
        PersonB = personB;
        CarA = carA;
        CarB = carB;
        CommentA = commentA;
        CommentB = commentB;
    }

    public Person getPersonA() {
        return PersonA;
    }

    public void setPersonA(Person personA) {
        PersonA = personA;
    }

    public Person getPersonB() {
        return PersonB;
    }

    public void setPersonB(Person personB) {
        PersonB = personB;
    }

    public Car getCarA() {
        return CarA;
    }

    public void setCarA(Car carA) {
        CarA = carA;
    }

    public Car getCarB() {
        return CarB;
    }

    public void setCarB(Car carB) {
        CarB = carB;
    }

    public String getCommentA() {
        return CommentA;
    }

    public void setCommentA(String commentA) {
        CommentA = commentA;
    }

    public String getCommentB() {
        return CommentB;
    }

    public void setCommentB(String commentB) {
        CommentB = commentB;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s %s Dátum: %s", PersonA.getLastName(), PersonA.getFirstName(),
            PersonB.getLastName(), PersonB.getFirstName(), "TODO: DateTimePicker");
    }
}
