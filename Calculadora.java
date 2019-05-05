package calculadora;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener
{
	private JLabel digitoUno;
	private JLabel digitoDos;
	private JButton boton;
	private JTextField cajaUno;
	private JTextField cajaDos;
	
    public Calculadora()
    {
    	super();
    	configurarVentana();
    	crearComponente();
    }
    
    private void configurarVentana()
    {
    	this.setTitle("CalculadoraV.1");
    	this.setSize(300,200);
    	this.setLocationRelativeTo(null);
    	this.setLayout(null);
    	this.setResizable(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    private void crearComponente()
    {
    	digitoUno = new JLabel();
    	
    	digitoUno.setText("Ingrese un numero: ");
    	digitoUno.setBounds(0, 0, 200, 30);
    	digitoUno.setForeground(Color.BLACK);
    	this.add(digitoUno);
    	
    	cajaUno = new JTextField();
    	
    	cajaUno.setBounds(125, 0, 100, 30);
    	this.add(cajaUno);

    	digitoDos = new JLabel();
    	
    	digitoDos.setText("Ingrese un numero: ");
    	digitoDos.setBounds(0, 40, 200, 30);
    	digitoDos.setForeground(Color.BLACK);
    	this.add(digitoDos);
    	
    	cajaDos = new JTextField();
    	
    	cajaDos.setBounds(125, 40, 100, 30);
    	this.add(cajaDos);
    	
    	boton = new JButton();
    	
    	boton.setText("Sumar");
    	boton.setBounds(125, 80, 100, 30);
    	boton.addActionListener(this);
    	this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	String numeroUno = cajaUno.getText();
    	String numeroDos = cajaDos.getText();
    	
    	String resultado=comprobarNumero(numeroUno, numeroDos);
    	
    	JOptionPane.showMessageDialog(this, "El resultado es: "+resultado);
    }
    
    private String comprobarNumero(String uno, String dos)
    {
    	double total;
    	String resultado;
    	try{
    		double numUno = Double.parseDouble(uno);
    		double numDos = Double.parseDouble(dos);
    		
    		total=numUno+numDos;
    		resultado = Double.toString(total);
    	} catch(Exception e){
    		resultado="Erro, digito no valido";
    	}
    	return resultado;
    }
    
    public static void main(String[] args)
    {
    	Calculadora ventana = new Calculadora();
    	
    	ventana.setVisible(true);
    	
    }
}