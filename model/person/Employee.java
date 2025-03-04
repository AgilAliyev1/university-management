package model.person;

import java.time.LocalDate;

// Interface
public interface Employee {
    LocalDate getHireDate();
}

// Base class implementing Employee
class BaseEmployee implements Employee {
    private String name;
    private LocalDate hireDate;

    public BaseEmployee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    @Override
    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getName() {
        return name;
    }
}

// Subclass extending BaseEmployee
class Manager extends BaseEmployee {
    private String department;

    public Manager(String name, LocalDate hireDate, String department) {
        super(name, hireDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
