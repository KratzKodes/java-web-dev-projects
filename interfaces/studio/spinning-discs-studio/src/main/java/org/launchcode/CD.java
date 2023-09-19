package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {


    protected CD(String spinSpeed, String discType, String capacity) {
        super(spinSpeed, discType, capacity);
    }

    @Override
    public void writeData(String name, String contents) {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void spin() {

    }

    @Override
    public void report() {

    }

}
