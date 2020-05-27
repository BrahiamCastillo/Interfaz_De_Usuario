package user;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana {
	JFrame ventana;
	Border blackline;
	JPanel panel1, panel2, panel3, panel4, panel5;
	JLabel uno, dos, tres, cuatro, cinco, seis, siete, ocho;
	JTextField campo1, campo2, campo3, campo4, campo5;
	JButton boton1, boton2, boton3;
	JComboBox<String> combo1;
	
	public Ventana() {
		Estructura();
	}
	
	void Componentes() {
		panel1=new JPanel();
		blackline=BorderFactory.createLineBorder(Color.black);
		panel1.setLayout(null);
		panel1.setBorder(blackline);
		uno=new JLabel("Datos personales");
		uno.setFont(new Font("Times New Roman",Font.BOLD,13));
		uno.setBounds(15,-30,100,100);
		dos=new JLabel("Nombres del contacto:");
		dos.setFont(new Font("Times New Roman",Font.BOLD,12));
		dos.setBounds(15,-28,150,150);
		campo1=new JTextField();
		campo1.setFont(new Font("Times New Roman",Font.BOLD,12));
		campo1.setBounds(15,55,250,22);
		tres=new JLabel("Apellidos del contacto:");
		tres.setFont(new Font("Times New Roman",Font.BOLD,12));
		tres.setBounds(15,15,150,150);
		campo2=new JTextField();
		campo2.setFont(new Font("Times New Roman",Font.BOLD,12));
		campo2.setBounds(15,98,250,22);
		cuatro=new JLabel("Email:");
		cuatro.setFont(new Font("Times New Roman",Font.BOLD,12));
		cuatro.setBounds(15,70,150,150);
		campo3=new JTextField();
		campo3.setFont(new Font("Times New Roman",Font.BOLD,12));
		campo3.setBounds(15,153,125,22);
		cinco=new JLabel("Celular:");
		cinco.setFont(new Font("Times New Roman",Font.BOLD,12));
		cinco.setBounds(150,70,150,150);
		campo4=new JTextField();
		campo4.setFont(new Font("Times New Roman",Font.BOLD,12));
		campo4.setBounds(150,153,113,22);
		seis=new JLabel("Dirección:");
		seis.setFont(new Font("Times New Roman",Font.BOLD,12));
		seis.setBounds(15,130,150,150);
		campo5=new JTextField();
		campo5.setFont(new Font("Times New Roman",Font.BOLD,12));
		campo5.setBounds(15,212,250,22);
		siete=new JLabel(" ");
		siete.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,15));
		siete.setBorder(blackline);
		siete.setSize(170,150);
		siete.setBounds(520,25,180,150);
		ocho=new JLabel("FOTO");
		ocho.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,15));
		ocho.setBounds(585,25,170,150);
		boton1=new JButton("Cargar foto");
		boton1.setFont(new Font("Times New Roman",Font.BOLD,14));
		boton1.setBounds(520,175,180,27);
		combo1=new JComboBox<String>();
		combo1.setFont(new Font("Times New Roman",Font.BOLD,12));
		combo1.addItem("Seleccione");
		combo1.addItem("Femenino");
		combo1.addItem("Masculino");
		combo1.setBounds(520,210,182,27);

		

		





		panel1.add(uno);
		panel1.add(dos);
		panel1.add(campo1);
		panel1.add(tres);
		panel1.add(campo2);
		panel1.add(cuatro);
		panel1.add(campo3);
		panel1.add(cinco);
		panel1.add(campo4);
		panel1.add(seis);
		panel1.add(campo5);
		panel1.add(siete);
		panel1.add(ocho);
		panel1.add(boton1);
		panel1.add(combo1);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		boton2=new JButton("Probar Conexión");
		boton2.setFont(new Font("Times New Roman",Font.BOLD,14));
		boton2.setBounds(10,10,230,27);
		boton3=new JButton("Otro botón");
		boton3.setFont(new Font("Times New Roman",Font.BOLD,14));
		boton3.setBounds(505,10,230,27);
		
		
		
		Vector<String> fila= new Vector<String>();
		Vector<Vector> filatotal= new Vector<Vector>();
		filatotal.addElement(fila);
		Vector<String> columna= new Vector<String>();
		columna.addElement("Nombres:");
		columna.addElement("Apellidos:");
		columna.addElement("Email:");
		columna.addElement("Telefono:");
		columna.addElement("Dirección:");
		columna.addElement("Sexo:");
		JTable tabla=new JTable(filatotal,columna);
		JScrollPane jsb=new JScrollPane(tabla);
		jsb.setBounds(10,50,725,200);


	



		
		
		panel2.add(boton2);
		panel2.add(boton3);
		panel2.add(jsb);
		
		
	}
	
	
	void Estructura() {
		ventana= new JFrame();
		ventana.setTitle("Formulario de contacto");
		ventana.setSize(760,680);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		Componentes();
		ventana.add(panel1);
		ventana.add(panel2);

		
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	}
	

}
