module com.dani.eventos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.dani.eventos to javafx.fxml;
    exports com.dani.eventos;

    exports com.dani.eventos.controler;
    opens com.dani.eventos.controler to javafx.fxml;
}