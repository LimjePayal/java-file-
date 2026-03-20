import java.util.*;

class Resort {
    int Rno, Days;
    String Name;
    float Charges, Amount;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rno, Name, Charges, Days: ");
        Rno = sc.nextInt();
        Name = sc.next();
        Charges = sc.nextFloat();
        Days = sc.nextInt();
    }

    float Compute() {
        Amount = Days * Charges;
        if (Amount > 11000)
            Amount = (float)(1.02 * Amount);
        return Amount;
    }

    void DispInfo() {
        Compute();
        System.out.println(Rno + " " + Name + " " + Charges + " " + Days + " " + Amount);
    }
}    