package question_3;

import java.util.Objects;

public class EmployeeWithEqHc {
    private int id;
    private String name;

    public EmployeeWithEqHc(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //Check if instance is equal or not if instance is iqual then id will obviously equal they point to same reference
        if (this == o) return true;

        //Check if the object received is null or the two class are of diff type then return false
        if (o == null || getClass() != o.getClass()) return false;

        //If two object are not equal but have same id we will return true both object are same
        EmployeeWithEqHc that = (EmployeeWithEqHc) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
