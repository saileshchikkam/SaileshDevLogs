# Day 8 Logs

## Topics Covered
- Lower Bound Algorithm
- Upper Bound Algorithm
- Search Insert Position
- Find First and Last Position in Sorted Array
- Binary Search based LeetCode Problems
- Search Space Reduction Technique

## Files Included
1. `LowerBound_Algorithm.java`
   - Implemented Lower Bound using Binary Search
   - Learned how to find the first index where:
   ```java
   arr[i] >= key
   ```

2. `UpperBound_Algorithm.java`
   - Implemented Upper Bound using Binary Search
   - Learned how to find the first index where:
   ```java
   arr[i] > key
   ```

3. `SearchInsert_Position.java`
   - Solved LeetCode-style Search Insert Position problem
   - Learned how Binary Search can determine insertion index efficiently

4. `FindFirstandLast_sortedArray.java`
   - Practiced finding first and last occurrence of an element in a sorted array
   - Explored lower bound and upper bound concepts practically

## Key Learnings
- Binary Search can solve more than just searching problems
- Lower Bound and Upper Bound are powerful concepts in sorted arrays
- Search Insert Position helps determine where an element should be placed
- Binary Search significantly reduces comparisons:
  - Time Complexity → O(log₂ n)

## Interesting Observations
⭐ Learned how Lower Bound returns the first position where an element can exist.

⭐ Understood the difference between:
```java
arr[mid] >= key
```
and
```java
arr[mid] > key
```

⭐ Explored how LeetCode problems are solved efficiently using Binary Search patterns.

⭐ Realized that many searching problems are actually variations of Lower Bound and Upper Bound concepts.

## Challenges Faced
- Understanding boundary conditions
- Handling duplicates in sorted arrays
- Visualizing insertion positions
- Differentiating Lower Bound vs Upper Bound logic

## Progress
Day 8 strengthened my understanding of advanced Binary Search concepts and helped me explore real interview-style and LeetCode-based problems using efficient searching techniques.
