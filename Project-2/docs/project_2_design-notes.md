# Design Notes – Programming Project 2

## Program Structure

The project will be organized into several main components.

1. **Permutation Generator**

The permutation generator creates every possible ordering of the integers `{0, 1, ..., n-1}`.  
These permutations are used as input arrays for the sorting algorithms so that all algorithms are tested on the same complete set of inputs.

The generator uses a **recursive backtracking approach with element swapping**.

Process:

1. Start with an array `[0, 1, 2, ..., n-1]`.
2. At each recursion level, select one position in the array.
3. Swap the current element with each element that follows it.
4. Recursively generate permutations for the remaining positions.
5. When the recursion reaches the end of the array, the current arrangement is stored as a valid permutation.
6. After each recursive call, the elements are swapped back to restore the original order (backtracking).

This approach ensures that:
- all possible permutations are generated,
- no duplicates are produced,
- each permutation is stored and used for testing the sorting algorithms.

---

2. **Sorting Algorithms**

The following algorithms will be implemented:
- Mergesort
- Quicksort
- Shaker Sort
- Heapsort
Each algorithm must:
- Accept an unsorted array
- Sort the array
- Count element-to-element comparisons
A comparison counter will be maintained during execution.

---

3. **Driver Program**

The driver program coordinates the experiment.
Responsibilities include:
- Generating permutations
- Running each sorting algorithm
- Recording comparison counts
- Tracking best, worst, and average performance

---

4. **Data Collection**

The program will store results including:
- Algorithm name
- Input permutation
- Number of comparisons
After all permutations are tested, summary statistics will be calculated.

---

## Comparison Counting Rule

Only comparisons between elements that determine ordering will be counted.
Examples:
**Valid comparison example:** `a[i] < a[j]`Not counted:
- loop index comparisons
- bounds checking
- control logic comparisons
This ensures all algorithms are measured using the same metric.

---

## Output Format

The program will produce clearly labeled output showing:
- Algorithm name
- Best 10 cases
- Worst 10 cases
- Average comparisons
