package ac.cput.domain.user;

import java.util.Objects;

public class Employee {
   private String employeeId, fName, lName;

    private Employee(){
    }

    private Employee(Builder builder){
        this.fName =builder.fName;
        this.lName=builder.lName;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public static class Builder{
        private String employeeId, fName, lName;

        public Builder employeeId(String empId){
            this.employeeId = empId;
            return this;
        }
        public Builder fName(String fName){
            this.fName= fName;
            return  this;
        }

        public Builder lName(String lName){
            this.lName=lName;
            return this;
        }
        public Builder copy(Employee employee){
            this.fName= employee.fName;
            this.lName=employee.lName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "EmployeeFactory{" +
                "employeeId='" + employeeId + '\'' +
                ", EmployeeName='" + fName + '\'' +
                ", EmployeeSurname='" + lName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

}
