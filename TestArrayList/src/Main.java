//External API use , import


import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        //add an object into the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);
        //add element at specific postion
        fruits.add(1,"Cherry");
        System.out.println("_______________");
        System.out.println(fruits);

        //remove an element from the list
        fruits.remove(0);
        System.out.println("_______________");
        System.out.println(fruits);

        //return any element of the list from specific location

        String element = fruits.get(0);

        System.out.println("_______________");
        //System.out.println(element);
        System.out.println(fruits);

        Collections.sort(fruits);
        String minElement = Collections.min(fruits);

        //replace an element at a specific location

        fruits.set(0,"Apple");

        System.out.println("_______________");
        //System.out.println(element);
        System.out.println(fruits);

        //what is the size of the list

        int size = fruits.size();

        //return true if the list is empty
        //to check whether the list is empty

        if(fruits.isEmpty())
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("List is not empty");
        }

        //check whether the list contains a specific element

        boolean isAvailable = fruits.contains("Apple");

        //remove all the elements from a list

        //fruits.clear();

        //Iterate over list
        //manual method

        for(int i =0; i <fruits.size();i++)
        {
            System.out.println(fruits.get(i));
        }

        //method no 2, for each , which is more preffered
        //for readability and usability

        for(String fruit: fruits)
        {
            System.out.println(fruit);


        }
        //Functional programming
        //method no 3

        fruits.stream().forEach(System.out::println);

        //Convert ArrayList into Array

        String arr[] = fruits.toArray(new String[0]);

        //convert an array into arraylist
        String[] myarr = {"A","B","C"};
        //myarr.add("D");
        List<String> list = Arrays.asList(myarr);

        list.add("D");

        //list sort. min, max











    }
}