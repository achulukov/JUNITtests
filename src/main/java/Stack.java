public class Stack {
    private Node head;

    public void push(int value){
        if (head == null){
            head = new Node(value, null);
        } else{
            Node node = new Node(value, head);
            head = node;
        }

    }

    public String pop(){
        if (head == null) {
            System.out.println("Нет элементов!");
            return "нет элементов!";
        } else {
            int value = head.getValue();
            head = head.getPrev();
            return Integer.toString(value);
        }
    }

    public void printme(){
        if (head == null){
            System.out.println("EMPTY");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.getValue());
                if (node.getPrev() != null) {
                    System.out.print(" -> ");
                }
                node = node.getPrev();
            }
            System.out.println();
        }

    }

    public Node getHead() {
        return head;
    }






}
