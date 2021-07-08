import java.util.Scanner;

//import jdk.internal.jshell.tool.resources.version;

import java.util.ArrayList;

public class tacToe {
    public static void main(String args[]){
        int x = 0, y = 0;
        int z = 0, w = 0;

        Scanner scanP1 = new Scanner(System.in);
        Scanner scanP12 = new Scanner(System.in);
        Scanner scanP2 = new Scanner(System.in);
        Scanner scanP22 = new Scanner(System.in);

        //String[] game = new String[9];
        String[] game = new String[]{"E ", "E ", "E "};
        String[] game2 = new String[]{"E ","E ","E "};
        String[] game3 = new String[]{"E ","E ","E "};
        
        for(int i=0;i<9;i++){
            System.out.println("\nPlayer 1 plays(type the coods x and y (0-2))\nx:");
            x=(scanP1.nextInt());            
            System.out.println("y: ");
            y=(scanP12.nextInt());
            
            

            if(x==0 && game[y]=="E "){
                game[y] = "X ";
            }else if(x==1 && game2[y]=="E "){
                game2[y] = "X ";
            }else if(x==2 && game3[y]=="E "){
                game3[y] = "X ";
            }else if(z == 0 && game[w]=="E "){
                game[w] = "O ";
            }else if(z == 1 && game[w]=="E "){
                game2[w] = "O ";
            }else if(z == 2 && game[w]=="E "){
                game3[w] = "O ";
            }else{
                System.out.println("ERROR!");//dps diminuir no i do for
                System.out.println("\nPlayer 1 plays(type the coods x and y (1-3))\nx:");
                x=scanP1.nextInt();            
                System.out.println("y: ");
                y=scanP12.nextInt();
            }
            
            
            System.out.println(game[0]+game[1]+game[2]);
            System.out.println(game2[0]+game[1]+game[2]);
            System.out.print(game3[0]+game[1]+game[2]);

            
            System.out.println("\nPlayer 2 plays(type the coods)\nZ:");
            z=(scanP2.nextInt());            
            System.out.println("W: ");
            w=(scanP22.nextInt());   
            
           

            if(x==0 && game[y]=="E "){
                game[y] = "X ";
            }else if(x==1 && game2[y]=="E "){
                game2[y] = "X ";
            }else if(x==2 && game3[y]=="E "){
                game3[y] = "X ";
            }else if(z == 0 && game[w]=="E "){
                game[w] = "O ";
            }else if(z == 1 && game[w]=="E "){
                game2[w] = "O ";
            }else if(z == 2 && game[w]=="E "){
                game3[w] = "O ";
            }else{
                System.out.println("ERROR!");//dps diminuir no i do for
                System.out.println("\nPlayer 2 plays(type the coods)\nZ:");
                z=scanP2.nextInt();            
                System.out.println("W: ");
                w=scanP22.nextInt(); 
            }
        
            System.out.println(game[0]+game[1]+game[2]);
            System.out.println(game2[0]+game2[1]+game2[2]);
            System.out.print(game3[0]+game3[1]+game3[2]);
            
            
        }    
        System.out.println("End of the game!");
            
            
    }
}
