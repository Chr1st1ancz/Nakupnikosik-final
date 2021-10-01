package com.company;

public class KosikBruh {
    public static void main(String[] args) {
        int cena = 0;

        if(args.length == 0){
           System.out.println("1 yougurt 10");
           System.out.println("2 Chleba 8");
           System.out.println("3 Rohlik 2");
           System.out.println("4 panini 60");
           System.out.println("5 stripsiky 50");
       }
       else{
           for (int i = 0; i < args.length; i++) {
                if(Integer.parseInt(args[i]) == 1){
                    System.out.println("1 yougurt 10");
                    cena += 10;
                }

                else if(Integer.parseInt(args[i]) == 2){
                    System.out.println("2 Chleba 8");
                    cena += 8;
                }

                else if(Integer.parseInt(args[i]) == 3){
                    System.out.println("3 Rohlik 2");
                    cena += 2;
                }

                else if(Integer.parseInt(args[i]) == 4){
                    System.out.println("4 panini 60");
                    cena += 60;
                }

                else if(Integer.parseInt(args[i]) == 5){
                    System.out.println("5 stripsiky 50");
                    cena += 50;
                }

                else{
                    System.out.println("to neznam");
                }
           }
           System.out.println("celkem " + cena + "kc");

       }
    }
}
