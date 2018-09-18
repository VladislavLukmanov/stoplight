public class Stoplight {
    private static final int LIGHT_AMOUNT = 3;
    private Light[] lights = new Light[LIGHT_AMOUNT];
    private int currentLight;

    Stoplight() {
        lights[0] = new Light("Зеленый");
        lights[1] = new Light("Желтый");
        lights[2] = new Light("Красный");
    }

    public void activate() {
        currentLight = 0;
        while (true) {
            lights[currentLight].turnOn();

            if (currentLight == LIGHT_AMOUNT - 1) {
                currentLight = 0;
            } else {
                currentLight++;
            }
        }
    }
}
