package section2;

import java.util.Set;

public class BoxBO extends Box {
    double volume;

    public BoxBO() {
        // TODO Auto-generated constructor stub
    }

    public void calculateVolume(Set<Box> ts) {
        // TODO Auto-generated method stub
        for (Box box : ts) {
            volume = (box.getHeight() * box.getLength() * box.getWidth());

        }
        System.out.println("Unique Boxes in the Set are");
        System.out.printf("Length = %.2f Width =%.2f Height =%.2f Volume = %.2f ", getLength(),
                getWidth(), getHeight(), volume);

    }

}
