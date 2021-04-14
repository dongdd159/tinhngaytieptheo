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
    public int getLastdayofmonth(){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (year%400==0||(year%4==0&&year%100!=0)){
                    return 29;
                }else {
                    return 28;
                }
            default:
                return 30;
        }
    }
    public boolean checkMonth(){
        if (month<13){
            return true;
        }
        return false;
    }
    public void setTomorrow(){
        if (day==getLastdayofmonth()){
            if (month==12){
                setDay(1);
                setMonth(1);
                setYear(year+1);
            }else {
                setDay(1);
                setMonth(month+1);
            }
        }else {
            setDay(day+1);
        }
    }
    @Override
    public String toString() {
        return  day + "/" + month + "/" + year;
    }
}
