package computer_factory;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;


    public PersonalComputer(String model, String manufacturer, Monitor monitor, MotherBoard motherBoard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
