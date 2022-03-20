package java.bridgelabz.Empwage;

public class EmployeeWage {

    public static final int WAGE_PER_HR = 20;
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int TOTAL_WORKING_DAY_IN_MONTH = 20;
    public static final int TOTAL_WORKING_HRS = 100;

    public static void totalEmployeeWage() {

        int workingdays = 0;
        int wageForMonth = 0;
        int totalEmpHrs = 0;
        int empHrs;


        while (totalEmpHrs < TOTAL_WORKING_HRS && workingdays < TOTAL_WORKING_DAY_IN_MONTH) {
            workingdays++;

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);


            switch (empCheck) {

                case 1:
                    empHrs = 4;
                    break;

                case 2:
                    empHrs = 8;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs = totalEmpHrs + empHrs;
        }

        wageForMonth += totalEmpHrs * WAGE_PER_HR;
        System.out.println("Employee wage in a month " + wageForMonth);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        totalEmployeeWage();

    }
}
