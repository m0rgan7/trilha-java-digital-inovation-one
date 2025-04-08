class Usuario {
    
    public static void main(String[] args) throws Exeption {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual " + smartTv.volume);

        System.out.println("tv ligada?" + smartTv.ligada);
        System.out.println("qual o canal atual?" + smartTv.canal);
        System.out.println("qual o volume atual?" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTV.desligar();
        System.out.println("Novo status -> TV desligada?" + smartTv.ligada);

    }
} 