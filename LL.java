public class LL {

    Node head; // head of the list
    private int size;

    @SuppressWarnings("unused")
    LL() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        } 
    }

    //Adding elements in the starting
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //Adding elements at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return; 
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    //Delete First element
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last element
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node Last = head.next;
        while (Last.next != null) {
            Last = Last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //Size of the List
    public int listSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("It");
        list.printList();
        System.out.println();
        list.addLast("a");
        list.addLast("LinkedList");
        list.printList();
        System.out.println();
        list.deleteFirst();
        list.printList();
        System.out.println();
        list.deleteLast();
        list.printList();
        System.out.println();
        System.out.println(list.listSize());
        // LinkedList<String> list = new LinkedList<>();
        // list.addFirst("is");
        // list.addFirst("it");
        // list.addLast("a");
        // list.addLast("LinkedList");
        // System.out.println(list);
    }
}
 