package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Item>myItemList=new ArrayList();

double itemCost=0;
double totalCost=0;
double salesTaxRate=0;
double salesTax=0;
double grandTotal=0;
int Rand=0;
boolean userInputTaxab=false;
String InputResponse="";


 //========================================================





       do {


           System.out.println("Enter the Item name");
           String userInputItemName = sc.next();
           System.out.println("enter the quantity");
           int userInputQuantity = sc.nextInt();
           System.out.println("enter the price");
           double userInputPrice = sc.nextDouble();




           System.out.println("is the item taxable T/F");



           userInputTaxab = sc.nextBoolean();



           if (userInputTaxab = true) {





               ArrayList<Double> TaxRate = new ArrayList<Double>();

               TaxRate.add(6.00 / 100);
               TaxRate.add(5.30 / 100);
               TaxRate.add(5.75 / 100);
               TaxRate.add(5.00 / 100);


               Random rn = new Random();
               Rand = rn.nextInt(TaxRate.size());
               salesTaxRate = TaxRate.get(Rand);

               System.out.println(salesTaxRate);

               //=========================================================



                   itemCost = userInputQuantity * userInputPrice;
                   totalCost = totalCost + itemCost;
                   salesTax = totalCost * salesTaxRate;
                   grandTotal = totalCost + salesTax;




               } else if (userInputTaxab = false) {

                   itemCost = userInputQuantity * userInputPrice;
                   totalCost = totalCost + itemCost;

               }

           myItemList.add(new Item(userInputItemName, userInputQuantity, userInputPrice, itemCost, userInputTaxab));


//===================================================================

           System.out.println("Do you want to add more items y/n");
           InputResponse = sc.next();


//=====================================================================


       } while (!InputResponse.equalsIgnoreCase("no")) ;





       System.out.println("Item Nme"+  "\t" + "Quantity" + "\t" + "price" + "\t" + "Sub Total" +  "\t" + "Taxable" );
           System.out.println("========================================================================");


        //for (Item tpItem:myItemList) {



            //System.out.println(tpItem.getItemName() + "\t" + "\t" + tpItem.getQuantity() + "\t" + tpItem.getPrice() + "\t" + "\t" + "\t" + "\t" + itemCost + "\t" + "\t" + tpItem.isTaxable());
            // System.out.println("\t");




        for (Item tpItem:myItemList) {



            System.out.println(tpItem.getItemName() + "\t" + "\t" + tpItem.getQuantity() + "\t" + tpItem.getPrice() + "\t" + "\t" + "\t" + "\t" + itemCost + "\t" + "\t" + tpItem.isTaxable());
            // System.out.println("\t");

        }

           System.out.println("\t");
           System.out.println("Sub Total : "+ totalCost);
           System.out.println("Tax Rate " + salesTaxRate);
           System.out.println("Sales Tax " + salesTax);


        //-----------------------------------------------------------------------------



    }

}




