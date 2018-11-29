package com.company;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args)throws Exception{
        try {

            //Scan the txt file of the purchase information
            File file = new File("C:\\Users\\jlgar\\Desktop\\JohnProject\\reportEdited.txt");

            Scanner scanner = new Scanner(file);

            //use an arraylist of PurchaseInfo to hold records from the txt file
            List<PurchaseInfo> info = new ArrayList<PurchaseInfo>();
            //going to next line because i dont want to get the column headers
            scanner.nextLine();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                //separate the info by tab field, and place into an array
                String[] details = line.split("\t");
                int arraySize = details.length;
                //hardcoded the array indices because the file has a standard input
                if(arraySize<9){//for a record that does not contain a quantity.
                    Date date = new SimpleDateFormat("MMMM dd, yyyy").parse(details[0]);
                    String orderID = details[1];
                    String sku = details[2];
                    String transactionType = details[3];
                    String paymentType = details[4];
                    String paymentDetail = details[5];
                    details[6] = details[6].replace("$","");
                    details[6] = details[6].replace(",","");
                    double amount = Double.parseDouble(details[6]);
                    info.add(new PurchaseInfo(date,orderID,sku,transactionType,paymentType,paymentDetail,amount));
                }else{//this else statement is for a normal with all fields
                    Date date = new SimpleDateFormat("MMMM dd, yyyy").parse(details[0]);
                    String orderID = details[1];
                    String sku = details[2];
                    String transactionType = details[3];
                    String paymentType = details[4];
                    String paymentDetail = details[5];
                    details[6] = details[6].replace("$","");
                    details[6] = details[6].replace(",","");
                    double amount = Double.parseDouble(details[6]);
                    int quantity;
                    if(details[7].equals("")) {
                        quantity = 0;
                    }else{
                        quantity = Integer.parseInt(details[7]);
                    }
                    String productTitle = details[8];
                    info.add(new PurchaseInfo(date,orderID,sku,transactionType,paymentType,paymentDetail,amount,quantity,productTitle));
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}

