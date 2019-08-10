package ac.cput.domain.user;

public class EmployeeRace {

    private String raceId, employeeId;

    public EmployeeRace(){

    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public EmployeeRace employeeRace(String raceId  , String employeeId){
        this.employeeId =employeeId;
        this.raceId =raceId;
        return this;


    }

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "EmployeeId='" + employeeId + '\'' +
                ", RaceId='" + raceId + '\'' +
                '}';
    }
}
