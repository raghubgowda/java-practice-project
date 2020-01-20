package com.raghu;

class MinimumSwap {

    int getMinimumSwaps(int[] q){
        int len = q.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < len; i++) {
            System.out.println("i: "+i +" value: "+q[i]);
            if(q[i] > i+1){
                swap(q, i, q[i] - 1);
                minSwaps++;
                i--;
                System.out.println(i);
            }
        }
        return minSwaps;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
