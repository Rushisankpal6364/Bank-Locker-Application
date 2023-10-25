import java.util.*;

public class BankAccount {
    private int acid;
    private String name;
    private String city;
    private static int id = 100;
    private Locker l1;
    private int locCounter=0;
    public int getAcid() {
        return acid;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public static int getId() {
        return id;
    }

    public Locker getL1() {
        return l1;
    }


    private class Locker {
        private int lockerid;
        private int duration;
        private double charges;
        private static int id = 100;


        public Locker() {
            lockerid = 1;
            duration = 12;
            charges = 300;
            id++;
        }

        public Locker(int duration) {
            this.lockerid = id++;
            this.duration = duration;
            this.charges = 30;
        }


        public String toString() {
            return "lockerid = " + lockerid + "duration = " + duration + "charges = " + charges + "duration = " + (duration * charges);
        }

    }


    public BankAccount() {
        acid = 101;
        name = "Rushi";
        city = "Mumbai";
        l1 = new Locker();
    }

    public BankAccount(String name, String city) {
        this.acid = id++;
        this.name = name;
        this.city = city;
    }

    public void assignlocker(int duration) {
        this.l1 = new Locker(duration);
    }


    public String toString() {
        if (l1 == null) {
            return "acid = " + acid + "name = " + name + "city = " + city + " No locker assign";
        } else {
            return "acid = " + acid + "name = " + name + "city = " + city + l1;
        }


    }


}

