package progmastersex_2;

import java.util.Scanner;

public class ProgmastersEx_2 {

    public static void main(String[] args) {
        int szam = 1;
        int maxHossz;
        
        do {
            System.out.println("Kérek egy pozitív egész számot");
            szam = szamBeolvas();
        } while (szam <= 0);

        maxHossz = hosszusagMeghatarozasa(szam);
        kiirEredmeny(maxHossz, szam);

    }

    private static int szamBeolvas() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    private static int hosszusagMeghatarozasa(int szam) {
        int eredmeny;
        return eredmeny = szam * 2 - 1;
    }

    private static void kiirEredmeny(int maxHossz, int szam) {
        String ures = " ";
        String teli = "0";
        for (int i = 0; i < szam; i++) {
            String sor = "";
            for (int j = 0; j < maxHossz; j++) {
                if (j >= szam - 1 - i && j <= (szam - 1 + i)) {
                    sor += teli;
                } else {
                    sor += ures;
                }
            }
            System.out.println(sor);
        }

    }

}


