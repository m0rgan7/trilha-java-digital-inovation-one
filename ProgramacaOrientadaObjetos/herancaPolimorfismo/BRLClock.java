package ProgramacaOrientadaObjetos.herancaPolimorfismo;

public non-sealed class BRLClock extends USClock {

    //por que final?
    Clock convert(final Clock clock){

        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock) {
            
            case (USClock usClock) -> {
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() +12 : usClock.getHour();
            }

            case (BRLClock brlClock) -> super.convert(clock);

        }
        return this;
    }   

}