# CS2430 – Programming Project 2

## Team Members
- Ti Nguyen – Communications Lead  
- Musfer Almansoori – Verification Lead  
- Deysi Oliver - Implementation Lead  

---

## Project Description
This project experimentally evaluates the performance of several sorting algorithms.

The program generates all permutations of integer arrays and runs multiple sorting algorithms on each permutation while counting the number of element-to-element comparisons.

The collected data is used to analyze algorithm efficiency and estimate theoretical complexity.

---

## Algorithms Implemented
The following sorting algorithms are implemented:
- Mergesort
- Quicksort
- Shaker Sort (Bidirectional Bubble Sort)
- Heapsort
Each algorithm:
- sorts an integer array
- counts element-to-element comparisons
- returns the sorted array and comparison count

--- 

## Features
- Permutation generator for arrays {0 ... n-1}
- Comparison counting for all sorting algorithms
- Experimental runs for:
    - n = 4
    - n = 6
    - n = 8
- Summary results including:
    - Best 10 cases
    - Worst 10 cases
    - Average comparisons
- Clearly labeled output for each algorithm

---

## Test Cases
The driver program runs the full experiment.

For each value of n:
1. Generate all permutations.
2. Run each sorting algorithm on every permutation.
3. Record comparison counts.
4. Summarize best, worst, and average cases.

--- 

## How to Run
Run instructions will be added once the implementation and driver program are finalized.

