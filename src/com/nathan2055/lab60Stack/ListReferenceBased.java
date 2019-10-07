package com.nathan2055.lab60Stack;

public class ListReferenceBased implements ListInterface{
    private Node head;
    private int numItems;
    
    //constructor
    public ListReferenceBased(){
        numItems=0;
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return numItems ==0;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void add(int index, Object item) throws ListIndexOutOfBoundsException {
        if(index>=0 && index<numItems+1){
            if(index == 0){
                //newNode is pointing to the first item in the list
                Node newNode = new Node(item, head);
                //head point to the new node
                head = newNode;
                
            }else{
                Node prev = find(index-1);
                Node newNode = new Node(item, prev.next);
                prev.next = newNode;
            }
            numItems++;
        }else{
            throw new ListIndexOutOfBoundsException("it is out of bound on add:index<0 && index>=numItems");
        }
        
    }

    @Override
    public void remove(int index) throws ListIndexOutOfBoundsException {
        if((index >= 0) && index<numItems){
            if(index == 0){
                head = head.next;
            }else{
            Node prev = find(index-1);
            Node curr = prev.next;
            prev.next = curr.next;
        }
        numItems--;
        
        }else{
            throw new ListIndexOutOfBoundsException("remove problem: index out of bound exception");
        }
    }

    @Override
    public Object get(int index) throws ListIndexOutOfBoundsException {
        if(index>=0 && index<numItems){
            Node curr = find(index);
            Object dataItem = curr.item;
            return dataItem;
        }else{
             throw new ListIndexOutOfBoundsException("it is out of bound on get:index<0 && index>=numItems");
         
        }
    }

    @Override
    public void removeAll() {
        head = null;
        numItems = 0;
    }
    
    private Node find(int index){
        
        Node curr = head;
        for(int skip = 0; skip<index; skip++){
            curr = curr.next;
        }
        return curr;
        
    }
    
    public Node getHead(){
        return head;
    }
}
