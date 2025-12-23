package classes_and_objects.exercises;

public class CarpetCostCalculator {
    private Floor floor;
    private Carpet carpet;

    public CarpetCostCalculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea();
        double cost = carpet.getCost();
        return area * cost;
    }
}
