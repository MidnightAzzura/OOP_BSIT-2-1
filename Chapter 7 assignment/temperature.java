package JavaAssignment;


interface tempCon{
    double convert(double roomtemperature, double humidity); // interface that will be used as a function later
}

class Simpletemp implements tempCon{

    private static final double MAX_HUMIDITY = 100.0;

    @Override
    public double convert(double roomtemperature, double humidity) {
        // TODO Auto-generated method stub
        double feeltemp = roomtemperature * (1 - humidity / MAX_HUMIDITY);
        return feeltemp; // returns it
    }
}
public class temperature {

    public static void main(String[] args){

        double roomtemperature = 25.0; // sample room temp
        double humidity = 50.0; // sample humidity %

        tempCon converter = new Simpletemp();
        double feeltemp= converter.convert(roomtemperature, humidity);

        System.out.println("Feels like temperature: " + feeltemp + " °C ");

    }
    
}
