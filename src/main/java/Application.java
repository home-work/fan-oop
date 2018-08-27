public class Application {
    public static void main(String[] args) {
        Fan fan_1 = new Fan();
        fan_1.setColor("3");
        fan_1.setRadius(10);
        fan_1.setColor("yellow");
        fan_1.setOn(true);
        System.out.println(fan_1.toString());

        Fan fan_2 = new Fan();
        fan_2.setSpeed(2);
        fan_2.setRadius(5);
        System.out.println(fan_2.toString());

    }
}
