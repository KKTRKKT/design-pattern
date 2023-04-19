package me.kktrkkt.designpattern.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

    @Test
    public void onlineCourse_test(){
        Student student = new Student("whiteship");
        Student keesun = new Student("keesun");
        OnlineCourse onlineCourse = new OnlineCourse();

        keesun.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new PrivateState(onlineCourse));

        onlineCourse.addStudent(keesun);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}