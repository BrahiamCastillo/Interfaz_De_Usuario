package user;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana {
	JFrame ventana;
	Border blackline;
	JPanel panel1, panel2, panel3, panel4, panel5;
	JLabel uno, dos, tres, cuatro, cinco, seis;
	JTextField campo1, campo2, campo3, campo4, campo5;
	JButton boton1, boton2;
	
	public Ventana() {
		Estructura();
	}
	
	void ParteIzquierda() {
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
		
		panel2=new JPanel();
		panel2.setLayout(null);
		boton2=new JButton("Probar Conexión");
		boton2.setFont(new Font("Times New Roman",Font.BOLD,12));
		boton2.setBounds(10,10,230,27);
		panel2.add(boton2);
		
	}
	
	void Estructura() {
		ventana= new JFrame();
		ventana.setTitle("Formulario de contacto");
		ventana.setSize(800,600);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		ParteIzquierda();
		ventana.add(panel1);
		ventana.add(panel2);
		
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	}
	

}
