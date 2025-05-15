package ontrack;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class TaskServiceTest {

    @Test
    public void testViewTaskDetails() {
        TaskService service = new TaskService();
        List<Message> messages = Arrays.asList(
            new Message("student", "Hi, when will I get feedback?"),
            new Message("tutor", "You’ll receive it soon.")
        );
        Task task = new Task("task123", "Well done! Just improve the formatting.", messages);
        service.addTask(task);

        Task result = service.viewTaskDetails("task123");

        assertNotNull(result);
        assertEquals("task123", result.getTaskId());
        assertEquals("Well done! Just improve the formatting.", result.getFeedback());
        assertEquals(2, result.getMessages().size());
        assertEquals("student", result.getMessages().get(0).getSender());
    }
}
