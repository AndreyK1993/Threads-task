package task_01;

public class Main01 {

    public static void main(String[] args) {

        Robot robot1 = getRobot("Robot 1.0");
        getRobotInfo(robot1);

        Robot robot2 = getRobot("Robot 2.0");
        getRobotInfo(robot2);
    }

    private static Robot getRobot(String name) {
        return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot.getName() + " state: " + robot.getState());
        robot.start();
        System.out.println(robot.getName() + " state: " + robot.getState());
    }
}
