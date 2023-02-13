package LRUCache;

import java.util.HashMap;

public class LRUCache {
    int capacity;
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<Integer,Node> map=new HashMap<>();

    LRUCache(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    class Node
    {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value)
        {
            this.key=key;
            this.value=value;
        }
    }

    public int get(int key)
    {
        if(!map.containsKey(key))
        {
            return -1;
        }
        else {
            Node node=map.get(key);
            delete(node);
            insert(key,node.value);
            return node.value;
        }
    }
    public void put(int key,int value)
    {
        if(map.containsKey(key))
        {
            delete(map.get(key));
        }
        else if (map.size() == capacity) {
                delete(tail.prev);
        }
        insert(key,value);

    }

    public void delete(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        map.remove(node.key);

    }
    public void insert(int key,int value){
        Node newNode=new Node(key,value);
        Node nextNode=head.next;
        head.next=newNode;
        newNode.prev=head;
        newNode.next=nextNode;
        nextNode.prev=newNode;
        map.put(key,newNode);
    }

    public static void main(String s[])
    {
        LRUCache lruCache=new LRUCache(3);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        System.out.println(lruCache.get(2));
        lruCache.put(4,40);
        lruCache.put(4,50);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(4));
        lruCache.put(5,10);
        System.out.println(lruCache.get(5));
    }


}
