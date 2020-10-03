package wprowadzenieDoJavaFX;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 12_4
 * "Wprowadzenie do pracy z programem SceneBuilder"
 */
public class TemplateController {

    @FXML
    private Label label;

    private int i = 0;

    @FXML
    public void inkrementacja() {
        label.setText("Obecna wartosc, to: " + ++i);
    }
}
