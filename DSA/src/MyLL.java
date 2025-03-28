//
//public class MyLL {
//    class Node1 {
//        int data;
//        Node1 next;
//        Node1(int data){
//            this.data = data;
//            this.next=null;
//        }
//    }
//
//    private Node1 head;
////    private Node1 next;
//    private int size;//element of list
//    public MyLL(){
//        this.head=null;
//        this.size=0;
//    }
//    public void addLast(int data){
//        Node1 newNode = new Node1(data);
//        if (head==null) {
//            head= newNode;
//        }
//        else
//        {
//            Node1 temp = head;
//            while(temp.next!=null){
//                temp =temp.next;
//
//            }
//            temp.next= newNode;
//        }size++;
//
//    }
//    public void addFirst(int data){
//        Node1 newNode = new Node1(data);
//        head=newNode;
//        size++;
//    }
//
//    public void removeFirst(){
//        if(head==null ){
//            System.out.println("Empty List");
//        }
//        head=head.next;
//        size--;
//    }
//    public void removeLast(){
//        if(head==null ){
//            System.out.println("Empty List");
//        }
//        if(head.next==null){
//            head =null;
//        }
//        else {
//            Node1 temp = head;
//            while(temp.next.next != null){
//            temp = temp.next;}
//            temp.next= null;
//        }size--;
//    }
//    public void printer(){
//        Node1 n = head;
//        //can prinyt null if list is emptty handle
//        while(n!=null){
//            System.out.println(n.data+"->");
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args) {
//    MyLL m = new MyLL();
//    m.addFirst(5);
//    m.printer();}
//}
