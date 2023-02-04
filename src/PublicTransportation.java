public class PublicTransportation {
    int num;
    int gasAmount = 100;
    int currentGas;
    int currentSpeed=0;
    int speedVariance;
    int maxPassenger;
    int currentPassenger =0;
    int charge;
    String status = "";

    public void Transportation (int num) {
        this.num = num;
    }

    public void changeSpeed(int speedVariance){
        this.speedVariance = speedVariance;
        currentSpeed = speedVariance;
    }

    public void changeGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void getOnOff (int passenger) {
        this.currentPassenger += passenger;
        this.maxPassenger -= passenger;
    }

    public void checkStatus() {
    }


}
