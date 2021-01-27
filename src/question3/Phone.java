package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;
    private String OperatingSystem;

    public Phone() {
    }

    public Phone(int width, int height) {
        super(width,height);
    }

    public Phone(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String getOperatingSystem() {
        return OperatingSystem;
    }

    @Override
    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    @Override
    public String networkType() {
        return "4G";
    }
}
