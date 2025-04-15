// Exemplo por Southern Claim (Iago Dórea)
import javax.swing.*;
import java.awt.*;



public class Main {
    public static void main(String[] args) {
        System.out.println("Programa Iniciado!");
        // O frame é a janela
        JFrame telaDoApp = new JFrame("Meu app");
        telaDoApp.setSize(520, 520);

        // O painel é o painel que vai dentro da tela
        JPanel painelDoApp = new JPanel();
        painelDoApp.setSize(520, 520);
        painelDoApp.setLayout(new GridBagLayout());
        String nome = JOptionPane.showInputDialog("Qual o seu Nome?");

        // JOptionPane.showMessageDialog(null, "Seu nome: " + nome, "Info", JOptionPane.INFORMATION_MESSAGE);

        // Adicionando o texto com o nome da pessoa
        JLabel informacoesIniciais = new JLabel();
        informacoesIniciais.setText("Bem vindo " + nome);
        
        // Juntando tudo e deixando a janela visivel
        painelDoApp.add(informacoesIniciais);
        telaDoApp.add(painelDoApp);
        telaDoApp.setVisible(true);
    }
}