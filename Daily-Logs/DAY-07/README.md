# Day 7 Logs

## Topics Covered
- Binary Search
- Iterative Binary Search
- Divide and Conquer Technique
- Order Agnostic Binary Search
- Time Complexity Analysis
- Overflow-safe Mid Calculation

## Files Included
1. `BinarySearch.java`
   - Implemented iterative Binary Search
   - Practiced searching in sorted arrays
   - Learned low, high, and mid pointer handling

2. `OrderAgnosticBinarySearch.java`
   - Implemented Binary Search for both ascending and descending arrays
   - Learned dynamic order checking

3. `BinarySearch_Notes.pdf`
   - Handwritten notes covering:
     - Binary Search workflow
     - Search space reduction
     - Complexity derivation
     - Overflow case handling
     - Order Agnostic Binary Search

## Key Learnings
- Binary Search works only on sorted arrays
- Search space reduces by half after every comparison
- Time Complexity:
  - O(log₂ n)
- Importance of optimized mid calculation:
```java
mid = low + (high - low) / 2;
```

## Interesting Observation
Learned why using:
```java
mid = (low + high) / 2;
```
can cause integer overflow for very large values, and how the optimized formula avoids it.

## Challenges Faced
- Understanding low, high, and mid pointer movement
- Handling ascending and descending sorted arrays
- Visualizing divide-and-conquer searching

## Progress
Day 7 strengthened my understanding of optimized searching algorithms and how Binary Search improves efficiency compared to Linear Search.
