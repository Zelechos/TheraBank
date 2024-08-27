module com.bank.therabank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.bank.therabank to javafx.fxml;
    exports com.bank.therabank;
    exports com.bank.therabank.Controllers;
    exports com.bank.therabank.Controllers.Admin;
    exports com.bank.therabank.Controllers.Client;
    exports com.bank.therabank.Controllers.Observer;
    exports com.bank.therabank.Models;
    exports com.bank.therabank.Views;
}
