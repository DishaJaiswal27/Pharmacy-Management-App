/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Disha
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),userName varchar(200),address varchar(200),password varchar(200))");
            st.executeUpdate("INSERT INTO appuser (userRole,name,dob,mobileNumber,email,userName,address,password) values('Admin','Disha','27-04-2002','0001112223','admin@gmail.com','Admin1','Indore','1234')");

            st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,ID varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");

            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
