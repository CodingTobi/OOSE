package Uebungsblatt6;

class Circle extends Ellipse {

	Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	Circle(Vertex corner, double diameter, Vertex velocity) {
		super(corner, diameter, diameter, velocity);
		// TODO Auto-generated constructor stub
	}

	Circle(Vertex corner, double diameter) {
		super(corner, diameter, diameter);
	}

	Circle(Vertex corner) {
		super(corner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circle(" + corner + "," + width + "," + height + "," + velocity
				+ ")";
	}
}
