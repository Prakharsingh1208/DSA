public class LinkList {
    public  static void main(String ... args){

    }
}

class Node{
    int data;
    Node next;
    //This is the constructed to load data during node creation
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkLists{
    Node node;

    public LinkLists(){
        this.node = new Node(123,null);
    }

    public static void addNode(){

    }
}
