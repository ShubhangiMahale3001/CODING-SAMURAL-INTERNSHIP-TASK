package Task;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    static ArrayList<Task> taskList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Complete");
            System.out.println("3. View Tasks");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    markTaskAsComplete(scanner);
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the To-Do List. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void addTask(Scanner scanner) {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter due date: ");
        String dueDate = scanner.nextLine();

        Task newTask = new Task(title, description, dueDate);
        taskList.add(newTask);
        System.out.println("Task added successfully!");
    }

    public static void markTaskAsComplete(Scanner scanner) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to mark as complete.");
            return;
        }

        System.out.println("Tasks:");
        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            System.out.println(i + ". Title: " + task.title + ", Description: " + task.description + ", Due Date: " + task.dueDate + ", Complete: " + task.isComplete);
        }

        System.out.print("Enter the index of the task to mark as complete: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < taskList.size()) {
            Task task = taskList.get(index);
            task.isComplete = true;
            System.out.println("Task marked as complete!");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    public static void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Tasks:");
        for (Task task : taskList) {
            System.out.println("Title: " + task.title + ", Description: " + task.description + ", Due Date: " + task.dueDate + ", Complete: " + task.isComplete);
        }
    }

    public static void removeTask(Scanner scanner) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        System.out.println("Tasks:");
        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            System.out.println(i + ". Title: " + task.title + ", Description: " + task.description + ", Due Date: " + task.dueDate + ", Complete: " + task.isComplete);
        }

        System.out.print("Enter the index of the task to remove: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}
    
