public class Flight {

    private final int MAX_SEATS=25;
    private String flightNo;
    private int numberofPassengers;
    private String []listOfPassengers= new String[MAX_SEATS];

    public String[] getListOfPassengers() {
        return listOfPassengers;
    }

    public void setListOfPassengers(String[] listOfPassengers) {
        this.listOfPassengers = listOfPassengers;
    }

    public int getNumberofPassengers() {
        return numberofPassengers;
    }

    public void setNumberofPassengers(int numberofPassengers) {
        this.numberofPassengers = numberofPassengers;
    }

    public String getflightNo(){
        return flightNo;
    }

    public void setFlightNo(String flightNo){
        this.flightNo = flightNo;
    }

    public boolean reservationSeat(String passengerName) {
        if(numberofPassengers < MAX_SEATS){
            for (int i = 0; i < getListOfPassengers().length; i++) {
                if (listOfPassengers[i] == null) {
                    listOfPassengers[i] = passengerName;
                    numberofPassengers++;
                    return true;
                }
            }
        }
        return false;
    }

    public String cancelReservation(String passengerName) {
        for (int i = 0; i < getListOfPassengers().length; i++) {
            if (listOfPassengers[i].equals(passengerName)) {
                listOfPassengers[i] = null;
                numberofPassengers--;
                return "Passenger: " + passengerName + " is deleted.";
            }
        }
        return "Reservation is not found.";
    }

    public int numberOfPassengers(){
        return numberofPassengers ;
    }

    public String checkName(String passengerName){
        for (int i = 0; i < getListOfPassengers().length; i++) {
            if (passengerName.equals(listOfPassengers[i])) {
                return "Passenger " + passengerName + " is found on " +  (i+1);
            }
        }
        return "Passenger is not found. " ;
    }

    public void printPassenger(){
        for (int i = 0; i < getListOfPassengers().length; i++) {
            if (listOfPassengers[i] != null) {
             System.out.println("Seat number: " + (i+1)  + " reserved by " +  listOfPassengers[i]);
            }
        }
    }
}


