public class Driver {

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.pop());
        System.out.println(stack.top());
        stack.printStack();
    } // main
} // class
