package io.twodigits.demo.groundoperations.thirdparty;

import java.util.List;
import java.util.Objects;

public class Gear {
    private Boolean isLowered;
    private List<Wheel> wheels;

    public Gear(Boolean isLowered, List<Wheel> wheels) {
        this.isLowered = isLowered;
        this.wheels = wheels;
    }

    public Boolean getLowered() {
        return isLowered;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gear)) return false;
        Gear gear = (Gear) o;
        return isLowered.equals(gear.isLowered) && getWheels().equals(gear.getWheels());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLowered, getWheels());
    }
}
