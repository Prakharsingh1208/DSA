import java.util.Stack;

public class Stacks {
    public static void main(String ... args){
        Stack<String> s = new Stack<>();
        s.push("First");
        s.push("Second");
        s.push("jhcfke");
        s.pop();
        System.out.println(s.peek());
    }
}
