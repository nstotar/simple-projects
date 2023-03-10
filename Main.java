import java.util.Scanner;
import java.util.Random;
class Main{
    public static void main(String[] args) {
        int c = 0, w = 0;
        final String[] tools = {"rock", "paper", "scissor"};
        Random choice = new Random();
        int index = choice.nextInt(tools.length);
        String CC = tools[index];
        Scanner obj = new Scanner(System.in);
        System.out.println("---choose Your Gaming Mode---\n *)Press C for Comp |VS| Player\n *)Press M for Multiplayer");
        String Gmode = obj.nextLine();
        switch (Gmode) {
            //1st Case start here
            case "C" -> {
                System.out.println("\t IT'S BEST OF 3 GOOD LUCK\n");
                System.out.println("You Have chosen Computer|Vs| Player");
                for (int i = 0; i < 3; i++) {
                    System.out.println("---Type Your option---\n *)scissor \n *)rock \n *)paper ");
                    System.out.println("Enter your option");
                    String UC = obj.nextLine();
                    System.out.println("computer Choice is ");
                    System.out.println(CC);
                    if (CC.equals(UC)) {
                        System.out.println("Tie");
                    } else if ((CC.equals("paper") && UC.equals("rock")) || (CC.equals("scissor") && UC.equals("paper")) || (CC.equals("rock") && UC.equals("scissor"))) {
                        System.out.println("computer wins ");
                        c += 1;
                        if(c==2){break;}
                    } else if ((UC.equals("paper") && CC.equals("rock")) || (UC.equals("scissor") && CC.equals("paper")) || (UC.equals("rock") && CC.equals("scissor"))) {
                        System.out.println("User wins");
                        w += 1;
                        if(w==2){break;}
                    }
                }
                if (w > c) {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n user score is " + w + " he won the game\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                } else if (w < c) {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n Computer score is C" + c + " he won the game\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                } else {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n Computer score is " + c + "\n User score is " + w + "\n Game tie\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
              }
            //2nd Case start here
            case "M" -> {
                System.out.println("\t THE GAME IS GOING TO BE BEST OF 3 GOOD LUCK\n");
                System.out.println("You Have chosen Multiplayer Gaming mode");
                System.out.println("---Type Your option---\n *)scissor \n *)rock \n *)paper ");
                for (int x = 0; x < 3; x++) {
                    System.out.println("Enter 1st player choice :");
                    String fp = obj.nextLine();
                    System.out.println("Enter 2nd player choice :");
                    String sp = obj.nextLine();
                    if (fp.equals(sp)) {
                        System.out.println("Tie");
                    } else if ((fp.equals("paper") && sp.equals("rock")) || (fp.equals("scissor") && sp.equals("paper")) || (fp.equals("rock") && sp.equals("scissor"))) {
                        System.out.println("First player won");
                        c += 1;
                        if(c==2){break;}
                    } else if ((sp.equals("paper") && fp.equals("rock")) || (sp.equals("scissor") && fp.equals("paper")) || (sp.equals("rock") && fp.equals("scissor"))) {
                        System.out.println("Second player won");
                        w += 1;
                        if(w==2){break;}
                    }
                }
                if (w > c) {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nsecond player score is " + w + " he won the game\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                } else if (w < c) {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nFirst player score is " + c + " he won the game\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                } else {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n 1st player score is " + c + "\n 2nd player score is " + w + "\n Game Tie \n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                }
             }
            default -> System.out.println("Enter valid choice");
            }
        }
    }