import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue=new PriorityQueue();
        priorityQueue.add("bills");
        priorityQueue.add("dishes");
        priorityQueue.add("laundary");
        priorityQueue.offer("bills");
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
    }
}
