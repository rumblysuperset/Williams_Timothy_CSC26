package java_discussion_week3;
import java.util.ArrayList;

public class Difference_Arrays_ArrayLists 
{
    public static void main(String[] args) 
    {
        
        // ----------- Using an Array -----------
        System.out.println("Array Example:");
        String[] fruitsArray = new String[3]; // Fixed size
        fruitsArray[0] = "Grapes";
        fruitsArray[1] = "Pineapple";
        fruitsArray[2] = "Guava";

        for (int i = 0; i < fruitsArray.length; i++) 
        {
            System.out.println("Array " + i + ": " + fruitsArray[i]);
        }

        // fruitsArray[3] = "Mango"; // ❌ Error: ArrayIndexOutOfBoundsException


        // ----------- Using an ArrayList -----------
        System.out.println("\nArrayList Example:");
        ArrayList<String> fruitsList = new ArrayList<>(); // Dynamic size
        fruitsList.add("Grapes");
        fruitsList.add("Pineapple");
        fruitsList.add("Guava");
        fruitsList.add("Mango"); // Works fine

        for (int i = 0; i < fruitsList.size(); i++) 
        {
            System.out.println("Array " + i + ": " + fruitsList.get(i));
        }
    }
}