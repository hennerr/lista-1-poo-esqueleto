package br.inatel.cdg.algebra.scene;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//Nao precisa se preocupar com essa classe
public class Main extends Application {

    //Não precisa alterar nada dessa classe
    @Override
    public void start(Stage stage) throws Exception {
        new ScenePrincipal().criaScenePrincipal(stage);
    }

    //Não precisa alterar nada dessa classe
    public static void main(String[] args) {
        launch();
    }
}
//Naoooooooooo
//De fato nao precisa fazer nada akiiiiiiii
//Tudo que eu mudo aqui! O git fica sabendo
//Demostracao para a turma C125-L2