package module;

import java.util.List;

public class Faculty {
    private List<Group> groupList;
    private String name;

    public Faculty(List<Group> groupList, String name) {
        this.groupList = groupList;
        this.name = name;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public String getName() {
        return name;
    }
}
