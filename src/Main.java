public class Main {
    public static void main(String[] args) {
        int[] integerArray = {4, 7, 1, 9, 3, -2, 5};

        // Find largest and smallest numbers
        int[] result = findLargestAndSmallest(integerArray);

        // Display results
        System.out.println("Largest number: " + result[0]);
        System.out.println("Smallest number: " + result[1]);
    }

    public static int[] findLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;  // Return null for both if the array is empty
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        return new int[]{largest, smallest};
    }
}
