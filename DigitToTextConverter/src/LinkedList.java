/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alfian
 */
public class LinkedList 
{
    
    private Node head;
    
    public LinkedList() 
    {
        this.head = null;
    }

    public boolean isEmpty() 
    {
        return head == null;
    }
    
    public Node getFirst() 
    {
        return head;
    }
    
    public void insertFirst(int value, int index) 
    {
        Node newNode = new Node(value, index);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertLast(int value, int index) 
    {
        Node newNode = new Node(value, index);
        if (isEmpty()) 
        {
            head = newNode;
        }
        else 
        {
            Node current = head;
            while (current.next != null) 
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public boolean insertAfter(int key, int newValue, int newIndex) 
    {
        Node current = head;
        while (current != null && current.value != key) 
        {
            current = current.next;
        }
        if (current == null) 
        {
            return false;
        }
        Node newNode = new Node(newValue, newIndex);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }
    
    public void displayList() 
    {
        System.out.print("List: ");
        Node current = head;
        while (current != null) 
        {
            System.out.print("[" + current.value + "|idx:" + current.index + "] -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
