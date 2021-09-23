public class ArraySum {
    
    public int sumOfArray(Integer[] list, int index) {
        int sum = 0;
        if (index == 0) sum = list[0];
        if (index > 0) sum = list[index] + sumOfArray(list, index - 1);
        return sum;
    }
}
