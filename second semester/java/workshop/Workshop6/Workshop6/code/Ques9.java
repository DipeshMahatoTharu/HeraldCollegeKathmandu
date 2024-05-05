//9.	Consider a scenario where you have two sets, each representing a group of animals. Implement a Java program to perform set operations (Union, Intersection, and Difference) on these sets:
//●	Initialize two HashSet objects: set1 with elements "Dog," "Cat," "Elephant," and "Lion," and set2 with elements "Cat," "Giraffe," "Dog," and "Monkey."
//●	Implement a method performUnion that takes two sets and returns their union.
//●	Implement a method performIntersection that takes two sets and returns their intersection.
//●	Implement a method performDifference that takes two sets and returns the difference of the first set from the second set. 
//●	Print the original sets, the union, intersection, and difference of the sets.


import java.util.HashSet;
import java.util.Set;


public class Ques9 {
    public static void main(String[] args) {
        // Initialize two HashSet objects: set1 and set2

        Set<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        Set<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");

        System.out.println("Original Set 1: " + set1);
        System.out.println("Original Set 2: " + set2);

        Set<String> unionSet = performUnion(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<String> intersectionSet = performIntersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);

        Set<String> differenceSet = performDifference(set1, set2);
        System.out.println("Difference of set1 from set2: " + differenceSet);

    }

    public static Set<String> performUnion(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;

    }

    public static Set<String> performIntersection(Set<String> set1, Set<String> set2) {
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static Set<String> performDifference(Set<String> set1, Set<String> set2) {
        Set<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }
}
	


