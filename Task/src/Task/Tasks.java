package Task;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String title;
    String description;
    String dueDate;
    boolean isComplete;

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = false;
    }
}