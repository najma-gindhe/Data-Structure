public class UniversityPayrollSystem {

    private Lecturer[] lecturers;

    public UniversityPayrollSystem() {
        lecturers = new Lecturer[0];
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers = java.util.Arrays.copyOf(lecturers, lecturers.length + 1);
        lecturers[lecturers.length - 1] = lecturer;
    }

    public void displayAllLecturers() {
        if (lecturers.length == 0) {
            System.out.println("No lecturers registered.");
            return;
        }

        for (Lecturer lecturer : lecturers) {
            lecturer.displayInformation();
        }
    }

    public void displayHighestPaidLecturer() {
        if (lecturers.length == 0) {
            System.out.println("No lecturers registered.");
            return;
        }

        Lecturer highestPaid = lecturers[0];

        for (Lecturer lecturer : lecturers) {
            if (lecturer.calculateSalary() > highestPaid.calculateSalary()) {
                highestPaid = lecturer;
            }
        }

        System.out.println("Highest Paid Lecturer:");
        highestPaid.displayInformation();
    }

    public double calculateFullTimePayroll() {
        double total = 0;

        for (Lecturer lecturer : lecturers) {
            if (lecturer instanceof FullTimeLecturer) {
                total += lecturer.calculateSalary();
            }
        }

        return total;
    }

    public double calculatePartTimePayroll() {
        double total = 0;

        for (Lecturer lecturer : lecturers) {
            if (lecturer instanceof PartTimeLecturer) {
                total += lecturer.calculateSalary();
            }
        }

        return total;
    }

    public void displayLecturersEarningMoreThan(double amount) {
        boolean found = false;

        System.out.println("Lecturers earning more than $" + amount + ":");

        for (Lecturer lecturer : lecturers) {
            if (lecturer.calculateSalary() > amount) {
                lecturer.displayInformation();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lecturers found.");
        }
    }

    public static void main(String[] args) {

        UniversityPayrollSystem payroll = new UniversityPayrollSystem();

        FullTimeLecturer lecturer1 = new FullTimeLecturer(
                "L001", "Ahmed", 2500, 500, 300
        );

        FullTimeLecturer lecturer2 = new FullTimeLecturer(
                "L002", "Fatima", 3000, 600, 400
        );

        PartTimeLecturer lecturer3 = new PartTimeLecturer(
                "L003", "Mohamed", 40, 25
        );

        PartTimeLecturer lecturer4 = new PartTimeLecturer(
                "L004", "Amina", 30, 20
        );

        payroll.addLecturer(lecturer1);
        payroll.addLecturer(lecturer2);
        payroll.addLecturer(lecturer3);
        payroll.addLecturer(lecturer4);

        System.out.println("UNIVERSITY LECTURER SALARY MANAGEMENT SYSTEM");
        System.out.println("============================================");

        payroll.displayAllLecturers();

        System.out.println("\nHIGHEST PAID LECTURER");
        payroll.displayHighestPaidLecturer();

        System.out.println("\nFULL-TIME PAYROLL: $" +
                payroll.calculateFullTimePayroll());

        System.out.println("PART-TIME PAYROLL: $" +
                payroll.calculatePartTimePayroll());

        System.out.println();

        payroll.displayLecturersEarningMoreThan(2000);
    }
}