/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_databasemysql;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.sql.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTablePosition;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.TreeTableView.TreeTableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 *
 * @author quochung
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    JFXTextField txtfi_sdt;
    @FXML
    JFXTextField txtfi_tenkh;
    @FXML
    JFXTextField txtfi_makh;
    @FXML
    JFXButton btn_insert;
    @FXML
    JFXButton btn_view;
    @FXML
    JFXButton btn_delete;
    @FXML
    JFXButton btn_update;
    @FXML
    JFXTreeTableView<customer> tree_table_vi;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        JFXButton btn = (JFXButton) event.getSource();
        if (btn == btn_insert) {
            
            insert();
        } else if (btn == btn_view) {
           
            view();
        } else if (btn == btn_update) {
           
            update();
        } else if (btn == btn_delete) {
            
            delete();
        }
    }

    private void insert() {
        StringProperty tenkh = new SimpleStringProperty(txtfi_tenkh.getText());
        StringProperty sdt = new SimpleStringProperty(txtfi_sdt.getText());
        customer cus = new customer(tenkh, sdt);
        if (cus.insert()) {
            System.out.println("them du lieu thanh cong");
        }
        view();
    }

    private void view() {
        customer cus = new customer();
        ObservableList<customer> cusList = cus.getCustomterList();
        
        TreeItem<customer> root = new RecursiveTreeItem<>(cusList, RecursiveTreeObject::getChildren);
        tree_table_vi.setRoot(root);
        tree_table_vi.setShowRoot(false);
    }

    private void update() {

        StringProperty tenkh = new SimpleStringProperty(txtfi_tenkh.getText());
        StringProperty sdt = new SimpleStringProperty(txtfi_sdt.getText());
        customer cus = new customer(tenkh, sdt);
        int makh=Integer.parseInt(txtfi_makh.getText());
        if (cus.update(makh,txtfi_tenkh.getText(),txtfi_sdt.getText())) {
            System.out.println("cap nhat du lieu thanh cong");
        }
        view();
    }

    private void delete() {
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Thông báo");
        alert.setHeaderText(null);
        alert.setContentText("Bạn có chắc muốn xóa không?");
      
        Optional <ButtonType> action = alert.showAndWait();
        
        if(action.get()==ButtonType.OK)
        {                   
            StringProperty tenkh = new SimpleStringProperty(txtfi_tenkh.getText());
            StringProperty sdt = new SimpleStringProperty(txtfi_sdt.getText());
            customer cus = new customer(tenkh, sdt);
            int makh=Integer.parseInt(txtfi_makh.getText());

            if (cus.delete(makh)) {
                System.out.println("xoa du lieu thanh cong");
            }
            view();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initTree_view();
        btn_view.setText("_View");
        btn_view.setMnemonicParsing(true);
        btn_insert.setText("_Insert");
        btn_insert.setMnemonicParsing(true);
        
    }

    private void initTree_view() {
        JFXTreeTableColumn<customer, Number> makh = new JFXTreeTableColumn<>("Mã khách hàng");
        makh.setPrefWidth(150);
        makh.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<customer, Number>, ObservableValue<Number>>() {
            @Override
            public ObservableValue<Number> call(TreeTableColumn.CellDataFeatures<customer, Number> param) {
                return param.getValue().getValue().getMakhachhang();
            }
        });
        //makh.setVisible(false);
        
        JFXTreeTableColumn<customer, String> tenkh = new JFXTreeTableColumn<>("Tên khách hàng");
        tenkh.setPrefWidth(150);
        tenkh.setCellValueFactory((TreeTableColumn.CellDataFeatures<customer, String> param)
                -> param.getValue().getValue().getTenkhachhang());

        JFXTreeTableColumn<customer, String> sdt = new JFXTreeTableColumn<>("Số điện thoại");
        sdt.setPrefWidth(150);
        sdt.setCellValueFactory((TreeTableColumn.CellDataFeatures<customer, String> param)
                -> param.getValue().getValue().getSdt());

//        JFXTreeTableColumn col = new JFXTreeTableColumn();
//        col.setText("Locked");  
//        col.setCellValueFactory(new PropertyValueFactory("Locked")); 
          //  tree_table_vi.getColumns().add(col);  
        tree_table_vi.getColumns().setAll(makh, tenkh, sdt);
    
        tree_table_vi.setColumnResizePolicy(TreeTableView.CONSTRAINED_RESIZE_POLICY);
        

        tree_table_vi.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object oldValue, Object newValue) {
               
                if (tree_table_vi.getSelectionModel().getSelectedItem() != null) {
//                    TreeTableViewSelectionModel selectionModel = tree_table_vi.getSelectionModel();
//                    ObservableList selectedCells = selectionModel.getSelectedCells();
//                    TreeTablePosition tablePosition = (TreeTablePosition) selectedCells.get(0);
//                    Object val = tablePosition.getTableColumn().getCellData(tablePosition.getRow());
                    TreeItem<customer> cus = tree_table_vi.getSelectionModel().getSelectedItem();                      
                    txtfi_makh.setText(""+cus.getValue().getMakhachhang().get());
                }
            }
        });
       

    }

}
