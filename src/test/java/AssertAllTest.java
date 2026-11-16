import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;


class Employee {
    private Integer empId;
    private String name;
    private Double salary;

    Employee(Integer empId, String name, Double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

public class AssertAllTest {

    @Test
    void assertAllTest() {
        assertAll(
                () -> Assertions.assertEquals("Praveen", "Praveen")
                , () -> Assertions.assertEquals("Sound", "Sound")
                , () ->Assertions.assertEquals("Fail", "Praveen1")
        );
    }

    @Test
    void assertAllEmployee() {

        Employee e = new Employee(101, "Praveen", 500.0);

        assertAll(
                () -> Assertions.assertEquals(e.getEmpId(), 101),
                () -> Assertions.assertEquals(e.getName(), "Praveen"),
                () -> Assertions.assertEquals(e.getSalary(), 500.0)
        );
    }

}
