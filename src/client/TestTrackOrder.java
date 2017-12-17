/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entity.Affiliate;
import entity.Customer;
import entity.OrderDelivery;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author PC2
 */
public class TestTrackOrder {

    public TestTrackOrder() {
        OrderDelivery od = new OrderDelivery(1, "20:00", "13/12/2017", "Dilraba", "", 0, 0, 0, "", "KFC", 0, "");
        ArrayList<Affiliate> afList = new ArrayList<>();
        ArrayList<Customer> cusList = new ArrayList<>();
        Affiliate af = new Affiliate("KFC", "", "", "", "51000", "");
        afList.add(af);
        Customer cus = new Customer("Dilraba", "", "", "", "", "53000", "");
        cusList.add(cus);
        String fromPostcode = "";
        String toPostcode = "";
        double distance = 0;
        for (int i = 0; i < afList.size(); i++) {
            if (afList.get(i).getAfName().equals(od.getAfName())) {
                fromPostcode = afList.get(i).getAfPostcode();
            }
        }
        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).getCusName().equals(od.getCusName())) {
                toPostcode = cusList.get(i).getCusPostcode();
            }
        }
        if (fromPostcode.equals("51000") && toPostcode.equals("53000")) {
            distance = 3;
        } else {
            //other postcode combination
        }
        double distancePerMinute = 0.6;
        double minute = distance / distancePerMinute;
        System.out.println(fromPostcode + " " + toPostcode + " " + minute);
        /*
        GregorianCalendar cal = new GregorianCalendar();
        int currentHour = cal.get(GregorianCalendar.HOUR_OF_DAY);
        int currentMinute = cal.get(GregorianCalendar.MINUTE);
        int orderHour = Integer.parseInt(od.getOdTime().substring(0, 2));
        int orderMinute = Integer.parseInt(od.getOdTime().substring(3, 5));
        System.out.println(orderHour + ":" + orderMinute + "  " + currentHour + ":" + currentMinute);
        if (currentMinute < orderMinute) {
            currentMinute += 60;
            currentHour--;
        }
        int minuteDiff = currentMinute - orderMinute + (currentHour - orderHour) * 60;
        System.out.println(minuteDiff);
         */
    }

    public static void main(String[] a) {
        new TestTrackOrder();
    }
}
