
public class Main {

	public static void main(String[] args) {
		int[] arr = { -1000, -250, -0, 300, 450, 900 };
		System.out.println(binarySearch(arr, 450));
		System.out.println(binarySearch(arr, -1000));
		System.out.println(binarySearch(arr, 355));
	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
