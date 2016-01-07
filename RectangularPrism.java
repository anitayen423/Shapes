public class RectangularPrism extends Prism{
	public double getVolume() {
		double volume = getHeight() * getLength() * getWidth();
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = 2 * ((getHeight() * getLength()) + (getHeight())* getWidth()) + (getLength() * getWidth());
		return surfaceArea;
	}
}
