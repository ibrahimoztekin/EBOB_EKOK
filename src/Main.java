import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1,n2,ebob=1,i=1,ekok=1,k=1;

        Scanner input =new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı giriniz: ");
        n2=input.nextInt();

        if(n1>n2){
            int variable=n2;
            n2=n1;
            n1=variable;
        }

        while (n1>=i){
            if(n1 % i ==0 && n2 % i ==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("Ebob: "+ebob);

        while ((n1*n2)>=k){

            if(k%n1==0 && k%n2==0){
                ekok=k;
                break;
            }
            k++;
        }
        System.out.println("Ekok: "+ekok);
        System.out.println("Ekok: "+(n1*n2)/ebob);

    }
}
