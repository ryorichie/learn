class CountingSort {
    public static void main(String[] args) {
        CountingSort ob = new CountingSort();

        char arr[] = {
            'g', 'a', 'w', 'h', 'm', 'q', 'e', 'q', 'r'
        };

        ob.sort(arr);

        System.out.print("Soted character array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void sort(char arr[]) {
        int n = arr.length;

        // array to be outputed
        char output[] = new char[n];

        // Create a count array to store count of invidual character
        int count[] = new int[256];
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }

        // store count of each character
        for (int i = 0; i < n; i++) {
            ++count[arr[i]];
        }

        // Change count[i] so that count[i] now contains actual position of the
        // character in ouput array
        for (int i = 1; i <= 255; i++) {
            count[i] += count[i - 1];
        }

        // Build output character array
        // to make it stable we operating in reverse order
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // copy the output array to arr, so that arr now contain sorted characters
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}