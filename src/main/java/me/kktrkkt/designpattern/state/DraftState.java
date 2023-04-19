package me.kktrkkt.designpattern.state;

public class DraftState implements State{

    private final OnlineCourse context;

    public DraftState(OnlineCourse context) {
        this.context = context;
    }

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        context.getStudents().add(student);
    }
}
