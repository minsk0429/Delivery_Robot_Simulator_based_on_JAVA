package javapr22;

public class GroundRobot extends DeliveryRobot {

    public GroundRobot(String id, int batteryLevel) {
        super(id, batteryLevel);
    }

    public void deliverPackage() {
        BatteryAlarm();

        if (batteryLevel < 20) {
            System.out.println(id + ": Ground delivery not possible due to low battery");
        } else {
            batteryLevel -= 30;
            System.out.println(id + ": Box delivery completed by ground robot");
            Batterycheck();
            checkAutoRecharge();
        }
    }

    public void recharge() {
        batteryLevel = 100;
        System.out.println(id + ": Ground robot battery fully charged");
    }

    public void BatteryAlarm() {
        if (batteryLevel < 15) {
            System.out.println(id + ": Ground robot battery low warning!");
        } else {
            System.out.println(id + ": Ground robot battery is in good condition");
        }
    }
}