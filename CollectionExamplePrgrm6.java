package assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionExamplePrgrm6
{
    public static ArrayList<Integer> createArrayList() {
        // Creating an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding numbers from 200 to 500 to the ArrayList
        for (int i = 200; i <= 500; i++) {
            arrayList.add(i);
        }

        return arrayList;
    }

    public static HashSet<Integer> createHashSet() {
        // Creating a HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // Adding numbers from 200 to 500 to the HashSet
        for (int i = 200; i <= 500; i++) {
            hashSet.add(i);
        }

        return hashSet;
    }

    public static TreeSet<Integer> createTreeSet() {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding numbers from 200 to 500 to the TreeSet
        for (int i = 200; i <= 500; i++) {
            treeSet.add(i);
        }

        return treeSet;
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        // Printing the ArrayList
        System.out.println("ArrayList:");
        System.out.println(arrayList);
        System.out.println();
    }

    public static void printHashSet(HashSet<Integer> hashSet) {
        // Printing the HashSet
        System.out.println("HashSet:");
        System.out.println(hashSet);
        System.out.println();
    }

    public static void printTreeSet(TreeSet<Integer> treeSet) {
        // Printing the TreeSet
        System.out.println("TreeSet:");
        System.out.println(treeSet);
    }
    public static void main(String[] args) {
        // Creating an ArrayList, HashSet, and TreeSet
        ArrayList<Integer> arrayList = createArrayList();
        HashSet<Integer> hashSet = createHashSet();
        TreeSet<Integer> treeSet = createTreeSet();

        // Printing the ArrayList, HashSet, and TreeSet
        printArrayList(arrayList);
        printHashSet(hashSet);
        printTreeSet(treeSet);
    }

}
