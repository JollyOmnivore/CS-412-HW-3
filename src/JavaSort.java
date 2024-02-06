import java.util.Arrays;

public class JavaSort extends Sort{
    JavaSort() {
        this.name = "JavaSort";
    }
    public void sortData() {
        startTimer();
        Arrays.stream(data).sorted();
        stopTimer();
    }

}
