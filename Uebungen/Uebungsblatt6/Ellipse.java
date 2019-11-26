package Uebungsblatt6;

class Ellipse extends GeometricObject {

	public Ellipse() {
		super(new Vertex(0,0), 100, 100, new Vertex(0, 0));
	}
	
	public Ellipse(Vertex corner) {
		super(corner, 100, 100, new Vertex(0, 0));
	}
	
	public Ellipse(Vertex corner, double width, double height) {
		super(corner, width, height, new Vertex(0, 0));
	}
	
	public Ellipse(Vertex corner, double width, double height, Vertex velocity) {
		super(corner, width, height, velocity);
	}

	@Override
	public String toString() {
		return "Ellipse [corner=" + corner + ", width=" + width + ", height=" + height + ", velocity=" + velocity + "]";
	}

	@Override
	double size() {
		return Math.PI*Math.pow((width+height)/4,2);
	}

	}