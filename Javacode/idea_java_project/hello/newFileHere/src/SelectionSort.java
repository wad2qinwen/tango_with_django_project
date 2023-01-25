public class SelectionSort {

    public void doItascend(int[] array){
        for(int i = 1 ; i < array.length; i++){
            int key = array[i];
            for(int j = 0 ; j < i + 1 ; j ++){
                if(key < array[j]){
                    key = array[j];
                    int temp = array[j];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
