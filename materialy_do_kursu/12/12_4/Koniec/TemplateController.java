public class TemplateController {

    @FXML
    private Label label;

    private int i = 0;

    @FXML
    public void inkrementacja() {
        label.setText("Obecna wartosc, to: " + ++i);
    }
}
