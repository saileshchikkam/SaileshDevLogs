# Day 9 Logs

## Topics Covered
- First and Last Occurrence in Sorted Array
- Number of Occurrences in Array
- Binary Search on Duplicates
- Lower Bound & Upper Bound Logic
- Optimized Binary Search Approaches

## Files Included
1. `FindFirstandLast_sortedArray.java`
   - Solved First and Last Occurrence problem
   - Explored multiple approaches:
     - Separate Binary Searches
     - Lower Bound + Upper Bound
     - Single optimized reusable method
   - Implemented boolean-based Binary Search logic

2. `no_of_occurence_inarray.java`
   - Calculated total occurrences of an element
   - Used:
     `(last - first) + 1`
   - Handled edge cases when target is absent

## Key Learnings
- Difference between Lower Bound and Upper Bound
- Relationship between First/Last Occurrence and Bounds
- Reusing one Binary Search method for multiple problems
- Handling duplicate elements efficiently
- Understanding Binary Search conditions deeply

## Interesting Observations
- `Lower Bound = First Occurrence`
- `Upper Bound = Last Occurrence + 1`
- Small condition changes completely alter Binary Search behavior
- Many LeetCode problems are interconnected internally

## Time Complexity
- Binary Search:
  O(log₂ n)

## Challenges Faced
- Understanding the logic behind Lower Bound & Upper Bound
- Combining both concepts together
- Optimizing solution using one reusable method
- Handling edge cases correctly

## Progress
Day 9 strengthened my understanding of advanced Binary Search patterns and helped me connect multiple LeetCode problems using optimized reusable logic.
