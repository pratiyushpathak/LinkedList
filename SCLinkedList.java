public class SCLinkedList {
    private SNode head, tail;

    public SCLinkedList(){
        this.head=head;
        this.tail=tail;
    }

    public SNode getHead(){
        return head;
    }

    public void setHead(SNode head){
        this.head=head;
    }

    public SNode getTail(){
        return tail;
    }

    public void setTail(SNode tail){
        this.tail=tail;
    }


    public boolean insertAtBegening(int data){
        SNode newnode = new SNode(data);
        if(newnode==null)
            return false;
        if(head==null){
            head=tail=newnode;
            head.setNext(head);
        }
        else{
            newnode.setNext(head);
            head=newnode;
            tail.setNext(head);
        }
        return true;
    }

    public boolean insertAtLast(int data){
        SNode nn=new SNode(data);
        if(nn==null){
            return false;
        }
        if(head==null){
            head=tail=nn;
            head.setNext(head);
        }
        else{
            tail.setNext(nn);
            nn.setNext(head);
            tail=nn;
        }
        return true;
    }

    public boolean insertAtPos(int data, int pos){
        if(head==null)
            return false;
        if(pos<=0){
            System.out.println("Please Enter a Valid Positive Position");
            return false;
        }
        if(pos==1){
            insertAtBegening(data);
        }
        else{
            SNode temp=head;
            SNode nn = new SNode(data);
            int i=1;
            while(i<pos-1 && temp!=null){
                temp=temp.getNext();
                i++;
            }
            if(temp==null){
                System.out.println("Invalid Position");
                return false;
            }
            nn.setNext(temp.getNext());
            temp.setNext(nn);
        }
        return true;
    }

    public boolean deleteAtBeg(){
        if(head==null){
            return false;
        }
        head=head.getNext();
        tail.getNext().setNext(null);
        tail.setNext(head);
        return true;
    }

    public boolean deleteAtLast(){
        if(head==null)
            return false;
        SNode temp=head;
        while(temp.getNext().getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(head);
        tail=temp;
        return true;
    }
    public boolean deleteAtPos(int pos){
        int count=0;
        if(head==null)
        return false;
        if(pos<=0){
            System.out.println("\nPlease Enter Positive Position");
            return false;
        }
        if(pos==1)
            deleteAtBeg();
        else{
        SNode temp=head;
        int i=1;
        while(i<pos-1 && temp!=null){
            temp=temp.getNext();
            i++;
        }
        if(temp==null){
            System.out.println("\nInvalid Position");
            return false;
        }
        SNode t=temp.getNext();
        temp.setNext(t.getNext());
        t.setNext(null);
        System.out.println("\nSNode Deleted -" + t.getData());
        
    }
    return true;
    }
    public void reverse(){
        SNode p,q,r;
        p=head;
        q=p.getNext();
        while(q!=head){
            r=q.getNext();
            q.setNext(p);
            p=q;
            q=r;
        }
        q.setNext(p);
        tail=q;
    }
    public void search(int v){
        boolean flag=false;
        SNode temp=head;
        int c=0;
        while(temp.getNext() !=head){
            c++;
            if(v==temp.getData()){
                flag=true;
                break;
            }
            temp=temp.getNext();
        }
        if(flag==true){
            System.out.println("\n"+v+"Foud at Position"+c);
        }
        else if(v==temp.getData()){
            c++;
            System.out.println("\n"+v+"Found at Position"+c);
        }
        else{
            System.out.println("\n"+v+"Not Found");
        }
    }
    public void display(){
        SNode temp=head;
        System.out.println("\n List Elements -");
        while(temp.getNext()!=head){
            System.out.println("\t"+temp.getData());
            temp=temp.getNext();
        }
        System.out.println("\t"+temp.getData()+"\n");
    }
}
