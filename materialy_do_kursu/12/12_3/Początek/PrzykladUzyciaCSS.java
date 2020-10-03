public class PrzykladUzyciaCSS extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Zdefiniowanie layoutu.
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Zdefiniowanie elementow.
        Button button_1 = new Button("Przycisk 1");
        Button button_2 = new Button("Przycisk 2");

        TextField textField_1 = new TextField("Pole tekstowe 1");
        TextField textField_2 = new TextField("Pole tekstowe 2");

        CheckBox checkBox_1 = new CheckBox("Check box 1");
        CheckBox checkBox_2 = new CheckBox("Check box 2");

        // Dodanie elementow do layoutu.
        gridPane.add(button_1, 0, 0);
        gridPane.add(button_2, 0, 1);

        gridPane.add(textField_1, 1, 0);
        gridPane.add(textField_2, 1, 1);

        gridPane.add(checkBox_1, 2, 0);
        gridPane.add(checkBox_2, 2, 1);

        // Zdefiniowanie sceny.
        Scene scene = new Scene(gridPane, 500, 200);

        // Wyswietlenie okna.
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}