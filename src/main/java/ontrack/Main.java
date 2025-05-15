package ontrack;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        List<Message> messages = Arrays.asList(
            new Message("student", "Hi, when will I get feedback?"),
            new Message("tutor", "You’ll receive it soon.")
        );

        Task task = new Task("task123", "Well done! Just improve the formatting.", messages);
        service.addTask(task);

        // Call the function
        Task result = service.viewTaskDetails("task123");

        // Print result
        System.out.println("Task ID: " + result.getTaskId());
        System.out.println("Feedback: " + result.getFeedback());
        System.out.println("Chat Messages:");
        for (Message msg : result.getMessages()) {
            System.out.println(msg.getSender() + ": " + msg.getContent());
        }
    }
}
