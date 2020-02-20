package Colas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	
	ImageIcon[] imagenes=new ImageIcon[15];
	JLabel[] clientes=new JLabel[11];
	Logica logic=new Logica();
	private JTextField nrecibos;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void update(){
		
		
		
		
		for(int i=0;i<logic.cola.size();i++){
			clientes[i].setIcon(imagenes[logic.cola.get(i).numeroderecibos-1]);
			clientes[i].setVisible(true);
		}
		
		
		
	}
	
	
	public void remove(){
		clientes[logic.cola.size()].setVisible(false);
		update();
	}


	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1615, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		imagenes[0]=new ImageIcon(Ventana.class.getResource("/Resource/cola1.png"));
		imagenes[1]=new ImageIcon(Ventana.class.getResource("/Resource/cola2.png"));
		imagenes[2]=new ImageIcon(Ventana.class.getResource("/Resource/cola3.png"));
		imagenes[3]=new ImageIcon(Ventana.class.getResource("/Resource/cola4.png"));
		imagenes[4]=new ImageIcon(Ventana.class.getResource("/Resource/cola5.png"));
		imagenes[5]=new ImageIcon(Ventana.class.getResource("/Resource/cola6.png"));
		imagenes[6]=new ImageIcon(Ventana.class.getResource("/Resource/cola7.png"));
		imagenes[7]=new ImageIcon(Ventana.class.getResource("/Resource/cola8.png"));
		imagenes[8]=new ImageIcon(Ventana.class.getResource("/Resource/cola9.png"));
		imagenes[9]=new ImageIcon(Ventana.class.getResource("/Resource/cola10.png"));
		imagenes[10]=new ImageIcon(Ventana.class.getResource("/Resource/cola11.png"));
		imagenes[11]=new ImageIcon(Ventana.class.getResource("/Resource/cola12.png"));
		imagenes[12]=new ImageIcon(Ventana.class.getResource("/Resource/cola13.png"));
		imagenes[13]=new ImageIcon(Ventana.class.getResource("/Resource/cola14.png"));
		imagenes[14]=new ImageIcon(Ventana.class.getResource("/Resource/cola15.png"));
		
		
		int posinicial=179;
		
		
		for(int i=0;i<11;i++){
			
			clientes[i]=new JLabel("");
			clientes[i].setIcon(imagenes[0]);
			clientes[i].setBounds(posinicial,275,117,133);
			posinicial=posinicial+125;
			contentPane.add(clientes[i]);
			clientes[i].setVisible(false);
			
		}
		
	
		
		nrecibos = new JTextField();
		nrecibos.setBounds(20, 489, 210, 26);
		contentPane.add(nrecibos);
		nrecibos.setColumns(10);
		
		JButton agregar = new JButton("");
		agregar.setIcon(new ImageIcon(Ventana.class.getResource("/Resource/agregarbtn.png")));
		agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					
					if(logic.cola.size()==11){
						JOptionPane.showMessageDialog(null, "Numero maximo de clientes en cola");
					}
					else{
						int recibosn=Integer.parseInt(nrecibos.getText());
						logic.agregarcliente(recibosn);
						update();
					}
					
					
				}
				catch(Exception e){
					
					
					
				}
				
			}
		});
		agregar.setBounds(20, 539, 210, 38);
		contentPane.add(agregar);
		
		JButton atender = new JButton("");
		atender.setIcon(new ImageIcon(Ventana.class.getResource("/Resource/atenderclientebtn.png")));
		atender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(logic.atender()==1){
					remove();
				}
				else{
				update();
				}
			}
		});
		atender.setBounds(276, 539, 210, 38);
		contentPane.add(atender);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Ventana.class.getResource("/Resource/ultimatefondo.png")));
		fondo.setBounds(0, 0, 1600, 600);
		contentPane.add(fondo);
	}
}
