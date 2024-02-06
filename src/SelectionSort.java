public class SelectionSort extends Sort {


    SelectionSort(){
        this.name = "SelectionSort";
    }


public void sortData() {
    /*

    selectionSort(data):
    */

    int N = data.length;
    startTimer();
    for(int i = 0; i < N-1; i++){
        int index = i;
        for( int j = i + 1; j < N; j++) {
            if(data[j] < data[index]){

            index = j;
            }

        }
        if(index != i) {
            swap(data[i], data[index]);
        }
    }stopTimer();

}
}