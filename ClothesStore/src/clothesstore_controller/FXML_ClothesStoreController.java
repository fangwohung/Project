/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothesstore_controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXDrawer.DrawerDirection;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.events.JFXDrawerEvent;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author dieunguyen
 */
public class FXML_ClothesStoreController implements Initializable {

    @FXML
    private JFXButton btnTongQuan;
    @FXML
    private JFXButton btnHangHoa;
    @FXML
    private JFXButton btnNhapKho;
    @FXML
    private JFXButton btnDonHang;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private AnchorPane box_minimized;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private AnchorPane root, rootm;

    public static AnchorPane rootP;

    @FXML
    private VBox list_btn;
private boolean ondrag=false;
    @FXML
    private void changeTab(ActionEvent event) throws IOException {
        JFXButton btn = (JFXButton) event.getSource();
        System.out.println(btn.getText());
        FXML_ClothesStoreController.rootP.getChildren().removeAll();
        switch (btn.getId()) {
            case "btnTongQuan":
                AnchorPane tongquan = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_TongQuan.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(tongquan);
                root.setLeftAnchor(tongquan, 0.0);
                root.setRightAnchor(tongquan, 0.0);
                root.setTopAnchor(tongquan, 0.0);
                root.setBottomAnchor(tongquan, 0.0);
                break;
            case "btnDonHang":
                AnchorPane donhang = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_DonHang.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(donhang);
                root.setLeftAnchor(donhang, 0.0);
                root.setRightAnchor(donhang, 0.0);
                root.setTopAnchor(donhang, 0.0);
                root.setBottomAnchor(donhang, 0.0);
                break;
            case "btnHangHoa":
                AnchorPane hanghoa = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_HangHoa.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(hanghoa);
                root.setLeftAnchor(hanghoa, 0.0);
                root.setRightAnchor(hanghoa, 0.0);
                root.setTopAnchor(hanghoa, 0.0);
                root.setBottomAnchor(hanghoa, 0.0);
                break;
            case "btnNhapKho":
                AnchorPane nhapkho = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_NhapKho.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(nhapkho);
                root.setLeftAnchor(nhapkho, 0.0);
                root.setRightAnchor(nhapkho, 0.0);
                root.setTopAnchor(nhapkho, 0.0);
                root.setBottomAnchor(nhapkho, 0.0);
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rootP = root;
        box_minimized.setVisible(false);

        try {
            AnchorPane tongquan = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_TongQuan.fxml"));
            FXML_ClothesStoreController.rootP.getChildren().setAll(tongquan);
            root.setLeftAnchor(tongquan, 0.0);
            root.setRightAnchor(tongquan, 0.0);
            root.setTopAnchor(tongquan, 0.0);
            root.setBottomAnchor(tongquan, 0.0);

            AnchorPane box = FXMLLoader.load(getClass().getResource("/clothesstore_view/SidePanelContent.fxml"));
//              box.getChildren().remove(1);
//              for(Node node: box.getChildren()){
//                if(node instanceof JFXButton){                  
//              }
//             }
            drawer.setSidePane(box);
        } catch (IOException ex) {
            Logger.getLogger(FXML_ClothesStoreController.class.getName()).log(Level.SEVERE, null, ex);
        }

  
  
      
    

        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
            transition.setRate(transition.getRate() * -1);
            transition.play();
            if (drawer.isShown()) {
                drawer.close();
                rootm.setLeftAnchor(root, 230.0);
                box_minimized.setVisible(false);
            } else {
                drawer.open();
                rootm.setLeftAnchor(root, 52.0);
                box_minimized.setVisible(true);
            }
        });
         drawer.addEventHandler(MouseEvent.DRAG_DETECTED, (e) -> {
            transition.setRate(transition.getRate() * -1);
            transition.play();
            if (drawer.isShown()) {
               
               
            } 
            else {
            rootm.setLeftAnchor(root, 52.0);
                box_minimized.setVisible(true);
            }
        });          
    }

}
