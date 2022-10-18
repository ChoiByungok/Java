package ch06;

public class BirthDay {

    private int day;
    private int month;
    private int year;
    boolean isValid = true;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31){
            isValid = false;
        }
        else{
            this.day = day;
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12){
            isValid = false;
        }
        else {
            this.month = month;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void showBirthDayInfo(){

        if(isValid){
            System.out.println(getYear() + "년 " + getMonth() + "월 " + getDay() + "일 입니다.");
        }
        else{
            System.out.println("유효하지 않은 날짜입니다.");
        }

    }
}
