import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0;

    public void input(){
        Scanner b1 = new Scanner(System.in);
        do {
            System.out.println("Nhap Code cua ban: ");
            customerCode = b1.nextLine();
            System.out.println("Nhap ten cua ban: ");
            customerName = b1.nextLine();
            System.out.println("Nhap so tai khoan: ");
            accNumber = b1.nextInt();
            System.out.println("Nhap so tien: ");
            amount = b1.nextLong();
        } while (accNumber < 100000 || accNumber > 101000|| customerCode.length() < 5 );
    }

    public void depositAndWithdraw(){
        long Money;
        int Type;
        Scanner b2 = new Scanner(System.in);
        System.out.println("Moi chon dich vu: ");
        System.out.println("1.Gui tien \n  2.Rut tien");
        Type = b2.nextInt();
        System.out.println("Nhap tien: ");
        Money = b2.nextLong();


        if (Type == 1){
            System.out.println("Ban da gui "+ Money + "đ thanh cong ! " );
            amount = Money + amount;
            System.out.println("So tien ban da gui :  "+ amount);
        }

        if (Type == 2){
            if (Money > amount){
                System.out.println("So du cua ban khong du");
            }
            else if (Money <= amount) {
                System.out.println("Ban da rut  "+ Money +"đ thanh cong ! ");
                amount = amount - Money;
                System.out.println("So du cua ban : "+ amount);
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }
}
