package ua.mycompany.sorts;

// sort, revers
//  n-array.length
//  2*n*n-2n+3
// n=100  O(2*n*n-2n+3)=O(2*n*n)= O(n*n)
// O(2)=O(1)
public interface Sort {
    void sort(int[] arr);
}
