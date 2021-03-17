import enums.Points;
import enums.Subjects;
import exeption.*;
import module.Faculty;
import module.Group;
import module.Students;
import module.University;

import java.util.List;

public class Sdu extends University {
    private List<Students> students;
    private List<Faculty> facultyList;
    private List<Group> groupList;
    private int avePoint;

    public Sdu(List<Faculty> facultyList) {
        super(facultyList);
        this.facultyList = facultyList;
    }

    public Sdu(List<Faculty> facultyList, List<Students> students) {
        super(facultyList);
        this.students = students;
    }

    public void countAvaragePointOfStudent(Students student) {

        for (Points p : student.getSubPoint()) {
            avePoint += p.value;
        }
        System.out.println("Avarage point of " + student.getName() + " is " + avePoint);
    }

    public int getIndexOfSubject(Group group, Subjects subjects) {
        int index = 0;
        for (int i = 0; i < group.getStudentsList().size(); i++) {
            index = group.getStudentsList().get(i).getSubjects().indexOf(Subjects.ALGEBRA);

        }
        return index;
    }

    public void countAvaragePointByFacultyBySubjectByStudent(Faculty faculty, Group group, Subjects subject) {
        int averagePoint = 0;


        switch (subject) {
            case HISTORY:
                for (int i = 1; i < group.getStudentsList().size(); i++) {
                    averagePoint += group.getStudentsList().get(i).getSubPoint().get(getIndexOfSubject(group, Subjects.HISTORY)).value;
                    System.out.println("AVARAGE " + averagePoint);
                }
                break;
            case MATH:
                for (int i = 1; i < group.getStudentsList().size(); i++) {
                    averagePoint += group.getStudentsList().get(i).getSubPoint().get(getIndexOfSubject(group, Subjects.MATH)).value;
                    System.out.println("AVARAGE " + averagePoint);
                }
                break;
            case GEOMETRIC:
                for (int i = 1; i < group.getStudentsList().size(); i++) {
                    averagePoint += group.getStudentsList().get(i).getSubPoint().get(getIndexOfSubject(group, Subjects.GEOMETRIC)).value;
                    System.out.println("AVARAGE " + averagePoint);
                }
                break;
            case ALGEBRA:
                for (int i = 1; i < group.getStudentsList().size(); i++) {
                    averagePoint += group.getStudentsList().get(i).getSubPoint().get(getIndexOfSubject(group, Subjects.ALGEBRA)).value;
                    System.out.println("AVARAGE " + averagePoint);
                }
                break;
        }
    }

    public void countPointForUniversity(List<Sdu> sduList, Subjects subject) throws Between0and10Exeption {
        int avarage = 0;
        Points point;
        try {
            for (int i = 0; i < sduList.size(); i++) {
                for (int j = 0; j <= sduList.get(i).facultyList.size(); j++) {
                    int index = sduList.get(i).facultyList.get(i).getGroupList().get(i).getStudentsList().get(i).getSubjects().indexOf(subject);
                    point = sduList.get(i).facultyList.get(i).getGroupList().get(i).getStudentsList().get(i).getSubPoint().get(index);
                    if (point.value <= 10 && point.value > 0)
                        throw new Between0and10Exeption("Points should be between 0 and 10");
                    {

                    }
                    avarage += point.value;
                }
                System.out.println("AVARAGE BY UNIVERSITY " + avarage);
            }


        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }

    }

    public void checkAnySubject(List<Sdu> sduList)throws NullSubjectExeption {
        try {
            for (int i = 0; i < sduList.size(); i++) {
                for (int j = 0; j <= sduList.get(i).facultyList.size(); j++) {
                    if (sduList.get(i).facultyList.get(i).getGroupList().get(i).getStudentsList().get(i).getSubjects().size()<0)throw new NullSubjectExeption("student must have at least 1 subject");{
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }

    }

    public void checkAnyStudent(List<Group> groupList)throws NullStudentsNotFoundExeption {
        if (groupList.size()<0){
            throw new NullStudentsNotFoundExeption("Student Not Found");
        }

    }

    public void checkAnyFaculty(List<Faculty> facultyList)throws NullFacultyNotFoundExeption {
        if (facultyList.size()<0){
            throw new NullFacultyNotFoundExeption("Faculty Not Found");
        }

    }
    public void checkAnyGroup(List<Group> groupList)throws NullGroupNotFoundExeption {
        if (groupList.size()<0){
            throw new NullGroupNotFoundExeption("Group Not Found");
        }

    }


}
