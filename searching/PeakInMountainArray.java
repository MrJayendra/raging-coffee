package searching;

public final class PeakInMountainArray {
    public static void main(String[] args) {
        
    }
    
    private int peakIndexInMountainArray(int[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        int midPointer;
        
        while (leftPointer != rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (arr[midPointer] > arr[midPointer + 1]) rightPointer = midPointer;
            else leftPointer = midPointer + 1;
        }

        return rightPointer;
    }
}
