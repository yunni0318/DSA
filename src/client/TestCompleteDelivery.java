/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entity.OrderDelivery;
import java.util.ArrayList;

/**
 *
 * @author PC2
 */
public class TestCompleteDelivery {

    public TestCompleteDelivery() {
        ArrayList<OrderDelivery> odList = new ArrayList<>();
        OrderDelivery od = new OrderDelivery(1, "20:00", "13/12/2017", "Dilraba", 0, "Tony", "MCD", 0, "Pending");
        odList.add(od);
        od = new OrderDelivery(2, "20:00", "13/12/2017", "Yunni", 0, "Alex", "MCD", 0, "Pending");
        odList.add(od);
        od = new OrderDelivery(3, "20:00", "13/12/2017", "Yunni", 0, "Alex", "MCD", 0, "Pending");
        odList.add(od);
        for (int i = 0; i < odList.size(); i++) {
            if (odList.get(i).getOdID() == 3) {
                odList.get(i).setStatus("Completed");
            }
        }
        for (int i = 0; i < odList.size(); i++) {
            System.out.println(odList.get(i).getOdID() + " " + odList.get(i).getdName() + " " + odList.get(i).getStatus());
        }
    }

    public static void main(String[] a) {
        new TestCompleteDelivery();
    }
}
