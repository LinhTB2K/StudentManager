/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanli
 */

public class Employee {
    String tensinhvien;
    String masinhvien;
    String gioitinh;
    String tuoisinhvien;
    String diachi;
    String id;
    String user;

    public Employee() {
    }

    public Employee(String id, String tensinhvien, String masinhvien, String gioitinh, String tuoisinhvien, String diachi) {
        this.id = id;
        this.tensinhvien = tensinhvien;
        this.masinhvien = masinhvien;
        this.gioitinh = gioitinh;
        this.tuoisinhvien = tuoisinhvien;
        this.diachi = diachi;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSinhVien() {
        return tensinhvien;
    }

    public void setTenSinhVien(String tensinhvien) {
        this.tensinhvien = tensinhvien;
    }

    public String getMaSinhVien() {
        return masinhvien;
    }

    public void setMaSinhVien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getGioiTinh() {
        return gioitinh;
    }

    public void setGioiTinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTuoiSinhVien() {
        return tuoisinhvien;
    }

    public void setTuoiSinhVien(String tuoisinhvien) {
        this.tuoisinhvien = tuoisinhvien;
    }

    public String getDiaChi() {
        return diachi;
    }

    public void setDiaChi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Nhân Viên{" + "Id : " + id + ", Họ và tên : " + tensinhvien + ", Số Tuổi : " + tuoisinhvien + ", Giới tính : " + gioitinh + ", Mã Sinh Viên : " + masinhvien + ", Địa chỉ : " + diachi + '}';
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập id nhân viên :");
        id = scan.nextLine();
        System.out.println("Nhập Họ và Tên :");
        tensinhvien = scan.nextLine();
        System.out.println("Nhap Ngay Sinh :");
        tuoisinhvien = scan.nextLine();
        System.out.println("Nhập Giới Tính :");
        gioitinh = scan.nextLine();
        System.out.println("Nhập Email : ");
        masinhvien = scan.nextLine();
        System.out.println("Nhập Địa Chỉ :");
        diachi = scan.nextLine();
    }
}
