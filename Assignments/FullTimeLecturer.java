public class FullTimeLecturer extends Lecturer {

    private double basicSalary;
    private double researchAllowance;
    private double administrativeAllowance;

    public FullTimeLecturer(String id, String name, double basic, double research, double admin) {
        super(id, name);
        this.basicSalary = basic;
        this.researchAllowance = research;
        this.administrativeAllowance = admin;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double value) {
        basicSalary = value;
    }

    public double getResearchAllowance() {
        return researchAllowance;
    }

    public void setResearchAllowance(double value) {
        researchAllowance = value;
    }

    public double getAdministrativeAllowance() {
        return administrativeAllowance;
    }

    public void setAdministrativeAllowance(double value) {
        administrativeAllowance = value;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + researchAllowance + administrativeAllowance;
    }

    @Override
    public void displayInformation() {
        System.out.println("Employment Type: Full-Time");
        System.out.println("Lecturer ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Research Allowance: $" + researchAllowance);
        System.out.println("Administrative Allowance: $" + administrativeAllowance);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("--------------------------------");
    }
}