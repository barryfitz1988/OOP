package test.com.company;

import main.com.company.Worker;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class WorkerTest {

    private Worker worker = new Worker();

    @Test
    @DisplayName("Should display something")
    public void output() {
        String[] testArray = {"Test", "This", "App"};
        assertEquals(testArray[0], worker.output(testArray)[0], testArray[0]);
    }
}
