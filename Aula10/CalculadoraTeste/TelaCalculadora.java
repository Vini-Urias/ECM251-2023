import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalculadora extends JFrame implements ActionListener{
    private JButton botao;
    private JTextField texto;
    private JLabel etiqueta;
    public TelaCalculadora(){
        super("Calculadora");
        botao = new JButton("Soma 10");
        texto = new JTextField("0",10);
        etiqueta = new JLabel("Valor: ");
        Container caixa = getContentPane();
        caixa.setLayout(new FlowLayout());
        caixa.add(etiqueta);
        caixa.add(texto);
        caixa.add(botao);
        caixa.createImage(100, 100);
        botao.addActionListener(this);
        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botao){
            int valor = Integer.parseInt(texto.getText());
            valor+=10;
            texto.setText(""+valor);
            
        }
    }
}


