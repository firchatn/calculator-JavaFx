/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


/**
 * FXML Controller class
 *
 * @author firas
 */
public class LayoutIndexController implements Initializable {
    @FXML private TextField res;
    @FXML private TextField resf;
        @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    /**
     * Initializes the controller class.
     */
        @FXML
    void un(ActionEvent event) {
        res.setText(res.getText() +"1");
    }
    @FXML
    void deux(ActionEvent event) {
        res.setText(res.getText() +"2");
    }
    @FXML
    void trois(ActionEvent event) {
        res.setText(res.getText() +"3");
    }
    @FXML
    void quatre(ActionEvent event) {
        res.setText(res.getText() +"4");
    }
    @FXML
    void cinq(ActionEvent event) {
        res.setText(res.getText() +"5");
    }
    @FXML
    void six(ActionEvent event) {
        res.setText(res.getText() +"6");
    }
    @FXML
    void sett(ActionEvent event) {
        res.setText(res.getText() +"7");
    }
    @FXML
    void huit(ActionEvent event) {
        res.setText(res.getText() +"8");
    }
    @FXML
    void neuf(ActionEvent event) {
        res.setText(res.getText() +"9");
    }
    @FXML
    void zero(ActionEvent event) {
        res.setText(res.getText() +"0");
    }
    @FXML
    void plus(ActionEvent event) {
        res.setText(res.getText() +"+");
    }
    @FXML
    void moin(ActionEvent event) {
        res.setText(res.getText() +"-");
    }
    @FXML
    void fois(ActionEvent event) {
        res.setText(res.getText() +"*");
    }
    @FXML
    void sur(ActionEvent event) {
        res.setText(res.getText() +"/");
    }
    @FXML
    void clean(ActionEvent event) {
        res.setText("");
        resf.setText("");
    }
    @FXML
    void resultat(ActionEvent event) throws ScriptException {
        
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String ch =res.getText();
    resf.setText(engine.eval(ch).toString());
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
