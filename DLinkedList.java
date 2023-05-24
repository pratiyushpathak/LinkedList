public class DLinkedList {
    DNode head, tail;
    
    public DLinkedList(){
        head=tail=null;
    }

    public DNode getHead(){
        return head;
    }

    public void setHead(DNode head){
        this.head=head;
    }
    public DNode getTail(){
        return tail;
    }

    public void setTail(DNode tail){
        this.tail=tail;
    }

    public boolean insertAtBeg(int data){
        DNode newnode = new DNode(data);
        if(newnode==null)
            return false;
        
        if(head==null){
            head=tail=newnode;
            head.setNext(newnode);
            head.setPrev(newnode);}
        else{
            newnode.setNext(head);
            newnode.setPrev(tail);
            head.setPrev(newnode);
            tail.setNext(newnode);
            head=newnode;
        }
        return true;
    }

    public boolean insertAtLast(int data){
        DNode newnode=new DNode(data);
        if(newnode==null){
            return false;
        }
        DNode temp=head;
        while(temp.getNext()!=null){
            temp.setNext(temp);
            return false;
        }
        temp.setNext(newnode);
        newnode.setPrev(temp);
        return true;
    }

    public void forwordDisplay() {
		DNode temp = head;
		System.out.print("\nForword List Elements  -");
		while (temp.getNext() != head) {
			//System.out.println(temp.getData()+"\n");
			System.out.print("\t"+temp.getData());
			temp = temp.getNext();
		}
		System.out.print("\t"+temp.getData()+"\n");
	}
}
