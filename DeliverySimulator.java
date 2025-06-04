package javapr22;

public class DeliverySimulator {
    public static void main(String[] args) {
        DeliveryRobot[] robots = {
            new DroneRobot("Drone-01", 100),
            new GroundRobot("GroundRobot-01", 100)
        };

        for (int i = 1; i <= 5; i++) { // 5회 반복 배달
            System.out.println("=== Delivery Simulation " + i + " ===");
            for (DeliveryRobot robot : robots) {
                robot.deliverPackage();
                System.out.println();
            }
        }
    }
}