import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class _GET extends Thread {
	String _cookie;

	public _GET(String cookie) {
		_cookie = cookie;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://111.204.39.58:8080/pc-client/jbxx.aspx");
			URLConnection connection = url.openConnection();
			connection.setRequestProperty("cookie", _cookie);
			// String cookie = connection.getHeaderField("set-cookie");

			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = br.readLine()) != null) {
				builder.append(line);
			}
			br.close();
			isr.close();
			is.close();

			System.out.println(builder.toString());
			// System.out.println(cookie.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}