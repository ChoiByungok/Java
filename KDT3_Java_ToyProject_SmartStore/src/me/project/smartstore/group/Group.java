package me.project.smartstore.group;

import java.util.Objects;

public class Group {

    protected String groupType;
    protected Parameter parameter;


    public Group(){}
    public Group(String groupType,Parameter parameter){

        this.groupType = groupType;
        this.parameter = parameter;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupType.equals(group.groupType) && parameter.equals(group.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, parameter);
    }

    @Override
    public String toString() {
       return "\n그룹: " + groupType +"\n" +
        "파라미터: " + parameter + "\n";
    }
}
