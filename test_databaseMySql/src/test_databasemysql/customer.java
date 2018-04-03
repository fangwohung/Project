/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_databasemysql;

import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

/**
 *
 * @author quochung
 */
public class customer extends RecursiveTreeObject<customer> {

    private IntegerProperty makhachhang;
    private StringProperty tenkhachhang;
    private StringProperty sdt;

    public customer(StringProperty tenkhachhang, StringProperty sdt) {
        this.tenkhachhang = tenkhachhang;
        this.sdt = sdt;
    }

    customer() {

    }

    public customer(int makhachhang, String tenkhachhang, String sdt) {
        this.makhachhang = new SimpleIntegerProperty(makhachhang);
        this.tenkhachhang = new SimpleStringProperty(tenkhachhang);
        this.sdt = new SimpleStringProperty(sdt);

    }
    public customer( String tenkhachhang, String sdt) {      
        this.tenkhachhang = new SimpleStringProperty(tenkhachhang);
        this.sdt = new SimpleStringProperty(sdt);

    }
    public customer(IntegerProperty makhachhang, StringProperty tenkhachhang, StringProperty sdt) {
        this.makhachhang = makhachhang;
        this.tenkhachhang = tenkhachhang;
        this.sdt = sdt;
    }

    public ObservableList<customer> getCustomterList()  {
        DBConnection db = new DBConnection();
        Connection con = db.getConnecttion();
        ObservableList<customer> cusList = FXCollections.observableArrayList();
        
        if(con!=null){
            try (
                Statement stmnt = con.createStatement();
                ResultSet rs = stmnt.executeQuery("select * from khachhang");)
              
            {
                while (rs.next()) {
                    int makh = rs.getInt("makhachhang");
                    String tenkh = rs.getString("tenkhachhang");
                    String sdtkh = rs.getString("sodienthoai");
                    customer cus = new customer(makh,tenkh, sdtkh);
                    cusList.add(cus);
                  
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        return cusList;
        
    }

    public boolean insert() {
        DBConnection db = new DBConnection();
        Connection con = db.getConnecttion();
        if (con != null) {

            String query = "insert into khachhang(tenkhachhang, sodienthoai) "
                    + "values(?,?)";
            try {
                PreparedStatement ptm = con.prepareStatement(query);

                ptm.setString(1, tenkhachhang.get());
                ptm.setString(2, sdt.get());
                int check = ptm.executeUpdate();
                if (check != 0) {

                    ptm.close();
                    con.close();
                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }
    public boolean delete(int makhachhang) {
        DBConnection db = new DBConnection();
        Connection con = db.getConnecttion();
        if (con != null) {

            String query = "delete from khachhang where makhachhang = ?";
                    
            try {
                PreparedStatement ptm = con.prepareStatement(query);
                
                ptm.setInt(1, makhachhang);
                
                int check = ptm.executeUpdate();
                if (check != 0) {

                    ptm.close();
                    con.close();
                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }
    public boolean update(int makh,String tenkh,String sdt) {
        DBConnection db = new DBConnection();
        Connection con = db.getConnecttion();
        if (con != null) {

            String query = "update khachhang "
                    + "set tenkhachhang=?, sodienthoai =? "
                    + "where makhachhang = ?";
                    
            try {
                PreparedStatement ptm = con.prepareStatement(query);
                
                ptm.setString(1, tenkh);
                ptm.setString(2, sdt);
                ptm.setInt(3, makh);
                
                int check = ptm.executeUpdate();
                if (check != 0) {

                    ptm.close();
                    con.close();
                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }


    public IntegerProperty getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = new SimpleIntegerProperty(makhachhang);
    }

    public void setTenkhachhang(StringProperty tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public void setSdt(StringProperty sdt) {
        this.sdt = sdt;
    }

    public StringProperty getTenkhachhang() {
        return tenkhachhang;
    }

    public StringProperty getSdt() {
        return sdt;
    }

}
