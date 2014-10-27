import java.util.TimerTask;

import javax.swing.JOptionPane;

/**
 * 
 * @author GisMan
 */
public class Task extends TimerTask {

	@Override
	public void run() {
		_POST post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
				"AjaxMethod=LOGIN&Account=" + main._userid + "&Pwd="
						+ main._userpassword, "", 1);
		post.run();
		if (post._GetStatus().compareTo("true") == 0)
			main._cookie = post._GetCookie();
		else
			JOptionPane.showMessageDialog(null, post._GetStatus());
	}
}
