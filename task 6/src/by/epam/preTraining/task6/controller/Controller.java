package by.epam.preTraining.task6.controller;

import by.epam.preTraining.task6.model.datastructure.*;
import by.epam.preTraining.task6.model.datastructure.exception.*;
import by.epam.preTraining.task6.model.datastructure.exception.IllegalArgumentException;
import by.epam.preTraining.task6.view.View;

import java.util.Random;

import static by.epam.preTraining.task6.model.palindrome.Palindrome.checkPalindrome;

public class Controller {
    public static void main(String[] args) {
        try{
            testPalindrome();
        } catch (DataStructureIndexOutOfBoundsException | EmptyCollectionException e) {
            View.print(e.getMessage());
        }
        testStacks();
        testQueues();
    }

    private static void testPalindrome() throws DataStructureIndexOutOfBoundsException, EmptyCollectionException {
        String s = "Racecar";
        View.print(s + " is a palindrome: " + checkPalindrome(s));
        s = "Test";
        View.print(s + " is a palindrome: " + checkPalindrome(s));
    }

    private static void testStack(Stack s) {
        try {
            for (int i = 0; i < 10; i++) {
                s.push(i);
            }
            View.print("Stack: " + s);
            Random rand = new Random();
            s.push(rand.nextInt(100));
            View.print("Stack: " + s);
            View.print("Popped element: " + s.pop());
            View.print("Stack: " + s);
        } catch (DataStructureIndexOutOfBoundsException | EmptyCollectionException e) {
            View.print(e.getMessage());
        }
    }

    private static void testStacks(){

        StackArray stackArrayFixed = new StackArray();
        StackArray stackArrayDynamic = new StackArray();
        StackList stackListFixed = new StackList();
        StackList stackListDynamic = new StackList();
        try {
            stackArrayFixed.setCapacity(10);
            stackListFixed.setCapacity(10);
        } catch (CastDynamicToFixedCollectionException | ChangeFixedCapacityException | IllegalArgumentException e) {
            View.print(e.getMessage());
        }
        View.print("----------FIXED-SIZE ARRAY STACK:");
        testStack(stackArrayFixed);
        View.print("----------DYNAMIC ARRAY STACK:");
        testStack(stackArrayDynamic);
        View.print("----------FIXED-SIZE LIST STACK:");
        testStack(stackListFixed);
        View.print("----------DYNAMIC LIST STACK:");
        testStack(stackListDynamic);
    }

    private static void testQueue(Queue q) {
        try {
            for (int i = 0; i < 10; i++) {
                q.enqueue(i);
            }
            View.print("Queue: " + q);
            Random rand = new Random();
            q.enqueue(rand.nextInt(100));
            View.print("Queue: " + q);
            View.print("Popped element: " + q.dequeue());
            View.print("Queue: " + q);
        } catch (DataStructureIndexOutOfBoundsException | EmptyCollectionException e) {
            View.print(e.getMessage());
        }
    }

    private static void testQueues(){
        QueueArray queueArrayFixed = new QueueArray();
        QueueArray queueArrayDynamic = new QueueArray();
        QueueList queueListFixed = new QueueList();
        QueueList queueListDynamic = new QueueList();
        try {
            queueArrayFixed.setCapacity(10);
            queueListFixed.setCapacity(10);
        } catch (CastDynamicToFixedCollectionException | ChangeFixedCapacityException | IllegalArgumentException e) {
            View.print(e.getMessage());
        }
        View.print("----------FIXED-SIZE ARRAY QUEUE:");
        testQueue(queueArrayFixed);
        View.print("----------DYNAMIC ARRAY QUEUE:");
        testQueue(queueArrayDynamic);
        View.print("----------FIXED-SIZE LIST QUEUE:");
        testQueue(queueListFixed);
        View.print("----------DYNAMIC LIST QUEUE:");
        testQueue(queueListDynamic);
    }
}
