package br.inatel.cdg.algebra.scene;

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
        HBox grupoHorizontal5 = new HBox(textOutCoefLin, textOutCoefAng);
        HBox grupoHorizontal6 = new HBox(btnCoeficienteLinear, btnCoeficienteAngular);

        // Agora vamos criar a area que mostrará o que foi digitado

        textOutCoefLin = new TextField();
        textOutCoefAng = new TextField();
        textOutCoefLin.setEditable(false); // vamos deixar false para apenas mostrar texto.
        textOutCoefAng.setEditable(false); // vamos deixar false para apenas mostrar texto.
        textOutCoefLin.setText("Coef Linear: ");
        textOutCoefAng.setText("Coef Angular: ");

        // Criamos o botão
        btnCoeficienteLinear = new Button("Calcula Coeficiente Linear");
        btnCoeficienteAngular = new Button("Calcula Coeficiente Angular");

        // Criamos a ação que o botão responderá as ser pressionado.
        // Aqui dentro é a ação que será executado ao pressionar o botão.

        btnCoeficienteLinear.setOnAction(CalcCoeficienteLinear -> {
            int ptx1, ptx2, pty1, pty2;
            ptx1 = Integer.parseInt(textInputx1.getText());
            ptx2 = Integer.parseInt(textInputx2.getText());
            pty1 = Integer.parseInt(textInputy1.getText());
            pty2 = Integer.parseInt(textInputy2.getText());

            textOutCoefLin.setText(String.valueOf(Coeficientelinear(ptx1, ptx2, pty1, pty2)));

        });
        btnCoeficienteAngular.setOnAction(CalcCoeficienteAngulaer -> {
            int ptx1, ptx2, pty1, pty2;
            ptx1 = Integer.parseInt(textInputx1.getText());
            ptx2 = Integer.parseInt(textInputx2.getText());
            pty1 = Integer.parseInt(textInputy1.getText());
            pty2 = Integer.parseInt(textInputy2.getText());

            textOutCoefLin.setText(String.valueOf(Coeficienteangular(ptx1, ptx2, pty1, pty2)));

        });

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

    public double Coeficienteangular(int ptx1, int ptx2, int pty1, int pty2) {

        double result;
        result = (pty2 - pty1) / (ptx2 - ptx1);

        return result;

    }

    public double Coeficientelinear(int ptx1, int ptx2, int pty1, int pty2) {

        double result;
        result = pty1 - Coeficienteangular(ptx1, ptx2, pty1, pty2) * ptx1;

        return result;

    }

}
