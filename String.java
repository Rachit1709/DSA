import java.util.*;
public class StackUsingLinkedList {
   // Node inner class to store data and next pointer
   private class Node {
       int data;
       Node link;

       // Node constructor to initialize data and next pointer
       Node(int data) {
           this.data = data;
           this.link = null;
       }
   }

   // top variable to point to the top of the stack
   private Node top;

   // Stack constructor to initialize the top
   public StackUsingLinkedList() {
       this.top = null;
   }

   // Function to check if the stack is empty
   public boolean isEmpty() {
       return top == null;
   }

   // Function to add an element to the stack
   public void push(int x) {
       Node temp = new Node(x); // Create a new node
       temp.link = top; // Set the next pointer of the new node to the top of the stack
       top = temp; // Update the top of the stack to the new node
   }

   // Function to remove an element from the stack
   public int pop() {
       if (!isEmpty()) { // Check if the stack is not empty
           int x = top.data; // Store the top element data
           top = top.link; // Update the top of the stack to the next node
           return x; // Return the removed element data
       } else {
           System.out.println("Stack. Underflow");
           return -1;
       }
   }

   // Function to return the top element without removing it
   public int peek() {
       if (!isEmpty()) { // Check if the stack is not empty
           return top.data; // Return the top element data
       } else {
           System.out.println("Stack. Underflow");
           return -1;
       }
   }

   // Function to display the elements of the stack
   public void display() {
       Node temp = top; // Initialize a temporary variable to the top of the stack
       while (temp != null) { // Iterate through the stack
           System.out.print(temp.data + " "); // Print the data of the current node
           temp = temp.link; // Move the temporary variable to the next node
       }
       System.out.println();
   }

   public static void main(String[] args) {      
       StackUsingLinkedList obj = new StackUsingLinkedList();
       obj.push(11);
       obj.push(22);
       obj.push(33);
       obj.push(44);
       obj.display();
       System.out.printf("\nTop element is %d\n", obj.peek());
       obj.pop();
       obj.display();
       System.out.printf("\nTop element is %d\n", obj.peek());
   }
}
