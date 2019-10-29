class DateTime {
  private Date d;
  private Time t;

  public DateTime(Date d, Time t) {
    this.d = d;
    this.t = t;
  }

  public string toString() {
    System.out.println(d.toString() + " " + t.toString());
  }

  public static void main (String[] args) {
    Date d = new Date(29,11,2018);
    Time t = new Time(12,59,15);
    DateTime dt = new DateTime(d, t);
  }
}
