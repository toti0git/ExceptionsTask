package module;

import java.util.List;

public class Group {
    private List<Students> studentsList;
    private String name;

    public Group(List<Students> studentsList, String name) {
        this.studentsList = studentsList;
        this.name = name;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public String getName() {
        return name;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
