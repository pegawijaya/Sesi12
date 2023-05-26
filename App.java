public class App {
    public static int linearSearch(int[] arr, int key) {
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("Waktu Linear Search: " + elapsedTime + " ns");
                return i;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Waktu Linear Search: " + elapsedTime + " ns");
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        long startTime = System.nanoTime();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("Waktu Binary Search: " + elapsedTime + " ns");
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Waktu Binary Search: " + elapsedTime + " ns");
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 23, 45, 78, 90, 57,};
        int key = 9;

        bubbleSort(arr);

        int linearResult = linearSearch(arr, key);
        if (linearResult != -1) {
            System.out.println("Elemen ditemukan (Linear Search) di indeks: " + linearResult);
        } else {
            System.out.println("Elemen tidak ditemukan (Linear Search)");
        }

        int binaryResult = binarySearch(arr, key);
        if (binaryResult != -1) {
            System.out.println("Elemen ditemukan (Binary Search) di indeks: " + binaryResult);
        } else {
            System.out.println("Elemen tidak ditemukan (Binary Search)");
        }
    }
}