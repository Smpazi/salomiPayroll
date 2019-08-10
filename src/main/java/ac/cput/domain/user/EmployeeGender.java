package ac.cput.domain.user;

public class EmployeeGender {
    private String genderId, employeeId;

    public EmployeeGender(){

    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public EmployeeGender employeeGender(String employeeId  , String genderId){
        this.employeeId =employeeId;
        this.genderId =genderId;
        return this;


    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "EmployeeId='" + employeeId + '\'' +
                ", GenderId='" + genderId + '\'' +
                '}';
    }
}
