import java.util.Scanner;

public class fizzbuzzgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scr1=0;
        int scr2=0;
        int num1=0;
        int num2=0;
        for(int i=0;i<10;i++){
            double random=1+Math.random()*9;
            int Random=(int)random;
           // System.out.println(Random);
            double random2=1+Math.random()*9;
            int Random2=(int)random2;
            //System.out.println(Random2);
            System.out.print((i+1)+".player1 enter your number between 1 to 100:");
            num1=scan.nextInt();
            if(num1>=1&&num1<=100){
                if(num1%Random==0&&num1%Random2==0){
                     System.out.println("player1 get fizzbuzz");
                     System.out.println();
                     scr1+=5;
                }else if(num1%Random==0){
                    System.out.println("player1 get fizz");
                    System.out.println();
                     scr1+=3;
                }else if(num1%Random2==0){
                    System.out.println("player1 get buzz");
                    System.out.println();
                     scr1+=3;
                }else{
                    System.out.println("player1 not get nither fizzbuzz not fizz nor buzz");
                    System.out.println();
                    scr1+=1;
                }   }
                else{
                    System.out.println("number is not between 1 to 100 please try again ");
                    break;
                }

                System.out.print((i+1)+".player2 enter your number between 1 to 100:");
                  num2=scan.nextInt();
                 if(num2>=1&&num2<=100){
                    if(num2%Random==0&&num2%Random2==0){
                         System.out.println("player2 get fizzbuzz");
                         System.out.println();
                         scr2+=5;
                    }else if(num2%Random==0){
                        System.out.println("player2 get fizz");
                        System.out.println();
                         scr2+=3;
                    }else if(num2%Random2==0){
                        System.out.println("player2 get buzz");
                        System.out.println();
                         scr2+=3;
                    }else{
                        System.out.println("player2 not get nither fizzbuzz not fizz nor buzz");
                        System.out.println();
                         scr2+=1;
                    } }
                    else{
                        System.out.println("number is not between 1 to 100 please try again ");
                        break;
                    }
                }
                if((num1>=1&&num1<=100)||(num2>=1&&num2<=100))
                    if(scr1>scr2){
                        System.out.println("player1 won with "+scr1+" points");
                    }else if(scr1<scr2){
                        System.out.println("player2 won with "+scr2+" points");
                    }else{
                        System.out.println("match draw with points "+scr1+"="+scr2);
                    }
                }
                }

            

    
       

 
   



