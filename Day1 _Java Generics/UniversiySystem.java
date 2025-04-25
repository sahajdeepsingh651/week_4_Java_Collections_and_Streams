package day1;

import java.util.*;

abstract class CourseType{
    protected String name;
    public CourseType(String name){
        this.name = name;
    }
    public abstract void getName();
}
class ExamCourse extends CourseType{
    ExamCourse(String name){
        super(name);
    }
    public void getName(){
        System.out.println("Name of the course is" + name);
    }
}
class AssignmentCourse extends CourseType{

    AssignmentCourse(String name){
        super(name);
    }
    public void getName(){
        System.out.println("Name of the course is" + name);
    }
}

class ResearchCourse extends CourseType{
    ResearchCourse(String name){
        super(name);
    }
    public void getName(){
        System.out.println("Name of the course is" + name);
    }
}
class Course<T extends CourseType>{
private List<T> courseList = new ArrayList<>();
public void addCourse(T course){
    courseList.add(course);
}
public List<T> getCourses(){
    return courseList;
}

}


class CourseUtils {
    public static void evaluateAnyCourse(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.getName();
        }
    }
}
public class UniversiySystem {
    public static void main(String[] args) {
        Course<ExamCourse> examDept = new Course<>();
        examDept.addCourse(new ExamCourse("Mathematics"));
        examDept.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentDept = new Course<>();
        assignmentDept.addCourse(new AssignmentCourse("Software Engineering"));

        Course<ResearchCourse> researchDept = new Course<>();
        researchDept.addCourse(new ResearchCourse("AI Research"));

        System.out.println("\n== Using Wildcard Utility ==");
        CourseUtils.evaluateAnyCourse(examDept.getCourses());
        CourseUtils.evaluateAnyCourse(assignmentDept.getCourses());
        CourseUtils.evaluateAnyCourse(researchDept.getCourses());
    }
}
