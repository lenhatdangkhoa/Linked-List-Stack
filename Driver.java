public class Driver {

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        String test = "3 4 * 2 5 * +";
        for (int i = 0; i < test.length(); i++) {
            stack.push("" + test.charAt(i));
        } // for
        stack.printStack();
        System.out.println("The result is: " + PostfixEvaluation.evaluate(stack));
    } // main
} // class
