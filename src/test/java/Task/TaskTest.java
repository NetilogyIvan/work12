package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testTrueMatchesForSimpleTask() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("Позвонить");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFalseMatchesForSimpleTask() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("купить");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTrueMatchesForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Хлеб");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFalseMatchesForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Масло");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTrueMatchesForMeeting() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("НетоБанк");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testFalseMatchesForMeeting() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("вторник");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

}