/**
 * Postfix Evaluation class.
 */
public class PostfixEvaluation {

    public double evaluate(LinkedListStack stack) {
        LinkedListStack tempStack = new LinkedListStack();
        while (stack.top() != null) {
            if (!stack.top().equals(" ") ||
            !stack.top().equals("+") ||
            !stack.top().equals("-") ||
            !stack.top().equals("*") ||
            !stack.top().equals("/")) {
                tempStack.push(stack.pop());
            } else if (stack.top().equals("+")) {
                double num2 = Double.parseDouble(stack.pop());
                double num1 = Double.parseDouble(stack.pop());
                double result = num1 + num2;
                tempStack.push("" + result);
            } else if (stack.top().equals("-")) {
                double num2 = Double.parseDouble(stack.pop());
                double num1 = Double.parseDouble(stack.pop());
                double result = num1 - num2;
                tempStack.push("" + result);
            } else if (stack.top().equals("*")) {
                double num2 = Double.parseDouble(stack.pop());
                double num1 = Double.parseDouble(stack.pop());
                double result = num1 * num2;
                tempStack.push("" + result);
            } else if (stack.top().equals("/")) {
                double num2 = Double.parseDouble(stack.pop());
                double num1 = Double.parseDouble(stack.pop());
                double result = num1 / num2;
                tempStack.push("" + result);
            } else {
                String answer = stack.pop();
                if (stack.top() != null) return Double.parseDouble(answer);
            } // else


        } // while
    } // evaluate

} // class
