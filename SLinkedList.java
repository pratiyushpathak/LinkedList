public class SLinkedList {
    Node head;
    Node tail;
  

    public SLinkedList(){
    }

    public void insertAtBegening(String data){
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }

    // public void insertAtLast(String data){
    //     Node nn = new Node(data);
    //     if(head==null){
    //         head=nn;
    //         return;
    //     }
    //     Node temp=head;
    //     while(temp.next!=null){
    //         temp=temp.next;
    //     }
    //     temp.next=nn;
    // }

    public void insertAtLast(String data){
        Node nn= new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
    }

    public void insertAtPos(String data, int pos){
        Node nn=new Node(data);
        int count=0;
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while(temp.next!=null && count!=pos-2){
            temp=temp.next;
            count++;
        }
        nn.next=temp.next;
        temp.next=nn;


    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The LIST is EMPTY, Nothing to DELETE");
            return;
        }

        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List EMPTY, Nothing to DELETE");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
           
            temp=temp.next;
            
        }
        temp.next=null;
    }

    public void deleteAtPos(int pos){
        int count=0;
        if(head==null){
            System.out.println("List EMPTY, Nothing to DELETE");
            return;
        }
        Node temp=head;
        while(temp.next!=null && count!=pos-2){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
    }

    public void displayList(){
        if (head == null) {
            System.out.println("The list is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}