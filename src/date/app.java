package date;

import java.util.Calendar;
public class app {
public static void main(String[] args) {
Calendar calendar = Calendar.getInstance();

calendar.add(Calendar.MONTH, 2);
System.out.println("la date d'expiration du produit Délice est : " + calendar.getTime());

calendar.add(Calendar.MONTH, 9);
System.out.println("la date d'expiration du produit Vitalait est : " + calendar.getTime());
calendar.add(Calendar.YEAR, 1);
calendar.add(Calendar.MONTH, 1);
System.out.println("la date d'expiration du produit Sicam est : " + calendar.getTime());






}
}