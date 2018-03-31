package idv.workshop.homework;

/*
* 合併排序(merge sort) 是將想要排序的數列分割成幾乎等長的兩個數列,
* 直到無法在分割(每個群只剩下一個數)時,再整合(合併)各組數列
* 合併時是將已排序完成的兩個數列整合成一個排序完成的數列,
* 反覆進行同樣的操作,直到全部的數形成一個數列
*
* 思想: 採用Divide and Conquer的做法, 將資料序列分成兩個子序列, 排序每一半, 然後再把排序好的兩個子序列合併成為一個有序的序列.
* 效率: Merge Sort的時間複雜度是O(nlogn), 主要是複製(因為此演算法通常都不是in-place sorting)跟比較會花比較多時間
*
* 參考:https://yotsuba1022.gitbooks.io/data-structure-note/content/mergesort.html
* */

public class MergeSort {  //已測試完,不過遞迴的部分還不太了解如何運作

    public void mergeSort(int[] data) {
        int[] temp = new int[data.length];
        doMergeSort(data, temp, 0, data.length - 1);
    }

    private void doMergeSort(int[] data, int[] temp, int from, int to) {

        if(from >= to) {
            return;
        }

        //Step1. Calculate the bound index  計算範圍索引
        int mid = (from + to)  >> 1;  //換算成二進制數往右移一位數 = 除以二 所以得到中間值mid

        //Step2. Sort the left part  排序左邊的部分
        doMergeSort(data, temp, from, mid);  //這邊使用遞迴,覺得混亂

        //Step3. Sort the right part  排序右邊的部分
        doMergeSort(data, temp, mid + 1, to);  //mid為左邊部分的最後一個索引,所以mid+1為右邊部分的第一個索引

        //Step4. Merge the two parts 合併兩部分
        merge(data, temp, from, mid + 1, to);
    }

    private void merge(int[] data, int[] temp, int from, int mid, int to) {

        //The index for merged data in temp array  暫存陣列的索引
        int count = 0;

        //The min index of the left part  左邊部分最小索引
        int minLeft = from;

        //The max index of the left part  左邊部分最大索引
        int maxLeft = mid - 1;  //因為傳進去的值為mid+1,所以-1才會再得到原本的中間值(?)

        //Step1. Get values from part and compare with the right part
        while (from <= maxLeft && mid <= to) {
            if (data[from] < data[mid]) {

                //If left < right, add the left value into temp
                temp[count++] = data[from++];

            } else {

                //If left > right, add the right value into temp
                temp[count++] = data[mid++];
            }
        }

        //Step2. Handle the remaining part:  處理剩下的部分

        //2.1 For the left part
        while (from <= maxLeft) {
            temp[count++] = data[from++];
        }

        //2.2 For the right part
        while (mid <= to) {
            temp[count++] = data[mid++];
        }

        //Step3. Copy the final result from temp array into data array
        for (int i = 0; i < (to - minLeft + 1); i++) {
            data[minLeft + i] = temp[i];
        }
    }
}
