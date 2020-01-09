package section2;

public class Box {
    double length;
    double width;
    double height;
    double volume;

    public Box() {
        // TODO Auto-generated constructor stub
    }

    public Box(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setVolume() {
        this.volume = (getLength() * getWidth() * getHeight());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Box other = (Box) obj;
        if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return String.format("Length = %.2f Width =%.2f Height =%.2f Volume = %.2f ", length, width,
                height, volume);

    }
    /*
     * public void calculateVolume(Set<Box> ts) {
     * 
     * // TODO Auto-generated method stub for (Box box : ts) { volume =
     * (box.getHeight() * box.getLength() * box.getWidth());
     * 
     * } System.out.println("Unique Boxes in the Set are");
     * System.out.printf("Length = %.2f Width =%.2f Height =%.2f Volume = %.2f ",
     * getLength(), getWidth(), getHeight(), volume);
     * 
     * }
     */

}
