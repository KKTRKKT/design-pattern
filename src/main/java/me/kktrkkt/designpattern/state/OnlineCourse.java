package me.kktrkkt.designpattern.state;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private State state = new DraftState(this);

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public OnlineCourse() {

    }

    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    public void addStudent(Student student) {
        state.addStudent(student);

        if (this.students.size() > 1) {
            this.state = new PrivateState(this);
        }
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    private boolean availableTo(Student student) {
        return student.isEnabledForPrivateClass(this);
    }


}
