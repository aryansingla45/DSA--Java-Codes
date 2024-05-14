package Hashmap;
import java.util.*;
public class ImplementationOfHashMap {

    static class MyHashMap<K , V>{
        public static final int Default_Capacity = 4;
        public static final float Default_Load_Factor = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int numberOfBuckets;             // n --> no of entries in the buckets.
        private LinkedList<Node>[] buckets;
        private void initialBuckets(int x){      // x is the size.
            buckets = new LinkedList[x];         // creating an array of size x;
            for (int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();      // updating each index of array with empty linked list.
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        //Transverses the linked list pass to it and find the given key in it
        //If found then return the index of the key in the linked list.
        //If not then returns -1.
        private int searchInBucket(LinkedList<Node> bucket,K key){
            for (int i = 0; i < bucket.size(); i++) {
                if(bucket.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initialBuckets(Default_Capacity);
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initialBuckets(oldBuckets.length * 2);
            numberOfBuckets = 0;
            for(var bucket: oldBuckets){
                for(var node : bucket ){
                    put(node.key , node.value);
                }
            }
        }
        public int size(){
            return numberOfBuckets;
        }
        public void put(K key , V value){  //Insert / Update
            // let us find a bucket index using a hash function to find the new index in the linked list.
            int bucketIndex = HashFunc(key);
            // let us initialize the current bucket to search for the key if it is present or not.
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int entryIndex = searchInBucket(currentBucket , key);
            if(entryIndex == -1){
                Node node = new Node(key , value);
                currentBucket.add(node);
                numberOfBuckets++;
            }
            else {
                Node currNode = currentBucket.get(entryIndex);
                currNode.value = value;
            }
            if(numberOfBuckets > buckets.length*Default_Load_Factor){
                rehash();
            }
        }
        public V get(K key){
            int bucketIndex = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int entryIndex = searchInBucket(currentBucket , key);
            if(entryIndex != -1){  //Key exists
                Node currNode = currentBucket.get(entryIndex);
                return currNode.value;
            }
            return null;
        }
        public V remove(K key){
            int bucketIndex = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int entryIndex = searchInBucket(currentBucket , key);
            if(entryIndex != -1){
                Node currNode = currentBucket.get(entryIndex);
                V val = currNode.value;
                currentBucket.remove(entryIndex);
                numberOfBuckets--;
                return val;
            } else {
                return null;
            }
        }
        // displaying the bucket array.
        public void display() {
            for (int i = 0; i < buckets.length; i++) {
                System.out.print(i + " --> ");
                LinkedList<Node> currentBucket = buckets[i];
                if (!currentBucket.isEmpty()) {
                    for (Node node : currentBucket) {
                        System.out.print("key(" + node.key + ") --> ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        MyHashMap<Integer , Integer> hm = new MyHashMap<>();
        hm.put(1,3);
        hm.put(2,2);
//        hm.display();
        hm.put(6,5);
//        hm.display();
        hm.put(5,1);
        hm.put(4,2);
//        hm.display();
        System.out.println(hm.size());
    }
}
