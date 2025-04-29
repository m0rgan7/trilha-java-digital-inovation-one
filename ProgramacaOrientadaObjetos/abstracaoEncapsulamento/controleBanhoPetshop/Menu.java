package abstracaoEncapsulamento.controleBanhoPetshop;

import java.util.Scanner;

public class Menu {

    private final static Scanner scanner = new Scanner (System.in);

    private final static WashingMachine washingMachine = new WashingMachine();
    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("***Escolha uma das opçoes***");
            System.out.println("1- Dar bannho no pet");
            System.out.println("2- Abastecer maquina com agua");
            System.out.println("3- Abastecer maquina com shampoo");
            System.out.println("4- Verificar agua");
            System.out.println("5- Verificar shampoo");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7- Colocar pet na maquina");
            System.out.println("8- Tirar pet da maquina");
            System.out.println("9- Limpar maquina");
            System.out.println("0- Sair");

            option = scanner.nextInt();

            switch (option) {
                case 6 -> washingMachine.hasPet();
                case 7 -> setPetInPetMachine();
                case 8 -> washingMachine.removePet();
                case 9 -> washingMachine.wash();
            }
        }
        
        while (option != 0);

    }
//pq ele usa var antes de tudo? funciona sem?
    public static void setPetInPetMachine(){
        System.out.println("Informe o nome do animal: ");
        var name =  scanner.nextLine();
        var pet = new Pet (name);
        washingMachine.setPet(pet);

        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

}