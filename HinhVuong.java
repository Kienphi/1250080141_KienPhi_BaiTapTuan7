package kethua;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
	public HinhVuong(){
		ten="Hinh vuong";
	}
	public void nhapcanh(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("nhap canh: ");
		dai=nhap.nextFloat();
	}
	public void tinhchuvi(){
		chuvi=dai*4;
	}
	public void tinhdientich(){
		dientich=dai*dai;
	}
}
