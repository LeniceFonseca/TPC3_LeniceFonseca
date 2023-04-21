package Ex11;

public class SecondHandVehicle extends Vehicle{

    private int numberOfOwners;

    public SecondHandVehicle() {}

    public SecondHandVehicle(String regNo, String make, int yearOfManufacture, double value, int numberOfOwners) {
        super(regNo, make, yearOfManufacture, value);
        this.numberOfOwners = numberOfOwners;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }

    public boolean hasMultipleOwners() {
        if (numberOfOwners > 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Numero de registo: " + getRegNo() + ", " +
                "Marca: " + getMake() + ", " +
                "Ano de fabrico: " + getYearOfManufacture() + ", " +
                "Valor: " + getValue() + ", " +
                "Quantidade de donos: " + getNumberOfOwners() +
                '}';
    }
}
