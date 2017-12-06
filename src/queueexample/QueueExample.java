/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

/**
 *
 * @author ethornbury
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue();
        
        queue.enqueue("This is number 1");
        queue.enqueue("This is number 2");
        queue.enqueue("This is the slowpoke");
        
        for( String item : queue){
            System.out.println("Im in the queue - " + item);
        }
        
        System.out.println("Peek sees : " + queue.peek());
        
        queue.dequeue();
        
        System.out.println("Peek sees : " + queue.peek());
        
        for( String item : queue){
            System.out.println("Im in the queue - " + item);
        }
        
        System.out.println(queue.size());
        
    }
    
}
