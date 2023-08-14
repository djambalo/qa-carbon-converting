// Code is easy to read and effective at the job. - William Yoder
public class Data {
//    Instance variables amount, unit, and downloadSpeed
    private double amount ;
    private String unit;
    private int speed;

//    Constructor
    public Data( double amount , String unit , int speed){
        this.amount = amount;
        this.unit = unit;
        this.speed = speed;
    }


//    Class methods
    public double convertToMegabytes(){
        double megabits = 0.00;

        if(unit.equals("bytes")){
             megabits = amount / (1024 * 1024 );
        }else if (unit.equals("kilobytes")){
             megabits = amount / 1024;
        }else if (unit.equals("megabytes")){
             megabits = amount * 1;
        }else if(unit.equals("gigabytes")){
             megabits = amount * 1024 ;
        } else {
            throw new IllegalArgumentException();
        }
        return megabits;
    }
    public double calculateDownloadTime(){
        double second = convertToMegabytes() / speed * 8;
        return second;
    }
    public String getFormattedDownloadTime(){
        int second = (int) calculateDownloadTime() % 60  ;
        int minute = (int) calculateDownloadTime() / 60 ;
        return minute + " minutes " + second + " seconds";
    }
    public String toString(){
        return "Data: " + amount+ " " + unit + "\n" +
                "Download Time: "+ getFormattedDownloadTime();
    }
}
