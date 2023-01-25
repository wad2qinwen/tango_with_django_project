

public class TestSortAlgorithms {
    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();
        int[] array1 ={114514, 12, 320, 114, 520};
        insertionSort.doItascend(array1);
        //print out all elements of array
        for(int element : array1){
            System.out.println(element);
        }

        insertionSort.doItdescend(array1);
        //print out all elements of array
        for(int element : array1){
            System.out.println(element);
        }

        SelectionSort selectionsort = new SelectionSort();
        selectionsort.doItascend(array1);
        for(int element : array1){
            System.out.println(element);
        }

    }
}