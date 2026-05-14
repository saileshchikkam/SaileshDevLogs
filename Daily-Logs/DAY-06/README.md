# Day 06 Logs

## Topics Covered
- Linear Search Algorithm
- Improved Linear Search Techniques
- Sentinel Linear Search
- Bidirectional Linear Search
- Transposition Method
- Move-to-Front Method
- Time Complexity Analysis

## Files Included
1. `LinearSearchAlgorithms.java`
   - Implemented basic Linear Search
   - Practiced Transposition Linear Search
   - Explored Move-to-Front optimization technique
   - Learned how searching performance can improve for frequently searched elements

2. `Sentinal_LinearSearch.java`
   - Implemented Sentinel Linear Search
   - Reduced unnecessary boundary comparisons
   - Understood how sentinel search slightly optimizes linear search performance

3. `Bidirectional_LinearSearch.java`
   - Implemented Bidirectional Linear Search
   - Practiced searching from both left and right directions simultaneously
   - Reduced the number of comparisons practically

4. `NOTES - Linear Search Algorithm (3Jan2026).pdf`
   - Detailed handwritten notes on Linear Search and its optimized versions
   - Included algorithm explanations, examples, and complexity analysis

## Key Learnings
- Linear Search works well for small or unsorted datasets
- Best Case Time Complexity → O(1)
- Worst Case Time Complexity → O(n)
- Average Case Time Complexity → O(n)
- Sentinel Search reduces comparison overhead
- Bidirectional Search improves practical performance
- Transposition and Move-to-Front methods optimize repeated searches

## Concepts Explored
- Sequential searching
- Searching in unsorted arrays
- Optimizing search operations
- Search improvement strategies
- Time Complexity comparison
- Practical searching techniques

## Interesting Observation
One interesting concept explored today was how Transposition and Move-to-Front techniques rearrange elements after searching.

For example:
- In Transposition Search, the found element swaps with the previous element
- In Move-to-Front, the found element moves directly to index 0

This improves future searches when the same elements are searched repeatedly.

## Challenges Faced
- Understanding how Sentinel Search avoids repeated boundary checks
- Visualizing how Bidirectional Search reduces comparisons
- Carefully handling index swapping in optimized searches
- Understanding practical optimization vs theoretical complexity

## Progress
Day 06 strengthened my understanding of searching algorithms and optimization techniques in DSA. I also explored how practical improvements can enhance algorithm performance even when the theoretical time complexity remains the same.

## References
- Notes and algorithm explanations were practiced using handwritten materials and Java implementations. :contentReference[oaicite:0]{index=0}
- Java implementation of Linear Search optimizations. :contentReference[oaicite:1]{index=1}
- Bidirectional Linear Search implementation. :contentReference[oaicite:2]{index=2}
- Sentinel Linear Search implementation. :contentReference[oaicite:3]{index=3}
