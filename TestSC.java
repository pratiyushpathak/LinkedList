public class TestSC {
    public static void main(String[] args) {
        SCLinkedList list=new SCLinkedList();
        // list.insertAtBegening("AAAAdmi");
        // list.insertAtBegening("kitne");
        // list.insertAtLast("the");
        // list.insertAtLast("Sardar");
        // list.insertAtLast("the");
        // list.insertAtPos("2", 5);
        // list.insertAtPos("Londe", 6);
        list.insertAtBegening(2);
        list.insertAtBegening(1);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(7);
        list.insertAtPos(5, 5);
        list.insertAtPos(6, 6);
        list.display();
        list.deleteAtBeg();
        list.search(5);
        list.display();
        list.deleteAtBeg();
        list.display();
        list.deleteAtLast();
        list.deleteAtLast();
        list.display();

        list.deleteAtPos(3);
        list.display();




        
        // list.print();
    }
}
