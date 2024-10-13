package arraysum;

public class ArraySum {

    // Recursive method to sum the values in the array
    public int sumOfArray(Integer[] a, int index) {
        // Base case: if the index is less than 0, return 0
        if (index < 0) {
            return 0;
        }
        // Recursive case: sum current value with the sum of the rest of the array
        return a[index] + sumOfArray(a, index - 1);
    }
}