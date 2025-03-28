class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }}
public class DLL {
    private Node head;
   private Node tail;

   public DLL(){}
    public void add(int d){
       Node n = new Node(d);
       if(head==null){
           head=tail=n;
           return;
       }
       tail.next =n;
       n.prev = tail;
       tail = n;
    }
    public void pf(){
       Node c= head;
       while(c!=null){
           System.out.println(c.data+"<->");
       }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL d = new DLL();
        d.add(5);
        d.pf();
    }
}
