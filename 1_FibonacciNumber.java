class Solution {
    public int fib(int n) {
        if (n <= 1){ return n; }
        else {return fib(n-1) + fib(n - 2);}
    }
}

/*
In my approach, the function fib(n) is returning the nth Fibonacci number.
The base case is:
- If n <= 1, return n. This is because fib(0) = 0 and fib(1) = 1
The recusive case is:
- for (n > 1), do fib(n - 1) + fib(n - 2). This is actually the mathematical definition of a Fibonacci number

Time Complexity = O(2^n)
Space Complexity = O(n)

This problem introduced me to the basics of recursion. It taught me how a unction calls itself to create smaller
problems. It taught me the importance of base cases.
*/
