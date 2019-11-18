package Uebungsblatt5;

public final class SimpleArrayFuns {

  private SimpleArrayFuns() {
  }

  static boolean contains(int[] xs,int y){
     for (int x : xs) {
    	 if (x == y) return true;
     }
     return false;
  }
  static long sum(int[] xs){
	  int tempL = 0;
	  for (int x : xs) {
	    	 tempL += x;
	     }
    return tempL;
  }
  static int avg(int[] xs){
    return (int) (sum(xs) / xs.length);
  }
  static boolean isSorted(int[] xs){
	  for (int i = 0; i < xs.length - 1; i++) {
	    	 if (xs[i] > xs[i+1]) return false;
	     }
    return true;
  }
  static int max(int[] xs){
	  int tempMax = xs[0];
	  for (int i = 1; i < xs.length; i++) {
		  if (xs[i] > tempMax) tempMax = xs[i];
	  }
    return tempMax;
  }
}