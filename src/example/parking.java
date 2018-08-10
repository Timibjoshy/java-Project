package example;

import java.util.ArrayList;

/**
 * Created by expert on 7/4/18.
 */
public class parking {

    public parking(int type, int time, String id) {
        this.type = type;
        this.time = time;
        this.id = id;
    }

    int type;
    int time;
    String id;

    static void addVehicle(parking p, ArrayList<parking> obj) {//class name with object,arraylist,any object name
        if (obj.size()<3) {//if we add one vehicle first it check the available slots
            obj.add(p);
            System.out.println("added");
        } else {
            System.out.println("slot filed");
        }
    }

    static void removeVehicle(ArrayList<parking> parkings, String num) {
        for (parking p : parkings) {
            if (p.id.equals(num)) {
                parkings.remove(p);
                System.out.println("remove vehicle id" + num);
                System.out.println("amount to be paid=" + p.time * 50);
                break;
            }
        }
    }


    public static void main(String[] args) {
        parking p = new parking(2, 3, "101");
        parking p1 = new parking(2, 3, "102");
        parking p2 = new parking(2, 3, "103");
        parking p3 = new parking(2, 3, "104");
        parking p11 = new parking(2, 3, "401");
        parking p12 = new parking(2, 3, "402");
        parking p13 = new parking(2, 3, "403");
        parking p14 = new parking(2, 3, "404");
        ArrayList<parking> park2 = new ArrayList<>();//arraylist of 2 wheelers
        ArrayList<parking> park4 = new ArrayList<>();//arraylist of 3 wheelers
        addVehicle(p, park2);//object,arraylist name
        addVehicle(p1, park2);
        addVehicle(p2, park2);
        addVehicle(p3, park2);
        removeVehicle(park2, "101");
        addVehicle(p11, park4);
        addVehicle(p12, park4);
        addVehicle(p13, park4);
        addVehicle(p14, park4);
        removeVehicle(park4, "403");
        addVehicle(p14, park4);
    }
}