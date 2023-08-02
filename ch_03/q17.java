package ch_03;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user_inp = sc.nextInt();

        String inp_name_user, inp_name_cpu;

        int cpu_inp = (int) (Math.random() * 3);

        if (user_inp == 0)
            inp_name_user = "scissor";
        else if (user_inp == 1)
            inp_name_user = "rock";
        else
            inp_name_user = "paper";

        if (cpu_inp == 0)
            inp_name_cpu = "scissor";
        else if (cpu_inp == 1)
            inp_name_cpu = "rock";
        else
            inp_name_cpu = "paper";

        

        if ((user_inp == 0 && cpu_inp == 0) || (user_inp == 1 && cpu_inp == 1) || (user_inp == 2 && cpu_inp == 2))
            System.out.println("The computer is " + inp_name_cpu + ". You are " + inp_name_user + " too. It is a draw");
        
        else if ((user_inp == 0 && cpu_inp == 2) || (user_inp == 1 && cpu_inp == 0) || (user_inp == 2 && cpu_inp == 1))
            System.out.println("The computer is " + inp_name_cpu + ". You are " + inp_name_user + ". You win");
        
        else
            System.out.println("The computer is " + inp_name_cpu + ". You are " + inp_name_user + ". You lose");

    }
}
