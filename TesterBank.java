import java.util.*;
public class TesterBank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount[] arr=new BankAccount[10];
        int n;
        int index =0;
        int dur;
        String name;

        do{
            System.out.println("1.Bank Account | 2.Option for locker | 3.Display | 4.Exit");
            System.out.println("Enter a choice");
            n=sc.nextInt();

        switch (n){
            case 1:
                if(index<arr.length){
                    System.out.println("Enter the Name and City");
                    BankAccount b=new BankAccount(sc.next(),sc.next());
                    arr[index]=b;
                    index++;
                }
                else{
                    System.out.println("Array is full");
                }
                break;

            case 2:
                System.out.println("Do you want locker? Yes or No");
                if(sc.next().equals("yes")){
                    System.out.println("Enter Name and Duration");
                    name=sc.next();
                    dur=sc.nextInt();
                    for (int i=0;i<index;i++){
                        if (arr[i].getName().equals(name)){
                            arr[i].assignlocker(dur);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Array is full");
                }
                break;

            case 3:
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
                break;

            case 4:
                break;
        }


        }while (n!=4);
    }
}
