public class Droid {
    String name;
    int batteryLevel;
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }
    public String toString() {
        return "The droid's name is " + name;
    }
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }
    public void energyReport() {
        System.out.println(name + " has " + batteryLevel + " battery level");
        if(batteryLevel < 0) {
          System.out.println(name + " has less than 0 battery level. He will still perform the task, but perhaps spare him and give him a break?");
        }
    }
    // Energy Transfer between two instances
    public void energyTransfer(Droid Name) {
        int prop = batteryLevel;
        batteryLevel = Name.batteryLevel;
        Name.batteryLevel = prop;
    }
    public static void main(String[] args) {
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("Dancing");
        Droid Marcus = new Droid("Markus");
        Codey.energyTransfer(Marcus);
        Codey.energyReport();
        Marcus.energyReport();
    }
}