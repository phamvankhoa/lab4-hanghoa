/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangHoa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class qlysp 
{
    private ArrayList<qlysp> ql = new ArrayList<qlysp>();
    private String tenHangHoa;
    private float GiaBan; 

    public qlysp(String tenHangHoa, float GiaBan) {
        this.tenHangHoa = tenHangHoa;
        this.GiaBan = GiaBan;
    }
    public qlysp ()
    {
                
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hang hoa: ");
        this.tenHangHoa = sc.nextLine();
        System.out.print("Nhap gia: ");
        GiaBan = sc.nextInt();
    }
    void xuat()
    {
        System.out.println("Ten hang hoa :" + this.getTenHangHoa());
        System.out.println("Gia ban: "+this.getGiaBan());
    }
    @Override
    public String toString() 
    {
        return "qlysp{" + "tenHangHoa=" + tenHangHoa + ", GiaBan=" + GiaBan + '}';
    }
    public void sort(qlysp[] b)
    {
        for (int i = 0; i < b.length - 1; i++) 
        {
            for (int j = i + 1; j < b.length; j++) 
            {
                if (b[i].GiaBan < b[j].GiaBan) 
                {
                    qlysp tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }
    
}
