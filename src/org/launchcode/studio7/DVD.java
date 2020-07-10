package org.launchcode.studio7;

public class DVD extends BaseDisc implements IOpticalDisc {

    // TODO: Implement your custom interface.
    public DVD(String rpm) {
        super(rpm);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.rpm + " rpm.");
    }
}
