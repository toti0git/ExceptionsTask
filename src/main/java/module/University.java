package module;

import java.util.List;

public class University {
    private List<Faculty> facultyList;

    public University(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }
}
