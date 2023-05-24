package L;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
import java.util.Scanner;
import javax.swing.Action;

public class L extends JFrame {

    private JPanel panelBotones;
private int matrizX[][];
    public L(int filas, int columnas) {
        initComponents(filas, columnas);

    }
    private static int v = 2;

    private void initComponents(int filas, int columnas) {

        panelBotones = new JPanel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        getContentPane().setLayout(new BorderLayout(2, 0));

        panelBotones.setLayout(new GridLayout(filas, columnas, 2, 2));
matrizX=new int[filas][columnas];
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                JButton boton = new JButton();
                boton.setText(" ");
                panelBotones.add(boton);
                int x = i;
                int y = j;

                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                            boton.setText(Motrar(x, y));
                            Motrar2();
                            
                    }
                });
            }
        }

        getContentPane().add(panelBotones, BorderLayout.SOUTH);
        setTitle("TicTac");
        pack();
        setVisible(true);
    }
    public String Motrar(int i, int j) {
if (v==2){
    v=1;
    matrizX[i][j]=1;
    return "O"; 
}else if (v==1){
    v=2;
    matrizX[i][j]=2;
    return "X";
}
        return "--";
        
    
    }
public void Motrar2(){
    if(matrizX[0][0]==1 && matrizX[1][1]==1 && matrizX[2][2]==1){
        System.out.println("ganaste o");
        v=0;
    }else  if(matrizX[0][0]==2 && matrizX[1][1]==2 && matrizX[2][2]==2){
        v=0;
        System.out.println("ganaste x");
    }
       if(matrizX[2][0]==1 && matrizX[1][1]==1 && matrizX[0][2]==1){
        System.out.println("ganaste o");
        v=0;
    }else  if(matrizX[2][0]==2 && matrizX[1][1]==2 && matrizX[0][2]==2){
        System.out.println("ganaste x");
        v=0;
    }
   
    for (int p = 0; p <matrizX[0].length; p++) {
        int k=0;
    int l=0; 
    for (int i = 0; i <matrizX.length; i++) {
         if(matrizX[i][p]==1){
                k+=1;
            }else if(matrizX[i][p]==2){
                        l+=1;
                        }
         if(k==matrizX.length){
                System.out.println("Ganaste o");
                v=0;
            }else if(l==matrizX.length) {
                System.out.println("Ganste x");
                v=0;
            }
        int o=0;
        int x=0;
        for (int j = 0; j <matrizX[0].length; j++) {
            if(matrizX[i][j]==1){
                o+=1;
            }else if(matrizX[i][j]==2){
                        x+=1;
                        }
            if(o==matrizX.length){
                System.out.println("Ganaste o");
                v=0;
            }else if(x==matrizX.length) {
                System.out.println("Ganste x");
                v=0;
            }
        }
        }
    } 
    
}
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese las Filas: \n");
        int filas = input.nextInt();

        System.out.print("Ingrese las Columnas: \n");
        int columnas = input.nextInt();
        L v = new L(filas, columnas);
        
    }
}
