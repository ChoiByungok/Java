package me.project.smartstore.group;

import java.util.Arrays;

public class Groups {

    private Group[] groups;

    public Groups(){

    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groups groups1 = (Groups) o;
        return Arrays.equals(groups, groups1.groups);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(groups);
    }

}
