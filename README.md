# 🚚 Delivery Robot Simulator

This is a **Java-based delivery robot simulation program** that demonstrates core Object-Oriented Programming (OOP) concepts such as **abstraction**, **inheritance**, **method overriding**, and **polymorphism**.

Robots are implemented via an abstract base class `DeliveryRobot`, with concrete subclasses `DroneRobot` and `GroundRobot`. Delivery operations are simulated in the `DeliverySimulator` class.

---

## 📌 Features

- Display robot battery status
- Display delivery status
- Manual battery recharge
- Battery warning when level drops below threshold (20% or 15%)
- Automatic battery recharge when level drops below threshold
- Manage multiple robots using an array

---

## 🧱 Code Structure

### `DeliveryRobot` (Abstract Class)

Defines shared properties and abstract methods for all robot types.

**Fields:**
- `id`: Unique robot identifier
- `batteryLevel`: Current battery percentage
- `deliveryCount`: Number of deliveries (currently unused)

**Abstract Methods:**
- `deliverPackage()`
- `recharge()`
- `BatteryAlarm()`

**Concrete Methods:**
- `checkAutoRecharge()`: Auto recharges if battery < 20%
- `Batterycheck()`: Prints current battery level

---

### `DroneRobot` (Subclass of `DeliveryRobot`)

- Delivers via drone
- Consumes 30% battery per delivery
- Warns if battery < 20%, recharges if needed

---

### `GroundRobot` (Subclass of `DeliveryRobot`)

- Delivers on ground
- Also consumes 30% battery per delivery
- Warns if battery < 15%, recharges if needed

---

### `DeliverySimulator` (Main Class)

- Creates an array of robots (`DroneRobot` and `GroundRobot`)
- Simulates 5 rounds of deliveries for each robot
- Automatically manages battery warnings and recharging

---

## 🔄 Example Output
=== 배달 시뮬레이션 1 === 드론-01: 드론 배터리 상태 양호 드론-01: 드론으로 상자 배달 완료 배터리 상태: 70%
지상로봇-01: 지상 로봇 배터리 상태 양호 지상로봇-01: 지상 로봇으로 상자 배달 완료 배터리 상태: 70% ...


---

## 🔍 OOP Concepts Demonstrated

| Concept       | Usage                                                                 |
|---------------|------------------------------------------------------------------------|
| Abstraction   | `DeliveryRobot` defines abstract methods to be implemented by subclasses |
| Inheritance   | `DroneRobot`, `GroundRobot` extend `DeliveryRobot`                     |
| Overriding    | Subclasses implement `deliverPackage`, `recharge`, and `BatteryAlarm` differently |
| Polymorphism  | Array of `DeliveryRobot` used to manage different robot types uniformly |

---

## 📈 Future Improvements

- Implement `deliveryCount` tracking
- Add failure/success simulation logic
- Refactor to use `ArrayList` for dynamic robot management
- Build GUI for visualization

---

## 📎 Requirements

- Java 8 or higher
- Any IDE (e.g., IntelliJ, Eclipse) or command-line compilation

---

## ✅ How to Run

1. Clone the repository
2. Compile all `.java` files
3. Run `DeliverySimulator.java` to start the simulation

```bash
javac javapr22/*.java
java javapr22.DeliverySimulator
