import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> deleteTask();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addTask() {
        System.out.print("Enter task: ");
        tasks.add(sc.nextLine());
        System.out.println("Task added!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    static void deleteTask() {
        viewTasks();
        System.out.print("Enter task number: ");
        int n = sc.nextInt();
        if (n > 0 && n <= tasks.size()) {
            tasks.remove(n - 1);
            System.out.println("Task removed!");
        }
    }
}

