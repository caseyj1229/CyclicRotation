import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {
    @Test
    void solution() {
        int[] A = {3,8,9,7,6};
        int K = 3;

        int[] B = {9,7,6,3,8};
        assertArrayEquals(B,CyclicRotation.Solution(A,K));

        int[] C = {0};

        assertArrayEquals(C,CyclicRotation.Solution(C,K));

        int[] D = {1,2,3,4,5};
        K = 5;

        assertArrayEquals(D,CyclicRotation.Solution(D,K));

        int[] E = new int[10000];
        int[] F = new int[10000];
        K=10;

        for(int i = 0; i < E.length; i++){
            E[i] = i;
        }

        for(int j = K; j < F.length; j++){
            F[j] = j-K;
        }
        for(int j = 0; j < K; j++){
            F[j] = F.length-K+j;
        }

        assertArrayEquals(F,CyclicRotation.Solution(E,K));
    }
}