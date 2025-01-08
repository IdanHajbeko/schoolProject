import java.util.Scanner;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";

    public static int money = 1000;
    public static Scanner input = new Scanner(System.in);

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean exit(){
        clear();
        System.out.println(GREEN+ """
                                                     __        __                          \s
                                                    /  |      /  |                         \s
                  ______    ______    ______    ____$$ |      $$ |____   __    __   ______ \s
                 /      \\  /      \\  /      \\  /    $$ |      $$      \\ /  |  /  | /      \\\s
                /$$$$$$  |/$$$$$$  |/$$$$$$  |/$$$$$$$ |      $$$$$$$  |$$ |  $$ |/$$$$$$  |
                $$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |      $$ |  $$ |$$ |  $$ |$$    $$ |
                $$ \\__$$ |$$ \\__$$ |$$ \\__$$ |$$ \\__$$ |      $$ |__$$ |$$ \\__$$ |$$$$$$$$/\s
                $$    $$ |$$    $$/ $$    $$/ $$    $$ |      $$    $$/ $$    $$ |$$       |
                 $$$$$$$ | $$$$$$/   $$$$$$/   $$$$$$$/       $$$$$$$/   $$$$$$$ | $$$$$$$/\s
                /  \\__$$ |                                              /  \\__$$ |         \s
                $$    $$/                                               $$    $$/          \s
                 $$$$$$/                                                 $$$$$$/⠀⠀⠀⠀⠀⠀⠀
                """ +RESET);
        return false;
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("InterruptedException : %s%n", e);
        }
    }

    // print logo functions
    public static void printLogo(){

    }

    public static void printLogoSlotMachine(){
        System.out.println(GREEN+"""
                                              .-------.
                                              |Jackpot|
                                  ____________|_______|____________
                                 |  __    __    ___  _____   __    | \s
                                 | / _\\  / /   /___\\/__   \\ / _\\   |\s
                                 | \\ \\  / /   //  //  / /\\ \\\\ \\  25| \s
                                 | _\\ \\/ /___/ \\_//  / /  \\/_\\ \\ []|\s
                                 | \\__/\\____/\\___/   \\/     \\__/ []|
                                 |===_______===_______===_______===|
                                 ||*|\\_     |*| _____ |*|\\_     |*||
                                 ||*|| \\ _  |*||     ||*|| \\ _  |*||
                                 ||*| \\_(_) |*||*BAR*||*| \\_(_) |*||
                                 ||*| (_)   |*||_____||*| (_)   |*|| __
                                 ||*|_______|*|_______|*|_______|*||(__)
                                 |===_______===_______===_______===| ||
                                 ||*| _____ |*|\\_     |*|  ___  |*|| ||
                                 ||*||     ||*|| \\ _  |*| |_  | |*|| ||
                                 ||*||*BAR*||*| \\_(_) |*|  / /  |*|| ||
                                 ||*||_____||*| (_)   |*| /_/   |*|| ||
                                 ||*|_______|*|_______|*|_______|*||_//
                                 |===_______===_______===_______===|_/
                                 ||*|  ___  |*|   |   |*| _____ |*||
                                 ||*| |_  | |*|  / \\  |*||     ||*||
                                 ||*|  / /  |*| /_ _\\ |*||*BAR*||*||             \s
                                 ||*| /_/   |*|   O   |*||_____||*||       \s
                                 ||*|_______|*|_______|*|_______|*||
                                 |lc=___________________________===|
                                 |  /___________________________\\  |
                                 |   |                         |   |
                                _|    \\_______________________/    |_
                               (_____________________________________)
                """+RESET);
    }

    // slot machine
    public static void needHelp(){
        clear();
        money += 50;
        System.out.println(PURPLE+"You got another" + GREEN+ "50"+PURPLE+"$"+RESET);
    }

    public static void drawSlot(String a, String b, String c){
        clear();
        System.out.printf("""
                      .-------.
                   oO{-JACKPOT-}Oo
                   .=============. __
                   |             |(  )
                   | [%s] [%s] [%s] | ||
                   |             | ||
                   |             |_||
                   | xxx ::::::: |--'
                   | ooo ::::::: |
                   | $$$ ::::::: |
                   |             |
                   |      __ === |
                   |_____/__\\____|
                  /###############\\
                 /#################\\
                |###################|

                """, a, b, c);
    }

    public static void animate(int num1, int num2, int num3){
        clear();
        for (int j = Math.abs(9-num1); j%10 != num1; j++){
            drawSlot(YELLOW+j+RESET, " ", " ");
            wait(300);
        }
        for (int j = Math.abs(9-num2); j%10 != num2; j++){
            drawSlot(PURPLE+num1+RESET, YELLOW+j%10+RESET, " ");
            wait(300);
        }
        for (int j = Math.abs(9-num3); j%10 != num3; j++){
            drawSlot(PURPLE+num1+RESET, PURPLE+num2+RESET, YELLOW+j%10+RESET);
            wait(300);
        }
        drawSlot(PURPLE+num1+RESET, PURPLE+num2+RESET, PURPLE+num3+RESET);
        wait(1000);
    }

    public static int play (int amount) {
        int slot1 = (int)(Math.random()* 8) + 1;
        int slot2 = (int)(Math.random()* 8) + 1;
        int slot3 = (int)(Math.random()* 8) + 1;

        int totalSlot1 = slot1*50;
        int totalSlot2 = slot2*50;
        int totalSlot3 = slot3*50;
        int sum = totalSlot1 + totalSlot2 + totalSlot3;
        animate(slot1, slot2, slot3);
        if (slot1 != slot2 && slot1 != slot3 && slot2 != slot3) {
            return -amount;
        }
        else if (slot1 != slot2 && slot2 != slot3) {
            return sum * amount/50;
        }
        else {
            return sum * amount/25;
        }
    }

    public static void amount(){
        clear();
        System.out.println(GREEN+"""
                          ___           ___       ___           ___    \s
                         /\\  \\         /\\__\\     /\\  \\         /\\  \\   \s
                        /::\\  \\       /:/  /    /::\\  \\        \\:\\  \\  \s
                       /:/\\ \\  \\     /:/  /    /:/\\:\\  \\        \\:\\  \\ \s
                      _\\:\\~\\ \\  \\   /:/  /    /:/  \\:\\  \\       /::\\  \\\s
                     /\\ \\:\\ \\ \\__\\ /:/__/    /:/__/ \\:\\__\\     /:/\\:\\__\\
                     \\:\\ \\:\\ \\/__/ \\:\\  \\    \\:\\  \\ /:/  /    /:/  \\/__/
                      \\:\\ \\:\\__\\    \\:\\  \\    \\:\\  /:/  /    /:/  /    \s
                       \\:\\/:/  /     \\:\\  \\    \\:\\/:/  /     \\/__/     \s
                        \\::/  /       \\:\\__\\    \\::/  /                \s
                         \\/__/         \\/__/     \\/__/                 \s
                    """+RESET);
        int amount;
        do{
            System.out.print("Enter how much money you want to put: ");
            amount = input.nextInt();
            if (amount <= money){
                money += play(amount);
                return;
            } else{
                System.out.println(RED+"You don't have enough money"+RESET);
                System.out.println(RED+"You can enter -1 if you give up"+RESET);
            }
        } while (amount != -1);
    }

    public static void earningsInfo(){
        System.out.println("Every time you get 2 or 3 of the same digit you will get the sum of your digit according to the table below\n" +
                "multiplied by (the amount of money you put)/50 if there 2 digits the same /25 if all of the digits are the same");
        System.out.println("1=50\n2=100\n3=150\n4=200\n5=250\n6=300\n7=1000\n8=350\n9=400");
    } // todo: make it look better

    public static void SlotMachineMenu(){
        clear();
        printLogoSlotMachine();
        boolean run = true;
        while (run){
            System.out.println("You have " +GREEN+ money+RESET+"$");
            System.out.println("1. Play\n2. Earnings info\n3. Need help\n4. Exit\n");
            System.out.print("Enter your choice: ");
            switch (input.next().toLowerCase()){
                case "1" -> amount();
                case "2" -> earningsInfo();
                case "3" -> needHelp();
                case "4" -> {return;}
                default -> System.out.println(RED+"Enter only from the menu"+RESET);
            }
        }
    }

    public static void main(String[] args) {
        clear();
        printLogo();
        boolean run = true;
        while (run){
            System.out.println("You have " +GREEN+ money+RESET+"$");
            System.out.println("1. Slot machine\n2. \n4. Exit\n");
        }
    }
}