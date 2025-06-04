package javapr22;

public class DroneRobot extends DeliveryRobot {

    public DroneRobot(String id, int batteryLevel) {
        super(id, batteryLevel);
    }

    public void deliverPackage() {
        BatteryAlarm();

        if (batteryLevel < 20) {
            System.out.println(id + ": 배터리 부족으로 드론 배송 불가");
        } else {
            batteryLevel -= 30; // 변경: 30% 감소
            System.out.println(id + ": 드론으로 상자 배달 완료");
            Batterycheck();
            checkAutoRecharge();
        }
    }

    public void recharge() {
        batteryLevel = 100;
        System.out.println(id + ": 드론 배터리 충전 완료");
    }

    public void BatteryAlarm() {
        if (batteryLevel < 20) {
            System.out.println(id + ": 드론 배터리 부족 경고!");
        } else {
            System.out.println(id + ": 드론 배터리 상태 양호");
        }
    }
}