package ProgramacaOrientedaObjetos.herancaPolimorfismo.User;

public class ViewClock{
    public static void main (String [] args){
        Clock brlclock = new brlClock();
        brlclock.setSecond (0);
        brlclock.setMinute (0);
        brlclock.setHour (25);


        System.out.println(brlclock.getTime());

        System.out.println (new USClock().convert(brlclock).getTime());
    }
}