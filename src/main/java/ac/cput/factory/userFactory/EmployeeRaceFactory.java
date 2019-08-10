package ac.cput.factory.userFactory;

import ac.cput.domain.user.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace getEmployeeRace(String empId, String genderId){

        return new EmployeeRace().employeeRace(genderId, empId);
    }
}
