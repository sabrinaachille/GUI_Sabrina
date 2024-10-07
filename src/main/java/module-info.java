module sabrina.gui_sabrina {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens sabrina.gui_sabrina to javafx.fxml;
    exports sabrina.gui_sabrina;
}