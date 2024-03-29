package name.panitz.oose.ws17;

public class Vertex {
  double x;
  double y;
  public Vertex(double x, double y) {
    super();
    this.x = x;
    this.y = y;
  }

  void move(Vertex v){
    x += v.x;
    y += v.y;
  }
  void moveTo(Vertex v){
    x = v.x;
    y = v.y;
  }
  @Override
  public String toString() {
    return "("+x+", "+y+")";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj==null) return false;
    if (!obj.getClass().equals(Vertex.class)) return false;
    Vertex that = (Vertex)obj;
    return (int)that.x==(int)this.x &&  (int)that.y==(int)this.y;
  }  
}