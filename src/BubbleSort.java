public class BubbleSort extends Sort{

BubbleSort(){
    this.name = "BubbleSort";
}


public void sortData() {

    int N = data.length;
    boolean swapped;
    startTimer();
    while (swapped == false) {
        for (int i = 0; i < N - 1;i++) {
            if (data[i] > data[i + 1]) {
                swap(data[i], data[i + 1]);
                swapped = true;

            }
        }
    }stopTimer();
}




}
