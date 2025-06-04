package javapr22;

public class DroneRobot extends DeliveryRobot {

    public DroneRobot(String id, int batteryLevel) {
        super(id, batteryLevel);
    }

    public void deliverPackage() {
        BatteryAlarm();

        if (batteryLevel < 20) {
            System.out.println(id + ": Drone delivery not possible due to low battery");
        } else {
            batteryLevel -= 30; // 변경: 30% 감소
            System.out.println(id + ": Box delivery completed by drone");
            Batterycheck();
            checkAutoRecharge();
        }
    }

    public void recharge() {
        batteryLevel = 100;
        System.out.println(id + ": Drone battery fully charged");
    }

    public void BatteryAlarm() {
        if (batteryLevel < 20) {
            System.out.println(id + ": Drone battery low warning!");
        } else {
            System.out.println(id + ": Drone battery is in good condition");
        }
    }
}