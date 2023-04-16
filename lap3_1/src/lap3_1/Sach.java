package lap3_1;
import java.util.Scanner;
public class Sach {
	 private String ma,ten,tg,loai,nxb;
	    private int trang,sotap,gia;
	    public void NhapSach(){
	       Scanner nhap = new Scanner(System.in);   
	        System.out.print("nhap ma sach: ");
	        ma=nhap.nextLine();
	        System.out.print("nhap ten sach: ");
	        ten=nhap.nextLine();
	        System.out.print("nhap ten tac gia: ");
	        tg=nhap.nextLine();
	        System.out.print("nhap loai sach: ");
	        loai=nhap.nextLine();
	        System.out.print("nhap nha xuat ban sach: ");  
	        nxb=nhap.nextLine();
	        System.out.print("nhap so trang sach: "); 
	        trang=nhap.nextInt();
	        System.out.print("nhap so tap sach: ");      
	        sotap=nhap.nextInt();     
	        System.out.print("nhap gia sach: ");      
	        gia=nhap.nextInt();
	    }
	    public String InSach(){
	        return "ten sach: "+ten+"\t ma sach: "+ma+"\t ten tac gia: "+tg+"\t "
	        		+ "loai sach: "+loai+"\t nha xuat ban: "+nxb+"\t "
	        		+ "so trang: "+trang+"\t so tap: "+sotap+"\t gia sach: "+gia;   
	    } 
	    
	    public static void main(String[] args) {
	        Scanner a = new Scanner(System.in);        
	        System.out.println("nhap so luong sach can quan li : ");
	        int n=a.nextInt();
	        Sach A[]=new Sach[n];
	        for(int i=0;i<n;i++){
	            A[i]=new Sach();
	            A[i].NhapSach();
	        }
	        for(int i=0;i<n;i++){
	            System.out.println(A[i].InSach());
	        }
	    }

}
	


