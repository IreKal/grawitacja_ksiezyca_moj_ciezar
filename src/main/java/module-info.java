module com.example.grawitacja_ksiezyca_moj_ciezar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grawitacja_ksiezyca_moj_ciezar to javafx.fxml;
    exports com.example.grawitacja_ksiezyca_moj_ciezar;
}