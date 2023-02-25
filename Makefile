cl:
	javac LinkedListStack.java
	javac PostfixConversion.java
	javac PostfixEvaluation.java
	javac Driver.java
run: cl
	java Driver
clean:
	rm -rf LinkedListStack.class
	rm -rf PostfixConversion.class
	rm -rf PostfixEvaluation.class
	rm -rf Driver.class
	rm -rf Node.class
