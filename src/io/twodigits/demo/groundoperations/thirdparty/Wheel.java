package io.twodigits.demo.groundoperations.thirdparty;

import java.util.Objects;

public class Wheel {
    Boolean canRotate;
    Double rotationAngle;
    InstallationPosition installationPosition;

    public enum InstallationPosition {
        FRONT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public Wheel(Boolean canRotate, Double rotationAngle, InstallationPosition installationPosition) {
        this.canRotate = canRotate;
        this.rotationAngle = rotationAngle;
        this.installationPosition = installationPosition;
    }

    public Boolean getCanRotate() {
        return canRotate;
    }

    public Double getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Double rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    public InstallationPosition getInstallationPosition() {
        return installationPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return getCanRotate().equals(wheel.getCanRotate()) && getRotationAngle().equals(wheel.getRotationAngle()) && getInstallationPosition() == wheel.getInstallationPosition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCanRotate(), getRotationAngle(), getInstallationPosition());
    }
}