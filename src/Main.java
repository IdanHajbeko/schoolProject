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

    public static void exit(){
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
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("InterruptedException : %s%n", e);
        }
    }

    public static void needHelp(){
        clear();
        money += 50;
        System.out.println(PURPLE+"You got another" + GREEN+ "50"+PURPLE+"$"+RESET);
    }

    public static int amount(){
        clear();
        System.out.println(GREEN+"""
                                                                         /$$   \s
                                                                        | $$   \s
                  /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$   /$$ /$$$$$$$  /$$$$$$ \s
                 |____  $$| $$_  $$_  $$ /$$__  $$| $$  | $$| $$__  $$|_  $$_/ \s
                  /$$$$$$$| $$ \\ $$ \\ $$| $$  \\ $$| $$  | $$| $$  \\ $$  | $$   \s
                 /$$__  $$| $$ | $$ | $$| $$  | $$| $$  | $$| $$  | $$  | $$ /$$
                |  $$$$$$$| $$ | $$ | $$|  $$$$$$/|  $$$$$$/| $$  | $$  |  $$$$/
                 \\_______/|__/ |__/ |__/ \\______/  \\______/ |__/  |__/   \\___/ \s
                                                                               \s
                                                                               \s
                                                                               \s
                """+RESET);
        int amount;
        do{
            System.out.print("Enter how much money you want to put: ");
            amount = input.nextInt();
            if (amount <= money) return amount;
            else{
                System.out.println(RED+"You don't have enough money"+RESET);
                System.out.println(RED+"You can enter -1 if you give up"+RESET);
            }
        } while (amount != -1);
        return -1;
    }

    // print logo functions
    public static void printLogo(){
        String logo = """
                                                                                                                                            \s
                                                                                                                ''''''                      \s
                DDDDDDDDDDDDD                  AAA   VVVVVVVV           VVVVVVVVIIIIIIIIIIDDDDDDDDDDDDD         '::::'   SSSSSSSSSSSSSSS    \s
                D::::::::::::DDD              A:::A  V::::::V           V::::::VI::::::::ID::::::::::::DDD      '::::' SS:::::::::::::::S   \s
                D:::::::::::::::DD           A:::::A V::::::V           V::::::VI::::::::ID:::::::::::::::DD    ':::''S:::::SSSSSS::::::S   \s
                DDD:::::DDDDD:::::D         A:::::::AV::::::V           V::::::VII::::::IIDDD:::::DDDDD:::::D  ':::'  S:::::S     SSSSSSS   \s
                  D:::::D    D:::::D       A:::::::::AV:::::V           V:::::V   I::::I    D:::::D    D:::::D ''''   S:::::S               \s
                  D:::::D     D:::::D     A:::::A:::::AV:::::V         V:::::V    I::::I    D:::::D     D:::::D       S:::::S               \s
                  D:::::D     D:::::D    A:::::A A:::::AV:::::V       V:::::V     I::::I    D:::::D     D:::::D        S::::SSSS            \s
                  D:::::D     D:::::D   A:::::A   A:::::AV:::::V     V:::::V      I::::I    D:::::D     D:::::D         SS::::::SSSSS       \s
                  D:::::D     D:::::D  A:::::A     A:::::AV:::::V   V:::::V       I::::I    D:::::D     D:::::D           SSS::::::::SS     \s
                  D:::::D     D:::::D A:::::AAAAAAAAA:::::AV:::::V V:::::V        I::::I    D:::::D     D:::::D              SSSSSS::::S    \s
                  D:::::D     D:::::DA:::::::::::::::::::::AV:::::V:::::V         I::::I    D:::::D     D:::::D                   S:::::S   \s
                  D:::::D    D:::::DA:::::AAAAAAAAAAAAA:::::AV:::::::::V          I::::I    D:::::D    D:::::D                    S:::::S   \s
                DDD:::::DDDDD:::::DA:::::A             A:::::AV:::::::V         II::::::IIDDD:::::DDDDD:::::D         SSSSSSS     S:::::S   \s
                D:::::::::::::::DDA:::::A               A:::::AV:::::V          I::::::::ID:::::::::::::::DD          S::::::SSSSSS:::::S   \s
                D::::::::::::DDD A:::::A                 A:::::AV:::V           I::::::::ID::::::::::::DDD            S:::::::::::::::SS    \s
                DDDDDDDDDDDDD   AAAAAAA                   AAAAAAAVVV            IIIIIIIIIIDDDDDDDDDDDDD                SSSSSSSSSSSSSSS      \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                                                                                                                                            \s
                        CCCCCCCCCCCCC               AAA                 SSSSSSSSSSSSSSS IIIIIIIIIINNNNNNNN        NNNNNNNN     OOOOOOOOO    \s
                     CCC::::::::::::C              A:::A              SS:::::::::::::::SI::::::::IN:::::::N       N::::::N   OO:::::::::OO  \s
                   CC:::::::::::::::C             A:::::A            S:::::SSSSSS::::::SI::::::::IN::::::::N      N::::::N OO:::::::::::::OO\s
                  C:::::CCCCCCCC::::C            A:::::::A           S:::::S     SSSSSSSII::::::IIN:::::::::N     N::::::NO:::::::OOO:::::::O
                 C:::::C       CCCCCC           A:::::::::A          S:::::S              I::::I  N::::::::::N    N::::::NO::::::O   O::::::O
                C:::::C                        A:::::A:::::A         S:::::S              I::::I  N:::::::::::N   N::::::NO:::::O     O:::::O
                C:::::C                       A:::::A A:::::A         S::::SSSS           I::::I  N:::::::N::::N  N::::::NO:::::O     O:::::O
                C:::::C                      A:::::A   A:::::A         SS::::::SSSSS      I::::I  N::::::N N::::N N::::::NO:::::O     O:::::O
                C:::::C                     A:::::A     A:::::A          SSS::::::::SS    I::::I  N::::::N  N::::N:::::::NO:::::O     O:::::O
                C:::::C                    A:::::AAAAAAAAA:::::A            SSSSSS::::S   I::::I  N::::::N   N:::::::::::NO:::::O     O:::::O
                C:::::C                   A:::::::::::::::::::::A                S:::::S  I::::I  N::::::N    N::::::::::NO:::::O     O:::::O
                 C:::::C       CCCCCC    A:::::AAAAAAAAAAAAA:::::A               S:::::S  I::::I  N::::::N     N:::::::::NO::::::O   O::::::O
                  C:::::CCCCCCCC::::C   A:::::A             A:::::A  SSSSSSS     S:::::SII::::::IIN::::::N      N::::::::NO:::::::OOO:::::::O
                   CC:::::::::::::::C  A:::::A               A:::::A S::::::SSSSSS:::::SI::::::::IN::::::N       N:::::::N OO:::::::::::::OO\s
                     CCC::::::::::::C A:::::A                 A:::::AS:::::::::::::::SS I::::::::IN::::::N        N::::::N   OO:::::::::OO  \s
                        CCCCCCCCCCCCCAAAAAAA                   AAAAAAASSSSSSSSSSSSSSS   IIIIIIIIIINNNNNNNN         NNNNNNN     OOOOOOOOO    \s
                """;
        for (int i = 0; i < logo.length(); i++){
            System.out.print(GREEN+logo.charAt(i)+RESET);
            wait(1);
        }
        System.out.println("\n");
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

    public static void printLogoBlackJack(){
        System.out.println(GREEN+"""
                88          88                       88        88                       88        \s
                88          88                       88        ""                       88        \s
                88          88                       88                                 88        \s
                88,dPPYba,  88 ,adPPYYba,  ,adPPYba, 88   ,d8  88 ,adPPYYba,  ,adPPYba, 88   ,d8  \s
                88P'    "8a 88 ""     `Y8 a8"     "" 88 ,a8"   88 ""     `Y8 a8"     "" 88 ,a8"   \s
                88       d8 88 ,adPPPPP88 8b         8888[     88 ,adPPPPP88 8b         8888[     \s
                88b,   ,a8" 88 88,    ,88 "8a,   ,aa 88`"Yba,  88 88,    ,88 "8a,   ,aa 88`"Yba,  \s
                8Y"Ybbd8"'  88 `"8bbdP"Y8  `"Ybbd8"' 88   `Y8a 88 `"8bbdP"Y8  `"Ybbd8"' 88   `Y8a \s
                                                              ,88                                 \s
                                                            888P"                                 \s
                """+RESET);
    }

    public static void printLogoRoulette(){
        System.out.println(GREEN+"""
                  _____   ____  _    _ _      ______ _______ _______ ______\s
                 |  __ \\ / __ \\| |  | | |    |  ____|__   __|__   __|  ____|
                 | |__) | |  | | |  | | |    | |__     | |     | |  | |__  \s
                 |  _  /| |  | | |  | | |    |  __|    | |     | |  |  __| \s
                 | | \\ \\| |__| | |__| | |____| |____   | |     | |  | |____\s
                 |_|  \\_\\\\____/ \\____/|______|______|  |_|     |_|  |______|
                                                                           \s
                                                                           \s
                """+RESET);
    }

    // slot machine
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

    public static int playSlot (int amount) {
        if (amount == -1) return 0;
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

    public static void SlotEarningsInfo(){
        System.out.println("Every time you get 2 or 3 of the same digit you will get the sum of your digit according to the table below\n" +
                "multiplied by (the amount of money you put)/50 if there 2 digits the same /25 if all of the digits are the same");
        System.out.println("1=50\n2=100\n3=150\n4=200\n5=250\n6=300\n7=1000\n8=350\n9=400");
    } // todo: make it look better

    // roulette
    public static int playRoulette(int amount){
        if (amount == -1) return 0;
        String answer;
        while (true){
            System.out.print("Enter Even Odd or a number trough 1 to 36: ");
            answer = input.next().toLowerCase().trim();
            int result = spinRoulette();
            if (answer.equals("even")) {
                if (result%2==0){
                    rouletteWinner(amount*2);
                    return amount*2;
                }
                break;
            }
            else if (answer.equals("odd")) {
                if (result%2==1){
                    rouletteWinner(amount*2);
                    return amount*2;
                }
                break;
            }
            else{
                try {
                    if (Integer.parseInt(answer) > 0 && Integer.parseInt(answer)  <= 36){
                        if (result==Integer.parseInt(answer)){
                            rouletteWinner(amount*35);
                            return amount*35;
                        }
                        break;
                    }
                } catch (Exception _){}
            }
        }
        System.out.println(RED+"YOU LOST"+RESET);
        return 0;
    }

    public static void rouletteWinner(int amount){
        clear();
        System.out.println(GREEN+"""
                 __          _______ _   _ _   _ ______ _____ \s
                 \\ \\        / /_   _| \\ | | \\ | |  ____|  __ \\\s
                  \\ \\  /\\  / /  | | |  \\| |  \\| | |__  | |__) |
                   \\ \\/  \\/ /   | | | . ` | . ` |  __| |  _  /\s
                    \\  /\\  /   _| |_| |\\  | |\\  | |____| | \\ \\\s
                 __  \\/  \\/  _|_____|_| \\_|_| \\_|______|_|__\\_\\
                 \\ \\        / /_   _| \\ | | \\ | |  ____|  __ \\\s
                  \\ \\  /\\  / /  | | |  \\| |  \\| | |__  | |__) |
                   \\ \\/  \\/ /   | | | . ` | . ` |  __| |  _  /\s
                    \\  /\\  /   _| |_| |\\  | |\\  | |____| | \\ \\\s
                     \\/  \\/   |_____|_| \\_|_| \\_|______|_|  \\_\\
                                                              \s
                                                              \s
                """);
        for (int i =0; i<1000; i++){
            if (i%100==0)System.out.println();
            System.out.print(GREEN+amount+ RESET+ "$ ");
            wait(1);
        }
        System.out.println(RESET);
        wait(4000);
        clear();
        printLogoRoulette();
    }

    public static int spinRoulette(){
        int number = (int)(Math.random()*36);
        System.out.println("""
                            _             _             \s
                           (_)           (_)            \s
                  ___ _ __  _ _ __  _ __  _ _ __   __ _ \s
                 / __| '_ \\| | '_ \\| '_ \\| | '_ \\ / _` |\s
                 \\__ \\ |_) | | | | | | | | | | | | (_| |\s
                 |___/ .__/|_|_| |_|_| |_|_|_| |_|\\__, |\s
                     | |         | |    | | | |    __/ |\s
                  _ _|_|__  _   _| | ___| |_| |_ _|___/ \s
                 | '__/ _ \\| | | | |/ _ \\ __| __/ _ \\   \s
                 | | | (_) | |_| | |  __/ |_| ||  __/   \s
                 |_|  \\___/ \\__,_|_|\\___|\\__|\\__\\___|   \s
                """);
        wait(1000);
        System.out.println(YELLOW+"THE NUMBER IS");
        for (int i =0; i<1000; i++){
            if (i%100==0) System.out.println();
            System.out.print(PURPLE+number + " ");
            wait(1);
        }
        System.out.println(RESET);
        return number;
    }

    //black jack
    public static int playBlackJack(int amount) {
        if (amount == -1) return 0;

        System.out.println("PLAYER'S TURN");
        int playerTotal = playTurn();

        if (playerTotal > 21) {
            System.out.println("You busted! Dealer wins.");
            return 0;
        }

        System.out.println("\nDEALER'S TURN");
        int dealerTotal = dealerTurn();

        if (dealerTotal > 21) {
            System.out.println("Dealer busted! You win!");
            return (int) Math.round(amount * 1.5);
        } else if (playerTotal > dealerTotal) {
            System.out.println("You win!");
            return (int) Math.round(amount * 1.5);
        } else if (dealerTotal > playerTotal) {
            System.out.println("Dealer wins!");
            return 0;
        } else {
            System.out.println("It's a tie!");
            return amount;
        }
    }

    private static int playTurn() {
        int totalCards = 0;

        int card1 = drawCard();
        int card2 = drawCard();
        totalCards += card1 + card2;

        System.out.println("Your cards:");
        cardPrint(card1);
        cardPrint(card2);

        boolean play = true;
        while (play) {
            System.out.printf("(%sH%s)it, (%sS%s)tand, (%sD%s)ouble down\n",PURPLE,RESET,PURPLE,RESET,PURPLE,RESET);
            System.out.print("Enter your move: ");
            char move = input.next().toLowerCase().charAt(0);

            switch (move) {
                case 'h':
                    int newCard = drawCard();
                    System.out.println(YELLOW+"You drew:"+RESET);
                    cardPrint(newCard);
                    totalCards += cardVal(newCard);

                    if (totalCards > 21) {
                        System.out.println(RED+"Busted! Total: " + totalCards+RESET);
                        return totalCards;
                    }
                    break;

                case 's':
                    play = false;
                    break;

                case 'd':
                    int doubleCard = drawCard();
                    totalCards += doubleCard;

                    System.out.println("You doubled down and drew:");
                    cardPrint(doubleCard);

                    play = false;
                    break;

                default:
                    System.out.println("Invalid move. Please try again.");
            }
        }

        System.out.println("Final total: " + totalCards);
        return totalCards;
    }

    private static int dealerTurn() {
        int totalCards = 0;

        int card1 = drawCard();
        int card2 = drawCard();
        totalCards += card1 + card2;

        System.out.println("Dealer's cards:");
        cardPrint(card1);
        cardPrint(card2);

        while (totalCards < 17) {
            int newCard = drawCard();
            totalCards += newCard;

            System.out.println("Dealer drew:");
            cardPrint(newCard);
        }

        System.out.println("Dealer's final total: " + totalCards);
        return totalCards;
    }

    private static int drawCard() {
        return (int) (Math.random() * 13) + 1;
    }

    public static void cardPrint(int cardValue) {
        String cardSymbol = symbol(cardValue);
        if (cardValue == 10){
            System.out.printf("""
             _______
            |%s     |
            |       |
            |   %s  |
            |       |
            |_____%s|
            """, cardSymbol, cardSymbol, cardSymbol);
            return;
        }
        System.out.printf("""
             _______
            |%s     |
            |      |
            |   %s  |
            |      |
            |_____%s|
            """, cardSymbol, cardSymbol, cardSymbol);
    }

    public static String symbol(int cardValue) {
        return switch (cardValue) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 1 -> "A";
            default -> String.valueOf(cardValue);
        };
    }

    public static int cardVal(int cardValue){
        if (cardValue == 11 || cardValue == 12 || cardValue == 13) return 10;
        return cardValue;
    }

    // menus
    public static void slotMachineMenu(){
        clear();
        printLogoSlotMachine();
        boolean run = true;
        while (run){
            System.out.println("You have " +GREEN+ money+RESET+"$");
            System.out.println("1. Play\n2. Earnings info\n3. Exit\n");
            System.out.print("Enter your choice: ");
            switch (input.next().toLowerCase()){
                case "1" -> money += playSlot(amount());
                case "2" -> SlotEarningsInfo();
                case "3" -> run = false;
                default -> System.out.println(RED+"Enter only from the menu"+RESET);
            }
        }
        clear();
    }

    public static void rouletteMenu(){
        clear();
        printLogoRoulette();
        boolean run = true;
        while (run){
            System.out.println("You have " +GREEN+ money+RESET+"$");
            System.out.println("1. Play\n2. Exit\n");
            System.out.print("Enter your choice: ");
            switch (input.next().toLowerCase()){
                case "1" -> money += playRoulette(amount());
                case "2" -> run = false;
                default -> System.out.println(RED+"Enter only from the menu"+RESET);
            }
        }
        clear();
    }

    public static void blackJackMenu(){
        clear();
        printLogoBlackJack();
        boolean run = true;
        while (run){
            System.out.println("You have " +GREEN+ money+RESET+"$");
            System.out.println("1. Play\n2. Exit\n");
            System.out.print("Enter your choice: ");
            switch (input.next().toLowerCase()){
                case "1" -> money += playBlackJack(amount());
                case "2" -> run = false;
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
            System.out.println("1. Slot machine\n2. Black jack\n3. Roulette\n4. Need help\n5. Exit\n");
            System.out.print("What do you want to play? ");
            switch (input.next().toLowerCase()){
                case "1" -> slotMachineMenu();
                case "2" -> blackJackMenu();
                case "3" -> rouletteMenu();
                case "4" -> needHelp();
                case "5" -> run = false;
            }
        }
        exit();
    }
}