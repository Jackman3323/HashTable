import java.util.ArrayList;

/**
 * 4-20-21
 *
 * This is an implementation of the common HashTable datastructures.
 *
 * Authors: Jack Hughes, Jack Greco, Henry Johnson
 * -JBH
 *
 */
public class HashTable {
    //INSTANCE-DATA
    int size;
    ArrayList<String> values;

    //CONSTRUCTOR
    public HashTable(){
        values = new ArrayList<String>();
        size = 0;
    }
    //HELPER METHODS
    private int hash(String key){
        StringBuilder hashOutput = new StringBuilder();
        for(int i = 0; i < key.length(); i++){
            hashOutput.append((int)key.charAt(i));
        }
        System.out.println(Integer.parseInt(hashOutput.toString()));
        return Integer.parseInt(hashOutput.toString()); //Return int-sequence of all chars as an index
    }
    //MAIN METHODS
    public void clear(){
        values.clear();
        size = 0;
    }
    public HashTable clone(){
        return this;
    }

    public boolean contains(String value){
        return values.contains(value);
    }
    //Return current value at inputted key--null if no current value
    public String get(String key){
        int index = this.hash(key);
        if(!values.get(index).equals("")){
            //Something already here
            return values.get(index);
        }
        else return null;
    }
    //Insert a value based off of a key--return the current value associated with said key if there is such a value
    public String put(String key, String value){
        int index = this.hash(key);
        String toReturn = null;
        if(!values.get(index).equals("")){
            //Something already here
            toReturn = values.get(index);
        }
        else{
            size++;
        }
        values.add(index,value);
        return toReturn;
    }
    //Remove a value from the Hashtable based on a key and return said value (null if there is no value at this key)
    public String remove(String key){
        int index = this.hash(key);
        String toReturn = null;
        if(!values.get(index).equals("")){
            //Something already here
            toReturn = values.get(index);
            size--;
        }
        values.set(index,"");
        return toReturn;
    }
    public int size(){
        return this.size;
    }
}
