import java.util.LinkedList;
import java.util.Queue;

public class NewQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("First");
        q.add("Second");
        q.add("Third");
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.contains("First"));
    }
}
