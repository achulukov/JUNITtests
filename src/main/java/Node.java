public class Node {
    private int value;
    private Node prev;

    public Node(int value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }

    public int getValue() {
        return value;
    }
}
