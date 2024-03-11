package Stack_Queue.Custom_Queue;

public class QueueMain {
    public static void main(String[] args) throws  Exception{
//        CustomQueue csq = new CustomQueue(5);
//
//        csq.push(12);
//        csq.push(4);
//        csq.push(8);
//        csq.push(1);
//        csq.push(99);
//
//        csq.Display();
//
//        System.out.println("Front element" + csq.front());
//        csq.remove();
//        csq.Display();
//
//        System.out.println("Front element" + csq.front());


//        CircularQueue cirq = new CircularQueue(5);
//        cirq.insert(12);
//        cirq.insert(4);
//        cirq.insert(8);
//        cirq.insert(1);
//        cirq.insert(99);
//
//        cirq.display();
//
//        cirq.remove();
//        cirq.display();
//
//        cirq.insert(133);
//        cirq.display();
//

        DynamicQueue dynq = new DynamicQueue(5);
        // no restriction of capacity of element
        dynq.insert(12);
        dynq.insert(1);
        dynq.insert(32);
        dynq.insert(42);
        dynq.insert(62);
        dynq.insert(72);
        dynq.insert(82);

        dynq.display();

        System.out.println(dynq.remove());
        dynq.display();


    }
}
