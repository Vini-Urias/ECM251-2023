package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAluno extends JFrame implements ActionListener{
    private JButton bt;
    
    private JTextField tx;
    
    public TelaAluno(){
        Container cx = getContentPane();
        cx.setLayout(new FlowLayout());
        bt = new JButton("Cadastrar.");
        
        


    }




    public void actionPerformed(ActionEvent e){

    }
}