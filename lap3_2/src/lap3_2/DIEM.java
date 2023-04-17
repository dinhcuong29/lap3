package lap3_2;
import java.util.Scanner;
public class DIEM {

float x,y,r;
double P,S;
final double pi = 3.14;
public void NhapDiem() {
	Scanner Nhap = new Scanner(System.in);
	System.out.print("Nhap diem x :");
	x = Nhap.nextFloat();
	System.out.print("Nhap diem y :");
	y = Nhap.nextFloat();
}

public void Indiem(){
    System.out.println("Diem x: "+x);
    System.out.println("Diem y: "+y);
} 
}
class Tamgiac extends DIEM{
	float a,b,c;
void Nhaptg(){
    Scanner tg = new Scanner(System.in);
    System.out.print("Nhap vao diem a: ");
    a=tg.nextInt();
    System.out.print("Nhap vao diem b: ");
    b=tg.nextInt();
    System.out.print("Nhap vao diem c: ");
    c=tg.nextInt();
}
void Intamgiac(){
    System.out.println("Diem a:"+a);
    System.out.println("Diem b:"+b);
    System.out.println("Diem c:"+c);
}
void Check(){
    if((a+b<=c)||(a+c<=b)||(b+c<=a))
        System.out.println("Day khong phai la hinh tam giac");
    else
        System.out.println("Day la hinh tam giac");
    
}
void Chuvi(){
     P = a+b+c;
    System.out.println("Chu vi la: "+P);
}
void Dientich(){
	double p,s;
    p = P/2.0f;
    s =Math.sqrt(p*(p-a)*(p-b)*(p-c));
    System.out.println("Dien tich la: "+s);
}
}

class Hinhtron extends DIEM{
	Scanner Nhap = new Scanner(System.in);
    void Nhapht(){
        System.out.print("Nhap vao ban kinh: ");
        r =Nhap.nextFloat();
    }
    void Inht(){
        System.out.println("Ban kinh la: "+r);
    }
    void Chuvi(){
        P = (2*r)*pi;
        System.out.println("Chu vi hinh tron la: "+P);
    }
    void Dientich(){
        S =r*r*pi;
        System.out.println("Dien tich hinh tron la: "+S);
    }
public static void main(String[] args) {
    int yc;
    Scanner Nhap=new Scanner(System.in);
    System.out.print("Hay Nhap Yeu Cau : ");
    yc = Nhap.nextInt();
    switch(yc){
    case 1:
    DIEM d=new DIEM();
    d.NhapDiem();
    d.Indiem();
    break;
    case 2:
    Tamgiac tg=new Tamgiac();
    tg.Nhaptg();
    tg.Intamgiac();
    tg.Check();
    tg.Chuvi();
    tg.Dientich();
    break;
    case 3:
    Hinhtron ht=new Hinhtron();
    ht.Nhapht();
    ht.Inht();
    ht.Chuvi();
    ht.Dientich();
    break;
    default :
    	System.out.print("Vui Long Nhap Lai Yeu Cau");
    }
}
}
