import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		List<String> hss = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Mã sinh viên: ");
			String maSv = sc.nextLine();
			System.out.println("Họ tên: ");
			String hoTen = sc.nextLine();
			System.out.println("Giới tính: ");
			char gt = sc.next().charAt(0);
			System.out.println("Điểm java: ");
			int diemJV = sc.nextInt();
			System.out.println("Điểm Python: ");
			int diemPy = sc.nextInt();
			sc.nextLine();
			
			hss.add(maSv + "," + hoTen + "," + gt + "," + diemJV + "," + diemPy);
		}
		
		try (BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\JavaSwing\\QLHS\\input.txt"));){
			for (String hocSinh : hss) {
				write.write(hocSinh + "\n");
			}
			write.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		List<HocSinh> hocSinh = new ArrayList<HocSinh>();
		
		try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\DELL\\JavaSwing\\QLHS\\input.txt"))){
			String line;
			while((line = read.readLine()) != null) {
				String[] parts = line.split(",");
				hocSinh.add(new HocSinh(parts[0], parts[1], parts[2].charAt(0), Double.parseDouble(parts[3]), Double.parseDouble(parts[4])));
			}
			read.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		hocSinh.sort(Comparator.comparingDouble(HocSinh::getDiemTB).reversed());
		
		try (BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\JavaSwing\\QLHS\\output.txt"))){
			for (HocSinh hs : hocSinh) {
				write.write("************************************************************************" + "\n" +
						hs.toString() + "\n"
						+ "Điểm trung bình: " + hs.getDiemTB() + "\n"
						+ "Kết quả: " + hs.isDau() + "\n");
			}
			write.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		boolean check = false;
		System.out.println("Nhập tên học sinh mà bạn muốn tìm: ");
		String ten = sc.nextLine();
		
		for (HocSinh hs : hocSinh) {
			if(hs.getHoTen().equals(ten)) {
				System.out.println("Thông tin: "+hs.toString() + "\n");
				check = true;
			}
		}		
		if (check == false) {
			System.out.println("Không tim được học sinh.");
		}
		
		System.out.println("Thông tin những bạn đã đậu: ");
		for (HocSinh hs : hocSinh) {
			if(hs.isDau()=="Đậu") {
				System.out.println(hs.toString() + "\n");
			}
		}
		
		System.out.println("Thông tin những bạn trượt: ");
		for (HocSinh hs : hocSinh) {
			if(hs.isDau()=="Trượt") {
				System.out.println(hs.toString() + "\n");
			}
		}
		
		System.out.println("Thông tin những bạn có điểm trung bình trên 8: ");
		for (HocSinh hs : hocSinh) {
			if(hs.getDiemTB() > 8) {
				System.out.println(hs.toString() + "\n");
			}
		}
	}

}
