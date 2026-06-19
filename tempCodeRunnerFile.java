import java.util.*;

class CR_Model {
    double Konversi(double sc) {
        return sc * 0.8;
    }
}

class CR_View {

    void show(double sr) {
        System.out.println("Suhu Reamur = " + sr);
    }

    double getSuhu() {
        Scanner ss;
        double cc;

        System.out.print("Masukkan suhu Celcius : ");

        ss = new Scanner(System.in);
        cc = Double.parseDouble(ss.nextLine());

        ss.close();

        return cc;
    }
}

class CR_Controller {
    CR_View V;
    CR_Model M;
    double suhuC;
    double suhuR;

    CR_Controller() {
        V = new CR_View();
        M = new CR_Model();

        suhuC = V.getSuhu();
        suhuR = M.Konversi(suhuC);

        V.show(suhuR);
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            new CR_Controller();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}