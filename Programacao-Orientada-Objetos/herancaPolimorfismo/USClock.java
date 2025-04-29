package herancaPolimorfismo;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator(){
        return periodIndicator;
    }

    public void setAfterMidday(){
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

    public String getTime(){
        return super.getTime() + "  " + this.periodIndicator;
    }

    Clock convert(final Clock clock){
        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock){
            case USClock usclock ->{
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator;
            }

            case BRLClock brlClock -> this.setHour (brlClock.getHour());
        }
        return this;
    }  

}