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
            System.out.println(id + ": 배터리 20% 미만 → 자동 충전 시작");
            recharge();
        }
    }
    public void Batterycheck() {
        System.out.println("배터리 상태: "+batteryLevel+"%");
    }
}