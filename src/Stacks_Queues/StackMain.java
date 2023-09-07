package Stacks_Queues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(56);
        stack.push(76);
        stack.push(43);
        stack.push(93);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
