public class DoEverythingManager {

    private String x;
    private int y;
    private boolean z;

    public DoEverythingManager(String x, int y, boolean z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void processData() {
        if (z) {
            System.out.println("Processing data for: " + x);
        } else {
            System.out.println("Skipping processing for: " + x);
        }
    }

    public void sendData() {
        System.out.println("Sending data: " + x + " to some endpoint.");
    }

    public void saveData() {
        System.out.println("Saving data: " + x);
        if (y > 10) {
            System.out.println("Data saved successfully.");
        } else {
            System.out.println("Data saving failed.");
        }
    }

    public void printInfo() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public boolean validateInput(String input) {
        return input != null && input.length() > 5;
    }

    public void handleError() {
        System.out.println("An error occurred but no details are available.");
    }

    public static void main(String[] args) {
        DoEverythingManager dem = new DoEverythingManager("Test", 5, true);
        dem.processData();
        dem.sendData();
        dem.saveData();
        dem.printInfo();
        if (!dem.validateInput("Short")) {
            dem.handleError();
        }
    }
}
