package ac.cput.repository.userRepository.impl;

import ac.cput.domain.user.EmployeeRace;
import ac.cput.repository.userRepository.EmployeeRaceRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {

    private static EmployeeRaceRepositoryImpl employeeRaceRepository =null;
    private Map<String,EmployeeRace> employeeRaceMap;

    private EmployeeRaceRepositoryImpl(){
        this.employeeRaceMap =new HashMap<>();
    }

    public static EmployeeRaceRepositoryImpl getEmployeeRaceRepository() {
        if(employeeRaceRepository==null)
            employeeRaceRepository = new EmployeeRaceRepositoryImpl();
        return employeeRaceRepository;
    }
    @Override
    public Map<String, EmployeeRace> getAll() {
        return employeeRaceMap;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        employeeRaceMap.put(employeeRace.getEmployeeId(),employeeRace);
        EmployeeRace employeeRace1= employeeRaceMap.get(employeeRace.getEmployeeId());

        return employeeRace1;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        employeeRaceMap.put(employeeRace.getEmployeeId(),employeeRace);
        EmployeeRace employeeRace1= employeeRaceMap.get(employeeRace.getEmployeeId());

        return employeeRace1;
    }

    @Override
    public EmployeeRace read(String s) {
        EmployeeRace employeeRace= employeeRaceMap.get(s);
        return employeeRace;
    }

    @Override
    public void delete(String s) {
        employeeRaceMap.remove(s);
    }
}
