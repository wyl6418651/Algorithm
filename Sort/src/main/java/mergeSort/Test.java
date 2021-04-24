package mergeSort;

public class Test {

    public static void main(String[] args) {
        int[] a = {2};
        int[] b = {1};
        int[] merge = MergeOne.twoArrayMerge(a, b);
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
