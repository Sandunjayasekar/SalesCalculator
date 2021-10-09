import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        boolean cont = true;

        Scanner scan = new Scanner(System.in);
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("records.csv"));
            String headers = br.readLine();
                while ((line = br.readLine()) != null)
                {
                    String[] employee = line.split(splitBy);
                    System.out.println("id: " + employee[0] + " | Position: " + employee[1] + " | Experience: " + employee[2] + " years");
                }

            while(cont){
                boolean valid=false;
                System.out.println();
                System.out.print("Enter ID number : ");
                String inptid = scan.nextLine();

                BufferedReader br2 = new BufferedReader(new FileReader("records.csv"));
                headers = br2.readLine();
                while ((line = br2.readLine()) != null)
                {
                    String[] employee = line.split(splitBy);

                    if(employee[0].equals(inptid)){

                        int year = Integer.parseInt(employee[2]);
                        String position = employee[1];
                        valid=true;

                        Calculations calculation = new Calculations(position,year);
                    }
                }
                if (valid==false){
                    System.out.println("Please enter valid ID number");
                }

                System.out.print("Do you want to continue(y/n)? : ");
                String rep = scan.nextLine();
                if(rep.equals("n")){
                    cont=false;
                    System.out.println();
                    System.out.println("Good Bye");
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
