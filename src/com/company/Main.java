package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("zadej 1. číslo");
        Double num =Double.parseDouble(sc.nextLine());

        System.out.println("zadej 2. číslo");
        Double num2 =Double.parseDouble(sc.nextLine());

        System.out.println(num+ " + " + num2 + " = " + (num+num2));
        System.out.println(num+ " - " + num2 + " = " + (num-num2));
        System.out.println(num+ " * " + num2 + " = " + (num*num2));
        System.out.println(num+ " / " + num2 + " = " + (num/num2));

        System.out.println("");

    }



}
