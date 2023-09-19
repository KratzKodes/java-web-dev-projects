package org.launchcode;

public abstract class BaseDisc {

    //spin
    private String spinSpeed = "Spin speed";
    //Disc type
    private  String discType;

    private  String capacity;


    protected BaseDisc(String spinSpeed, String discType, String capacity) {
        this.spinSpeed = spinSpeed;
        this.discType = discType;
        this.capacity = capacity;
    }

   public BaseDisc(String discType, String capacity){
       this.discType = discType;

       this.capacity = capacity;
   }


    public BaseDisc() {

    }
}
