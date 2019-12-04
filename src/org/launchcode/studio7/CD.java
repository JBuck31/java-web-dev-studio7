package org.launchcode.studio7;

public class CD extends Disc implements OpticalDisc{
    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Data successfully stored on " + this.discType);
    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public String toString() {
        return "CD{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", contents='" + contents + '\'' +
                ", discType='" + discType + '\'' +
                '}';
    }
}
