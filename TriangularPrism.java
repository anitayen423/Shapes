public class TriangularPrism implements Shape{
	private double height;
	private double baseA;
	private double baseB;
	private double baseC;
	
	public TriangularPrism(double height, double baseA, double baseB, double baseC){
		this.height = height;
		this.baseA = baseA;
		this.baseB = baseB;
		this.baseC = baseC;
	}
	
	public double getVolume() {
		double s = (baseA + baseB + baseC) / 2;
		double adiff=Math.abs(s-baseA);
		double bdiff=Math.abs(s-baseB);
		double cdiff=Math.abs(s-baseC);
		double volume = (Math.sqrt(s * adiff * bdiff * cdiff))*height;
		return volume;
	}
	
	public double getSurfaceArea() {
		double s = (baseA + baseB + baseC) / 2;
		double adiff=Math.abs(s-baseA);
		double bdiff=Math.abs(s-baseB);
		double cdiff=Math.abs(s-baseC);
		double areaOfBases = 2 * (Math.sqrt(s * adiff * bdiff * cdiff));
		double surfaceArea = ((baseA*height) + (baseB*height) + (baseC*height) + areaOfBases);
		return surfaceArea;
	}
}
