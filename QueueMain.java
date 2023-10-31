public class QueueMain {
    public static void main(String[] args) throws Exception {
        // QueueCustom queue = new QueueCustom(5);
        // queue.insert(10);
        // queue.insert(20);
        // queue.insert(30);
        // queue.insert(40);
        // queue.insert(50);

        QueueCircular queue = new QueueCircular(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        
        queue.display();
    }
}
