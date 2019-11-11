package Uebungsblatt4;

class Num{
  //n is assumed to be a positive number
  final long n;
  Num(long n){
    assert n>=0;
    this.n = n;
  }
  String toBin(){
	  System.out.println("n "+n + "  n%2 "+n%2 + "   n/2 "+ n/2);
    return (n>0) ? "" + new Num(n/2).toBin()  + n % 2: "";
  }
  String toOct(){
	  System.out.println("n "+n + "  n%2 "+n%2 + "   n/2 "+ n/2);
	  return (n > 0) ? "" + new Num(n / 4).toOct() + n % 4 : "";
  }
  String toBase(int b){
	  System.out.println("n "+n + "  n%2 "+n%2 + "   n/2 "+ n/2);
	  return (n > 0) ? "" + new Num(n / b).toBase(b) + getDigit(n % b) : "";
  }
  static char getDigit(long d){
    return (char) (d<10? '0'+d : 'A'+d-10);
  }  
  
  public static void main(String[] args) {
	  System.out.println(new Num(42).toBase(16));
  }
}
