package book.view;

import book.Book;
import book.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBookController {

    @FXML
    private TableView<DataPersonal> tabelPerson;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaBelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelKota;

    @FXML
    private Label labelNoHp;
    
    private Book kelasUtama;

    public ViewBookController(){
    }
    
    @FXML
    private void initialize(){
       kolomNamaDepan.setCellValueFactory(celldata->celldata.getValue().namadepanProperty());
        kolomNamaBelakang.setCellValueFactory(celldata->celldata.getValue().namabelakangProperty());
    }
    
        public void setKelasUtama(Book book){
        this.kelasUtama = book;
        tabelPerson.setItems(kelasUtama.getDataPersonal());
    }

}
