package bdEjercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Tipografias.Fuentes;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ventana_Cliente extends JFrame {

    private JPanel panel, panel1;
    private JTextField textNombre;
    private JTextField textCedula;
    private JTextField textApellido;
    private JTextField textDireccion;
    private JTextField textCorreo;
    private JTextField textTelefono;
    private JButton botonGuardar;
    private JButton botonEditar;
    private JButton botonEliminar;
    private JButton botonTraer;
    private Utilidades utilidades;
    private Fuentes tipoFuente = new Fuentes();

    public Ventana_Cliente() {
        this.setSize(830, 830);
        this.setTitle("Cliente");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();

    }

    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiquetas();
        colocarTexto();
        //colocarLayouts();
        colocarBotones();
        eventoBoton();
        utilidades = new Utilidades();
        limpiarCampos();
    }

    public void limpiarCampos() {
        textCedula.setText("");
        textNombre.setText("");
        textApellido.setText("");
        textDireccion.setText("");
        textCorreo.setText("");
        textTelefono.setText("");
    }

    public void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
        //panel.setLayout(new BorderLayout(0,0));
        panel.setLayout(null);

        panel1 = new JPanel();
        panel1.setBackground(Color.ORANGE);
        //panel.add(panel1, BorderLayout.CENTER);
    }

    public void colocarEtiquetas() {

        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(200, 30, 470, 40);
        etiqueta.setText("Reguistro de Personas");
        //etiqueta.setFont(new Font("forte", 1, 34));
        etiqueta.setFont(tipoFuente.fuente(tipoFuente.Sectar, 1, 34));
        etiqueta.setForeground(Color.BLACK);
        panel.add(etiqueta);

        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(90, 100, 300, 40);
        etiqueta1.setText("Cédula: ");
        etiqueta1.setFont(new Font("Cooper black", 1, 24));
        etiqueta1.setForeground(Color.BLACK);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(90, 190, 300, 40);
        etiqueta2.setText("Nombres: ");
        etiqueta2.setFont(new Font("Cooper black", 1, 24));
        etiqueta2.setForeground(Color.BLACK);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(90, 270, 300, 40);
        etiqueta3.setText("Apellidos: ");
        etiqueta3.setFont(new Font("Cooper black", 1, 24));
        etiqueta3.setForeground(Color.BLACK);
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(90, 350, 300, 40);
        etiqueta4.setText("Dirección: ");
        etiqueta4.setFont(new Font("Cooper black", 1, 24));
        etiqueta4.setForeground(Color.BLACK);
        panel.add(etiqueta4);

        JLabel etiqueta5 = new JLabel();
        etiqueta5.setBounds(90, 430, 300, 40);
        etiqueta5.setText("Correo: ");
        etiqueta5.setFont(new Font("Cooper black", 1, 24));
        etiqueta5.setForeground(Color.BLACK);
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel();
        etiqueta6.setBounds(90, 510, 300, 40);
        etiqueta6.setText("Teléfono: ");
        etiqueta6.setFont(new Font("Cooper black", 1, 24));
        etiqueta6.setForeground(Color.BLACK);
        panel.add(etiqueta6);
    }

    public void colocarTexto() {
        textCedula = new JTextField();
        textCedula.setBounds(260, 100, 400, 40);
        textCedula.setFont(new Font("constantia", 0, 28));
        textCedula.setBackground(Color.WHITE);
        textCedula.setForeground(Color.blue);
        panel.add(textCedula);

        textNombre = new JTextField();
        textNombre.setBounds(260, 190, 400, 40);
        textNombre.setFont(new Font("constantia", 2, 28));
        textNombre.setBackground(Color.WHITE);
        textNombre.setForeground(Color.blue);
        panel.add(textNombre);

        textApellido = new JTextField();
        textApellido.setBounds(260, 270, 400, 40);
        textApellido.setFont(new Font("constantia", 2, 26));
        textApellido.setBackground(Color.WHITE);
        textApellido.setForeground(Color.blue);
        panel.add(textApellido);

        textDireccion = new JTextField();
        textDireccion.setBounds(260, 350, 400, 40);
        textDireccion.setFont(new Font("constantia", 2, 26));
        textDireccion.setBackground(Color.WHITE);
        textDireccion.setForeground(Color.blue);
        panel.add(textDireccion);

        textCorreo = new JTextField();
        textCorreo.setBounds(260, 430, 400, 40);
        textCorreo.setFont(new Font("constantia", 2, 26));
        textCorreo.setBackground(Color.WHITE);
        textCorreo.setForeground(Color.blue);
        panel.add(textCorreo);

        textTelefono = new JTextField();
        textTelefono.setBounds(260, 510, 400, 40);
        textTelefono.setFont(new Font("constantia", 0, 26));
        textTelefono.setBackground(Color.WHITE);
        textTelefono.setForeground(Color.blue);
        panel.add(textTelefono);

    }

    public void colocarLayouts() {
        //panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); //Podemos poner los datos en el centreo, izquierda, etc.
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
    }

    public void colocarBotones() {
        botonGuardar = new JButton();
        botonGuardar.setText("AGREGAR");
        botonGuardar.setBounds(10, 600, 190, 45);
        botonGuardar.setBackground(Color.ORANGE);
        botonGuardar.setForeground(Color.BLACK);
        botonGuardar.setFont(tipoFuente.fuente(tipoFuente.FightThis, 2, 40));
        panel.add(botonGuardar);

        botonEditar = new JButton();
        botonEditar.setText("EDITAR");
        botonEditar.setBounds(210, 600, 190, 45);
        botonEditar.setBackground(Color.ORANGE);
        botonEditar.setForeground(Color.BLACK);
        botonEditar.setFont(tipoFuente.fuente(tipoFuente.FightThis, 2, 40));
        panel.add(botonEditar);

        botonEliminar = new JButton();
        botonEliminar.setText("ELIMINAR");
        botonEliminar.setBounds(410, 600, 190, 45);
        botonEliminar.setBackground(Color.ORANGE);
        botonEliminar.setForeground(Color.BLACK);
        botonEliminar.setFont(tipoFuente.fuente(tipoFuente.FightThis, 2, 40));
        panel.add(botonEliminar);

        botonTraer = new JButton();
        botonTraer.setText("TRAER");
        botonTraer.setBounds(610, 600, 190, 45);
        botonTraer.setBackground(Color.ORANGE);
        botonTraer.setForeground(Color.BLACK);
        botonTraer.setFont(tipoFuente.fuente(tipoFuente.FightThis, 2, 40));
        panel.add(botonTraer);
    }

    public void eventoBoton() {

        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (textCedula.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "En campo de cédula está vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textCedula.requestFocus();
                    return;
                }

                if (!utilidades.validadorDeCedula(textCedula.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "la cédula ingresada no es valida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (textNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textNombre.requestFocus();
                    return;
                }
                if (textApellido.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textApellido.requestFocus();
                    return;
                }
                if (textDireccion.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "El campo dirección no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textDireccion.requestFocus();
                    return;
                }
                if (textTelefono.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "El campo telefono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textTelefono.requestFocus();
                    return;
                }
                if (!utilidades.validarNumeros(textTelefono.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textTelefono.requestFocus();
                    return;
                }
                if (textCorreo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    textCorreo.requestFocus();
                    return;
                }

                if (!utilidades.validarCorreo(textCorreo.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Los datos del correo son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                    textCorreo.requestFocus();
                    return;
                }

                Cliente cliente = new Cliente(textCedula.getText(), textNombre.getText(), textApellido.getText(), textDireccion.getText(), textCorreo.getText(), textTelefono.getText());
                System.out.println(cliente.toString());
                limpiarCampos();
            }
        };

        botonGuardar.addActionListener(guardar);
        num(textCedula);
        num(textTelefono);
    }

    public void num(JTextField texto) {
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if (texto.getText().length() >= 10) {
                    ke.consume();
                }

                char c = ke.getKeyChar();
                if (!Character.isDigit(c)) {
                    ke.consume();
                }
            }
        });
    }

}
