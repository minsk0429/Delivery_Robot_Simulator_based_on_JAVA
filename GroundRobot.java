package javapr22;

public class GroundRobot extends DeliveryRobot {

    public GroundRobot(String id, int batteryLevel) {
        super(id, batteryLevel);
    }

    public void deliverPackage() {
        BatteryAlarm();

        if (batteryLevel < 20) {
            System.out.println(id + ": 배터리 부족으로 지상 배송 불가");
        } else {
            batteryLevel -= 30;
            System.out.println(id + ": 지상 로봇으로 상자 배달 완료");
            Batterycheck();
            checkAutoRecharge();
        }
    }

    public void recharge() {
        batteryLevel = 100;
        System.out.println(id + ": 지상 로봇 배터리 충전 완료");
    }

    public void BatteryAlarm() {
        if (batteryLevel < 15) {
            System.out.println(id + ": 지상 로봇 배터리 부족 경고!");
        } else {
            System.out.println(id + ": 지상 로봇 배터리 상태 양호");
        }
    }
}