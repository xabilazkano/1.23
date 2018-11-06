import java.util.ArrayList;
import java.util.ListIterator;
 
public class List {
 
  public static void main(String[] args) {

    ArrayList<String> arrayList = new ArrayList<String>(); //we create an arraylist of type string
    arrayList.add("element_1"); //we add five elements to the list
    arrayList.add("element_2");
    arrayList.add("element_3");
    arrayList.add("element_4");
    arrayList.add("element_5");
  
    ListIterator it = arrayList.listIterator();//we create an iterator which is used to iterate elements one-by-one from a List implemented object. 
  
    while(it.hasNext()) //if the list has more elements the iterator will go one by one and print them until the last one.
         System.out.println(it.next());
  
    //we have the iterator in the last position
    while(it.hasPrevious()) //if the list has more elements the iterator will go one by one and print them until the first one.
         System.out.println(it.previous());

    //we have the iterator in the first position
    //using next and previous methods we move the cursor, using nextIndex and previousIndex no
    System.out.println("Previous Index is : " + it.previousIndex());   //as we are in index 0 the previous one is -1
    System.out.println("Next Index is : " + it.nextIndex()); //the index of the next element is 0

    System.out.println("Next element is : " + it.next()); //we move to the next element, in this case element_1
    
    System.out.println("Previous Index is : " + it.previousIndex());  //as we have moved the cursor the index of the previous element is 0
    System.out.println("Next Index is : " + it.nextIndex()); //the index of the next element is 1

    it.add("element_6"); //we are positioned in the first element so this line will add element_6 after the first one

    for(int i = 0; i < arrayList.size(); i++) //we print all the elements without moving the iterator
          System.out.println(arrayList.get(i));

    System.out.println("Next element is : " + it.next()); //as we haven't move the iterator the next element is element_2 (we were in element_6)

    it.remove(); //we decide to remove it

    for(int i = 0; i < arrayList.size(); i++) //printing all the list we can see that element_2 has been deleted
            System.out.println(arrayList.get(i));

    System.out.println("Next element is : " + it.next()); //as element_2 has been removed the next one is element_3
    
    it.set("element_7"); //using set we replace the last element returned by next or previous

    for(int i = 0; i < arrayList.size(); i++) //we can see that element_3 has been replaced by element_7
           System.out.println(arrayList.get(i)); 

  }
}