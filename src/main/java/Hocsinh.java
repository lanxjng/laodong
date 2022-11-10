
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public  class Hocsinh {
    private String Hoten,Ngaysinh ;
    private float DiemToan,DiemVan;
    public float DTB()
    {
        return (DiemToan + DiemVan)/2;
    }

    public Hocsinh() {
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        this.Hoten = sc.nextLine();
        System.out.println("Ngay sinh: ");
        this.Ngaysinh = sc.nextLine();
        System.out.println("Diem toan: ");
        this.DiemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Diem van: ");
        this.DiemVan = Float.parseFloat(sc.nextLine());
           
    }
    public void Output(){
        System.out.println("Ho ten: "+ this.Hoten);
        System.out.println("Ngay sinh: "+ this.Ngaysinh);
        System.out.println("Diem toan: "+ this.DiemToan);
        System.out.println("Diem van: "+ this.DiemVan);  
    }
    public float getDiemToan(){
        return this.DiemToan;
    }
    public float getDiemVan(){
        return this.DiemVan;
    }
    

}
