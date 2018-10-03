import java.util.Scanner;
public class luyen_tap_bien_kieu_du_lieu {
    public static void main(String[] args){
        float vl, hh, sh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào điểm vật lý: ");
        vl = sc.nextFloat();
        System.out.println ("Mời các bạn nhập vào điểm hoá học: ");
        hh = sc.nextFloat();
        System.out.println ("Mời các bạn nhập vào điểm sinh học: ");
        sh = sc.nextFloat();
        float tong = vl + hh + sh;
        float dtb = tong/3;
        System.out.println ("Tổng điểm là: " + tong);
        System.out.println ("Điểm trung bình là: " +dtb);
    }
}
