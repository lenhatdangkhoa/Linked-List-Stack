public class PostfixConversion() {

    private boolean checker;

    public boolean validate(LinkedListStack stack) {
        LinkedListStack stack1 = new LinkedListStack();
        while (stack.top() != null) {
            if (stack.top() = "(") {
                stack1.push(stack.pop()); // adds intial opening (
            } else if (stack.top() != "(") {
                if ((stack.top() == "+" || stack.top() == "-" || stack.top() == "*"
                || stack.top() == "/") && (stack1.top() == "+" || stack1.top() == "-"
                || stack1.top() == "*"  || stack1.top() == "/")) {
                    return checker = false;
                } else { // input number here
                    stack1.push(stack.pop());
                } // else
            } else { // checks for ending )

            } // else


            } // else if
        } // while
    } // validate

    public LinkedListStack convert(LinkedListStack stack) {
        if (checker = false) {
            System.out.println("Invalid expression, check your stack.");
        } else {

        } // else
    } // convert

} // PostfixConversion
