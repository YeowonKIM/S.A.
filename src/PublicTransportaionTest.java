public class PublicTransportaionTest {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.Bus();
        bus1.getOnOff(2);
        bus1.changeGasAmount(100, -50);
        bus1.checkStatus();
        bus2.Bus();
        bus2.getOnOff(45);
        bus2.getOnOff(5);
        bus2.changeGasAmount(60, -55);
        bus2.checkStatus();

        System.out.println("==============================================");

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        taxi1.Taxi();
        taxi1.getOnOff(2, "서울역", 2);
        taxi1.total();
        taxi1.changeGasAmount(-80);
        taxi1.checkStatus();
        taxi2.Taxi();
        taxi2.getOnOff(3, "구로 디지털 단지역", 12);
        taxi2.total();
        taxi1.changeGasAmount(-20);
    }
}
