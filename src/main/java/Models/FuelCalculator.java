package Models;

public class FuelCalculator {
    //Distance
    private double wayDistance;
    // Average fuel consumption
    private double averageFuelConsumption;
    // Fuel consumption
    private double fuelConsumption;
    // The cost of 1 liter. fuel
    private double oneLiterFuelCost;
    // Fuel quantity
    private double fuelQuantity;

    public FuelCalculator() {
        wayDistance = 0;
        averageFuelConsumption = 0;
        fuelConsumption = 0;
        oneLiterFuelCost = 0;
        fuelQuantity = 0;
    }

    public FuelCalculator(Double distanse, Double averageFuelConsumption, Double oneLiterFuelCost, Double fuelConsumption, Double fuelQuantity) {
        this.wayDistance = distanse;
        this.averageFuelConsumption = averageFuelConsumption;
        this.oneLiterFuelCost = oneLiterFuelCost;
        this.fuelConsumption = fuelConsumption;
        this.fuelQuantity = fuelQuantity;
    }

    public double getWayDistance() {
        return wayDistance;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getOneLiterFuelCost() {
        return oneLiterFuelCost;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setOneLiterFuelCost(double oneLiterFuelCost) {
        this.oneLiterFuelCost = oneLiterFuelCost;
    }

    public void setWayDistance(double wayDistance) {
        this.wayDistance = wayDistance;
    }

    public String travelCost(){
        double fuelQuantity = wayDistance * (averageFuelConsumption / 100);
        double travelCost = fuelQuantity * oneLiterFuelCost;
        return "TravelCost{" + "fuelQuantity=" + fuelQuantity +
                ", travelCost='" + travelCost + '\'' +
                '}';
    }

    public String averageFuelConsumption(){
        double averageConsumption = fuelQuantity / wayDistance * 100;
        return "AverageFuelConsumption{" + "averageConsumption=" + averageConsumption + '\'' + '}';
    }

    public String HowMuchFuelIsEnough(){
        double HowMuchFuelIsEnough = fuelConsumption / fuelQuantity * 100;
        return "HowMuchFuelIsEnough{" + "HowMuchFuelIsEnough=" + HowMuchFuelIsEnough + '\'' + '}';
    }

    @Override
    public String toString(){
        return "FuelCalculator{" + "Distance=" + wayDistance +
                ", AverageFuelConsumption='" + averageFuelConsumption + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", oneLiterFuelCost='" + oneLiterFuelCost + '\'' +
                ", fuelQuantity='" + fuelQuantity + '\'' +
                '}';
    }
}
