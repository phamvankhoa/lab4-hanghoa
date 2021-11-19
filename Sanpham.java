/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangHoa;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Sanpham 
{

    /**
     * @param args the command line arguments
     */
    static void menu()
    {
        System.out.print("1. Nhập danh sách sản phẩm từ bàn phím: ");
        System.out.print("\n2. Xuất danh sách vừa nhập: ");
        System.out.print("\n3. Xuất danh sách ngẫu nhiên: ");
        System.out.print("\n4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình: ");
        System.out.print("\n5. Tìm và xóa sản phẩm theo tên nhập từ bàn phím: ");
        System.out.print("\n6. Xuất giá trung bình của các sản phẩm: ");
    }
    public static void main(String[] args) 
    {
        int n = 0;
        qlysp a = new qlysp();
        qlysp[] Qlysp = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao so san pham: ");
                    m = Integer.parseInt(sc.nextLine());
                    Qlysp = new qlysp[m];
                    for (int i = 0; i < m; i++) {
                    Qlysp[i] = new qlysp();
                    Qlysp[i].nhap();
                    }
                break;
                }
                case 2: {
                    if (Qlysp == null) {
                    System.out.println("Ban chua nhap du lieu: ");
                    } else {
                        System.out.println("Du lieu ban vua nhap la: ");
                        for (int i = 0; i < Qlysp.length; i++) {
                            System.out.println("Thong tin hang hoa thu: " + (i + 1));
                            Qlysp[i].xuat();
                            }
                        }
                break;
                }
                case 3: {
                    if (Qlysp == null) {
                        System.out.println("Ban chua nhap du lieu: ");
                        } else {
                            a.sort(Qlysp);
                            System.out.println("Du lieu sau khi sap xep la: ");
                            for (int i = 0; i < Qlysp.length; i++) {
                                System.out.println("Thong tin hang hoa thu: " + (i + 1));
                                Qlysp[i].xuat();
                                }
                            }
                break;
                }
                case 4:
                    break;
                    default: 
                    {
                        System.out.println("Khong co lua chon cua ban. ");
                        break;
                    }
                }  
            }
        while (n != 4);
    }   
}   

