package stack;

public class Content {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        while(stack.hasNext()){
            System.out.println(stack.pop());
        }
    }
}
