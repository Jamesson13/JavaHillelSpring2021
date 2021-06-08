package Lesson20HW;

import java.util.Random;

public class ATM {
    public static void main(String[] args) {
        ATMIn in = new ATMIn();
        ATMOut out = new ATMOut();

        in.start();
        out.start();
    }


}

class ATMIn extends Thread {
    @Override
    public void run() {
        final String orgName = Thread.currentThread().getName();
        Thread.currentThread().setName(orgName + " - Putting money from an ATM");
        Random random = new Random();
        int value = 0;
        for (int i = 0; i < 20; i++) {
            value = random.nextInt(5000);
            try {
                Thread.sleep(5000);
                System.out.println("Thread name >> " + currentThread().getName());
                ATMPutGet.putMoney(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}

class ATMOut extends Thread {
    @Override
    public void run() {
        final String orgName = Thread.currentThread().getName();
        Thread.currentThread().setName(orgName + " - Getting money from an ATM");
        Random random = new Random();
        int value = 0;
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(5000);
                value = random.nextInt(5000);
                System.out.println("Thread name >> " + currentThread().getName());
                ATMPutGet.getMoney(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}
