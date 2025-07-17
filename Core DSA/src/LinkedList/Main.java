package LinkedList;

// import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();
        
        
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(18);
        // list.insertAtFirst(9);
        list.insertAtFirst(18);
        list.insertAtLast(98);
        list.insertAtLast(7);
        list.insertAtLast(7);
        list.insertAtLast(45);
        list.insert(4, 11);

        // // int x = list.get(2);
        // // System.out.println(x);

        list.insertRec(3, 98);

        list.display();

        list.deleteDuplicates();

        list.display();

        // // System.out.println(list.deleteFirst());

        // // System.out.println(list.deleteLast());

        // System.out.println(list.delete(2));

        // list.display();  
        
        

        // DLL list = new DLL();

        // list.insertAtFirst(45);
        // list.insertAtFirst(3);
        // list.insertAtFirst(18);
        // list.insertAtFirst(9);
        // list.insertAtFirst(7);
        // list.insertAtLast(98);
        // list.insertAtLast(8);
        // list.insertAtLast(9);
        // list.insertAtLast(51);
        // list.insert(5, 45);
        // list.insertAfter(51, 99);
        // list.deleteFirst();
        // list.deleteLast();
        // list.delete(5);
        
        // System.out.println(list.get(4));
        // list.display();
        // list.displayReverse();


        // CLL list = new CLL();
        // list.insertFirst(4);
        // list.insertFirst(7);
        // list.insertFirst(18);
        // list.insertFirst(45);
        // list.insertLast(9);
        // list.insertLast(39);
        // list.insertLast(1);

        // list.display();

        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
        // System.out.println(list.delete(0));

        // System.out.println(list.get(0));

        // list.insertFirst(10);
        // list.insertFirst(20);
        // list.insertFirst(30);
        // list.insertLast(40);
        // list.display();

        // list.insert(2, 25);
        // list.display();

        // list.deleteFirst();
        // list.display();

        // list.deleteLast();
        // list.display();

        // list.delete(1);
        // list.display();

        // list.deleteValue(40);
        // list.display();
    }
}
