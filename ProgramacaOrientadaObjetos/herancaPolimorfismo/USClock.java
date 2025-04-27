package ProgramacaOrientadaObjetos.herancaPolimorfismo;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator(){
        return periodIndicator;
    }

    public void serAfterMidday(){
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }

    public void setHour(int hour){
        setBeforeMidday();
        if ((hour > 12) && (hour <=23)) {
           setBeforeMidday();
            this.hour = hour - 12;
        } else if (hour >= 24){
            this.hour = 0;
        } else{
             this.hour = hour;
        }
    }


    Clock convert(final Clock clock){
        return null;
    }  

}