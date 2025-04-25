package Day5_Regex_Junit.Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;



public class TaskProcessorTest {

    private TaskProcessor taskProcessor = new TaskProcessor();

    @Test
    @Timeout(2000)  // Test should fail if it takes longer than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        taskProcessor.longRunningTask();
    }
}
class TaskProcessor {

    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);  // Simulate a 3-second task
    }
}

