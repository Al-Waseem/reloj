package ventana;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

public class Film extends JFrame {
	private Timer temporizador;
	private JLabel lblTexto = null;
	private GregorianCalendar calendario = new GregorianCalendar();
	private SimpleDateFormat formateador = new SimpleDateFormat(
			"EEEEE dd/MMMMM/yyyy hh:mm:ss aa");
	private OyenteTiempo oyt;

	public Film() {
		oyt = new OyenteTiempo();
		temporizador = new Timer(1000, oyt);
		lblTexto = new JLabel();
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);// javax.swing
		lblTexto.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 30));
		getContentPane().add(lblTexto);
		temporizador.start();
	}

	private void actualizaReloj(ActionEvent e) {
		calendario.add(Calendar.SECOND, 1);
		String cadenaTiempo = formateador.format(calendario.getTime());
		lblTexto.setText(cadenaTiempo);
	}

	class OyenteTiempo implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			actualizaReloj(e);
		}
	}
}