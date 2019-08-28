/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_4;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private DatePicker datePickerNascimento;
    @FXML
    private ComboBox<String> comboCidades;
    @FXML
    private ListView<String> listViewCidade;
    @FXML
    private Spinner<Integer> spinnerPeriodo;
    
        private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //configurar os elementos que vão aparecer no comboBox
        
        //Criar uma lista JavaFX de String para colocar no comboBox
        ObservableList  lista =  FXCollections.observableArrayList();
        lista.add("Pirapora");
        lista.add("Buritizero");
        lista.add("Varzea da Palma");
        
        //adicionar a lista no comboBox
        comboCidades.setItems(lista);
        
        //mostrar listView
        listViewCidade.setItems(lista);
        
        //configurar o Spinner para valores interos
        //primeiro parametro é o minimo
        //segundo maximo
        //terceiro valor(opcional)
        SpinnerValueFactory<Integer> valores = 
                new SpinnerValueFactory
                        .IntegerSpinnerValueFactory(1,8,1);
        spinnerPeriodo.setValueFactory(valores);
    }    

    @FXML
    private void PegarDados(ActionEvent event) {
        
        //Pegando a data do componente
        LocalDate data =datePickerNascimento.getValue();
        System.out.println(data);
       
        //pegando os elementos do ComboBox
        System.out.println(comboCidades.getValue());
        
        //pegando os elementos da ListView
        System.out.println(listViewCidade.getSelectionModel()
                .getSelectedItems());
        
        //pegando dados do Spinner
        System.out.println(spinnerPeriodo.getValue());
               
    }
    
}
