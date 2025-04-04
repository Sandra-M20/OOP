import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
       
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(5);
        priorityQueue.add(30);

       
        System.out.println("Priority Queue: " + priorityQueue);

      
        System.out.println("Size of the queue: " + priorityQueue.size());

        
        int element = 15;
        System.out.println("Does the queue contain " + element + "? " + priorityQueue.contains(element));

       
        System.out.println("Poll operation: " + priorityQueue.poll());
        System.out.println("Priority Queue after poll: " + priorityQueue);

      
        System.out.println("Size of the queue after poll: " + priorityQueue.size());

        
        System.out.println("Peek operation: " + priorityQueue.peek()); 

      
        System.out.println("Is the queue empty? " + priorityQueue.isEmpty());
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removing: " + priorityQueue.poll());
        }

        System.out.println("Priority Queue after removing all elements: " + priorityQueue);
        System.out.println("Size of the queue after all elements are removed: " + priorityQueue.size());
    }
}

      
