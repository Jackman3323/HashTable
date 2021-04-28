/**
 * HashTableDriver.java
 *
 * This program tests all functionality of my HashTable class
 *
 * Date of Creation: 4-26-21
 * Authors: Jack Hughes
 *
 * -JBH
 */
public class HashTableDriver {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        System.out.println("Should say null: " + hashTable.put("key1", "value1"));
        System.out.println("Should say value1: " + hashTable.get("key1"));
    }
}
