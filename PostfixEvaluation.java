/**
 * Postfix Evaluation class.
 */
public class PostfixEvaluation {

    public static double evaluate(LinkedListStack stack) {
        LinkedListStack tempStack = new LinkedListStack();
        LinkedListStack reversedStack = new LinkedListStack();
        String answer = null;
        while (stack.top() != null) {
            reversedStack.push(stack.pop());
        }
        while (reversedStack.top() != null) {
            if (!reversedStack.top().equals(" ") &&
            !reversedStack.top().equals("+") &&
            !reversedStack.top().equals("-") &&
            !reversedStack.top().equals("*") &&
            !reversedStack.top().equals("/")) {
                answer = reversedStack.pop();
                tempStack.push(answer);
            } else if (reversedStack.top().equals("+")) {
                double num2 = Double.parseDouble(tempStack.pop());
                double num1 = Double.parseDouble(tempStack.pop());
                double result = num1 + num2;
                tempStack.push("" + result);
                answer = reversedStack.pop();
            } else if (reversedStack.top().equals("-")) {
                double num2 = Double.parseDouble(tempStack.pop());
                double num1 = Double.parseDouble(tempStack.pop());
                double result = num1 - num2;
                tempStack.push("" + result);
                answer = reversedStack.pop();
            } else if (reversedStack.top().equals("*")) {
                double num2 = Double.parseDouble(tempStack.pop());
                double num1 = Double.parseDouble(tempStack.pop());
                double result = num1 * num2;
                tempStack.push("" + result);
                answer = reversedStack.pop();
            } else if (reversedStack.top().equals("/")) {
                double num2 = Double.parseDouble(tempStack.pop());
                double num1 = Double.parseDouble(tempStack.pop());
                double result = num1 / num2;
                tempStack.push("" + result);
                answer = reversedStack.pop();
            } else if (reversedStack.top().equals(" ")) {
                reversedStack.pop();
            } // else

            if (reversedStack.top() == null) return Double.parseDouble(tempStack.pop());
        } // while
        return 0;
    } // evaluate

} // class
