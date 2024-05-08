import java.util.Scanner;
public class calculator {    public static void main(String [] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the first number:");
    int  n1=scan.nextInt();
    System.out.println("enter the second number:");
    int n2=scan.nextInt();
    System.out.println("choose operator(+,-,*,/):");
    char operator=scan.next().charAt(0);
    int result=0;
    switch(operator){
        case '+':
            result=n1+n2;
            break;
        case '-':
            result=n1-n2;
            break;
        case '*':
            result=n1*n2;
            break;
        case '/':
            result=n1/n2;
            break;
        default:
            System.out.println("invalid");
            break;
    }
    System.out.println("Result:"+ result);
    scan.close();


}

}


