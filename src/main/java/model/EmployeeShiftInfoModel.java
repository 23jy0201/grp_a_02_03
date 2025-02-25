package model;

public class EmployeeShiftInfoModel {
    private EmployeeModel employee;
    private Shift_desired_templateModel shift;

    public EmployeeShiftInfoModel(EmployeeModel employee, Shift_desired_templateModel shift) {
        this.employee = employee;
        this.shift = shift;
    }

    // Getter メソッド
    public EmployeeModel getEmployee() { return employee; }
    public Shift_desired_templateModel getShift() { return shift; }
}
