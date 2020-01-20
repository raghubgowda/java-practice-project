package com.raghu;

/**
 * It's New Year's Day and everyone's in line for the Wonderland roller-coaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue.
 * Initial positions increment by 1 from 1 at the front of the line to 'n' at the back.
 * Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line.
 * One person can bribe at most two others. For example, if n = 8 and Person 5 bribes Person 4, the queue will look like this: 1,2,3,5,4,6,7,8.
 */
public class MinimumBribes {

    /**
     * It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.
     *
     * @param q an array of integers
     */
    String getMinimumBribes(int[] q) {
        int len = q.length;
        int bribeCount = 0;
        for (int i = 0; i < len; i++) {
            if (q[i] - (i+1) >  2) {
                return "Too chaotic";
            }
            for (int j = Math.max(0, q[i]-2); j < i; j++) {
                if (q[j] > q[i]) {
                    bribeCount++;
                }
            }
        }
        return "" + bribeCount;
    }
}