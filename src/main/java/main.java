
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Hschuyenvan> list_hs = new ArrayList<Hschuyenvan>();
        int luachon=0;
        while(luachon!= 5){
            System.out.println("Lua chon cong viec");
            System.out.println("1.Nhap danh sach hoc sinh chuyen van");
            System.out.println("2.Dua ra cac sinh vien co xep loai gioi");
            System.out.println("3.Tim hoc sinh co diem trung binh cao nhat");
            System.out.println("4.Xoa 1 sinh vien");
            System.out.println("5.Thoat");
            luachon = Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:
                    System.out.println("Nhap so luong sinh vien chuyen van");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i=0; i<n; i++){
                        Hschuyenvan ob = new Hschuyenvan();
                        ob.Input();
                        list_hs.add(ob);
                        System.out.println("Danh sach sinh vien la:");
                        for(Hschuyenvan hs : list_hs ){
                            hs.Output();
                        }
                        
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien xep loai gioi la:");
                    for(Hschuyenvan hs : list_hs){
                        if(hs.XepLoai().equals("Gioi")){
                            hs.Output();
                        }
                    }
                    break;
                case 3:
                    Collections.sort(list_hs);
                    float max= list_hs.get(list_hs.size() -1).DTB();
                    System.out.println("Sinh vien co diem trung binh cao nhat la:");
                    for(Hschuyenvan hs : list_hs ){
                        if(hs.DTB()==max)
                           hs.Output();
                        }
                    break;
                case 4:
                    System.out.println("Nhap vi tri can xoa");
                    int i= Integer.parseInt(sc.nextLine());
                    list_hs.remove(i);
                    System.out.println("Danh sach sinh vien sau khi xoa la:");
                    for(Hschuyenvan hs : list_hs ){
                            hs.Output();
                        }
                    break;
                case 5:
                    break;      
                   
            }
        }
    }   
}


        
