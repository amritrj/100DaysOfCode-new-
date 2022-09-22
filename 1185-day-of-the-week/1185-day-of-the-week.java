class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int days=day-1;
        int dim[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String week[]={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
    
    for(int y=1971;y<year;y++)
        days+=isLeapYear(y)?366:365;
    for(int m=1;m<month;m++)
        days+=dim[m-1];
    
    if(isLeapYear(year) && month>2)  //if given year is leap year then feb month will be 29 but in general we have taken 28 so here we have to add 1 
        days++;
    
    return week[days%7];
}

public boolean isLeapYear(int year)
{
    
    if(year%400==0)
        return true;
    else if(year%4==0 && year%100!=0)
        return true;
    else
        return false;
        
    }
}