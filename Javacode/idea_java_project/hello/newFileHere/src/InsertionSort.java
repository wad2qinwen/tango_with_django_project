public class InsertionSort {

    public void doItascend(int[] inputArray){
        int l = inputArray.length;
        for(int i = 1; i < l ; i++){
            int key = inputArray[i];
            int j = i -1;
            while(j >= 0 && inputArray[j] > key){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = key;
        }
    }

    public void doItdescend(int[] inputArray){
        int l = inputArray.length;
        for(int i = 1; i < l ; i++){
            int key = inputArray[i];
            int j = i -1;
            while(j >= 0 && inputArray[j] < key){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = key;
        }
    }
}
