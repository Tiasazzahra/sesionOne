import Model.KartuATM;

import java.util.Scanner;

public class ATM {
    private static void PrintTitle(){
        System.out.println("--------------------------------");
        System.out.println("     HH   HH    HHHHH");
        System.out.println("     HH   HH    hh hh   ");
        System.out.println("     HHHHHHH    hh hh");
        System.out.println("     HH   HH    HHHH");
        System.out.println("--------------------------------");
        System.out.println(" BANK HARBER - CABANG TEGAL");
        System.out.println(" -------------------------------");

    }

    public static void main(String[] args) {
        String nokar;
        String norek;
        String nama;
        String pin;

        nokar = "ABCDE";
        norek = "087687";
        nama  = "donald";
        Scanner inputeUser = new Scanner(System.in);
        PrintTitle();

        System.out.println("Masukan Kartu ");
        System.out.println("Masukan PIN   ");
        pin = inputeUser.nextLine();
        if(pin.equals("123456")){
            KartuATM donal = new KartuATM(nokar,norek,nama);
            char pilihan = 0 ;
            do {
                PrintTitle();
                System.out.println("MENU");
                System.out.println("[1]. Deposit");
                System.out.println("[2]. Withdraw");
                System.out.println("[0]. Exit");
                System.out.println("pilihan Anda :");
                pilihan = inputeUser.next().charAt(0);
                System.out.println();
                switch (pilihan) {
                    case '1' -> {
                        int jumlahdepo;
                        jumlahdepo = 100000;
                        int saldoakhirdepo = donal.Deposit(jumlahdepo);
                        System.out.println("Saldo Akhir : " + saldoakhirdepo);
                    }

                    case '2' -> {
                        int jumlahwd = 10000;
                        int saldoakhirwd = donal.Withdraw(jumlahwd);
                        System.out.println("Saldo Akhir : saldoakhirwd");
                    }
                    default -> {

                    }
                }
            }while (pilihan!= 0);

        }


    }
}
