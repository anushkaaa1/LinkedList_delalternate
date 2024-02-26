public class linkedldelalternate {
    Node head,tail;

    linkedldelalternate(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head==null)
           tail =head = newnode ;
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head==null)
           System.out.println("list is empty");
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void delalternate(){
        if(head==null||head.next==null){
            System.out.println("deletion not possible");
        }
        else{
            Node temp = head;
            Node ptemp = head.next;
            while(ptemp!=null){
                temp.next = ptemp.next;
                temp = ptemp;
                ptemp = ptemp.next;
            }
        }
    }
    public static void main(String args[]){
        linkedldelalternate l = new linkedldelalternate();
        l.create(10);
        l.create(20);
        l.create(30);
        l.create(40);
        l.create(50);
        l.print(l.head);
        System.out.println();
        l.delalternate();
        l.print(l.head);
    }
}
