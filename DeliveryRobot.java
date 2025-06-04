package javapr22;

public abstract class DeliveryRobot {
    protected String id;
    protected int batteryLevel;
    protected int deliveryCount;

    public DeliveryRobot(String id, int batteryLevel) {
        this.id = id;
        this.batteryLevel = batteryLevel;
    }

    public abstract void deliverPackage();
    public abstract void recharge();
    public abstract void BatteryAlarm();
    protected void checkAutoRecharge() {
        if (batteryLevel < 20) {
            BatteryAlarm();
            System.out.println(id + ": Battery less than 20% -> Automatic charging starts");
            recharge();
        }
    }
    public void Batterycheck() {
        System.out.println("Battery status : "+batteryLevel+"%");
    }
}