public class NextDayCalculator {
    private int day;
    private int month;
    private int year;
    public NextDayCalculator() {
    }
    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void display(){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day>31){
                    System.out.println("ngày không hợp lệ");
                }else if (day==31){
                    System.out.println(this.toString());
                    setDay(1);
                    if (month==12){
                        setMonth(1);
                        setYear(year+1);
                    }else {
                        setMonth(month+1);
                    }
                    System.out.println(this.toString());
                }
                else {
                    System.out.println(this.toString());
                    setDay(day+1);
                    System.out.println(this.toString());
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day>30){
                    System.out.println("ngày không hợp lệ");
                }else if (day==30){
                    System.out.println(this.toString());
                    setDay(1);
                    setMonth(month+1);
                    System.out.println(this.toString());
                }else {
                    System.out.println(this.toString());
                    setDay(day+1);
                    System.out.println(this.toString());
                }
                break;
            case 2:
                if (year%400==0||(year%4==0&&year%100!=0)){
                    if (day>29){
                        System.out.println("ngày không hợp lệ");
                    }else if (day==29){
                        System.out.println(this.toString());
                        setDay(1);
                        setMonth(month+1);
                        System.out.println(this.toString());
                    }else {
                        System.out.println(this.toString());
                        setDay(day+1);
                        System.out.println(this.toString());
                    }
                }else {
                    if (day>28){
                        System.out.println("ngày không hợp lệ");
                    }else if (day==28){
                        System.out.println(this.toString());
                        setDay(1);
                        setMonth(month+1);
                        System.out.println(this.toString());
                    }else {
                        System.out.println(this.toString());
                        setDay(day+1);
                        System.out.println(this.toString());
                    }
                }
                break;
            default:
                System.out.println("tháng không hợp lệ");
        }
    }
    @Override
    public String toString() {
        return  day + "/" + month + "/" + year;
    }
}
