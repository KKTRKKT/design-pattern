package me.kktrkkt.designpattern.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

    @Test
    public void draft_add_review_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();

        assertThrows(UnsupportedOperationException.class, () -> onlineCourse.addReview("review", student));
    }

    @Test
    public void draft_add_student_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();

        onlineCourse.addStudent(student);
        assertEquals(student, onlineCourse.getStudents().get(0));
    }

    @Test
    public void published_add_review_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(new PublishedState(onlineCourse));

        onlineCourse.addReview("hello", student);

        assertEquals("hello", onlineCourse.getReviews().get(0));
    }

    @Test
    public void published_add_student_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(new PublishedState(onlineCourse));

        onlineCourse.addStudent(student);

        assertEquals(student, onlineCourse.getStudents().get(0));
    }

    @Test
    public void private_add_review_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(new PrivateState(onlineCourse));

        assertThrows(UnsupportedOperationException.class, () -> onlineCourse.addReview("hello", student));
    }

    @Test
    public void private_add_student_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(new PrivateState(onlineCourse));

        assertThrows(UnsupportedOperationException.class, () -> onlineCourse.addStudent(student));
    }

    @Test
    public void private_add_review_not_contain_student_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.addStudent(student);
        onlineCourse.changeState(new PrivateState(onlineCourse));

        onlineCourse.addReview("hello", student);

        assertEquals("hello", onlineCourse.getReviews().get(0));
    }

    @Test
    public void private_add_student_private_pass_test() {
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.changeState(new PrivateState(onlineCourse));

        student.addPrivateCourse(onlineCourse);
        onlineCourse.addStudent(student);

        assertEquals(student, onlineCourse.getStudents().get(0));
    }

}