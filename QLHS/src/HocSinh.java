
public class HocSinh {
	private String maSv;
	private String hoTen;
	private char gioiTinh;
	private double diemJava;
	private double diemPython;
	
	public HocSinh(){
		
	}
	
	
	public HocSinh(String maSv, String hoTen, char gioiTinh, double diemJava, double diemPython) {
		super();
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.diemJava = diemJava;
		this.diemPython = diemPython;
	}



	public String getMaSv() {
		return maSv;
	}



	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public char getGioiTinh() {
		return gioiTinh;
	}



	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}



	public double getDiemJava() {
		return diemJava;
	}



	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}



	public double getDiemPython() {
		return diemPython;
	}



	public void setDiemPython(double diemPython) {
		this.diemPython = diemPython;
	}



	public double getDiemTB() {
		return Math.floor(((diemJava*2 + diemPython)/3)*100)/100;
	}
	
	public String isDau() {
		if(getDiemTB() >= 5) {
			return "Đậu";
		}else if(gioiTinh == 'f'){
			return "Đậu";
		}else {
			return "Trượt";
		}
	}


	@Override
	public String toString() {
		return "HocSinh [maSv=" + maSv + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", diemJava=" + diemJava
				+ ", diemPython=" + diemPython + "]";
	}
	
	
}
