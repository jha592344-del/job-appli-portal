// Job class: one object = one job.
public class Job {
    private String title;
    private String company;
    private String location;
    private String salary;
    private boolean applied;   // false = not applied, true = applied

    // Constructor: sets the values when a job is created
    public Job(String title, String company, String location, String salary) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.applied = false;
    }

    // Getter methods (private data can be read only through these)
    public String getTitle() {
        return title;
    }

    public boolean isApplied() {
        return applied;
    }

    // Marks this job as applied
    public void apply() {
        applied = true;
    }

    // Prints the job details
    public void display() {
        System.out.println(title + " | " + company + " | " + location + " | " + salary + " LPA");
    }
}
