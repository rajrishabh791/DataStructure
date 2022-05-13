package DataStructure;

public class MainMethod {
    public static void main(String args[])
    {
        LinkedList1 linkedList = new LinkedList1();
        linkedList.addLast(56);
        linkedList.addLast(30);
        linkedList.addLast(70);
        linkedList.addFirst(44);
        linkedList.addFirst(22);
        linkedList.addAt(2,99);
        linkedList.show();
        linkedList.deleteFirst(2);
        System.out.println("******");
        linkedList.show();
    }
}
