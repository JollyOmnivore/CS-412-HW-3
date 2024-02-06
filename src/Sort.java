abstract class Sort {

    String name;
    int[] data;

    long startTime;

    long stopTime;


    public String getName() {
        return this.name;
    }


    public boolean isSorted() {
        return true;
    }

    public void sortData() {


    }

    public void setData(int[] clone) {
        this.data = clone;
    }


    void swap(int i, int j) {
        int x = i;
        i = j;
        j = x;
    }

    void startTimer() {
        startTime = System.nanoTime();

    }

    void stopTimer() {
        stopTime = System.nanoTime();

    }

    long getRuntime() {
        long totalTime = stopTime - startTime;
        return totalTime;


    }


}