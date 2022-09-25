import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("გამარჯობა ");
        System.out.print("რა გქვია?");
        String value = input.next();
        System.out.println( "გამარჯობა " + value);
        System.out.println( "მე ვარ ჩატბოტი როგორ ხარ?");
        String answer= input.next();

        if (answer.equals("კარგად")){
            System.out.printf("ძალიან კარგი მეც :)");
        }
        else if(answer.equals("ცუდად")) {
            System.out.printf("ნუ გეშინია. მეც მეშინია.");
        }
        else{
            System.out.printf("კარგად და ცუდად ვიცი მარტო მე ჯერ :P");
        }

        input.close();

    }
}