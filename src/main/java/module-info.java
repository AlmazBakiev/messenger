module ru.gb.javalvl2.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.javalvl2.demo to javafx.fxml;
    exports ru.gb.javalvl2.demo;
}