package CandraApp.File;

import com.sun.java.accessibility.util.GUIInitializedListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Cursor;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class candra extends JFrame{
    public static void main(String[] args) {
//        launch(args);
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//
//    }
        Scanner candra2 = new Scanner(System.in);

            JFrame candra = new candra();
            candra.setTitle("Kalkulator By Candra Julius Sinaga ");
            candra.setDefaultCloseOperation(candra.EXIT_ON_CLOSE);
            candra.setVisible(true);

    }
    private static int Frame_Width = 600;
    private static int Frame_Height = 600;
    private JLabel bilangan1;
    private JLabel bilangan2;
    private JLabel Operator;
    private JLabel hasil;
    private JTextField text1;
    private JTextField text2;
    private JTextField textHasil;
    private JTextField Operator1;
    private JButton tombol;
    private JPanel panel;
    public  candra(){
        createField();
        createTombol();
        createPanel();
        setSize(Frame_Width,Frame_Height);

    }
     private void createField(){
        bilangan1 = new JLabel("Bilangan A ");
        Operator = new JLabel("Operator ");
        bilangan2 = new JLabel("Bilangan B ");
        hasil = new JLabel(" = ");
         final int Field_Width = 15;
         final int Field_Height = 10;
         text1 = new JTextField(Field_Width);
         text1.setText("0 ");
         text1.setSize(Field_Width,Field_Height);
         Operator1 = new JTextField(Field_Height);
         Operator1.setText("*,+,-,/");
         Operator1.setSize(Field_Width,Field_Height);
         text2 = new JTextField();
         text2.setSize(Field_Width,Field_Height);
         text2.setText("0");
         textHasil = new JTextField(Field_Width);
    }
    private void createTombol(){
        final int Frame_width = 5;
        final int Frame_height = 10;
        tombol = new JButton("Tekan Tombol ");
        tombol.setSize(Frame_width,Frame_height);
        class listener implements ActionListener{

            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                boolean candra2 = true;
                double candra = Double.valueOf(text1.getText());
                String operator = String.valueOf(Operator1.getText());
                double julius = Double.valueOf(text2.getText());
                if (operator.equalsIgnoreCase("*")){
                    double hasil = candra * julius;
                    textHasil.setText(hasil + "");
                }else {
                    Scanner candra3 = new Scanner(System.in);
                    System.err.println("Anda Salah memilih operator");
                    setVisible(false);
                    Scanner system = new Scanner(System.in);
                    System.out.println("\n" + " apakah anda ingin lanjut ? (ya/tidak) ");
                    String lanjut = system.nextLine();
                    if (lanjut.equalsIgnoreCase("ya")) {
                        while (!lanjut.equalsIgnoreCase("ya") && !lanjut.equalsIgnoreCase("tidak")) {
                            System.err.println("anda keluar dari program ");
                            System.out.println("\n " + "apakah anda ingin lanjut ? (ya/tidak) ");
                            lanjut = system.nextLine();
                        }
                        setVisible(true);
                    }
                    if (lanjut.equalsIgnoreCase("tidak")){
                        System.err.println("Anda keluar dari program ");
                        setDefaultCloseOperation(JFrame.ERROR);
                    }
                }

            }
        }
        ActionListener liser = new listener();
        tombol.addActionListener(liser);
    }
    private void createPanel(){
        panel = new JPanel();
        panel.add(bilangan1);
        panel.add(text1);
        panel.add(Operator);
        panel.add(Operator1);
        panel.add(bilangan2);
        panel.add(text2);
        panel.add(hasil);
        panel.add(textHasil);
        panel.add(tombol);
        add(panel);
    }
    private static boolean Konfirmasi(String message){
        Scanner system = new Scanner(System.in);
        System.out.println("\n" + message);
        String lanjut = system.nextLine();
        while (!lanjut.equalsIgnoreCase("ya") && !lanjut.equalsIgnoreCase("tidak")){
            System.err.println("anda keluar dari program ");
            System.out.println("\n " + message);
            lanjut = system.nextLine();
        }
        if (lanjut.equalsIgnoreCase("tidak")){
            System.err.println("Anda keluar dari program ");
        }
        return lanjut.equalsIgnoreCase("ya");
    }
}
