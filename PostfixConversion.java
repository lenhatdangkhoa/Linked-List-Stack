public class PostfixConversion {

    private boolean checker;

    public boolean validate(LinkedListStack stack) {
        LinkedListStack stack1 = new LinkedListStack();
        while (stack.top() != null) {
            if (stack.top().equals("(")) {
                stack1.push(stack.pop()); // adds intial opening
            } else if (!stack.top().equals("(")) {
                if ((stack.top().equals("+") || stack.top().equals("-") || stack.top().equals("*")
                || stack.top().equals("/")) && (stack1.top().equals("+") || stack1.top().equals("-")
                || stack1.top().equals("*")  || stack1.top().equals("/"))) {
                    return checker = false;
                } else { // input number here
                    stack1.push(stack.pop());
                } // else
            } else { // checks for ending )

            } // else


        } // while
        return false;
    } // validate

    public LinkedListStack convert(LinkedListStack stack) {
        if (checker = false) {
            System.out.println("Invalid expression, check your stack.");
        } else {

        } // else
        return null;
    } // convert

} // PostfixConversion
