public class DNode {
    int data;
    DNode next, prev;

    public DNode(int data){
        super();
        this.data=data;
        prev=next=null;
        
    }
    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data=data;
    }
    public DNode getNext(){
        return next;
    }

    public void setNext(DNode next){
        this.next=next;
    }
    public DNode getPrev(){
        return prev;
    }

    public void setPrev(DNode prev){
        this.prev=prev;
    }


    
}
