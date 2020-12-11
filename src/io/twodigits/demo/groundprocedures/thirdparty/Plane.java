package io.twodigits.demo.groundprocedures.thirdparty;

import java.util.List;

final public class Plane {
    String callsign;
    Gear gear;
    List<Cargo> cargo;
    List<Engine> engines;

    public Plane(String callsign) {
        this(callsign,
                new Gear(false,
                        List.of(
                                new Wheel(true, 0.0, Wheel.InstallationPosition.FRONT),
                                new Wheel(false, 0.0, Wheel.InstallationPosition.BACK_RIGHT),
                                new Wheel(false, 0.0, Wheel.InstallationPosition.BACK_LEFT)
                        )),
                List.of(
                        new Engine(),
                        new Engine()
                )
        );
    }

    private Plane(String callsign, Gear gear, List<Engine> engines) {
        this.callsign = callsign;
        this.gear = gear;
        this.cargo = List.of();
        this.engines = engines;
    }

    public String getCallsign() {
        return callsign;
    }

    public Gear getGear() {
        return gear;
    }

    public List<Cargo> getCargo() {
        return cargo;
    }

    public List<Engine> getEngines() {
        return engines;
    }
}
