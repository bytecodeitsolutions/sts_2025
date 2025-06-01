package demo;

public class BinarySearch {

	public static void main(String[] args) {
		int[] sortedArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		int result = binarySearch(sortedArray, 80);
		if (result == -1) {
			System.out.println("Element Not Found in Given Array");
		} else {
			System.out.println("Element found at index=" + result);
		}
	}

	public static int binarySearch(int[] items, int target) {
		int start = 0;
		int end = items.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (items[mid] == target) {
				return mid;
			} else if (items[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
