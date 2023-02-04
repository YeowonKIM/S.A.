public class Bus extends PublicTransportation {
    int gas;

    public int makeNum(){
        int number = (int) (Math.random() * 9999);
        return number;
    }
    public void Bus () {
        this.num += makeNum();
        System.out.println(num + "번 버스 객체 생성");
        this.status = "driving";
        this.charge = 1000;
    }

    @Override
    public void changeSpeed(int speedVariance) {
        currentSpeed += speedVariance;
    }

    public void changeGasAmount(int gas, int gasAmount) {
        gas += gasAmount;
        System.out.println("주유량 : "+gas);
        if (this.gas <= 10) {
            System.out.println("주유가 필요합니다.");
        }
    }

    @Override
    public void getOnOff (int passenger) {
        this.maxPassenger = 30;
        if (this.status.equals("driving")) {
            if(passenger > 30) {
                System.out.println("최대 승객 수를 초과했습니다.");
            } else {
                this.currentPassenger += passenger;
                this.maxPassenger -= passenger;
                this.charge = passenger*1000;
                System.out.println("탑승 승객 수 = "+currentPassenger);
                System.out.println("잔여 승객 수 = "+maxPassenger);
                System.out.println("요금 확인 = "+charge);
            }
        }
    }

    @Override
    public void checkStatus() {
        if (status.equals("driving")) {
            this.status = "driving";
            System.out.println("상태 : 운행");
        } else{
            this.status = "impound";
            System.out.println("상태 : 차고지행");
        }
    }



}
