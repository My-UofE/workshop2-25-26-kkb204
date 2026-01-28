public class MyBirthday {
    public static void main(String[] args) {
        int current_weekday = Integer.parseInt(args[0]);
        int current_date = Integer.parseInt(args[1]);
        int date_ob = Integer.parseInt(args[2]);

        int days_to = date_ob - current_date;
        int birthday = (days_to + current_weekday)%7;
        System.out.println(birthday);
    }
}
