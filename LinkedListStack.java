
/**
 * This is a linked list representation of a stack.
 */
public class LinkedListStack {

    private Node head;
    private Node cursor;

    public LinkedListStack() {
        this.head = null;
        this.cursor = null;
    }

    /**
     * Push an item to the stack.
     * @param item the item to be pushed
     */
    public void push(char item) {
        if (head == null) {
            head = new Node(item, null);
        } else {
            Node temp = new Node(item, head);
            head = temp;
        }
    } // push

    /**
     * Pop the item off the stack.
     * @return the item popped
     */
    public char pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            char item = head.getItem();
            head = head.getNext();
            return item;
        } // else
    } // pop

    /**
     * Return the top item of the stack.
     * @return the top item of the stack
     */
    public char top() {
        if (head == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return head.getItem();
        } // else
    } // top

    /**
     * Print out the stack in a nice format.
     */
    public void printStack() {
        this.cursor = this.head;
        while (cursor != null) {
            System.out.println("---");
            System.out.println("|" + cursor.getItem() + "|");
            cursor = cursor.getNext();
        } // while
    } // toString


} // class
/**
 * This is a node class
 */
class Node {
    private String item;
    private Node next;

    public Node() {
        next = null;
    } // Node constructor

    public Node(String item, Node node) {
        this.item = item;
        this.next = node;
    } // Node constructor

    /**
     * Get the current item in the node.
     */
    public String getItem() {return this.item;} // getItem

    /**
     * Set the item of the node.
     * @param item the item to be set
     */
    public void setItem(String item) {this.item = item;} // setItem

    /**
     * Get the next node.
     * @return the next node
     */
    public Node getNext() {return this.next;} // getNext

    /**
     * Set the next node.
     * @param node the next node
     */
    public void setNext(Node node) {this.next = node;} // setNext
}
