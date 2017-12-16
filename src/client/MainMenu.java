/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.DeliverymanLinkedQueue;
import adt.OrderLinkedList;
import entity.Affiliate;
import entity.Customer;
import entity.Deliveryman;
import entity.OrderDelivery;
import java.util.ArrayList;

/**
 *
 * @author PC2
 */
public class MainMenu {

    public static ArrayList<Affiliate> afList = new ArrayList<>();
    public static ArrayList<Customer> cusList = new ArrayList<>();
    public static DeliverymanLinkedQueue<Deliveryman> dList = new DeliverymanLinkedQueue<>();
    public static OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();

    public static void initAffiliate() {
        Affiliate af = new Affiliate("MCD", "", "", "", "51000", "");
        afList.add(af);
    }

    public static void initCustomer() {
        Customer cus = new Customer("Ckk", "", "", "", "", "53000", "");
        cusList.add(cus);
    }

    public static void initDeliveryman() {
        Deliveryman d = new Deliveryman("Tony", "", "", "", "", 0, "");
        dList.enqueue(d);
        d = new Deliveryman("Alex", "", "", "", "", 0, "");
        dList.enqueue(d);
    }

    public static void initOrderDelivery() {
        OrderDelivery od = new OrderDelivery(1, "20:00", "13/12/2017", "Ckk", 0, "Tony", "MCD", 10, "Pending");
        odList.add(od);
        od = new OrderDelivery(2, "20:00", "13/12/2017", "Yunni", 0, "Alex", "MCD", 20, "Pending");
        odList.add(od);
        od = new OrderDelivery(3, "20:00", "13/12/2017", "SBS", 0, "Alex", "MCD", 30, "Pending");
        odList.add(od);
        od = new OrderDelivery(4, "20:00", "13/12/2017", "Cheng", 0, "Tony", "MCD", 40, "Pending");
        odList.add(od);
        od = new OrderDelivery(5, "20:00", "13/12/2017", "Evon", 0, "Alex", "MCD", 50, "Pending");
        odList.add(od);
    }
}
