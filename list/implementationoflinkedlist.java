

/*
 * A linked list is linear data structure where elements are not stored in contiguous memory locations .instead ,each element called node ,contain two parts : 
 *  1) data
 *  2) a reference(link) to the next node
 */

 /*
  * how it works ?
  node : the basic building block of linked list .A node typically consists of a data field and a next filed ,which is a pointer to the next node .
  head : the firs node of the list .it is the starting point for he raversing the list .
  tail : it is endpoint or the last node of the list it is null point.

  every node in the linked list is store the data of its and refrence of the next node so we have to check the previos node to reach the wanted node 
  */

  /*
  common operaions of the linkedlist 
  insertion : adding a new node is very efficient in the linkedlist .we just need to change the next pointer of the previos node the inserted node and the next pointer of the inserted node is to next of the previous node 

  Deletion : removing node similar to the insertion operaion but we have change the next pointing locaions .

  Access : to find the eleemnt ,we need to traverse the list from the head and and check the every node 
   */

/* IMPLEMENTION OF LINKED LIST  */ 

/*
 * To implement a linked list in Java, we need two main components: a Node class and the main LinkedList class that manages the nodes
 * Node : it is the funemental buliding block of the linkedlist .it the class that hold the data and refrence of the next node
 
 *libkedlist : the linked list class manages the operaions of the list such as adding ,deleting and prining the nodes.it holds single refrence of the head the list 
 */

 class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
}
public class implementationoflinkedlist {
    
}
