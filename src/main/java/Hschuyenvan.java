
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Hschuyenvan extends Hocsinh implements Comparable<Hschuyenvan>{
    private String Lop;

    public Hschuyenvan() {
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Lop: ");
        this.Lop= sc.nextLine();

    }
    @Override
    public float DTB(){
        return (super.getDiemVan()*2 + super.getDiemToan())/3;
    }
    public void Output(){
        super.Output();
        System.out.println("Lop: "+ this.Lop);
        System.out.println("DTB: "+this.DTB());
    }
    
    public String XepLoai(){
        if(this.DTB()<5)
            return "Kem";
        else if(this.DTB()<6.5)
            return "TB";
        else if(this.DTB()<7.5)
            return "Kha";
        else if(this.DTB()<9)
            return "Gioi";
        else
            return "Xuat Sac";

    }

    @Override
    public int compareTo(Hschuyenvan cv) {
        if(this.DTB()== cv.DTB())
            return 0;
        else if(this.DTB()> cv.DTB())
            return 1;
        else
                return -1;
    }
    
}
