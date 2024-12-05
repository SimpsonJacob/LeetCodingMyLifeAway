// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        RemoveElement removeElement = new RemoveElement();
        int[] removeElementNums = {0,1,2,2,3,0,4,2};
        removeElement.removeElement(removeElementNums, 2);

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] mergeNums = {1,2,3,0,0,0};
        int[] mergeNums2 = {2,5,6};
        int m = 3;
        int n = 3;
        mergeSortedArray.merge(mergeNums, m,mergeNums2,n);
    }
}