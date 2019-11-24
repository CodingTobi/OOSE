package Uebungsblatt5;

public class GeometricObject {
	Vertex corner;
	double width;
	double height;
	Vertex velocity;

	GeometricObject(Vertex corner, double width, double height,
			Vertex velocity) {
		this.corner = corner;
		this.width = width;
		this.height = height;
		this.velocity = velocity;
	}

	double size() {
		return width * height;
	}

	boolean isLargerThan(GeometricObject that) {
		return this.size() > that.size();
	}

	boolean isAbove(GeometricObject that) {
		return that.corner.y > (this.height + this.corner.y);
	}

	boolean isUnderneath(GeometricObject that) {
		return this.corner.y > (that.height + that.corner.y);
	}

	boolean isLeftOf(GeometricObject that) {
		return (this.corner.x + this.width) < that.corner.x;
	}

	boolean isRightOf(GeometricObject that) {
		return (that.corner.x + that.width) < this.corner.x;
	}

	boolean touches(GeometricObject that) {
		return (!isRightOf(that) && !isLeftOf(that)
				|| !isAbove(that) && !isUnderneath(that));
	}
}
