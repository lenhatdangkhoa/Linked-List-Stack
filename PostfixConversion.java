public class PostfixConversion() {

    private boolean checker;

    public boolean validate(LinkedListStack stack) {
        LinkedListStack stack1 = new LinkedListStack();
        while (stack.top() != null) {
            if (stack.top() = "(") {
                stack1.push(stack.pop());
            } else if (stack.top() != "(") {
                if (stack1.top(stack.pop())) {

                } // if


            } // else if
        } // while
    } // validate

    public LinkedListStack convert(LinkedListStack stack) {

    } // convert

} // PostfixConversion
