package Number;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Task {
    private  int X;
    private int Y;

    public Task(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (X == task.X && Y == task.Y)
                || (X == task.Y && Y == task.X );
    }

    @Override
    public int hashCode() {
        return Objects.hash(X* Y, Y+X);
    }

    public static void checkTheTask(){
        Set<Task> tasks = new HashSet<>(15);
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(2, 10)));
            random.nextInt(2, 10);
        }
    }
    @Override
    public String toString() {
        return "Task{" + "tasks = "  + tasks + "}";
    }
}
