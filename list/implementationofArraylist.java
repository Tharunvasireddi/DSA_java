
import java.util.*;

public class implementationofArraylist {
    

    public static void main(String[]args){
    /*
     An arraylist in java is a dynamic array,a part of the java  collection framework .unlike a traditional array,an arraylist can automatically resize as you add of remove elements making it more flexible .think of it as a resizeable container for object
     */

     // declaration and intialising of arraylist 

    // ArrayList<Type> listname = new ArrayList<>();

    ArrayList<Integer> list = new ArrayList<>();

    // methods of the arraylists
    
    // add() : this method is used to append the elements at end of the list 
    // syntax -->  listname.add(value)

    list.add(100);
    list.add(200);
    System.out.println("array list elements"+ list);

    // add(index ,value) --> inserts the element at the given index number

    // size() --> this method is used to give the size of the arraylist
    System.out.println("size of the array list : "+list.size());
    list.add(1,150);
    System.out.println("array list elements"+ list);

    // remove() : Removes the element at the specified index. This shifts any subsequent elements to the left. It returns the element that was removed. 
    list.remove(list.size()-1);
    System.out.println("list of elements after removing the one element :"+list);

     // clear() --> this method is used to clear the elements in the list 
     list.clear();
     System.out.println("list after using clear method : "+list);

    // get() --> this method is used to get the element form the list by giving the index number
    
    for(int i=0;i<10;i++){
        list.add(i+1);
    }
    list.add(5,70);

    System.out.println("printing the elements using get method");

    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }

    // set() -> this method is used to update the values in the list .it takes the index number and value and change the value according to the index number

    list.set(5,60);
    System.out.println( "list of elements after printing change the values "+list);

     // isEmpty() --> this method is used to know weather the list is empty or not 
      boolean boolvalue =  list.isEmpty();
      System.out.println(" isEmpty or not : "+boolvalue);

    // contains() --> this method is used to know wheather the element is present in the list or not.  Returns true if the list contains the specified object 

    boolean isPresent=list.contains(1000);
    System.out.println("wheather the element is present in the list or not "+ isPresent);

     // indexOf() --> this method is used to know the index of the particular value the in the list.it return the first occurence of the list .

     System.out.println("index of the element in the list : "+list.indexOf(2));
    
     //lastIndexOf(Object o): Returns the index of the last occurrence of the specified object o, or -1 if the list does not contain it.

     System.out.println("lastindex of the element in the list : "+list.lastIndexOf(10));

     // toArray(): Returns an array containing all of the elements in this list in proper sequence
    Integer [] listArray =list.toArray(new Integer[0]);
    System.out.println("list to array elements :"+ Arrays.toString(listArray));


    }
}
