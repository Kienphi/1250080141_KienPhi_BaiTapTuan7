package kethua;
import java.util.Scanner;
import kethua.HinhHoc;
import kethua.HinhChuNhat;
import kethua.HinhTron;
import kethua.HinhTru;
import kethua.HinhVuong;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhtron = new HinhTron();
		HinhChuNhat hinhchunhat = new HinhChuNhat();
		HinhTru hinhtru = new HinhTru();
		HinhVuong hinhvuong = new HinhVuong();
		
		hinhtron.xuatten();
		hinhtron.nhapbankinh();
		hinhtron.tinhchuvi();
		hinhtron.tinhdientich();
		hinhtron.inchuvi();
		hinhtron.indientich();
		
		hinhchunhat.xuatten();
		hinhchunhat.nhapchieudai();
		hinhchunhat.nhapchieurong();
		hinhchunhat.tinhchuvi();
		hinhchunhat.tinhdientich();
		hinhchunhat.inchuvi();
		hinhchunhat.indientich();
		
		hinhtru.xuatten();
		hinhtru.nhapchieucao();	
		hinhtru.tinhthetich();
		hinhtru.inthetich();
		
		hinhvuong.xuatten();
		hinhvuong.nhapcanh();
		hinhvuong.tinhchuvi();
		hinhvuong.tinhdientich();
		hinhvuong.inchuvi();
		hinhvuong.indientich();

	}

}
