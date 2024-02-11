import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CadastroProdutos extends JFrame {
    // Componentes do formulário
    private final JTextField nomeProdutoField;
    private final JTextField precoProdutoField;
    private final JTextField quantidadeProdutoField;
    private final JButton botaoCadastrar;

    public CadastroProdutos() {
        super("Cadastro de Produtos"); // Título da janela
        setLayout(new FlowLayout()); // Define o layout da janela

        // Cria e adiciona os componentes do formulário
        add(new JLabel("Nome do Produto:"));
        nomeProdutoField = new JTextField(20);
        add(nomeProdutoField);

        add(new JLabel("Preço do Produto:"));
        precoProdutoField = new JTextField(10);
        add(precoProdutoField);

        add(new JLabel("Quantidade em Estoque:"));
        quantidadeProdutoField = new JTextField(10);
        add(quantidadeProdutoField);

        botaoCadastrar = new JButton("Cadastrar");
        add(botaoCadastrar);

        // Configura o evento de clique do botão
        botaoCadastrar.addActionListener(new ActionListener() {
            
            public void actionPerformed(final ActionEvent e) {
                cadastrarProduto();
            }
        });

        setSize(250, 200); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar a janela
        setVisible(true); // Torna a janela visível
    }

    private void cadastrarProduto() {
        // Aqui você pode adicionar a lógica para salvar os dados do produto
        final String nomeProduto = nomeProdutoField.getText();
        final String precoProduto = precoProdutoField.getText();
        final String quantidadeProduto = quantidadeProdutoField.getText();

        // Simulação de cadastro (substituir por lógica de banco de dados)
        System.out.println("Produto cadastrado com sucesso:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Preço: " + precoProduto);
        System.out.println("Quantidade em Estoque: " + quantidadeProduto);
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new CadastroProdutos(); // Cria e mostra a aplicação
            }
        });
    }
}
