public class PartTimeLecturer extends Lecturer {

    private double teachingHours;
    private double hourlyRate;

    public PartTimeLecturer(String id, String name, double hours, double rate) {
        super(id, name);
        this.teachingHours = hours;
        this.hourlyRate = rate;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double hours) {
        teachingHours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double rate) {
        hourlyRate = rate;
    }

    @Override
    public double calculateSalary() {
        return teachingHours * hourlyRate;
    }

    @Override
    public void displayInformation() {
        System.out.println("Employment Type: Part-Time");
        System.out.println("Lecturer ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.println("Teaching Hours: " + teachingHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("--------------------------------");
    }
}