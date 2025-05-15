package ontrack;

import java.util.List;

public class Task {
    private String taskId;
    private String feedback;
    private List<Message> messages;

    public Task(String taskId, String feedback, List<Message> messages) {
        this.taskId = taskId;
        this.feedback = feedback;
        this.messages = messages;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
