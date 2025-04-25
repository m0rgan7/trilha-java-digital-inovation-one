package abstracaoEncapsulamento.controleBanhoPetshop;

public class WhashingMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeShower(){

        if (this.pet == null){
            System.out.println("Sem nenhum animal na máquina no momento.");
            return;
        }

        this.shampoo -= 2;
        this.water -= 10;

        pet.setClean (true);
        System.out.println("O pet " + pet.getName() + " esta limpo.");
    }

    public void addWater(){

        if (water == 30){
            System.out.println("A capacidade de agua da maquina está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo(){

        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina está no máximo");
            return;
        }

        shampoo += 2;
    }

//o get nao tinha que ser anter de todo o codigo? questao de ordem dos fatores mesmo

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }
//poderia usar o if, mas eu poderia por um out print?
    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){

        if (!this.clean){
            System.out.println("A maquina ta suja e precisa de limpeza");
            return;
        }
   
        if (hasPet()){
            System.out.println("O animal " + this.pet.getName() + " esta na maquina agora");
            return;
        }

        this.pet = pet;
    }

    public void removePet(){

        this.clean = this.pet.isClean();
        System.out.println("O animal " + this.pet.getName() + " está limpo." );
        this.pet = null;
    }

    public void wash(){

        this.shampoo -= 2;
        this.water -= 10;
        this.clean = true;

        System.out.println("A maquina está limpa");
    }
}