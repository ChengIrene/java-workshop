package idv.workshop.homework;

/*
 * 氣泡排序法是反覆進行「由右往左,將相鄰的數兩兩相比後重新排列」的操作.
 * 因為數由右往左移動時,很像水中氣泡浮起得樣子,因而得名(亦稱泡沫排序)
 *
 * 參考: https://yotsuba1022.gitbooks.io/data-structure-note/content/2.1.1-bubble-sort.html
 */

public class BubbleSort {

    //封裝交換位置的方法!
    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    // Descending 降冪
    public static int[] sortDesc(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] < input[j + 1]) {
                    swap(input, j, j + 1);
                }
            }
        }
        return input;
    }

    // Ascending 升冪
    public static int[] sortAsc(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 -i; j++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j , j + 1);
                }
            }
        }
        return input;
    }
}
