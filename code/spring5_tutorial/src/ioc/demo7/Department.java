package ioc.demo7;

public class Department {
    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return this.departmentName;
    }
}
