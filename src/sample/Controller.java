package sample;

import com.sun.webkit.WebPage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Controller {
    @FXML
    public Label javaFxAppliactionLabel;
    @FXML
    public GridPane gridPaneOne;
    @FXML
    public WebView webView;

    @FXML
    private Button button4;

    public void initialize() {
//        button4.setEffect(new DropShadow());
    }

    @FXML
    public  void handleMouseEnter(){
    javaFxAppliactionLabel.setScaleX(2.0);
    javaFxAppliactionLabel.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit(){
        javaFxAppliactionLabel.setScaleX(1.0);
        javaFxAppliactionLabel.setScaleY(1.0);
    }

    public void mouseOnButton4(MouseEvent mouseEvent) {

        button4.setEffect(new DropShadow());
    }

    public void mouseOnButton4vol2(MouseEvent mouseEvent) {
        button4.setEffect(null);

    }

    public void handleClickButton(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();

        chooser.setTitle("SaveApplicationFile");
//        chooser.getExtensionFilters().addAll(
//                new FileChooser.ExtensionFilter("Text","*.txt"),
//                new FileChooser.ExtensionFilter("PDF","*.pdf")
//        );
//        DirectoryChooser directoryChooser = new DirectoryChooser();

//        directoryChooser.showDialog(gridPaneOne.getScene().getWindow());
        List<File> file = chooser.showOpenMultipleDialog(gridPaneOne.getScene().getWindow());
        if (file != null) {
            for (File f: file) {
                System.out.println(f.getName());
                System.out.println(f.getPath());
            }
//            System.out.println(file.getName());
//            System.out.println(file.getPath());
//            System.out.println(file.getParent());
//            System.out.println(file.getFreeSpace());
//            System.out.println(file.getUsableSpace());
//            System.out.println(file.getTotalSpace());
        } else {
            System.out.println("Choose was cancelled");
        }
    }

    public void handleLinkClick(ActionEvent actionEvent) throws URISyntaxException {
//        System.out.println("Link is clicked");
//        try {
//            Desktop.getDesktop().browse(new URI("http://www.google.com"));
//        } catch (URISyntaxException | IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        WebEngine webEngine = webView.getEngine();
        webEngine.load("http://www.google.com");
    }

}
