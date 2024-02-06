class InsertionSort extends Sort {

    InsertionSort() {
        this.name = "InsertionSort";
    }

    public void sortData() {


        int N = data.length;
        startTimer();
        for (int i = 1; i < N; i++) {
            int val = data[i];
            int loc = i - 1;
            while (loc >= 0 && data[loc] > val) {
                data[loc + 1] = data[loc];
                loc -= 1;
                data[loc + 1] = val;
            }
        }
        stopTimer();

    }
}
