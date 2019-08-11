package ac.cput.factory.userFactory;

import ac.cput.domain.user.EmployeeGender;

import java.util.Map;

public class EmployeeGenderFactory {

    public static EmployeeGender getEmployeeGender(Map<String, String>values){

        return new EmployeeGender().employeeGender(values.get("EmployeeId"), values.get("GenderID"));
    }
}
