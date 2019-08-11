package ac.cput.factory.userFactory;

import ac.cput.domain.user.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace getEmployeeRace(String empId, String raceId){

        return new EmployeeRace().employeeRace(raceId, empId);
    }
}
