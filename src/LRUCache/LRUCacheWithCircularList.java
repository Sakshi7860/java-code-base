package LRUCache;

import java.util.HashMap;
//Not completed code
public class LRUCacheWithCircularList {
    int capacity;
    HashMap<Integer,Node> map=new HashMap<>();

    Node head;

    LRUCacheWithCircularList(int capacity){

        this.capacity=capacity;

    }
    class Node
    {
        int key;
        String value;

        Node next;
        Node prev;

        Node(int key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }

    public String get(int key)
    {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            delete(node);
            insert(key,node.value);
            return node.value;
        }
        return null;

    }
    public void put(int key,String value)
    {
       if(map.containsKey(key))
       {
           delete(map.get(key));
       }
       else if(map.size()==capacity){
           delete(head.prev);
       }
       insert(key,value);
    }

    private void delete(Node node)
    {
       node.prev.next=node.next;
       node.next.prev=node.prev;
       map.remove(node.key);
    }
    private void insert(int key, String value){
       Node node=new Node(key,value);
       if(head==null) {
           head=node;
           head.next=head;
           head.prev=head;
       }
       else {
           node.next=head;
           node.prev=head.prev;
           head.prev.next=node;
           head.prev=node;
           head=node;

       }

       map.put(key,node);
    }

    public static void main(String s[])
    {
        LRUCacheWithCircularList lruCache=new LRUCacheWithCircularList(3);
        lruCache.put(1,"Sakshi");
        lruCache.put(2,"Gupta");
        lruCache.put(3,"Mittal");
        System.out.println(lruCache.get(2));
        lruCache.put(4,"Mittal");
        System.out.println(lruCache.get(1));
        lruCache.put(4,"Sarbjot");
        System.out.println(lruCache.get(4));
    }
}
