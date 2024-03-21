public class Velocity_Solution {
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    static public int solution(int[] A) {
        // The code is written in in Java SE 8
        if (A.length < 3) { // base case
            return -1;
        }
        int preParticleDifference = A[1] - A[0];
        int velocityCount = 0; // captures velocity, default is -1
        int currentParticleValue = 0;

        // time complexity is linear; O(n) plus some constant based on assignment and conditional check
        for (int i = 2; i < A.length; i++) {
            currentParticleValue = A[i] - A[i - 1];
            if (preParticleDifference == currentParticleValue) {
                if (i % 2 == 0) { // if the element is at every 3rd repeated position on zero based indexing
                    velocityCount++;
                    if (i + 1 != A.length) {
                        // initialize again presuming there will be another sequence
                        preParticleDifference = A[i + 1] - A[i];
                    }
                    i++; // step ahead; don't forget to check for array index exception
                }
            } else {
                preParticleDifference = A[i] - A[i - 1];
            }
        }
        int count = velocityCount > 1000000000 ? -1 : velocityCount;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 1, 3, 3, 3, 2, 3, 2, 1}));
    }
}
