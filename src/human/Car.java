package human;

import java.io.Serializable;

public class Car implements Serializable {
    private boolean cool;
    public Car(boolean cool) {
        this.cool = cool;
    }

    public boolean isCool() {
        return cool;
    }
}
