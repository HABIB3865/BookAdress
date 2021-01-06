/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Scene;
 import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *
 * @author habib
 */
public class Book extends Application {
    
  //variabel kelas
 private Stage stageAplikasi;
 private BorderPane rootAplikasi;

 @Override
 public void start(Stage primaryStage){
 this.stageAplikasi = primaryStage;
 this.stageAplikasi.setTitle("Buku Alamat");
 initGuiKerangka(); //fungsi untuk inisialisasi node dari Guikerangka.fxml
 initViewBook();//fungsi inisialisasi node dari viewBukuAlamat
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
    private void initViewBook() {
        try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(Book.class.getResource(
        "view/ViewBook.fxml"));
         AnchorPane guiIsi = (AnchorPane)loader.load();
        rootAplikasi.setCenter(guiIsi);
         } catch (IOException ex) {
         Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
         }
 }

   

    
}
