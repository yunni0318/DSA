/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.LListAdditem;
import adt.DeliverymanLinkedList;
import adt.LListAddAffiliate;
import adt.OrderItemLinkedList;
import adt.OrderLinkedList;
import adt.ScheduleLinkedList;
import entity.Item;
import entity.Affiliate;
import entity.Customer;
import entity.Deliveryman;
import entity.OrderDelivery;
import entity.OrderItem;
import entity.Schedule;
import java.util.ArrayList;

/**
 *
 * @author PC2
 */
public class MainMenu {

    public static LListAddAffiliate<Affiliate> afList = new LListAddAffiliate<>();
    public static ArrayList<Customer> cusList = new ArrayList<>();
    public static LListAdditem<Item> iList = new LListAdditem<>();
    public static DeliverymanLinkedList<Deliveryman> dList = new DeliverymanLinkedList<>();
    public static OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();
    public static OrderItemLinkedList<OrderItem> oiList = new OrderItemLinkedList<>();
    public static ScheduleLinkedList<Schedule> sList = new ScheduleLinkedList<>();
    public static String userName;
    public static boolean isFirstRun = true;

    public static void initAffiliate() {
        Affiliate af = new Affiliate("Homemade Chinese Restaurant", "Jalan Tembikai", "Kuala Lumpur", "Setapak", "53000","12345");
        afList.add(af);
        af = new Affiliate("Delicious Sushi Restaurant","Jalan Pisang", "Kuala Lumpur", "Setapak", "53000","12345");
        afList.add(af);
        af = new Affiliate("Kenny Roaster Restaurant","Jalan Durian", "Kuala Lumpur", "Setapak", "53000","12345");
        afList.add(af);
        af = new Affiliate("Bukit Bintang Nasi Lemak","Jalan Banana", "Kuala Lumpur", "Setapak", "53100","12345");
        afList.add(af);
        af = new Affiliate("All Noodle Restaurant","Jalan PV15", "Kuala Lumpur", "Setapak", "53100","12345");
        afList.add(af);
        af = new Affiliate("Rice Tong Restaurant","Jalan POPO", "Kuala Lumpur", "Setapak", "53100","12345");
        afList.add(af);
        af = new Affiliate("Special Spaghetti Restaurant","Jalan Kikab", "Kuala Lumpur", "Setapak", "53000","12345");
        afList.add(af);
        af = new Affiliate("Homemade Western Food","Jalan Juour", "Kuala Lumpur", "Setapak", "53000","12345");
        afList.add(af);
    }

    public static void initItem(){
        Item itf= new Item("Spicy Dry Noodle",7.00,"Homemade Chinese Restaurant");
        iList.add(itf);
        itf= new Item("Fried Rice with Chinese Sausage",8.00,"Homemade Chinese Restaurant");
        iList.add(itf);
        itf= new Item("Special Dumping Soup (4 pcs)",6.00,"Homemade Chinese Restaurant");
        iList.add(itf);
        itf= new Item("Lo Han Guo Herba Tea",3.00,"Homemade Chinese Restaurant");
        iList.add(itf);
        itf= new Item("Sushi Set (salmon, maguro, ebi,anago)",20.00,"Delicious Sushi Restaurant");
        iList.add(itf);
        itf= new Item("Ramen Soup", 10.00,"Delicious Sushi Restaurant");
        iList.add(itf);
        itf= new Item("Chicken Teriyaki Bento",15.00,"Delicious Sushi Restaurant");
        iList.add(itf);
        itf= new Item("Tropicana Twister Orange Juice",4.00,"Delicious Sushi Restaurant");
        iList.add(itf);
        itf= new Item("Honey Roaster Chicken",16.00,"Kenny Roaster Restaurant");
        iList.add(itf);
        itf= new Item("Spicy Roaster Chicken",18.00,"Kenny Roaster Restaurant");
        iList.add(itf);
        itf= new Item("Glutinous Oil Rice",8.00,"Kenny Roaster Restaurant");
        iList.add(itf);
        itf= new Item("Pepsi",3.00 ,"Kenny Roaster Restaurant");
        iList.add(itf);
        itf= new Item("Nasi Lemak with Egg",5.00,"Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf= new Item("Nasi Lemak with Fried Chicken",8.00,"Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf= new Item("Nasi Lemak with Currry Chicken",9.00,"Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf= new Item("Bentong Cincau",3.00,"Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf= new Item("Special Dry Noodle",8.00,"All Noodle Restaurant");
        iList.add(itf);
        itf= new Item("Special Noodle Soup",9.00,"All Noodle Restaurant");
        iList.add(itf);
        itf= new Item("Spicy Noodle Soup",9.00,"All Noodle Restaurant");
        iList.add(itf);
        itf= new Item("Honey Lemon Tea",3.00,"All Noodle Restaurant");
        iList.add(itf);
        itf= new Item("Salted Fish Pork Rice",7.00,"Rice Tong Restaurant");
        iList.add(itf);
        itf= new Item("Shrimp Fried Rice",8.00,"Rice Tong Restaurant");
        iList.add(itf);
        itf= new Item("Sweet and Sour Pork Rice",8.00,"Rice Tong Restaurant");
        iList.add(itf);
        itf= new Item("Chinese Tea",2.00,"Rice Tong Restaurant");
        iList.add(itf);
        itf= new Item("Special Spaghetti",12.00,"Special Spaghetti Restaurant");
        iList.add(itf);
        itf= new Item("Baked Cheese Spaghetti",18.00,"Special Spaghetti Restaurant");
        iList.add(itf);
        itf= new Item("Spaghetti Bolognese",15.00,"Special Spaghetti Restaurant");
        iList.add(itf);
        itf= new Item("Lemon Tea",3.00,"Special Spaghetti Restaurant");
        iList.add(itf);
        itf= new Item("Homemade Pork Chop",15.00,"Homemade Western Food");
        iList.add(itf);
        itf= new Item("Black Peper Chicken Chop",15.00,"Homemade Western Food");
        iList.add(itf);
        itf= new Item("Fried Rice",7.00,"Homemade Western Food");
        iList.add(itf);
        itf= new Item("Red Tea",3.00,"Homemade Western Food");
        iList.add(itf);

    }

    public static void initCustomer() {
        Customer cus = new Customer("Ckk", "", "", "", "", "53000");
        cusList.add(cus);
    }

    public static void initDeliveryman() {
        Deliveryman d = new Deliveryman("Alex", "Active", "123", "123", "123", "alex", "123", 0, "Available");
        dList.add(d);
        d = new Deliveryman("Tony", "Active", "", "", "", "tony", "123", 0, "Available");
        dList.add(d);
    }

    public static void initOrderDelivery() {
        OrderDelivery od = new OrderDelivery(1001, "10:00", "13/12/2017", "Ckk", "0123456789", 22.00, 5.00, 27.00, "Tony", "Homemade Chinese Restaurant", 10, "Completed");
        odList.add(od);
        od = new OrderDelivery(1002, "11:00", "14/12/2017", "Yunni", "", 5.00, 5.00, 10.00, "Alex", "Bukit Bintang Nasi Lemak", 20, "Completed");
        odList.add(od);
        od = new OrderDelivery(1003, "12:00", "15/12/2017", "SBS", "", 12.00, 5.00, 17.00, "Alex", "Special Spaghetti Restaurant", 10, "Completed");
        odList.add(od);
        od = new OrderDelivery(1004, "13:00", "16/12/2017", "Cheng", "", 22.00, 5.00, 27.00, "Tony", "Homemade Western Food", 30, "Pending");
        odList.add(od);
        od = new OrderDelivery(1005, "14:00", "22/12/2017", "Evon", "", 15.00, 5.00, 20.00, "Alex", "All Noodle Restaurant", 25, "Pending");
        odList.add(od);
    }

    public static void initOrderItem() {
        OrderItem oi = new OrderItem(1001, "Spicy Dry Noodle", 2, 14.00);
        oiList.add(oi);
        oi = new OrderItem(1001, "Fried Rice with Chinese Sausage", 1, 8.00);
        oiList.add(oi);
        
        oi = new OrderItem(1002, "Nasi Lemak with Egg", 1, 5.00);
        oiList.add(oi);
        
        oi = new OrderItem(1003, "Special Spaghetti", 1, 12.00);
        oiList.add(oi);
        
        oi = new OrderItem(1004, "Homemade Pork Chop", 1, 15.00);
        oiList.add(oi);
        oi = new OrderItem(1004, "Fried Rice", 1, 7.00);
        oiList.add(oi);
        
        oi = new OrderItem(1005, "Spicy Noodle Soup", 1, 12.00);
        oiList.add(oi);
        oi = new OrderItem(1005, "Honey Lemon Tea", 1, 3.00);
        oiList.add(oi);
    }

}
