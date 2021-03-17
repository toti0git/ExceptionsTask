package module;



import enums.Points;
import enums.Subjects;

import java.util.List;

public class Students {
    //HashMap<Subjects, Integer> subjectAndPoint;
    List<Points> subPoint;
    List<Subjects> subjects;
    String name;

    public Students(List<Points> subPoint, List<Subjects> subjects, String name) {
        this.subPoint = subPoint;
        this.subjects = subjects;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Points> getSubPoint() {
        return subPoint;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubPoint(List<Points> subPoint) {
        this.subPoint = subPoint;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }
//    public Students(HashMap<Subjects, Integer> subjectAndPoint) {
//        this.subjectAndPoint = subjectAndPoint;
//    }
//
//    public void setSubjectAndPoint(HashMap<Subjects, Integer> subjectAndPoint) {
//        this.subjectAndPoint = subjectAndPoint;
//    }
//
//    public HashMap<Subjects, Integer> getSubjectAndPoint() {
//        return subjectAndPoint;
//    }
}
