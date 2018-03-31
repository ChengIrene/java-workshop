package idv.workshop.homework;

/*
* 插入排序(insertion sort) 是從數列的左邊開始,往右依次排序下去
* 過程中,左邊的數一一完成排序,右邊剩下尚未確認的數
* 在右邊上為搜尋的領域中取出一個數,插入已排序完成的領域中的適當位置
*
* 參考: https://yotsuba1022.gitbooks.io/data-structure-note/content/2.1.2-insertion-sort.html
**/

public class InsertionSort {

    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    public static int[] sortDesc(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (input[j - 1] < input[j]) {
                    swap(input, j - 1, j);
                }
            }
        }
        return input;
    }

    public static int[] sortAsc(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (input[j - 1] > input[j]) {
                    swap(input, j - 1, j);
                }
            }
        }
        return input;
    }
}
