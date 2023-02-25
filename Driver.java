import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1) Postfix conversion\n2) Postfix evaluation\n3)Quit");
        String userInput = keyboard.next();
        while (!userInput.equals("3")) {
            if (userInput.equals("1")) {
                System.out.print("Please enter an infix expression: ");
                keyboard.nextLine();
                String test = keyboard.nextLine();
                LinkedListStack stack = new LinkedListStack();
                String temp = "";
                System.out.println(test);
                for (int i = 0; i < test.length(); i++) {
                    if (test.charAt(i) != ' ' && test.charAt(i) != '(' &&
                    test.charAt(i) != ')' && test.charAt(i) != '+' &&
                    test.charAt(i) != '-' && test.charAt(i) != '*' &&
                    test.charAt(i) != '/') {
                        temp += test.charAt(i);
                    } else {
                        if (temp.length() > 0) stack.push(temp);
                        stack.push("" + test.charAt(i));
                        temp = "";
                    } // else
                } // for
                if (temp.length() > 0) stack.push(temp);
                try {
                    test = PostfixConversion.convert(stack);
                    System.out.println("The result is: " + test);
                } catch (Exception e) {
                    System.out.println("An error has occurred. Please check your syntax");
                } // catch
            } else if (userInput.equals("3")) {
                System.exit(0);
            } else if (userInput.equals("2")) {
                System.out.print("Please enter a postfix expression: ");
                keyboard.nextLine();
                String test = keyboard.nextLine();
                LinkedListStack stack = new LinkedListStack();
                String temp = "";
                System.out.println(test);
                for (int i = 0; i < test.length(); i++) {
                    if (test.charAt(i) != ' ') {
                        temp += test.charAt(i);
                    } else {
                        if (temp.length() > 0)
                            stack.push(temp);
                temp = "";
                    } // else
                } // for
                if (temp.length() > 0) stack.push(temp);
                try {
                    test = "" + PostfixEvaluation.evaluate(stack);
                    System.out.println("The result is: " + test);
                } catch (Exception e) {
                    System.out.println("An error has occurred. Please check your syntax");
                } // catch
            } // else
            System.out.println("1) Postfix conversion\n2) Postfix evaluation\n3)Quit");
            userInput = keyboard.next();
        } // else
    } // main
} // class
