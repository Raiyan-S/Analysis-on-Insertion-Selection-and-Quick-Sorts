# Theoretical and Empirical Analysis Study 
# Overview
This project provides an in-depth analysis of three essential sorting algorithms: 
* Insertion Sort 
* Selection Sort
* Quick Sort
  
We delve into their efficiency, performance, and suitability for different input scenarios to understand their strengths and weaknesses better.

## Introduction

* Bubble sort, which repeatedly compares adjacent elements and swaps them
if they are in the wrong order.

* Insertion sort, which repeatedly inserts each new item into its correct
position.

* Selection sort, which repeatedly selects the minimum element from the
unsorted part of the list and move it to the sorted part.

* Merge sort, which divides the input list into two smaller sub-lists, sorts them
recursively and then merges them back together.

* Quick sort, which selects the pivot element from the array and partitions the
other elements into two sub-arrays, depending on if they are less than or
greater than the pivot.

* Heap sort, which builds a binary heap from the input list and repeatedly
extracts the maximum element.

Each algorithm has its own time and time complexity, and it is important to choose
the most appropriate one for the specific use case, taking into account the size of
the data and the desired performance.

## Insertion Sort

Insertion sort is a simple sorting algorithm that builds the sorted list one item at a
time. It works by iterating through the list, comparing each item with the one
before it, and swapping them if they are out of order. This process continues until
the entire list is sorted.

The algorithm begins with the second element of the list and compares it to the
first element. If it is smaller, it is swapped with the first element. The process then
continues with the third element, which is compared to the second element and the
first element. If it is smaller, it is swapped with the second element, if it’s not
smaller then it stops and we choose the next element until the list is complete.

The algorithm is efficient for small lists and lists that are already partially sorted.
Its time complexity is 𝑂(𝑛). in the best case. The average time complexity of
insertion sort is 𝑂(𝑛^2 ). This means that, on average, the algorithm will take n^
steps to sort a list of n items. In the worst-case scenario, it is also 𝑂(𝑛^2 ).

### Example of Insertion Sort


This is an unsorted array of 5. To apply the Insertion sort, we start at the second
element and compare it with the first element. If the second element is smaller than
the first element, then swap and that’s the first iteration. Then we go to the next
element (third element) and compare it with the previous element (second element)
and if it’s smaller we swap, we swap until the element is not smaller compared to
the previous element and repeat till the array is sorted.

### Design and Implementation of Insertion Sort


## Selection Sort

Selection sort is another simple sorting algorithm that repeatedly selects the
minimum element from the unsorted part of the list and moves it to the sorted part
of the list.

The selection algorithm divides the list into two parts: the sorted part at the left end
and the unsorted part at the right end.

The algorithm begins by finding the minimum element in the unsorted part of the
list, then it swaps the smallest element with the first element of the unsorted part.
Then the sorted part shifts so that the smallest element that has been swapped is
now part of the sorted list. The process then continues by finding the minimum
element in the remaining unsorted part of the list and swapping it with the second
element of the unsorted part, and so on.

This continues until the entire list is sorted. The time complexity of the selection sort is
𝑂(𝑛^2 ). in the worst and average case, because for each element in the list, the
algorithm needs to iterate through the remaining unsorted part to find the minimum
element.

The best-case time complexity for selection sort is also 𝑂(𝑛^2 ). This is because the
algorithm always needs to iterate through the remaining unsorted part of the list to
find the minimum element, regardless of the initial ordering of the elements.

Even in the best-case scenario, where the input is already sorted, the algorithm still
needs to make (n-1) comparisons and (n-1) swaps to fully sort the list. Note
that the best-case time complexity of the selection sort is not much better than the
worst-case time complexity, unlike other sorting algorithms. For this reason,
selection sort is considered to be a relatively inefficient sorting algorithm, and it's
not used in practice for large data sets.

### Example of Selection Sort


This is an unsorted array of 9. To apply the Selection sort, we find the smallest
element in the array, which is 13 in this case. It then compares with the previous
element and if it’s bigger it swaps the previous element until we find there’s a
smaller element or it’s at the end of the array. So, (13) has been swapped with (29)
and now it’s considered part of the sorted list, then we apply selection sort again on
the unsorted list till the array is sorted.


### Design and Implementation of Selection Sort

## Quick Sort

Quicksort is a divide-and-conquer algorithm and it’s one of the most frequently
used algorithms in sorting, it starts by partitioning the array into two sub-arrays,
one that contains elements smaller than a chosen pivot element, and one that
contains elements larger than the chosen pivot.

The pivot element can be chosen to be the first or the last element of the array, but
it can also be chosen randomly using the median. Then we partition the array using
two pointers, one starting at the first element and one starting at the last element of
the array.

Elements that are smaller than the pivot should be moved to the left of the pivot,
and elements that are larger than the pivot should be moved to the right of the
pivot. They are moved by swapping the elements and whether the element is to be
swapped is depended on the pivot.

Repeat the quick sort by using recursion on the left partition till it’s sorted, then
repeat the quick sort on the right partition till it’s sorted. Concatenate the left
partition and the right partition to get the fully sorted array. The time complexity of
quicksort depends on how well the pivot element is chosen and how balanced the
partition is. The time complexity for quick sort is 𝑂(𝑛log𝑛) in the best and average
case scenario.

In the worst-case scenario, when the pivot element is always the smallest or largest
element, the algorithm results in one partition being empty and the other partition
having all elements. This leads to 𝑂(𝑛^2 ) time complexity.


### Example of Quick Sort

We choose the last element of the array as the pivot, which is 8. We partition the
array by using two pointers, one starting at the first element of the array and one
starting at the last element.

We iterate through the array. Elements that are smaller than the pivot (8) should be
moved to the left of the pivot, and elements that are larger than the pivot should be
moved to the right of the pivot.

We swap 6 with 20, 1 with 9, and swap the pivot (8) with 12 because the two
pointers have crossed, our array now becomes [6, 2, 1, 7, 8, 15, 9, 20, 12]. We
repeat the process recursively on the left partition [6, 2, 1, 7] and the right partition
[15, 9, 20, 12] The left partition becomes [2, 1, 6, 7] to [1, 2, 6, 7] and the right
partition becomes [9, 12, 15, 20], We concatenate the left partition [1, 2, 6, 7],
pivot 8 and the right partition [9, 12, 15, 20] to get the fully sorted array [1, 2, 6, 7,
8, 9, 12, 15, 20].

Quicksort works by repeatedly partitioning the array into two sub-arrays, one that
contains elements smaller than the pivot, and one that contains elements larger than
the pivot. The pivot element is not included in either the left or the right partition
but is concatenated at the end.


### Design and Implementation of Quick Sort


## Comparison

## Conclusion

The table compares the performance of three popular sorting algorithms: Insertion
Sort, Selection Sort, and Quick Sort, in terms of time complexity. The comparison
of the algorithms is based on their average running time for different input sizes (N
= 100, 1000, 10000, and 100000).

In terms of big O notation, Insertion Sort has a best-case time complexity of 𝑂(𝑛),
average-case time complexity of 𝑂(𝑛^2 ), and worst-case time complexity of 𝑂(𝑛^2 ).

Selection Sort also has a best-case time complexity of 𝑂(𝑛^2 ), average-case time
complexity of 𝑂(𝑛^2 ), and worst-case time complexity of 𝑂(𝑛^2 ).

Quick Sort has a best-case time complexity of 𝑂(𝑛log𝑛), average-case time
complexity of 𝑂(𝑛log𝑛), and worst-case time complexity of 𝑂(𝑛^2 ).

Quick Sort's average-case time complexity is significantly faster than both
Insertion Sort and Selection Sort for large inputs.

The results show that as the size of the input increases, Quick Sort performs better
than both Insertion Sort and Selection Sort, with its average running time being
significantly faster. For example, when N = 100000, Quick Sort's average running
time is only 32904940 nanoseconds, while both Insertion Sort and Selection Sort
have average running times of over 100 million nanoseconds.

On the other hand, for small input sizes, the difference in performance between the
algorithms are not very significant, and in such cases, the choice of the algorithm may
depend on other factors.

In conclusion, Quick Sort is the preferred sorting algorithm for large inputs due to
its fast performance and efficient average-case time complexity of O(n*log(n)).
However, for small inputs, the choice of algorithm may depend on other factors.
