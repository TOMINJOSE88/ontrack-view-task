package ontrack;

import java.util.*;

public class TaskService {
    private Map<String, Task> taskDatabase = new HashMap<>();

    public void addTask(Task task) {
        taskDatabase.put(task.getTaskId(), task);
    }

    public Task viewTaskDetails(String taskId) {
        return taskDatabase.get(taskId);
    }
}
