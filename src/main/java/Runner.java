

import enums.Points;
import enums.Subjects;
import exeption.Between0and10Exeption;
import module.Faculty;
import module.Group;
import module.Students;

import java.util.*;


public class Runner {
    public static List<Points> points = new ArrayList<Points>();
    public static List<Subjects> subjects = new ArrayList<Subjects>();
    public static List<Students> students = Arrays.asList(new Students(points, subjects, "Aktolkyn"),
            new Students(points, subjects, "Nurzhan"));
    public static List<Group> groupList = Arrays.asList(new Group(students, "EN04"),
            new Group(students, "EN03"));
    public static List<Faculty> facultyList = Arrays.asList(new Faculty(groupList, "Engineering faculty"));
    public static List<Sdu> sduUniversity = Arrays.asList(new Sdu(facultyList));

    public static void main(String[] args) {
        addToListPoints(points);
        addToListSubjects(subjects);
        Sdu sdu = new Sdu(facultyList, students);
        sdu.countAvaragePointOfStudent(students.get(0));
        sdu.countAvaragePointByFacultyBySubjectByStudent(facultyList.get(0), groupList.get(0), subjects.get(0));
        try {
            sdu.countPointForUniversity(sduUniversity, Subjects.ALGEBRA);
        } catch (Between0and10Exeption between0and10Exeption) {
            between0and10Exeption.printStackTrace();
        }
    }

    public static void addToListPoints(List<Points> points) {
        points.add(Points.FIVE);
        points.add(Points.NINE);
        points.add(Points.SEVEN);
        points.add(Points.TWO);
    }

    public static void addToListSubjects(List<Subjects> points) {
        points.add(Subjects.ALGEBRA); //10
        points.add(Subjects.GEOMETRIC);// 18
        points.add(Subjects.HISTORY);// 14
        points.add(Subjects.MATH);//4
    }
}
