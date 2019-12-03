package name.panitz.oose.ws17;
import javafx.scene.canvas.GraphicsContext;

public class GeometricObject {
  Vertex corner;
  double width;
  double height;
  Vertex velocity;

  public GeometricObject(Vertex corner, double width, 
      double height, Vertex velocity) {
    super();
    this.corner = corner;
    this.width = width;
    this.height = height;
    this.velocity = velocity;
  }

  double size(){
    return width*height;
  }
  
  boolean isLargerThan(GeometricObject that){
    return size()>that.size();
  }
  boolean isAbove(GeometricObject that){
    return corner.y+height<that.corner.y;
  }
  boolean isUnderneath(GeometricObject that){
    return that.isAbove(this);
  }
  boolean isLeftOf(GeometricObject that){
    return corner.x+width<that.corner.x;
  }
  boolean isRightOf(GeometricObject that){
    return that.isLeftOf(this);
  }
  boolean touches(GeometricObject that){
    return !(isLeftOf(that)||isRightOf(that)
        ||isAbove(that)||isUnderneath(that));
  }
  void move(){
    corner.move(velocity);
  }
  @Override
  public String toString() {
    return "Geo("+corner+","+width+","+height+","+velocity+")";
  }

  public void paintMeTo(GraphicsContext gc) {    
    //TODO.
    //Paint the rectangle to the FX Graphics Content
  }    
}