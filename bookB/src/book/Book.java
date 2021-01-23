/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import book.model.DataPersonal;
import book.view.ViewBookController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Yonatan
 */
public class Book extends Application {
    
    //variabel kelas
private Stage stageAplikasi;
private BorderPane rootAplikasi;
private ObservableList<DataPersonal> dataperson = FXCollections.observableArrayList();

public Book(){
        dataperson.add(new DataPersonal("habib","ahmad"));
        dataperson.add(new DataPersonal("Ahmad","Habib"));
        dataperson.add(new DataPersonal("Imam","suyono"));
        dataperson.add(new DataPersonal("baaqil","arif"));
        dataperson.add(new DataPersonal("Faizin","fais"));
 }

   public ObservableList<DataPersonal> getDataPersonal() {
       return dataperson; //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");

 initGuiKerangka(); //fungsi untuk inisialisasi node dari Guikerangka.fxml
 initViewBukuAlamat();//fungsi inisialisasi node dari viewBukuAlamat
 }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

private void initGuiKerangka() {
 try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(Book.class.getResource("view/GuiKerangka.fxml"));
 rootAplikasi = (BorderPane)loader.load();

 Scene sceneAplikasi = new Scene(rootAplikasi);
 stageAplikasi.setScene(sceneAplikasi);
 stageAplikasi.show();
 } catch (IOException ex) {
Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
}
 }

 private void initViewBukuAlamat() {
 try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(Book.class.getResource("view/ViewBook.fxml"));
 AnchorPane guiIsi = (AnchorPane)loader.load();
 rootAplikasi.setCenter(guiIsi);
 
    ViewBookController kontroler = loader.getController();
    kontroler.setKelasUtama(this);
    
        } catch (IOException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}
