public class Taxi extends  PublicTransportation{
    int gasAmount = 100;
    String destination = "";
    int destKm = 0;
    static int totalCharge;


    public int makeNum(){
        int number = (int) (Math.random() * 9999);
        return number;
    }

    public void Taxi () {
        this.num += makeNum();
        System.out.println(num + "번 택시 객체 생성");
        status = "일반";
    }

    @Override
    public void changeSpeed(int speedVariance) {
        currentSpeed += speedVariance;
    }


    @Override
    public void changeGasAmount (int gasAmount) {
        this.gasAmount += gasAmount;
        System.out.println("주유량 : "+this.gasAmount);
        if (this.gasAmount <= 10) {
            System.out.println("주유가 필요합니다.");
            this.status = "운행불가";
            System.out.println("상태 : 운행불가");
        }
    }


    public void getOnOff (int passenger, String destination, int destKm) {
        this.maxPassenger = 4;
        if (this.status.equals("일반")) {
            if (currentPassenger <= 4) {
                this.currentPassenger += passenger;
                this.maxPassenger -= passenger;
                this.destination = destination;
                this.destKm = destKm;
                this.status = "운행중";
                charge += 3000 +(1000 * (destKm - 1));
                System.out.println("탑승 승객 수 = "+currentPassenger);
                System.out.println("잔여 승객 수 = "+maxPassenger);
                System.out.println("기본 요금 확인 = "+3000);
                System.out.println("목적지 = "+ destination);
                System.out.println("목적지까지 거리 = "+ destKm);
                System.out.println("지불할 요금 = " + (3000 + 1000 * (destKm - 1)));

            } else {
                System.out.println("운행 불가");
            }
            }

    }
    public void total(){
        totalCharge +=  3000 +(1000 * (destKm - 1));
        System.out.println("누적 요금 = "+ totalCharge);
    }

    @Override
    public void checkStatus() {
        if (status.equals("운행중")) {
            System.out.println("상태 : 운행중");
        } else{
            if (this.gasAmount <=10) {
                this.status = "운행불가";
                System.out.println("상태 : 운행불가");
                System.out.println("주유가 필요한 상태입니다.");
            }
        }
    }

}
