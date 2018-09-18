import java.util.Scanner;

public class Light {
    private String color;
    private int duration;

    public Light(String color) {
        this.color = color;
        duration = getInputDuration();
    }

    public void turnOn() {
        System.out.println(color + " " + duration + " минут");
        try {
            Thread.sleep(duration * 60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getInputDuration() {
        System.out.println("Введите продолжительность сигнала: " + color + " в минутах");
        Scanner scanner = new Scanner(System.in);
        int duration = 0;
        do
        {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
            }
            duration = scanner.nextInt();
        } while (duration <= 0);
        return duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
