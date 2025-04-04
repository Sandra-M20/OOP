  import java.util.*;  

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<String> names= new ArrayList<>();
        
        
        names.add("Aairah");
        names.add("Maryam");
        names.add("Ezza");
        names.add("Amrin");
        names.add("Eva");
        names.add("Mehak");
        names.add("Aima");
         System.out.println("ArrayList after adding elements: " + names );
        
        
        String firstName = names.get(0); //accessing
        System.out.println("First Name: " + firstName);

        Collections.sort(names);
        System.out.println("ArrayList after sorting: " + names);//sorting
        
        names.set(1, "Aliet"); 
        System.out.println("ArrayList after updating: " + names);//updating
        
        names.remove("Amrin");  
        System.out.println("ArrayList after removing 'Amrin': " + names);//removing
        
        
        boolean containsNyza =names.contains("Nyza");
        System.out.println("Does the list contain Nyza? " + containsNyza);//contains function

       
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);//size
        
       
        System.out.println("Iterating over the ArrayList:");//iterating over
        Iterator itr=names.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }
       
       names.clear();//clearing
        System.out.println("ArrayList after clearing all elements: " + names);
    }
}
