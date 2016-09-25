import java.util.HashSet;

public class Circle {
	private String circleId;
	
	public HashSet<Vertex> memberVertices = new HashSet<Vertex>();

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}
	
	public Circle(String circleId) {
		this.circleId = circleId;
	}

}
