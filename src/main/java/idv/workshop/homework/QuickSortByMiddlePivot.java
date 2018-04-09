package idv.workshop.homework;

// 參考來源: https://yotsuba1022.gitbooks.io/data-structure-note/content/quick-sort.html

public class QuickSortByMiddlePivot {

    public static void sort(int[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int leftBound, int rightBound) {

        int left = leftBound;
        int right = rightBound;

        // 取出中間的元素作為pivot
        int pivot = data[leftBound + (rightBound - leftBound) / 2];

        // 分為左右兩個list
        while (left < right) {

            // 若左半邊當前的值比pivot還要小的話, 就往右邊移動, 直到找出比pivot大的值為止,這個loop會在data[left]跟pivot相等時停止
            while (data[left] < pivot) {
                left++;
            }

            // 若右半邊當前的值比pivot還要大的話, 就往左邊移動, 直到找出比pivot小的值為止,這個loop會在data[right]跟pivot相等時停止
            while (data[right] > pivot) {
                right--;
            }

            /*
            * pivot的左右兩邊都掃完後, 會有兩種情況:
            *  1. left = right
            *     這表示說左邊都比pivot小, 右邊都比pivot大, 那就是排好了, 此時left++, right--這兩個動作也不會對之後的程式有影響, 因為也不會做事了.
            *  2. left < right
            *     這又有三種情況:
            *      a) left < pivot < right: 表示說左半邊找到了比pivot大的值, 右半邊找到了比pivot小的值, 那這時候交換這兩者後再繼續於兩半邊裡找其他可能可以交換的值, 直到左右兩邊的index都跟pivot相等為止
            *      b) left < pivot = right: 表示說左半邊找到了比pivot大的值, 然而右半邊卻找不到比pivot小的值
            *      c) left = pivot < right: 表示說左半邊找不到pivot大的值, 然而右半邊卻找得到比pivot小的值
            *
            * */

            if(left <= right) {
                swap(data, left, right);
                left++;
                right--;
            }
        }

        // 經過上面那個大的while loop後, 此時的left應該要是大於等於right的:
        // leftBound ----- right ----- left ----- rightBound
        // 所以就要繼續遞迴地排序左半邊(leftBound ~ right)跟右半邊(left ~ rightBound), 直到leftBount=right跟left=rightBound才算完全結束.

        if (leftBound < right) {
            quickSort(data, leftBound, right);
        }

        if (left < rightBound) {
            quickSort(data, left, rightBound);
        }
    }

    private static void swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
}
