package abstracaoEncapsulamento.controleBanhoPetshop;

public class Pet {
    
    private final String name;

    private boolean clean;

    public pet (String name){
        this.name = name;
        this.clean = false;
    }

    public String getName(){
        return name;
    }

    public boolen isClean(){
        return clean;
    }

    public void setClean(boolean){
        this.clean = clean;
    }
}