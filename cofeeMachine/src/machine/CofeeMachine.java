package machine;

import java.util.Scanner;

public class CofeeMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int cofeeBeans = 120;
        int cups = 9;
        int money = 550;
        //String cofeeType = "1";
        //printWhatIHave(water, milk, cofeeBeans, cups, money);

        //String action;
        //String action;
        //String action = sc.next();
        mainMenu(water, milk, cofeeBeans, cups, money);
        //buy(cofeeType, water, milk, cofeeBeans, cups, money);
    }

    static void findRes(int cupsNeeded, int minCup) {
        if (minCup < cupsNeeded) {
            System.out.println("No, I can make only " + minCup + " cup(s) of coffee");
        }
        if (minCup == cupsNeeded) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (minCup > cupsNeeded) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (minCup - cupsNeeded) + " more than that)");
        }

    }

    static void printWhatIHave(int water, int milk, int coffeBeans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$"+ money + " of money");
        //mainMenu(water, milk, coffeBeans, cups, money);
    }

    static void buy(String cofeeType, int water, int milk, int cofeeBeans, int cups, int money) {
        if (cofeeType.equals("1")) {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
            }
            if (cofeeBeans < 16) {
                System.out.println("Sorry, not enough cofeebeans!");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            } else if(water >= 250 && cofeeBeans >= 16 && cups >= 1){    
                //250 ml of water and 16 g of coffee beans. It costs $4, 1 cup
                System.out.println("I have enough resources, making you a coffee!");
                //System.out.println();
                water = water - 250;
                cofeeBeans = cofeeBeans - 16;
                money = money + 4;
                cups = cups - 1;
            }
        } else if (cofeeType.equals("2")) {

            if (water < 350) {
                System.out.println("Sorry, not enough water!");
            }
            if (cofeeBeans < 20) {
                System.out.println("Sorry, not enough cofeebeans!");
            }
            if (milk < 75) {
                System.out.println("Sorry, not enough milk!");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            } else if(water >= 350 && cofeeBeans >= 20 && milk >= 75 && cups >= 1){
                System.out.println("I have enough resources, making you a coffee!");
                //350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7, 1 cup
                water = water - 350;
                milk = milk - 75;
                cofeeBeans = cofeeBeans - 20;
                money = money + 7;
                cups = cups - 1;
            }
        } else if (cofeeType.equals("3")) {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
            }
            if (cofeeBeans < 12) {
                System.out.println("Sorry, not enough cofeebeans!");
            }
            if (milk < 100) {
                System.out.println("Sorry, not enough milk!");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            } else if(water >= 200 && cofeeBeans >= 12 && milk >= 100 && cups >= 1){
                System.out.println("I have enough resources, making you a coffee!");
                //200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6, 1 cup
                water = water - 200;
                milk = milk - 100;
                cofeeBeans = cofeeBeans - 12;
                money = money + 6;
                cups = cups - 1;
            }
        } else if (cofeeType.equals("back")) {
            mainMenu(water, milk, cofeeBeans, cups, money);
        }
        //mainMenu(water, milk, cofeeBeans, cups, money);
        //printWhatIHave(water, milk, cofeeBeans, cups, money);
    }

    static void fill(int water, int milk, int cofeeBeans, int cups, int money) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int addedWater = sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addedMilk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addedCofee = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addedCups = sc.nextInt();

        milk = milk + addedMilk;
        water = water + addedWater;
        cofeeBeans = cofeeBeans + addedCofee;
        cups = cups + addedCups;

        mainMenu(water, milk, cofeeBeans, cups, money);
    }

    static void take(int water, int milk, int coffeBeans, int cups, int money) {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println("");
        mainMenu(water, milk, coffeBeans, cups, money);
    }

    static void mainMenu(int water, int milk, int cofeeBeans, int cups, int money) {
        String cofeeType;
        String action = "test";
        while (!(action.equals("exit"))){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    cofeeType = sc.next();
                    buy(cofeeType, water, milk, cofeeBeans, cups, money);
                    break;
                case "fill":
                    fill(water, milk, cofeeBeans, cups, money);
                    break;
                case "take":
                    take(water, milk, cofeeBeans, cups, money);
                    break;
                case "remaining":
                    printWhatIHave(water, milk, cofeeBeans, cups, money);
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    mainMenu(water, milk, cofeeBeans, cups, money);
                    System.out.println();
                    break;
        }}
        /*do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    cofeeType = sc.next();
                    buy(cofeeType, water, milk, cofeeBeans, cups, money);
                    break;
                case "fill":
                    fill(water, milk, cofeeBeans, cups, money);
                    break;
                case "take":
                    take(water, milk, cofeeBeans, cups, money);
                    break;
                case "remaining":
                    printWhatIHave(water, milk, cofeeBeans, cups, money);
                    //mainMenu(water, milk, cofeeBeans, cups, money);
                    System.out.println();
                    break;

            }
        } while (!(action.equals("exit")));*/
    }
}
