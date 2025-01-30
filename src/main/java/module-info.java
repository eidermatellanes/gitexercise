module ehu.eus.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ehu.eus.gitexercise to javafx.fxml;
    exports ehu.eus.gitexercise;
}