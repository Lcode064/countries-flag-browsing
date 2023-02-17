
package luka;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class FXMLDocumentController implements Initializable {

    
    
    HashMap hash = new HashMap();
    @FXML
    private Label country;
    @FXML
    private Text rt;
    @FXML
    private Text name;
    @FXML
    private Text capital;
    @FXML
    private Text population;
    @FXML
    private Text continent;
    @FXML
    private Text currency;
    @FXML
    private Rectangle leftB;
    @FXML
    private Rectangle rightB;
    @FXML
    private Rectangle centerB;
    @FXML
    private Rectangle rectangle;
    
    Alert alert=new Alert(AlertType.WARNING,"you are about to exit, do you wish to continue?",ButtonType.YES,ButtonType.NO);
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void belgium(ActionEvent event)
    {
        country.setText("Belgium");
        leftB.setFill(Color.BLACK);
        centerB.setFill(Color.YELLOW);
        rightB.setFill(Color.RED);
        name.setText("Belgium");
        capital.setText("Brussels");
        population.setText("11.59 million(2021)");
        continent.setText("Europe");
        currency.setText("Euros");
        rectangle.setStroke(Color.WHITE);
        hash.put("Belgium", rectangle.getFill());
        
    }

    @FXML
    private void ireland(ActionEvent event) 
    {
        country.setText("Ireland");
        leftB.setFill(Color.GREEN);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.ORANGE);
        name.setText("North Ireland");
        capital.setText("Dublin");
        population.setText("7,026,636(2022)");
        continent.setText("Europe");
        currency.setText("Euros");
        rectangle.setStroke(Color.WHITE);
    }

    @FXML
    private void roma(ActionEvent event)
    {
        country.setText("Italy");
        leftB.setFill(Color.GREEN);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.RED);
        name.setText("Italy");
        capital.setText("Rome");
        population.setText("11.59 million(2021)");
        continent.setText("Europe");
        currency.setText("Euros");
        rectangle.setStroke(Color.WHITE);
    }

    @FXML
    private void lesotho(ActionEvent event)
    {
        country.setText("Nigeria");
        leftB.setFill(Color.GREEN);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.GREEN);
        name.setText("Nigeria");
        capital.setText("Abuja");
        population.setText("213.4 million(2021)");
        continent.setText("Africa");
        currency.setText("Naija");
        rectangle.setStroke(Color.WHITE);
    }

    @FXML
    private void paris(ActionEvent event) 
    {
        country.setText("France");
        leftB.setFill(Color.BLUE);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.RED);
        name.setText("France");
        capital.setText("Paris");
        population.setText("67.75 million(2022)");
        continent.setText("Europe");
        currency.setText("Euros");
    }

    @FXML
    private void mzanzi(ActionEvent event)
    {
        country.setText("Invalid Selection");
        leftB.setFill(Color.WHITE);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.WHITE);
        name.setText("N/A");
        capital.setText("N/A");
        population.setText("N/A");
        continent.setText("N/A");
        currency.setText("N/A");
        rectangle.setStroke(Color.GREY);
        
    }

    @FXML
    private void delhi(ActionEvent event) 
    {
        country.setText("Invalid Selection");
        leftB.setFill(Color.WHITE);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.WHITE);
        name.setText("N/A");
        capital.setText("N/A");
        population.setText("N/A");
        continent.setText("N/A");
        currency.setText("N/A");
        rectangle.setStroke(Color.GREY);
    }

    @FXML
    private void refresh(ActionEvent event)
    {
        country.setText("Fun With Flags");
        leftB.setFill(Color.WHITE);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.WHITE);
        name.setText("N/A");
        capital.setText("N/A");
        population.setText("N/A");
        continent.setText("N/A");
        currency.setText("N/A");
        rectangle.setStroke(Color.GREY);
        leftB.setFill(Color.WHITE);
        centerB.setFill(Color.WHITE);
        rightB.setFill(Color.WHITE);
        name.setText("N/A");
        capital.setText("N/A");
        population.setText("N/A");
        continent.setText("N/A");
        currency.setText("N/A");
        rectangle.setStroke(Color.GREY);
    }

    @FXML
    private void exit(ActionEvent event)
    {
        
        if(alert.showAndWait().get()==ButtonType.YES)
        {
            Platform.exit();
            System.exit(0);
        }
        
    }

    
}
