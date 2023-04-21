package Ex11;

public class TesteMethods {

    public static void main(String[] args) {

        SecondHandVehicle secondHandVehicle = new SecondHandVehicle("Sv345", "Mercedes", 1999, 550000.56, 3);

        System.out.println("Numero de registo:...." + secondHandVehicle.getRegNo());
        System.out.println("Marca:................" + secondHandVehicle.getMake());
        System.out.println("Ano de fabrico:......." + secondHandVehicle.getYearOfManufacture());
        System.out.println("Valor:................" + secondHandVehicle.getValue());
        System.out.println("Idade do veiculo......" + secondHandVehicle.calculateAge(secondHandVehicle.getYearOfManufacture()));
        if (secondHandVehicle.hasMultipleOwners()) {
            System.out.println("Teve " + secondHandVehicle.getNumberOfOwners() + " donos!");
        }
        else {
            System.out.println("Teve apenas 1 dono!");
        }

    }

}
