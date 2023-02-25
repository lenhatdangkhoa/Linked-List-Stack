public class PostfixConversion {

    public static boolean validate(LinkedListStack input) throws Exception{
        int variableCount = 0; // variables
        int opCount = 0; // operations
        int parCount = 0; // parentheses
        LinkedListStack reversedInput = new LinkedListStack();
            while (input.top() != null) reversedInput.push(input.pop());
        LinkedListStack parStack = new LinkedListStack();
        while (reversedInput.top() != null) {
            if (reversedInput.top().equals("(")) {
                parCount++;
                String temp = reversedInput.pop();
                parStack.push(temp);
                input.push(temp);
            } else if (reversedInput.top().equals("+") ||
            reversedInput.top().equals("-") ||
            reversedInput.top().equals("*") ||
            reversedInput.top().equals("/")) {
                opCount++;
                input.push(reversedInput.pop());
            } else if (!reversedInput.top().equals(")") &&
            !reversedInput.top().equals(" ") && !reversedInput.top().equals("")) {
                variableCount++;
                input.push(reversedInput.pop());
            } else if (reversedInput.top().equals(")")) {
                if (parCount == 0) return false;
                parStack.pop();
                parCount--;
                input.push(reversedInput.pop());
            } else {
                input.push(reversedInput.pop());
            }
        } // while
        return parCount == 0 && variableCount == opCount + 1;
    } // validate

    public static String convert(LinkedListStack rawPrefix) throws Exception {
        if (!validate(rawPrefix)) return null;
        else {
            LinkedListStack prefix = new LinkedListStack();
            while (rawPrefix.top() != null) prefix.push(rawPrefix.pop());
            String result = "";
            LinkedListStack tempStack = new LinkedListStack();
            while (prefix.top() != null || tempStack.top() != null) {
                if (prefix.top() != null) {
                    if (!prefix.top().equals("(") &&
                    !prefix.top().equals(")") &&
                    !prefix.top().equals("+") &&
                    !prefix.top().equals("-") &&
                    !prefix.top().equals("*") &&
                    !prefix.top().equals("/"))  {
                        result += " " + prefix.pop() + " ";
                    } else if (prefix.top().equals("(")) {
                        tempStack.push(prefix.pop());
                    } else if (prefix.top().equals("*") || prefix.top().equals("/")) {
                        if (tempStack.top() != null) {
                            while (tempStack.top().equals("*") || tempStack.top().equals("/")) {
                                result += tempStack.pop();
                                if (tempStack.top() == null) break;
                            } // while
                        } // if
                        tempStack.push(prefix.pop());
                    } else if (prefix.top().equals("+") || prefix.top().equals("-")) {
                        if (tempStack.top() != null) {
                            while (tempStack.top().equals("*") || tempStack.top().equals("/")) {
                                result += tempStack.pop();
                                if (tempStack.top() == null) break;
                            }
                        }// while
                        if (tempStack.top() != null) {
                            while (tempStack.top().equals("+") || tempStack.top().equals("-")) {
                                result += tempStack.pop();
                                if (tempStack.top() == null) break;
                            } // while
                        } // if
                        //} // if
                        tempStack.push(prefix.pop());
                    } else if (prefix.top().equals(")")) {
                        prefix.pop();
                        while (!tempStack.top().equals("(")) {
                            result += tempStack.pop();
                            if (tempStack.top().equals("(")) {
                                tempStack.pop();
                                break;
                            }

                        } // while
                    } // else if
                } else {
                    result += " " + tempStack.pop();
                } // else
            } // while
            return result;
        } // else
    } // convert
} // PostfixConversion
