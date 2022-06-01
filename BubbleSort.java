package Strings;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;

		int arr[] = { 1, 4, 6, 2, 55, 6, 88, 99, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}
