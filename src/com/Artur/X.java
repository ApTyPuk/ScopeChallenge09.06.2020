package com.Artur;

import java.util.*;

public class X {
    private ArrayList<Integer> x= new ArrayList<>();

    public X() {
    }

    public void x(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 12 numbers.");

        int x = 0;

        while(x<12){
            x++;
            System.out.print((x) + " number: ");
            this.x.add(scanner.nextInt());

        }

        System.out.println("******************************************");
        for(int i = 0; i<this.x.size(); i++){
            System.out.println((i+1) +" array number: " + this.x.get(i));

        }




    }



    public void x(ArrayList x) {

        int x = 0;

        for(int i = 0; i<this.x.size(); i++){
            System.out.println((i+1) + " array number: " + this.x.get(i));

        }
    }



}
