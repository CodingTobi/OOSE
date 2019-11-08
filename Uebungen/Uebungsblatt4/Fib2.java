class Fib{
  static int fib(int n) {
    if (n >= 2) {
      fib(n-2) + fib(n-1);
    }
    return (n==1) ? 1 : 0;
  }
}
