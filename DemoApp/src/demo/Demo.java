package demo;

public class Demo {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int target = 30;

		int result = binarySearch(a, target);
		if (result == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element found at index ::" + result);
		}
	}

	static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length-1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
