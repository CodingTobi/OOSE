class Fib{
  static int fib(int n) {
    return (n != 0) ? fib(n-2) + fib(n-1) : 0;
  }
}
