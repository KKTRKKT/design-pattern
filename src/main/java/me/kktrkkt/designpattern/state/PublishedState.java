package me.kktrkkt.designpattern.state;

public class PublishedState implements State{

    private final OnlineCourse context;

    public PublishedState(OnlineCourse context) {
        this.context = context;
    }

    @Override
    public void addReview(String review, Student student) {
        context.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        context.getStudents().add(student);
    }
}
