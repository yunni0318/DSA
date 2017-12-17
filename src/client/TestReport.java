/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.DeliverymanLinkedQueue;
import entity.Deliveryman;
import entity.OrderDelivery;
import java.util.ArrayList;

/**
 *
 * @author PC2
 */
public class TestReport {

    public TestReport() {
        ArrayList<OrderDelivery> odList = new ArrayList<>();
        DeliverymanLinkedQueue<Deliveryman> dList = new DeliverymanLinkedQueue<>();
        OrderDelivery od = new OrderDelivery(1, "20:00", "13/12/2017", "Ckk", "", 0, "Tony", "MCD", 10, "Pending");
        odList.add(od);
        od = new OrderDelivery(2, "20:00", "13/12/2017", "Yunni", "", 0, "Alex", "MCD", 20, "Pending");
        odList.add(od);
        od = new OrderDelivery(3, "20:00", "13/12/2017", "SBS", "", 0, "Alex", "MCD", 30, "Pending");
        odList.add(od);
        od = new OrderDelivery(4, "20:00", "13/12/2017", "Cheng", "", 0, "Tony", "MCD", 40, "Pending");
        odList.add(od);
        od = new OrderDelivery(5, "20:00", "13/12/2017", "Evon", "", 0, "Alex", "MCD", 50, "Pending");
        odList.add(od);
        Deliveryman d = new Deliveryman("Tony", "", "", "", "", 0, "");
        dList.enqueue(d);
        d = new Deliveryman("Alex", "", "", "", "", 0, "");
        dList.enqueue(d);
        int totalDistance;
        int totalDelivery;
        for (int i = 0; i < dList.getSize(); i++) {
            Deliveryman deliveryman = dList.dequeue();
            dList.enqueue(deliveryman);
            totalDistance = 0;
            totalDelivery = 0;
            for (int j = 0; j < odList.size(); j++) {
                if (odList.get(j).getdName().equals(deliveryman.getdName())) {
                    totalDistance += odList.get(j).getDistance();
                    totalDelivery++;
                }
            }
            System.out.println(deliveryman.getdName() + " " + totalDistance + " " + totalDelivery);
        }
    }

    public static void main(String[] a) {
        new TestReport();
    }
}
