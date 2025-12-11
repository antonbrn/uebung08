package p3;

public class P3_main {
	public static void main(String[] args) {
		int[] a = {2, 1, 3};
		int[] b = {3, 6, 2};
		System.out.println(java.util.Arrays.toString(elementwiseMultiply(a, b)));
	}

	public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return new int[0];
		}
		int[] result = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i] * arr2[i];
		}
		return result;
	}
}
