package gr.aueb.cf.cf9.ch6;

/**
 * οταν κανουμε copy references, τοτε
 * το copy ονομαζεται shallow και εχει
 * side effects.
 */
public class ArraySwallowCopyApp{

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1; //shallow copy

        arr2[0] =  1000;

        System.out.println(arr1[0]);


    }


}
