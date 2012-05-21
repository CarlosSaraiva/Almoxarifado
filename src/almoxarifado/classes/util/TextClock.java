/* Autor Original: http://www.java.happycodings.com/Date_time/code3.html
 * Minha modifica��o foi fazer o rel�gio funcionar numa JLabel ao inv�s de um TexField.
 * Para isto herdei da classe JLabel e usei m�todos para atualiza��o de textos desta classe.
 * 
 */


package almoxarifado.classes.util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

public class TextClock extends JLabel {

	private static final long serialVersionUID = -4131720584240211956L;

	public TextClock() {

		setFont(new Font("sansserif", Font.PLAIN, 12));

		javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar now = Calendar.getInstance();
				int h = now.get(Calendar.HOUR_OF_DAY);
				int m = now.get(Calendar.MINUTE);
				int s = now.get(Calendar.SECOND);
				setText("" + h + ":" + m + ":" + s);
			}
		});
		t.start();
	}
}