import tech.first.model.Node;

public class SimpleLinkedIst {
    Node head;
    public static void main(String[] args){
        System.out.println("Hi");

        SimpleLinkedIst ll = new SimpleLinkedIst();
        ll.head = null;
        ll.add(5);
        ll.add(0);
        ll.add(7);
        ll.add(11);
        ll.display();

    }

    public void add(int value){
       // Node head = null;
        Node node = null;
        if(head==null){
            head = new Node(value,null);
        }
        else{
            node=head;
            while(node.getNext()!=null){
                node=node.getNext();
            }
            Node newNode = new Node(value,null);
            node.setNext(newNode);
        }
    }

    public void display(){
        Node d= head;
        while(d!=null){
            System.out.println("Value " + d.getValue()+ ", " + "next " +d.getNext());
            d=d.getNext();
        }
    }

}
