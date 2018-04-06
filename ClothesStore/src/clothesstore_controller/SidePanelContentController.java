package clothesstore_controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class SidePanelContentController implements Initializable {

    @FXML
    private JFXButton btnTongQuan;
    @FXML
    private JFXButton btnHangHoa;
    @FXML
    private JFXButton btnNhapKho;
    @FXML
    private JFXButton btnDonHang;  
    
    @FXML
    private VBox list_btn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //list_btn.getChildren().remove(0);
    }    
    
    @FXML
    private void changeTab(ActionEvent event) throws IOException {
        JFXButton btn = (JFXButton) event.getSource();
        System.out.println(btn.getText());
        FXML_ClothesStoreController.rootP.getChildren().removeAll();
        switch(btn.getId())
        {
            case "btnTongQuan":
                AnchorPane tongquan = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_TongQuan.fxml"));           
                FXML_ClothesStoreController.rootP.getChildren().setAll(tongquan);
                FXML_ClothesStoreController.rootP.setLeftAnchor(tongquan, 0.0);
                FXML_ClothesStoreController.rootP.setRightAnchor(tongquan, 0.0);
                FXML_ClothesStoreController.rootP.setTopAnchor(tongquan, 0.0);
                FXML_ClothesStoreController.rootP.setBottomAnchor(tongquan, 0.0);
                break;
            case "btnDonHang":
                AnchorPane donhang = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_DonHang.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(donhang);
                FXML_ClothesStoreController.rootP.setLeftAnchor(donhang, 0.0);
                FXML_ClothesStoreController.rootP.setRightAnchor(donhang, 0.0);
                FXML_ClothesStoreController.rootP.setTopAnchor(donhang, 0.0);
                FXML_ClothesStoreController.rootP.setBottomAnchor(donhang, 0.0);
                break;
            case "btnHangHoa":
                AnchorPane hanghoa = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_HangHoa.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(hanghoa);
                FXML_ClothesStoreController.rootP.setLeftAnchor(hanghoa, 0.0);
                FXML_ClothesStoreController.rootP.setRightAnchor(hanghoa, 0.0);
                FXML_ClothesStoreController.rootP.setTopAnchor(hanghoa, 0.0);
                FXML_ClothesStoreController.rootP.setBottomAnchor(hanghoa, 0.0);
                break;
            case "btnNhapKho":
                AnchorPane nhapkho = FXMLLoader.load(getClass().getResource("/clothesstore_view/FXML_NhapKho.fxml"));
                FXML_ClothesStoreController.rootP.getChildren().setAll(nhapkho);
                FXML_ClothesStoreController.rootP.setLeftAnchor(nhapkho, 0.0);
                FXML_ClothesStoreController.rootP.setRightAnchor(nhapkho, 0.0);
                FXML_ClothesStoreController.rootP.setTopAnchor(nhapkho, 0.0);
                FXML_ClothesStoreController.rootP.setBottomAnchor(nhapkho, 0.0);
                break;
        }
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
}
