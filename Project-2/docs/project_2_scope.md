# Project Scope – Programming Project 2

## Goal
The goal of this project is to experimentally evaluate the performance of several sorting algorithms by measuring the number of element-to-element comparisons they perform.
The project focuses on comparing algorithm efficiency through data-driven experiments rather than theoretical analysis alone.

---

## Algorithms Included
The following algorithms will be implemented and tested:
- Mergesort
- Quicksort
- Shaker Sort (bidirectional bubble sort)
- Heapsort

---

## Experimental Method
For each algorithm, the program will:

1. Generate all permutations of arrays containing integers from 0 to n - 1.
2. Run the sorting algorithm on each permutation.
3. Count the number of element-to-element comparisons.
4. Record performance metrics.
Experiments will be conducted for:
- n = 4
- n = 6
- n = 8

---

## Data Collected
For each algorithm and value of n, the program will record:
- Best 10 cases (fewest comparisons)
- Worst 10 cases (most comparisons)
- Average number of comparisons
These results will be used in the team report to estimate algorithmic complexity.

---

## Expected Outcome
The collected data will allow the team to:
- Compare algorithm performance
- Identify best and worst case behavior
- Estimate Big-O, Big-Ω, and Big-Θ complexity
- Predict performance for larger inputs (such as n = 12)