/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.DeliverymanLinkedList;
import adt.OrderItemLinkedList;
import adt.OrderLinkedList;
import adt.ScheduleLinkedList;
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

    public static ArrayList<Affiliate> afList = new ArrayList<>();
    public static ArrayList<Customer> cusList = new ArrayList<>();
    public static DeliverymanLinkedList<Deliveryman> dList = new DeliverymanLinkedList<>();
    public static OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();
    public static OrderItemLinkedList<OrderItem> oiList = new OrderItemLinkedList<>();
    public static ScheduleLinkedList<Schedule> sList=new ScheduleLinkedList<>();

    public static void initAffiliate() {
        Affiliate af = new Affiliate("MCD", "", "", "", "", "51000");
        afList.add(af);
    }

    public static void initCustomer() {
        Customer cus = new Customer("Ckk", "", "", "", "", "53000");
        cusList.add(cus);
    }

    public static void initDeliveryman() {
        Deliveryman d = new Deliveryman("Tony", "", "", "", "", "", "", 0, "");
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
