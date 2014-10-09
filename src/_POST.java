import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class _POST extends Thread {
	String _url;
	String _param;
	public String _cookie, _status;
	int _i;

	public _POST(String url, String param, String cookie, int i) {
		_url = url;
		_param = param;
		if (i == 0) {
			_cookie = cookie;
		}
		_i = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			URL url = new URL(_url);
			HttpURLConnection.setFollowRedirects(true);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.addRequestProperty("encoding", "utf-8");
			// connection.addRequestProperty("Referer",
			// "http://111.204.39.58:8080/login-pc.aspx");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");

			if (_i == 0) {
				connection.setRequestProperty("cookie", _cookie);
			}

			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			bw.write(_param);
			bw.flush();

			if (_i != 0) {
				_cookie = connection.getHeaderField("set-cookie");
			}

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
			bw.close();
			osw.close();
			os.close();
			_status = builder.toString();
			// System.out.println(builder.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void run2() {
		try {
			URL url = new URL(_url);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(_param);
			bw.flush();
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			StringBuilder builder = new StringBuilder();
			builder.append(br.readLine());
			br.close();
			isr.close();
			is.close();
			bw.close();
			osw.close();
			os.close();
			_status = builder.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String _GetCookie() {
		return _cookie;
	}

	public String _GetStatus() {
		return _status;
	}

}
