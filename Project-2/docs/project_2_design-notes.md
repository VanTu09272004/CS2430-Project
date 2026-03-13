# Design Notes – Programming Project 2

## Program Structure

The project will be organized into several main components.

1. **Permutation Generator**

Responsible for generating all permutations of the array `{0, 1, ..., n-1}`.
These permutations are used as the input data for each sorting algorithm so that all algorithms are tested on the same complete set of arrays.

The generator begins with the sorted array and produces each new permutation until all possible orderings have been generated. This ensures that:
- every possible input arrangement is tested,
- no duplicate permutations are produced,
- the experiment is fair across all sorting algorithms.

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
