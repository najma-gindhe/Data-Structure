public abstract class Lecturer {

    private String lecturerId;
    private String name;

    public Lecturer(String lecturerId, String name) {
        this.lecturerId = lecturerId;
        this.name = name;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String id) {
        this.lecturerId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract void displayInformation();
}