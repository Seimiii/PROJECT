package Menu;
import java.util.Scanner;

public class Menu {
	
	

    // ANSI colors
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String PURPLE = "\u001B[35m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print(YELLOW + "  ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗      ██████╗ ██╗   ██╗██████╗ \n");
        System.out.print("  ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ██╔═══██╗██║   ██║██╔══██╗ \n");
        System.out.print("  ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║    ██║   ██║██║   ██║██████╔╝ \n");
        System.out.print("  ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║    ██║   ██║██║   ██║██╔══██╗ \n");
        System.out.print("  ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝    ╚██████╔╝╚██████╔╝██║  ██║ \n");
        System.out.print("   ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝      ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ \n" + RESET );
        		 
        		                                                                   
       
        System.out.println(PURPLE + "   ************************************************MENU-DRIVEN SYSTEM!**********************************************" + RESET);
        System.out.println(BLUE + "                                               ^APPLICATION IS NOW LOADING^: " + RESET);

        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(BLUE + "██████" + RESET);
        }

        int choice;

        while (true) {
        	
        	
        	
        
        	System.out.print(YELLOW +"                                          ⣠⡴⡾⠛⠛⠛⡲⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        	System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                 ⣠⣾⠳⠃⢀⣠⣤⣀⠀⠑⡙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        	System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                 ⢈⣾⡇⠃⡰⡋⠄⠀⠈⢳⡄⠘⢨⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        	System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                  ⠸⣯⡗⠄⣧⠀⣠⣔⣖⣤⣇⠰⢘⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠀⠀  ⢿⣞⢵⡈⠻⢥⢤⠴⢊⡙⣯⣷⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠀⠀  ⠈⠻⣧⣍⢆⣀⡀⠂⢄⣪⠖⠙⡦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠀⠀⠀  ⠙⣿⢶⠿⣟⠋⠁⠀⠡⠹⡵⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                   ⡰⡛⣩⠩⠚⣄⣀⠀⠡⣀⢹⢃⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⢠⢦⠶⠴⡤⠶⢖⠲⠞⠙⠈⠈⠀⠀⠀⠀⠈⠁⠉⠘⣹⠏⡈⠉⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⠀⢸⣧⣟⡤⣃⣻⢃⡀⠀⢀⠀⡀⢀⠀⣀⠀⡀⢀⢀⣀⣻⠄⠃⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀                  ⢸⡷⠾⣷⣿⣷⣷⣻⣟⡻⣟⡻⣞⣿⣛⢿⡻⠟⡻⢿⣿⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⠈⠉⠙⠳⠿⣵⠛⡇⢁⣢⡴⠡⢬⠾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀                  ⢸⠄⣳⠌⢸⣁⡴⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                  ⢸⡃⢼⠀⢸⡏⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                  ⢸⡁⢸⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                 ⢀⣼⡇⢸⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print( "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                 ⣴⡛⢹⡇⢸⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                 ⢀⣠⢴⡖⠀⠀⠀⡀⣾⠋⠀⢸⡇⢹⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠈⢯⠑⠶⡤⣀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀                ⢀⣤⡾⠏⠁⢸⠃⠀⠀⠐⣜⡅⠠⠀⢸⡇⢺⡇⠀⣿⠀⠀⠀⠀⠀⠐⠈⠐⠘⡆⡄⠙⣤⡙⠦⡀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀                ⣠⣶⢻⡜⠁⠀⠀⡿⠀⠀⠀⠡⣯⠀⠀⠀⢸⠇⣹⡇⠀⢹⠀⠀⠀⠀⠀⠀⠐⠀⠀⡇⠀⠀⠈⣆⠅⠈⠳⣄⠀⠀\n");
            System.out.print("⠀⠀⠀⠀               ⣠⣾⢻⣜⡏⠀⠀⠀⠀⣟⠀⠀⠈⠁⡾⠀⠀⠀⣸⠃⣸⡇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢀⠀⠸⡐⢀⣌⡊⢣⡀\n");
            System.out.print("⠀⠀               ⢠⣟⣞⣯⢾⣐⢢⢲⣤⡀⣿⠀⠀⠐⢂⢳⣆⠂⠀⣾⠁⢴⡇⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⢨⢃⡔⣿⠀⠀⡇⠃⢿⡍⠓⠷\n");
            System.out.print("⠀⠀               ⣿⣞⡇⣏⠦⣹⡇⠹⣿⡄⠀⠀⠀⠀⠱⣷⣄⡏⡐⢸⡇⠀⠀⢿⠀⠀⠀⠀⠀⢀⠀⠸⠋⠀⢸⠀⢰⡇⢠⢸⡗⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀               ⣿⡾⣽⢡⣚⠹⣇⠀⠈⠀⠀⠀⠀⠑⢡⠀⣹⠺⢶⣭⡧⣀⡀⢸⣆⠀⠀⠀⠀⠀⠊⠀⡇⠀⡼⢀⢾⡅⢀⢸⠇⠀⠀\n");
            System.out.print("⠀⠀⠀      ⠀          ⠸⣿⡽⣇⢪⢓⣻⣄⠀⠀⠀⠀⠀⠀⡀⣠⡏⠱⢂⣞⡏⠉⠉⠓⠳⣾⡣⠦⢦⡠⣀⠀⣡⠜⢁⣾⠣⠀⢇⡟⠀⠀⠀\n");
            System.out.print("⠀⠀⠀       ⠀⠀         ⢻⣟⡿⣷⡕⢆⣛⠷⣤⣀⣀⣀⣠⠶⡋⠔⡡⠆⣯⡇⠀⠀⠀⠀⠈⠙⠒⠶⠾⠓⠊⢁⢴⡽⢡⢂⢍⠞⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀     ⠀⠀           ⠙⣿⣽⣻⢷⣅⡻⣰⢩⢍⠣⢆⡓⠬⡑⠦⡑⣮⣧⢀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢴⠽⢋⢔⢄⡵⠋⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀      ⠀⠀⠀          ⠙⣿⣯⡟⣿⣷⢫⣮⠓⣬⡜⢡⠙⣴⢱⡏⣿⠀⡄⠀⠀⠀⠀⢠⣴⡟⠊⠁⡔⣤⢻⠉⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀        ⠀⠀⠀         ⠙⠻⢷⣯⣟⡾⣿⢦⣷⣉⣳⢤⡿⣹⢿⠀⢂⠀⣄⡴⠞⠋⠁⣠⡤⠗⠋⠁⠁⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠈⠙⠛⠿⣿⣾⣽⣻⣾⣝⣳⢿⢀⡴⠚⠁⠀⡠⠔⡋⠅⠂⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀          ⠉⠛⢷⣯⣟⣯⣿⠎⠀⢀⠴⠋⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠈⠻⣯⣿⠀⡰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠘⢿⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                  ⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET );
        			
            
            System.out.print(GREEN +"   ████████  █████  ██████   █████  ██     ██     ██ ███████      █████  ██████  ███████     ████████ ██   ██ ███████ \n");
            System.out.print("      ██    ██   ██ ██   ██ ██   ██ ██     ██     ██ ██          ██   ██ ██   ██ ██             ██    ██   ██ ██      \n");
            System.out.print("      ██    ███████ ██   ██ ███████ ██     ██  █  ██ █████       ███████ ██████  █████          ██    ███████ █████   \n");
            System.out.print("      ██    ██   ██ ██   ██ ██   ██        ██ ███ ██ ██          ██   ██ ██   ██ ██             ██    ██   ██ ██      \n");
            System.out.print("      ██    ██   ██ ██████  ██   ██ ██      ███ ███  ███████     ██   ██ ██   ██ ███████        ██    ██   ██ ███████ \n");
            System.out.print("                                                                                                                   \n"); 
            System.out.print(GREEN +"  ██╗           ██╗ █████╗ ██╗   ██╗ █████╗ ███╗   ██╗ ██████╗██╗  ██╗ ██████╗ ██████╗       ██╗\n");
            System.out.print("  ╚██╗          ██║██╔══██╗██║   ██║██╔══██╗████╗  ██║██╔════╝██║  ██║██╔═══██╗██╔══██╗     ██╔╝\n");
            System.out.print("   ╚██╗         ██║███████║██║   ██║███████║██╔██╗ ██║██║     ███████║██║   ██║██████╔╝    ██╔╝ \n");
            System.out.print("   ██╔╝    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║██║╚██╗██║██║     ██╔══██║██║   ██║██╔══██╗    ╚██╗ \n");
            System.out.print("  ██╔╝     ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║██║ ╚████║╚██████╗██║  ██║╚██████╔╝██║  ██║     ╚██╗\n");
            System.out.print("  ╚═╝       ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝      ╚═╝\n" + RESET ); 
            
            		                                                                                       
        	

        	System.out.print("================================================================================================");
            System.out.println(PURPLE + "= =\n\t\t                              MAIN MENU   " + RESET);
            System.out.println(YELLOW + "=                                          1. CALCULATOR   " + RESET);
            System.out.println(CYAN + "=                                          2. CONVERSION OF:  " + RESET);
            System.out.println(BLUE + "=                                             - MM, CM, M" + RESET);
            System.out.println(BLUE + "=                                             - ODD AND EVEN" + RESET);
            System.out.println(BLUE + "=                                             - AREA AND CIRCUMFERENCE OF A CIRCLE" + RESET);
            System.out.println(YELLOW + "=                                          3. ABOUT US" + RESET);
            System.out.println(CYAN + "=                                          4. EXIT" + RESET);
            System.out.print("=================================================================================================");

            System.out.print(RED + " ^CHOOSE A NUMBER^: " + RESET);
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println(BLUE+ "~~OPENING CALCULATOR~~" + RESET);
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    System.out.print(BLUE + "█" + RESET);
                }

                int calcChoice = -1;
                while (calcChoice != 0) {
                    System.out.println(YELLOW + "\n---CALCULATOR---" + RESET);
                    System.out.println("  1. Start Calculator");
                    System.out.println("  0. Back to Main Menu");
                    System.out.print("Enter choice: ");
                    calcChoice = input.nextInt();

                    if (calcChoice == 1) {
                        System.out.print("Enter first number: ");
                        double num1 = input.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = input.nextDouble();
                        System.out.print("Choose operation (+, -, *, /): ");
                        char op = input.next().charAt(0);

                        double result = 0;
                        if (op == '+') result = num1 + num2;
                        else if (op == '-') result = num1 - num2;
                        else if (op == '*') result = num1 * num2;
                        else if (op == '/') {
                            if (num2 != 0) result = num1 / num2;
                            else {
                                System.out.println(RED + "Error: Division by zero!" + RESET);
                                continue;
                            }
                        } else {
                            System.out.println(RED + "Invalid operator!" + RESET);
                            continue;
                        }
                        System.out.println(BLUE + "Result = " + result + RESET);

                    } else if (calcChoice == 0) {
                        System.out.println(YELLOW + "Returning to Main Menu..." + RESET);
                        break;
                    } else {
                        System.out.println(RED + "Invalid choice!" + RESET);
                    }
                }

            } else if (choice == 2) {
                System.out.println(GREEN + "OPENING CONVERSION PROGRAM" + RESET);
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    System.out.print(GREEN + "█" + RESET);
                }

                System.out.println(CYAN + "\nAVAILABLE PROGRAMS" + RESET);
                System.out.println(GREEN + "1. MM, CM, M" + RESET);
                System.out.println(GREEN + "2. ODD OR EVEN" + RESET);
                System.out.println(GREEN + "3. AREA AND CIRCUMFERENCE OF A CIRCLE" + RESET);
                System.out.print(GREEN + "CHOOSE PROGRAM: " + RESET);

                int sub = input.nextInt();

                if (sub == 1) {
                    System.out.print(YELLOW + "ENTER VALUE IN MILLIMETERS (mm): " + RESET);
                    double mm = input.nextDouble();
                    double cm = mm / 10;
                    double m = mm / 1000;
                    System.out.println(mm + " mm = " + cm + " cm = " + m + " m");
                } else if (sub == 2) {
                    System.out.print(YELLOW + "ENTER A NUMBER: " + RESET);
                    int num = input.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " is EVEN");
                    } else {
                        System.out.println(num + " is ODD");
                    }
                } else if (sub == 3) {
                    System.out.print(CYAN + "ENTER RADIUS OF CIRCLE: " + RESET);
                    double r = input.nextDouble();
                    double area = Math.PI * r * r;
                    double circumference = 2 * Math.PI * r;
                    System.out.println(RED + "AREA = " + RESET + area);
                    System.out.println(GREEN + "CIRCUMFERENCE = " + RESET + circumference);
                } else {
                    System.out.println(RED + "Invalid sub-choice!" + RESET);
                }

            } else if (choice == 3) {
                // ✅ Call the About Us method
                aboutUs();
            } else if (choice == 4) {
                System.out.println(RED + "Exiting the application. BABUU!" + RESET);
                break;
            } else {
                System.out.println(RED + "Invalid main menu choice!" + RESET);
            }
        }

        input.close();
    }

    // ✅ ABOUT US METHOD
    public static void aboutUs() {
    	
        System.out.println(RED +"⠀     ⣴⠶⢦⣤⠶⠶⣄⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀ ⣇⠀  ♥  ⢀⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠙⢧⣄⠀⣠⠞⠁⠀⠀⠀⠀");
        System.out.println("⠀⠀ ⠀⣀⡀⠀ ⠉⠛ ⣠⣄⡀⠀⠀⠀");
        System.out.println("⠀⠀⠀⡞⠉⠙⢳⣄⢀⡾⠁⠈⣿⠀⠀⠀");
        System.out.println("⠀⠀ ⠀⢻⡄⠀ ⠀⠙⢿⡇⠀⢰⠇⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠙⣦⡀  ⠀⠹⣦⡟⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀  ⠈⢳⣄⠀⠀⠈⠻⣄⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀  ⠀⡞⠋⠛⢧⡀  ⠀⠘⢷⡀⠀");
        System.out.println("⠀⠀⠀⢠⡴⠾⣧⡀⠀  ⠀⠹⣦⠀⠀  ⠈⢿⡄");
        System.out.println("⠀⠀⣀⣿⠀⠀⠈⠻⣄⠀⠀⠀⠀⠀       ⠈⣷");
        System.out.println("⢠⡟⠉⠛⢷⣄⠀⠀⠈⠀⠀⠀⠀     ⠀  ⠀⣰⠏");
        System.out.println("⠀⢷⡀⠀⠀⠉⠃⠀⠀⠀⠀⠀⠀       ⠀⠀⣴⠏");
        System.out.println("  ⠈⠻⣦⡀⠀⠀⠀⠀⠀      ⢀⣠⠞⠁⠀⠀");
        System.out.println("⠀⠀    ⠈⠙⠶⣤⣤⣤⡤⠶⠋⠁⠀⠀⠀⠀" + RESET);
    	
        System.out.println(PURPLE + "\n============================" + RESET);
        System.out.println(PURPLE + "         ABOUT US           " + RESET);
        System.out.println(PURPLE + "============================" + RESET);

        System.out.println("This program was developed by the ABAYLAROO Team.");
        System.out.println("Menu-driven application that offers:");
        System.out.println("- A basic calculator");
        System.out.println("- Unit conversions (mm, cm, m)");
        System.out.println("- Odd or even number checker");
        System.out.println("- Area and circumference calculator for circles");
        System.out.println("Developers:  ");

        System.out.println(PURPLE + "============================" + RESET);
    }
}

