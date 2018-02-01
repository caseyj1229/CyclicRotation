//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class CyclicRotation {
    public static int[] Solution(int[] A, int K){
        //Less than 2 elements or K is 0
        if(A.length <= 1 || K == 0){
            return A;
        }

        //If K is greater than A.length, we can subtract A.length from K to minimize rotations
        while(K > A.length){
            K -= A.length;
        }

        //If K = array size, elements will be rotated back to their initial positions
        if(A.length == K){
            return A;
        }

        //Do the rotation
        //Find the hinge index (first index that will go first in new array
        int hinge = A.length - K;
        int[] temp = new int[A.length];

        for(int i = 0; i < temp.length-hinge; i++){
            temp[i] = A[hinge + i];
        }

        for(int j = 0; j < hinge; j++){
            temp[j+K] = A[j];
        }

        for(int i = 0; i < temp.length; i++){
            A[i] = temp[i];
        }
        return temp;
    }
}
