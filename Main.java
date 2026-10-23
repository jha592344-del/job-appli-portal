import java.util.Scanner;

// Main class: shows the menu and calls the JobPortal methods.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobPortal portal = new JobPortal();
        boolean running = true;

        System.out.println("===== Welcome to JobPortal =====");

        while (running) {
            System.out.println("\n1. View all jobs");
            System.out.println("2. Search job by title");
            System.out.println("3. Apply for a job");
            System.out.println("4. View applied jobs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    portal.showAllJobs();
                    break;
                case "2":
                    System.out.print("Enter job title to search: ");
                    portal.searchJob(sc.nextLine());
                    break;
                case "3":
                    portal.showAllJobs();
                    System.out.print("Enter job number to apply: ");
                    portal.applyForJob(sc.nextLine());
                    break;
                case "4":
                    portal.showAppliedJobs();
                    break;
                case "5":
                    System.out.println("Thank you for using JobPortal. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 to 5.");
            }
        }
    }
}
