// JobPortal class: stores the 5 jobs in an array and does all the work.
public class JobPortal {
    private Job[] jobs = new Job[5];

    // Constructor: creates the five predefined jobs
    public JobPortal() {
        jobs[0] = new Job("Java Developer", "TechNova Solutions", "Pune", "6-9");
        jobs[1] = new Job("Web Developer", "PixelCraft Studio", "Mumbai", "4-7");
        jobs[2] = new Job("Data Analyst", "DataBridge Analytics", "Bengaluru", "5-8");
        jobs[3] = new Job("Software Tester", "QualityFirst Labs", "Hyderabad", "3-6");
        jobs[4] = new Job("Python Developer", "CodeWave Systems", "Chennai", "5-9");
    }

    // 1. Display all jobs
    public void showAllJobs() {
        System.out.println("\n--- Available Jobs ---");
        for (int i = 0; i < jobs.length; i++) {
            System.out.print((i + 1) + ". ");
            jobs[i].display();
        }
    }

    // 2. Search jobs by title
    public void searchJob(String keyword) {
        keyword = keyword.toLowerCase();
        boolean found = false;

        System.out.println("\n--- Search Results ---");
        for (int i = 0; i < jobs.length; i++) {
            String title = jobs[i].getTitle().toLowerCase();
            if (title.contains(keyword)) {
                System.out.print((i + 1) + ". ");
                jobs[i].display();
                found = true;
            }
        }

        if (found == false) {
            System.out.println("No jobs found.");
        }
    }

    // 3. Apply for a job using its number (1 to 5)
    public void applyForJob(String number) {
        boolean valid = false;

        for (int i = 0; i < jobs.length; i++) {
            if (number.equals(String.valueOf(i + 1))) {
                valid = true;
                if (jobs[i].isApplied()) {
                    System.out.println("You have already applied for " + jobs[i].getTitle() + ".");
                } else {
                    jobs[i].apply();
                    System.out.println("Application sent for " + jobs[i].getTitle() + "!");
                }
            }
        }

        if (valid == false) {
            System.out.println("Invalid job number. Enter a number from 1 to 5.");
        }
    }

    // 4. Show applied jobs
    public void showAppliedJobs() {
        boolean any = false;

        System.out.println("\n--- Applied Jobs ---");
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i].isApplied()) {
                jobs[i].display();
                any = true;
            }
        }

        if (any == false) {
            System.out.println("You have not applied for any job yet.");
        }
    }
}
