package org.launchcode.studio7;

public class DVD extends Disc implements OpticalDisc{

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {

        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {

        System.out.println("Error!" + this.name + " is already stored on " + this.discType);
    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public String toString() {
        return "DVD{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", contents='" + contents + '\'' +
                ", discType='" + discType + '\'' +
                '}';
    }
}
