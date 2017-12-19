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

    public static void initAffiliate() {
        Affiliate af = new Affiliate("Homemade Chinese Restaurant", "12345", "Jalan Tembikai", "Kuala Lumpur", "Setapak", "53000");
        afList.add(af);
        af = new Affiliate("Delicious Sushi Restaurant", "12345", "Jalan Pisang", "Kuala Lumpur", "Setapak", "53000");
        afList.add(af);
        af = new Affiliate("Kenny Roaster Restaurant", "12345", "Jalan Durian", "Kuala Lumpur", "Setapak", "53000");
        afList.add(af);
        af = new Affiliate("Bukit Bintang Nasi Lemak", "12345", "Jalan Banana", "Kuala Lumpur", "Setapak", "53100");
        afList.add(af);
        af = new Affiliate("All Noodle Restaurant", "12345", "Jalan PV15", "Kuala Lumpur", "Setapak", "53100");
        afList.add(af);
        af = new Affiliate("Rice Tong Restaurant", "12345", "Jalan POPO", "Kuala Lumpur", "Setapak", "53100");
        afList.add(af);
        af = new Affiliate("Special Spaghetti Restaurant", "12345", "Jalan Kikab", "Kuala Lumpur", "Setapak", "53000");
        afList.add(af);
        af = new Affiliate("Homemade Western Food", "12345", "Jalan Juour", "Kuala Lumpur", "Setapak", "53000");
        afList.add(af);
    }

    public static void initItem() {
        Item itf = new Item("Spicy Dry Noodle", 10.00, "Homemade Chinese Restaurant");
        iList.add(itf);
        itf = new Item("Fried Rice with Chinese Sausage", 11.00, "Homemade Chinese Restaurant");
        iList.add(itf);
        itf = new Item("Special Dumping Soup (4 pcs)", 8.00, "Homemade Chinese Restaurant");
        iList.add(itf);
        itf = new Item("Lo Han Guo Herba Tea", 4.00, "Homemade Chinese Restaurant");
        iList.add(itf);
        itf = new Item("Sushi Set (salmon, maguro, ebi,anago)", 22.99, "Delicious Sushi Restaurant");
        iList.add(itf);
        itf = new Item("Ramen Soup", 18.99, "Delicious Sushi Restaurant");
        iList.add(itf);
        itf = new Item("Chicken Teriyaki Bento", 19.99, "Delicious Sushi Restaurant");
        iList.add(itf);
        itf = new Item("Tropicana Twister Orange Juice", 19.99, "Delicious Sushi Restaurant");
        iList.add(itf);
        itf = new Item("Honey Roaster Chicken", 18.99, "Kenny Roaster Restaurant");
        iList.add(itf);
        itf = new Item("Spicy Roaster Chicken", 19.99, "Kenny Roaster Restaurant");
        iList.add(itf);
        itf = new Item("Glutinous Oil Rice", 15.99, "Kenny Roaster Restaurant");
        iList.add(itf);
        itf = new Item("Pepsi", 4.99, "Kenny Roaster Restaurant");
        iList.add(itf);
        itf = new Item("Nasi Lemak with Egg", 5.99, "Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf = new Item("Nasi Lemak with Fried Chicken", 8.99, "Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf = new Item("Nasi Lemak with Currry Chicken", 8.99, "Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf = new Item("Bentong Cincau", 3.99, "Bukit Bintang Nasi Lemak");
        iList.add(itf);
        itf = new Item("Special Dry Noodle", 11.99, "All Noodle Restaurant");
        iList.add(itf);
        itf = new Item("Special Noodle Soup", 14.99, "All Noodle Restaurant");
        iList.add(itf);
        itf = new Item("Spicy Noodle Soup", 14.99, "All Noodle Restaurant");
        iList.add(itf);
        itf = new Item("Honey Lemon Tea", 4.99, "All Noodle Restaurant");
        iList.add(itf);
        itf = new Item("Salted Fish Pork Rice", 18.99, "Rice Tong Restaurant");
        iList.add(itf);
        itf = new Item("Shrimp Fried Rice", 17.99, "Rice Tong Restaurant");
        iList.add(itf);
        itf = new Item("Sweet and Sour Pork Rice", 19.99, "Rice Tong Restaurant");
        iList.add(itf);
        itf = new Item("Chinese Tea", 3.99, "Rice Tong Restaurant");
        iList.add(itf);
        itf = new Item("Special Spaghetti", 23.99, "Special Spaghetti Restaurant");
        iList.add(itf);
        itf = new Item("Baked Cheese Spaghetti", 25.99, "Special Spaghetti Restaurant");
        iList.add(itf);
        itf = new Item("Spaghetti Bolognese", 24.99, "Special Spaghetti Restaurant");
        iList.add(itf);
        itf = new Item("Lemon Tea", 4.99, "Special Spaghetti Restaurant");
        iList.add(itf);
        itf = new Item("Homemade Pork Chop", 20.99, "Homemade Western Food");
        iList.add(itf);
        itf = new Item("Black Peper Chicken Chop", 18.99, "Homemade Western Food");
        iList.add(itf);
        itf = new Item("Fried Rice", 7.99, "Homemade Western Food");
        iList.add(itf);
        itf = new Item("Red Tea", 5.99, "Homemade Western Food");
        iList.add(itf);

    }

    public static void initCustomer() {
        Customer cus = new Customer("Ckk", "", "", "", "", "53000");
        cusList.add(cus);
    }

    public static void initDeliveryman() {
        Deliveryman d = new Deliveryman("Tony", "Active", "123", "123", "123", "tony", "123", 0, "Available");
        dList.add(d);
        d = new Deliveryman("Alex", "", "", "", "", "", "", 0, "");
        dList.add(d);
    }

    public static void initOrderDelivery() {
        OrderDelivery od = new OrderDelivery(1001, "10:00", "13/12/2017", "Ckk", "0123456789", 20.00, 5.00, 25.00, "Tony", "Homemade Chinese Restaurant", 10, "Completed");
        odList.add(od);
        od = new OrderDelivery(1002, "20:00", "13/12/2017", "Yunni", "", 0, 0, 0, "Alex", "MCD", 20, "Pending");
        odList.add(od);
        od = new OrderDelivery(1003, "20:00", "13/12/2017", "SBS", "", 0, 0, 0, "Alex", "MCD", 30, "Pending");
        odList.add(od);
        od = new OrderDelivery(1004, "20:00", "13/12/2017", "Cheng", "", 0, 0, 0, "Tony", "MCD", 40, "Pending");
        odList.add(od);
        od = new OrderDelivery(1005, "20:00", "13/12/2017", "Evon", "", 0, 0, 0, "Alex", "MCD", 50, "Pending");
        odList.add(od);
    }

    public static void initOrderItem() {
        OrderItem oi = new OrderItem(1001, "Spicy Dry Noodle", 2, 20.00);
        oiList.add(oi);
        oi = new OrderItem(1001, "Fried Rice with Chinese Sausage", 1, 11.00);
        oiList.add(oi);
    }
}
