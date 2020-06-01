package study.yang.algorithm.sort;

import java.util.Arrays;

public class Select {
        public static void main(String[] args) {

            int arry[] = {49,38,65,97,76,13,27,49};
            // check sort
            isSortTrue(arry);
        }

        static void selectSort(int[] arry){

            for (int i = 0; i < arry.length-1; i++) {
                int min = i;
                for (int j = i+1; j < arry.length; j++) {
                    if (arry[j]<arry[min]){
                        //select max numIndex
                        min = j;
                    }
                }
                //swap
                swap(arry,i,min);
            }
        }


        static void swap(int[] arry,int statr,int end){
            int temp = arry[statr];
            arry[statr] = arry[end];
            arry[end] = temp;
        }

        static void printArry(int[] arry){
            for (int i : arry) {
                System.out.print(i+" ");
            }
        }

        static void isSortTrue(int[] arry){
            int[] getArry = Arrays.copyOf(arry, arry.length);
            selectSort(arry);
            Arrays.sort(getArry);

            boolean isTure = false;
            for (int i = 0; i < arry.length; i++) {
                isTure = arry[i] == getArry[i] ? true:false;
            }
            System.out.println("sort is " + isTure);
        }

}
