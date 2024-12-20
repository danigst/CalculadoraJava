package com.dani.eventos.controler;

import com.dani.eventos.MyApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculadoraControler implements Initializable,EventHandler<ActionEvent> {
    @FXML
    private Button btnCero,btnCientifica,btnUno, btnTres,btnSiete,btnSeis,btnPunto,btnOcho,
            btnNueve,btnMulti,btnMostrarOcultar,btnResta,btnSuma,btnDos,btnDivison, btnCuatro,btnCinco,ac,btnIgual, btnMasMenos, btnPorcentaje;
    @FXML
    private TextField pantalla;

    @FXML
    private GridPane panelTeclas;

    private DropShadow sombra;

    private boolean operacion = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Empieza a generar la logica de la programacion

        //Instancioas deberia ser llamado el primero
        instancias();
        initGUI();
        acciones();

    }

    private void acciones() {
        //Cuando se pasa encima del boton, sombra
        //Cuandos se sale del boton se quita la sombra
        //Cuando se pulsa en el boton pasa algo


        for(Node item: panelTeclas.getChildren()){
            ((Button)item).setOnAction(this);
            ((Button)item).setOnMouseEntered(new ManejoRaton());
            ((Button)item).setOnMouseExited(new ManejoRaton());
        }
    }
    private void instancias(){sombra = new DropShadow();}

    private void initGUI() {
        btnSuma.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/Iconos/mas.png"))));
        btnSuma.setBackground(null);
        btnSuma.setUserData("+");

        btnResta.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/boton-menos.png"))));
        btnResta.setBackground(null);
        btnResta.setUserData("-");

        btnUno.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/1.png"))));
        btnUno.setBackground(null);
        btnUno.setUserData("1");

        btnDos.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/2.png"))));
        btnDos.setBackground(null);
        btnDos.setUserData("2");

        btnTres.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/3.png"))));
        btnTres.setBackground(null);
        btnTres.setUserData("3");

        btnCuatro.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/4.png"))));
        btnCuatro.setBackground(null);
        btnCuatro.setUserData("4");

        btnCinco.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/5.png"))));
        btnCinco.setBackground(null);
        btnCinco.setUserData("5");

        btnSeis.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/6.png"))));
        btnSeis.setBackground(null);
        btnSeis.setUserData("6");

        btnSiete.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/7.png"))));
        btnSiete.setBackground(null);
        btnSiete.setUserData("7");

        btnOcho.setGraphic(new ImageView(new Image("/com/dani/calculadora/iconos/8.png")));
        btnOcho.setBackground(null);
        btnOcho.setUserData("8");

        btnNueve.setGraphic(new ImageView(new Image("/com/dani/calculadora/iconos/9.png")));
        btnNueve.setBackground(null);
        btnNueve.setUserData("9");

        btnCero.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/0.png"))));
        btnCero.setBackground(null);
        btnCero.setUserData("0");

        btnDivison.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/division.png"))));
        btnDivison.setBackground(null);
        btnDivison.setUserData("/");

        ac.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/isla-ascencion.png"))));
        ac.setBackground(null);
        ac.setUserData("ac");

        btnIgual.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/igual.png"))));
        btnIgual.setBackground(null);
        btnIgual.setUserData("=");

        btnMulti.setGraphic(new ImageView(new Image(MyApp.class.getResourceAsStream("/com/dani/calculadora/iconos/asterisco.png"))));
        btnMulti.setBackground(null);
        btnMulti.setUserData("*");

        btnMasMenos.setGraphic(new ImageView(new Image("/com/dani/calculadora/iconos/mas-menos.png")));
        btnMasMenos.setBackground(null);
        btnMasMenos.setUserData("-");

        btnPunto.setGraphic(new ImageView(new Image("/com/dani/calculadora/iconos/periodo.png")));
        btnPunto.setBackground(null);
        btnPunto.setUserData(".");

        btnPorcentaje.setGraphic(new ImageView(new Image("/com/dani/calculadora/iconos/por-ciento.png")));
        btnPorcentaje.setBackground(null);
        btnPorcentaje.setUserData("%");







    }

    @Override
    public void handle(ActionEvent event) {
        Button button = (Button) event.getSource();
        pantalla.appendText((String) button.getUserData());

        if (event.getSource() == ac) {
            pantalla.clear();

        } else if (event.getSource() == btnSuma) {
            pantalla.clear();
        } else if (event.getSource() == btnResta){
            pantalla.clear();
        }else if (event.getSource() == btnDivison){
            pantalla.clear();
        } else if (event.getSource() == btnMulti) {
            pantalla.clear();
        } else if (event.getSource() == btnIgual) {
            pantalla.clear();
        }
    }

    class ManejoRaton implements EventHandler<MouseEvent>{

        @Override
        public void handle(MouseEvent event) {
            if (event.getEventType() == MouseEvent.MOUSE_ENTERED){
                ((Button)event.getSource()).setEffect(sombra);
                //event.getSource() sabemos quien ha provocado el evento
            } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
                ((Button)event.getSource()).setEffect(null);
            }

        }
    }
}