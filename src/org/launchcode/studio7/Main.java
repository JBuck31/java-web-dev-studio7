package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Whatever and Ever Amen", 156, "13 songs", "audio disc");
        DVD myDVD = new DVD("The Lion King", 156, "90 minute movie", "video disc");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();
        myCD.storeData();
        myDVD.storeData();
        System.out.println(myCD);
        System.out.println(myDVD);


    }
}
