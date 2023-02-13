package LRUCache;

import java.util.HashMap;

public class LRUCacheWithGenerics<K,V> {
    int capacity;
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<K,Node<K,V>> map=new HashMap<>();

    LRUCacheWithGenerics(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    class Node<K,V>
    {
        K key;
        V value;
        Node prev;
        Node next;
        Node(K key, V value)
        {
            this.key=key;
            this.value=value;
        }
    }

    public V get(K key)
    {
        if(!map.containsKey(key))
        {
            return null;
        }
        else {
            Node<K,V> node=map.get(key);
            delete(node);
            insert(key,node.value);
            return node.value;
        }
    }
    public void put(K key,V value)
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

    private void delete(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        map.remove(node.key);
    }
    private void insert(K key,V value){
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
        LRUCacheWithGenerics<Integer,String> lruCache=new LRUCacheWithGenerics(3);
        lruCache.put(1,"Sakshi");
        lruCache.put(2,"Gupta");
        lruCache.put(3,"Mittal");
        System.out.println(lruCache.get(2));
        lruCache.put(4,"Garg");
        lruCache.put(4,"Brahma");
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(4));
        lruCache.put(5,"Mittal");
        System.out.println(lruCache.get(5));
    }


}
