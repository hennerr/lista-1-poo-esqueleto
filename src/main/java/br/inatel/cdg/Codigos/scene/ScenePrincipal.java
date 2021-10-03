package br.inatel.cdg.algebra.scene;
import br.inatel.cdg.algebra.reta.Reta;
import br.inatel.cdg.algebra.reta.Ponto;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScenePrincipal {

    private Button btnCoeficienteLinear, btnCoeficienteAngular; // Criando botões de ação, para calcular os
                                                                // coeficientes.
    private Label pontox1, pontox2, pontoy1, pontoy2; // Criando as label com os pontos para o calculo dos coeficientes.
    private TextField textInputx1, textInputx2, textInputy1, textInputy2; // Criando as variáveis de inserção de texto.
    private TextField textOutCoefLin, textOutCoefAng; // Criando as variáveis de saída de texto.

    public void criaScenePrincipal(Stage stage) {

        // Criando os labels para os pontos e os campos de texto para os dados

        // rótulos
        pontox1 = new Label("Ponto P1.X");
        pontox2 = new Label("Ponto P2.X");
        pontoy1 = new Label("Ponto P1.Y");
        pontoy2 = new Label("Ponto P2.Y");
        // área de texto onde vc digitara alguma coisa
        textInputx1 = new TextField();
        textInputx2 = new TextField();
        textInputy1 = new TextField();
        textInputy2 = new TextField();

        // HBox é usado para agrupar elementos horizontalmente.
        // Passamos no construtor todos os elementos. Você poderá criar vários grupos
        // horizontais.
        HBox grupoHorizontal1 = new HBox(pontox1, textInputx1);
        HBox grupoHorizontal2 = new HBox(pontoy1, textInputy1);
        HBox grupoHorizontal3 = new HBox(pontox2, textInputx2);
        HBox grupoHorizontal4 = new HBox(pontoy2, textInputy2);

        // Agora vamos criar a area que mostrará o que foi digitado
        textOutCoefLin = new TextField();
        textOutCoefAng = new TextField();
        textOutCoefLin.setEditable(false); // vamos deixar false para apenas mostrar texto.
        textOutCoefAng.setEditable(false); // vamos deixar false para apenas mostrar texto.
        textOutCoefLin.setText("Coef Linear: ");
        textOutCoefAng.setText("Coef Angular: ");

        HBox grupoHorizontal5 = new HBox(textOutCoefLin, textOutCoefAng);
        // Criamos a ação que o botão responderá as ser pressionado.
        // Aqui dentro é a ação que será executado ao pressionar o botão.
        // Criamos o botão
        btnCoeficienteLinear = new Button("Calcula Coeficiente Linear");
        btnCoeficienteAngular = new Button("Calcula Coeficiente Angular");
        btnCoeficienteLinear.setOnAction(CalcCoeficienteLinear -> {
            int x1, x2, y1, y2;
            x1 = Integer.parseInt(textInputx1.getText());
            x2 = Integer.parseInt(textInputx2.getText());
            y1 = Integer.parseInt(textInputy1.getText());
            y2 = Integer.parseInt(textInputy2.getText());

            Reta reta = criarReta(x1, y1, x2, y2);

            textOutCoefLin.setText(String.valueOf(reta.calcCoeficientelinear()));

        });
        btnCoeficienteAngular.setOnAction(CalcCoeficienteAngulaer -> {
            int x1, x2, y1, y2;
            x1 = Integer.parseInt(textInputx1.getText());
            x2 = Integer.parseInt(textInputx2.getText());
            y1 = Integer.parseInt(textInputy1.getText());
            y2 = Integer.parseInt(textInputy2.getText());

            Reta reta = criarReta(x1, y1, x2, y2);

            textOutCoefLin.setText(String.valueOf(reta.calcCoeficienteangular()));

        });
        HBox grupoHorizontal6 = new HBox(btnCoeficienteLinear, btnCoeficienteAngular);

        // VBox é usada para agrupar elementos verticalmente.
        // No construtor passamos todos os elementos que serão agrupados, que podem ser
        // outros grupos.
        // Aqui vamos agrupar verticalmente o grupo, (Label + Texto) o Botao e a area
        // que aparecer o texto digitado.

        VBox layoutFinal = new VBox(grupoHorizontal1, grupoHorizontal2, grupoHorizontal3, grupoHorizontal4,
                grupoHorizontal5, grupoHorizontal6);
        // Criamos a Scene
        Scene scene = new Scene(layoutFinal, 300, 200);

        stage.setTitle("Software Para Calculos de Álgebra Linear");
        stage.setScene(scene);
        stage.show();
    }

    public Reta criarReta(double x1, double y1, double x2, double y2) {

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);

        Reta reta = new Reta(p1, p2);

        return reta;

    }

}
