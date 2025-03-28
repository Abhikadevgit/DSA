//// Node.java
//class Node {
//    int data;
//    Node1 next;
//    Node1 prev;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//        this.prev = null;
//    }
//}
//
//// DoublyLinkedList.java
// class DoublyLinkedList {
//    private Node1 head;
//    private Node1 tail;
//
//    // Add a new node at the end of the list.
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = tail = newNode;
//            return;
//        }
//        tail.next = newNode;
//        newNode.prev = tail;
//        tail = newNode;
//    }
//
//    // Remove the first node that contains the given data.
//    public boolean remove(int data) {
//        if (head == null) {
//            return false; // List is empty
//        }
//
//        Node1 current = head;
//        while (current != null && current.data != data) {
//            current = current.next;
//        }
//
//        if (current == null) {
//            return false; // Element not found
//        }
//
//        // If the node is at the head
//        if (current == head) {
//            head = current.next;
//            if (head != null) {
//                head.prev = null;
//            } else { // List becomes empty
//                tail = null;
//            }
//        }
//        // If the node is at the tail
//        else if (current == tail) {
//            tail = current.prev;
//            tail.next = null;
//        }
//        // Node is in the middle
//        else {
//            current.prev.next = current.next;
//            current.next.prev = current.prev;
//        }
//
//        return true;
//    }
//
//    // Check if the list contains a node with the given data.
//    public boolean contains(int data) {
//        Node1 current = head;
//        while (current != null) {
//            if (current.data == data)
//                return true;
//            current = current.next;
//        }
//        return false;
//    }
//
//    // Print list elements from head to tail.
//    public void printForward() {
//        Node1 current = head;
//        while (current != null) {
//            System.out.print(current.data + " <-> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//    // Print list elements from tail to head.
//    public void printReverse() {
//        Node1 current = tail;
//        while (current != null) {
//            System.out.print(current.data + " <-> ");
//            current = current.prev;
//        }
//        System.out.println("null");
//    }
//
//    // Main method for testing.
//    public static void main(String[] args) {
//        DoublyLinkedList list = new DoublyLinkedList();
//
//        // Add elements to the list.
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println("List printed forward:");
//        list.printForward(); // Expected: 10 <-> 20 <-> 30 <-> 40 <-> null
//
//        System.out.println("List printed reverse:");
//        list.printReverse(); // Expected: 40 <-> 30 <-> 20 <-> 10 <-> null
//
//        // Check if elements exist.
//        System.out.println("Contains 20? " + list.contains(20));  // Expected: true
//        System.out.println("Contains 50? " + list.contains(50));  // Expected: false
//
//        // Remove an element.
//        list.remove(20);
//        System.out.println("After removing 20:");
//        list.printForward(); // Expected: 10 <-> 30 <-> 40 <-> null
//
//        // Remove head and tail.
//        list.remove(10);
//        list.remove(40);
//        System.out.println("After removing 10 and 40:");
//        list.printForward(); // Expected: 30 <-> null
//    }
//}
