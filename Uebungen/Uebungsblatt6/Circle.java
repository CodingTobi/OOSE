package Uebungsblatt6;

class Circle extends Ellipse {

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(Vertex corner, double width, double height, Vertex velocity) {
		super(corner, width, height, velocity);
		// TODO Auto-generated constructor stub
	}

	public Circle(Vertex corner, double width, double height) {
		super(corner, width, height);
		// TODO Auto-generated constructor stub
	}

	public Circle(Vertex corner) {
		super(corner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circle [corner=" + corner + ", width=" + width + ", height=" + height + ", velocity=" + velocity + "]";
	}
	  


	}
