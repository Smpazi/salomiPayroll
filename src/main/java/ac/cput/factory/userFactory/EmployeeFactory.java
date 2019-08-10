package ac.cput.factory.userFactory;

import ac.cput.domain.user.Employee;

import java.util.Map;

public class EmployeeFactory {

    public static Employee getEmployee(Map<String, String> values){
        return new Employee.Builder()
                .employeeId(values.get("EmployeeId"))
                .fName(values.get("Name"))
                .lName(values.get("Surname"))
                .build();
    }


}
