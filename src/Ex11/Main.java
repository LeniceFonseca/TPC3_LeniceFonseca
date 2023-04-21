package Ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<SecondHandVehicle> listaVeiculos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("""
                    1 - Adicionar veiculo
                    2 - Listar veiculos
                    3 - Apagar um veiculo
                    4 - Terminar
                    """);
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    adicionar(listaVeiculos);
                    break;
                case 2:
                    listar(listaVeiculos);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Registo do veiculo a apagar: ");
                    String registo = scanner.next();
                    apagar(listaVeiculos, registo);
                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalido!");
            }

        } while (opcao != 4);

    }

    public static void adicionar(ArrayList<SecondHandVehicle> veiculos) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero Registo: ");
        String regNo = scanner.next();
        System.out.print("Marca: ");
        String make = scanner.next();
        System.out.print("Ano de fabrico: ");
        int yearOfManufacture = scanner.nextInt();
        System.out.print("Valor: ");
        double value = scanner.nextDouble();
        System.out.print("Quantidade de donos: ");
        int numberOfOwners = scanner.nextInt();
        System.out.println()
        ;
        SecondHandVehicle veiculo = new SecondHandVehicle(regNo, make, yearOfManufacture, value, numberOfOwners);
        veiculos.add(veiculo);
    }

    public static void listar(ArrayList<SecondHandVehicle> veiculos) {
        for (SecondHandVehicle v : veiculos) {
            System.out.println(v.toString());
        }
    }

    public static void apagar(ArrayList<SecondHandVehicle> veiculos, String registo) {
        SecondHandVehicle veiculo = new SecondHandVehicle();
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getRegNo().equals(registo)) {
                veiculos.remove(i);
            }
        }
    }

}
