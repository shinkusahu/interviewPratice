package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
public class QueueSimulator {
    public static void main(String args[] ) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Your Service  = new  Your  Service
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        String instruction = null;
        while(  (instruction = bufferedReader.readLine()) != null ){

            if ( instruction != null ){

                String[] tokens = instruction.split("=");

                if( tokens != null &&
                        "dequeue".equalsIgnoreCase(tokens[0])){
                    //Invoke dequeue of your service
                    queue.dequeue();

                }else if(tokens != null &&
                        "enqueue".equalsIgnoreCase(tokens[0]) ){

                    String enqueueInput = tokens[1];
                    String[] enqueueElements = enqueueInput.split(",");
                    for (int j = 0; j < enqueueElements.length; j++) {

                        //Invoke Enqueue of your service
                        enQueue(q,enqueueElements[j]);


                    }
                }
            }
        }

    }
    static class Queue {
        Stack<String> stack1;
        Stack<String> stack2;
    }

    /* Function to push an item to stack*/
     static void push(Stack<String> top_ref, String new_data)
    {
        // Push the data onto the stack
        top_ref.push(new_data);
    }

    /* Function to pop an item from stack*/
     String pop(Stack<String> top_ref)
    {
        /*If stack is empty then error */
        if (top_ref.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }

        // pop the data from the stack
        return top_ref.pop();
    }

    // Function to enqueue an item to the queue
     static void enQueue(Queue q, String x)
    {
        push(q.stack1, x);
    }

    /* Function to deQueue an item from queue */
    String deQueue(Queue q)
    {
        String x;

        /* If both stacks are empty then error */
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
 
        /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        x = pop(q.stack2);
        return x;
    }



}