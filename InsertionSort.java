package Strings;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 6, 2, 55, 6, 88, 99, 0 };

		for (int i = 0; i < arr.length; i++) {

			int min = arr[i];
			int loc = i;

			for (int j = i + 1; j < arr.length; j++)

				if (arr[j] < min) {
					min = arr[j];
					loc = j;
				}
			int temp = arr[i];
			arr[i] = arr[loc];
			arr[loc] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
