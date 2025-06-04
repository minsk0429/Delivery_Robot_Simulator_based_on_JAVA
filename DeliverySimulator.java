package javapr22;

public class DeliverySimulator {
    public static void main(String[] args) {
        DeliveryRobot[] robots = {
            new DroneRobot("드론-01", 100),
            new GroundRobot("지상로봇-01", 100)
        };

        for (int i = 1; i <= 5; i++) { // 5회 반복 배달
            System.out.println("=== 배달 시뮬레이션 " + i + " ===");
            for (DeliveryRobot robot : robots) {
                robot.deliverPackage();
                System.out.println();
            }
        }
    }
}