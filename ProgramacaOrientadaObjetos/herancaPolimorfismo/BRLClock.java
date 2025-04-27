package ProgramacaOrientadaObjetos.herancaPolimorfismo;

public non-sealed class BRLClock extends Clock{

    //por que final?
    Clock convert(final Clock clock){

        switch (clock) {
            case (USClock usClock) -> {
                this.minute = usClock.getMinute();
                this.second = usClock.getSecond();
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() +12;
                usClock.getHour();
            }
        }
        return null;
    }   

}