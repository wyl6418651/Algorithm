package mergeSort;

public class MergeOne {

    /**
     * 二路归并
     * @param randomIntArray
     */
    public static void twoWaysMerge (int[] randomIntArray) {
        int length = randomIntArray.length;
        int[] tmpArray = new int[length];

    }

    /**
     * 两个有序数组merge并排序
     * @param oneArray
     * @param anotherArray
     */
    public static int[] twoArrayMerge (int[] oneArray, int[] anotherArray) {
        int oneArrayLength = oneArray.length;
        int anotherArrayLength = anotherArray.length;
        int mergeArrayLength = oneArrayLength + anotherArrayLength;
        //创建合并
        int[] mergeArray = new int[mergeArrayLength];
        int oneArrayPoint = 0;
        int anotherArrayPoint = 0;
        int mergeArrayPoint = 0;
        while ((oneArrayPoint < oneArrayLength ) && (anotherArrayPoint < anotherArrayLength )) {
            if (oneArray[oneArrayPoint] < anotherArray[anotherArrayPoint]) {
                mergeArray[mergeArrayPoint] = oneArray[oneArrayPoint];
                oneArrayPoint ++;
                mergeArrayPoint ++;
            }else{
                mergeArray[mergeArrayPoint] = anotherArray[anotherArrayPoint];
                anotherArrayPoint ++;
                mergeArrayPoint ++;
            }
        }
        //数组剩余部分全部复制到merge数组
        oneArrayPoint --;
        anotherArrayPoint --;
        mergeArrayPoint --;
        if (oneArrayPoint < oneArrayLength -1) {
            for (int i = oneArrayPoint; i < oneArrayLength - 1; i++) {
                mergeArray[++mergeArrayPoint] = oneArray[++oneArrayPoint];
            }
        } else if (anotherArrayPoint < anotherArrayLength -1) {
            for (int i = anotherArrayPoint;i < anotherArrayLength - 1; i++) {
                mergeArray[++mergeArrayPoint] = anotherArray[++anotherArrayPoint];
            }
        }
        return mergeArray;
    }
}
