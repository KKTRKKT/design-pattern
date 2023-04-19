package me.kktrkkt.designpattern.state;

public class PrivateState implements State{

    private final OnlineCourse context;

    public PrivateState(OnlineCourse context) {
        this.context = context;
    }

    @Override
    public void addReview(String review, Student student) {
        if(!context.getStudents().contains(student)){
            throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
        }

        context.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        if (!student.isEnabledForPrivateClass(context)) {
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
        }

        context.getStudents().add(student);
    }
}
