package kethua;
import java.util.Scanner;
public class HinhTru extends HinhTron {
	public float chieucao;
	
	public HinhTru(){
		ten="Hinh tru";
	}
	public void nhapchieucao(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu cao: ");
		chieucao= nhap.nextFloat();
	}
	public void tinhthetich(){
		thetich=Pi*bankinh*bankinh*chieucao;
	}
}
