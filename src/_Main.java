import java.awt.Color;
import java.lang.reflect.Array;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/*
 * _Main.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 * 
 * @author __USER__
 */
public class _Main extends javax.swing.JFrame {

	JsonArray data_jbxx;
	JsonArray data_stu;
	JsonArray data_exam;
	JsonArray data_train;
	_POST post;
	JsonObject json;
	String line;
	String[] array = new String[35];
	int count = 0;

	/** Creates new form _Main */
	public _Main() {
		initComponents();
		// 基本信息
		post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
				"AjaxMethod=jbxx", main._cookie, 0);
		post.run();
		_JSON json_jbxx = new _JSON(post._GetStatus().toString());
		data_jbxx = json_jbxx._GetJsonData();
		json = data_jbxx.get(0).getAsJsonObject();
		main._mPhone = json.get("fchrMobile").toString().split("\"")[1];
		jLabel7.setText(json.get("fchrStudentName").toString());
		jLabel8.setText(main._userid);
		jLabel9.setText(json.get("fdtmRegistrationDate").toString());
		jLabel10.setText(json.get("fchrCarTypeName").toString());
		jLabel11.setText(json.get("fchrLessonTypeName").toString());
		jLabel12.setText(json.get("fchrExaminationName").toString());
		jLabel15.setText(json.get("fchrIDCardNOTrans").toString());
		jLabel16.setText(json.get("fchrMobile").toString());

		// 学时进度
		post = new _POST("http://111.204.39.58:8080/DfssAjax.aspx",
				"AjaxMethod=xxjdxsxx", main._cookie, 0);
		post.run();
		_JSON json_exam = new _JSON(post._GetStatus().toString());
		data_exam = json_exam._GetJsonData();
		json = data_exam.get(0).getAsJsonObject();
		jLabel22.setText(json.get("fintAppointmentLesson").toString() + "/"
				+ json.get("fintSumLesson").toString());
		json = data_exam.get(1).getAsJsonObject();
		jLabel23.setText(json.get("fintAppointmentLesson").toString() + "/"
				+ json.get("fintSumLesson").toString());
		json = data_exam.get(2).getAsJsonObject();
		jLabel24.setText(json.get("fintAppointmentLesson").toString() + "/"
				+ json.get("fintSumLesson").toString());
		json = data_exam.get(3).getAsJsonObject();
		jLabel25.setText(json.get("fintAppointmentLesson").toString() + "/"
				+ json.get("fintSumLesson").toString());
		json = data_exam.get(4).getAsJsonObject();
		jLabel26.setText(json.get("fintAppointmentLesson").toString() + "/"
				+ json.get("fintSumLesson").toString());
		json = data_exam.get(5).getAsJsonObject();
		jLabel27.setText(json.get("fintAppointmentLesson").toString() + "/"
				+ json.get("fintSumLesson").toString());
		//
		post = new _POST("http://111.204.39.58:8080/Ajax/StuHdl.ashx",
				"loginType=2&method=stu&stuid=" + main._userid
						+ "&sfznum=&carid=", main._cookie, 0);
		post.run();
		System.out.println(post._GetStatus());
		String[] dataarr = post._GetStatus().split("\\|\\|\\|\\|");
		_JSON json_stu = new _JSON(dataarr[0]);
		data_train = json_stu._GetJsonData();
		main._bmnum = data_train.get(0).getAsJsonObject()
				.get("fchrRegistrationID").toString().split("\"")[1];
		main._trainpriceid = data_train.get(0).getAsJsonObject()
				.get("fchrTrainPriceID").toString().split("\"")[1];
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		jCheckBox2 = new javax.swing.JCheckBox();
		jCheckBox3 = new javax.swing.JCheckBox();
		jCheckBox4 = new javax.swing.JCheckBox();
		jCheckBox5 = new javax.swing.JCheckBox();
		jCheckBox6 = new javax.swing.JCheckBox();
		jCheckBox7 = new javax.swing.JCheckBox();
		jCheckBox8 = new javax.swing.JCheckBox();
		jCheckBox9 = new javax.swing.JCheckBox();
		jCheckBox10 = new javax.swing.JCheckBox();
		jCheckBox11 = new javax.swing.JCheckBox();
		jCheckBox12 = new javax.swing.JCheckBox();
		jCheckBox13 = new javax.swing.JCheckBox();
		jCheckBox14 = new javax.swing.JCheckBox();
		jCheckBox15 = new javax.swing.JCheckBox();
		jCheckBox16 = new javax.swing.JCheckBox();
		jCheckBox17 = new javax.swing.JCheckBox();
		jCheckBox18 = new javax.swing.JCheckBox();
		jCheckBox19 = new javax.swing.JCheckBox();
		jCheckBox20 = new javax.swing.JCheckBox();
		jCheckBox21 = new javax.swing.JCheckBox();
		jCheckBox22 = new javax.swing.JCheckBox();
		jCheckBox23 = new javax.swing.JCheckBox();
		jCheckBox24 = new javax.swing.JCheckBox();
		jCheckBox25 = new javax.swing.JCheckBox();
		jCheckBox26 = new javax.swing.JCheckBox();
		jCheckBox27 = new javax.swing.JCheckBox();
		jCheckBox28 = new javax.swing.JCheckBox();
		jCheckBox29 = new javax.swing.JCheckBox();
		jCheckBox30 = new javax.swing.JCheckBox();
		jCheckBox31 = new javax.swing.JCheckBox();
		jCheckBox32 = new javax.swing.JCheckBox();
		jCheckBox33 = new javax.swing.JCheckBox();
		jCheckBox34 = new javax.swing.JCheckBox();
		jCheckBox35 = new javax.swing.JCheckBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		jTextField1 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("gisman");
		setResizable(false);

		jPanel2.setName("\u6563\u6bb5\u7ea6\u8f66");

		jLabel1.setText("\u59d3\u540d\uff1a");

		jLabel2.setText("\u5b66\u53f7\uff1a");

		jLabel3.setText("\u62a5\u540d\u65f6\u95f4\uff1a");

		jLabel4.setText("\u8bad\u7ec3\u8f66\u578b\uff1a");

		jLabel5.setText("\u8bad\u7ec3\u73ed\u578b\uff1a");

		jLabel6.setText("\u9a7e\u7167\u7c7b\u578b\uff1a");

		jLabel7.setText("Null");

		jLabel8.setText("Null");

		jLabel9.setText("Null");

		jLabel10.setText("Null");

		jLabel11.setText("Null");

		jLabel12.setText("Null");

		jLabel13.setText("\u8bc1\u4ef6\u53f7\u7801\uff1a");

		jLabel14.setText("\u624b\u673a\u53f7\u7801\uff1a");

		jLabel15.setText("Null");

		jLabel16.setText("Null");

		jLabel17.setText("\u6cd5\u57f9\u5b66\u65f6\uff1a");

		jLabel18.setText("\u6a21\u62df\u5b66\u65f6\uff1a");

		jLabel19.setText("\u6563\u6bb5\u5b66\u65f6\uff1a");

		jLabel20.setText("\u6869\u8bad\u5b66\u65f6\uff1a");

		jLabel21.setText("\u7efc\u5408\u8bad\u7ec3\uff1a");

		jLabel22.setText("Null");

		jLabel23.setText("Null");

		jLabel24.setText("Null");

		jLabel25.setText("Null");

		jLabel26.setText("Null");

		jLabel28.setText("\u8003\u524d\u8def\u8bad\uff1a");

		jLabel27.setText("Null");

		jLabel29.setText("\u5df2\u7ea6/\u603b\u5b66\u65f6");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel6,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel13,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel14,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel11,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel12,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel15,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel16,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addGap(7,
																				7,
																				7)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel17,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel18,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel19,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel20,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel21,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel28,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel29,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel22,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																65,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel23,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																65,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel25,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																65,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel24,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																65,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel26,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																65,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel27,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																65,
																																Short.MAX_VALUE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												36,
																												Short.MAX_VALUE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel8,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addGap(66,
																												66,
																												66))))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(12,
																				12,
																				12)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel7,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				23,
																				Short.MAX_VALUE)
																		.addGap(163,
																				163,
																				163)))
										.addGap(254, 254, 254)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel29,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												17, Short.MAX_VALUE)
										.addGap(3, 3, 3)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel9,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel17)
														.addComponent(
																jLabel22,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel10,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel18)
														.addComponent(
																jLabel23,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel11,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel19)
														.addComponent(
																jLabel24,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel12,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel20)
														.addComponent(
																jLabel25,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel13,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel15,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel21)
														.addComponent(
																jLabel26,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel14,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel16,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel28)
														.addComponent(
																jLabel27,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																17,
																Short.MAX_VALUE))
										.addGap(153, 153, 153)));

		jTabbedPane1.addTab("\u57fa\u672c\u4fe1\u606f", jPanel2);

		jPanel1.setMaximumSize(new java.awt.Dimension(500, 400));
		jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

		jLabel30.setText("\u65e5\u671f");

		jLabel31.setText("7~9");

		jLabel32.setText("9~13");

		jLabel33.setText("13~17");

		jLabel34.setText("17~19");

		jLabel35.setText("19~21");

		jLabel36.setText("\u65e5\u671f\u4e00");

		jLabel37.setText("\u65e5\u671f\u4e8c");

		jLabel38.setText("\u65e5\u671f\u4e09");

		jLabel39.setText("\u65e5\u671f\u56db");

		jLabel40.setText("\u65e5\u671f\u4e94");

		jLabel41.setText("\u65e5\u671f\u516d");

		jLabel42.setText("\u65e5\u671f\u4e03");

		jCheckBox1.setText("Box");

		jCheckBox2.setText("Box");

		jCheckBox3.setText("Box");

		jCheckBox4.setText("Box");

		jCheckBox5.setText("Box");

		jCheckBox6.setText("Box");

		jCheckBox7.setText("Box");

		jCheckBox8.setText("Box");

		jCheckBox9.setText("Box");

		jCheckBox10.setText("Box");

		jCheckBox11.setText("Box");

		jCheckBox12.setText("Box");

		jCheckBox13.setText("Box");

		jCheckBox14.setText("Box");

		jCheckBox15.setText("Box");

		jCheckBox16.setText("Box");

		jCheckBox17.setText("Box");

		jCheckBox18.setText("Box");

		jCheckBox19.setText("Box");

		jCheckBox20.setText("Box");

		jCheckBox21.setText("Box");

		jCheckBox22.setText("Box");

		jCheckBox23.setText("Box");

		jCheckBox24.setText("Box");

		jCheckBox25.setText("Box");

		jCheckBox26.setText("Box");

		jCheckBox27.setText("Box");

		jCheckBox28.setText("Box");

		jCheckBox29.setText("Box");

		jCheckBox30.setText("Box");

		jCheckBox31.setText("Box");

		jCheckBox32.setText("Box");

		jCheckBox33.setText("Box");

		jCheckBox34.setText("Box");

		jCheckBox35.setText("Box");

		jButton1.setText("\u5237\u65b0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u7ea6\u8f66");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"散段", "模拟机", "综合训练" }));

		jButton3.setText("\u53d6\u6d88");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(1, 1, 1)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel30,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel36,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel37,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel38,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel39,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel40,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel41,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE)
														.addComponent(
																jLabel42,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																38,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel31,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox11,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox16,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox21,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox26,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox31,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel32,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				44,
																				Short.MAX_VALUE)
																		.addGap(4,
																				4,
																				4))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(1,
																				1,
																				1))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox7,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(1,
																				1,
																				1))
														.addComponent(
																jCheckBox12,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																48,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox17,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																48,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox22,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																48,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox27,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																48,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox32,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																48,
																Short.MAX_VALUE))
										.addGap(3, 3, 3)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel33,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				46,
																				Short.MAX_VALUE)
																		.addGap(1,
																				1,
																				1))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox8,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addComponent(
																jCheckBox13,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox18,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox23,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox28,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox33,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(6, 6, 6)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel34,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				44,
																				Short.MAX_VALUE)
																		.addGap(5,
																				5,
																				5))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(2,
																				2,
																				2))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox9,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(2,
																				2,
																				2))
														.addComponent(
																jCheckBox14,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox19,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox24,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox29,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox34,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																49,
																Short.MAX_VALUE))
										.addGap(2, 2, 2)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel35,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox10,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox15,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox20,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox25,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox30,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																56,
																Short.MAX_VALUE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox35,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(9,
																				9,
																				9)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																99,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				0,
																				66,
																				Short.MAX_VALUE)))
										.addContainerGap(21, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.CENTER)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel35)
														.addComponent(jLabel34)
														.addComponent(jLabel33)
														.addComponent(jLabel32)
														.addComponent(jLabel31)
														.addComponent(jLabel30))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(8,
																				8,
																				8)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(2,
																												2,
																												2)
																										.addComponent(
																												jCheckBox1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.addComponent(
																								jCheckBox2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								27,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								27,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								27,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								27,
																								Short.MAX_VALUE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(1,
																												1,
																												1)
																										.addComponent(
																												jLabel36,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												26,
																												Short.MAX_VALUE)))
																		.addGap(13,
																				13,
																				13)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addComponent(
																								jCheckBox6,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox7,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox9,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox10,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel37,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								25,
																								Short.MAX_VALUE))
																		.addGap(8,
																				8,
																				8)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addComponent(
																								jCheckBox15,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox14,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox13,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox12,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox11,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel38,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								25,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addComponent(
																								jLabel39,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								25,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox16,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox17,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox18,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox19,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox20,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addComponent(
																								jCheckBox24,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox23,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox22,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox21,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel40,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								25,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addComponent(
																								jCheckBox30,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox29,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox28,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox27,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox26,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel41,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								25,
																								Short.MAX_VALUE))
																		.addGap(8,
																				8,
																				8)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.CENTER)
																						.addComponent(
																								jLabel42,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								25,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox31,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox32,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox33,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox34,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jCheckBox35,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addGap(55,
																				55,
																				55))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				11,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton3)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				121,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(40,
																				40,
																				40))))
						.addGroup(
								javax.swing.GroupLayout.Alignment.CENTER,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(179, 179, 179)
										.addComponent(
												jCheckBox25,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												33, Short.MAX_VALUE)
										.addGap(118, 118, 118)));

		jTabbedPane1.addTab("\u81ea\u52a8\u7ea6\u8f66", jPanel1);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 436,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 305,
				Short.MAX_VALUE));

		jTabbedPane1.addTab("\u8f6f\u4ef6\u8bbe\u7f6e", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		_GetDate();
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
			post = new _POST("http://111.204.39.58:8080/Ajax/StuHdl.ashx",
					"loginType=2&method=yueche&stuid=" + main._userid
							+ "&lesstypeid=02&id=1&bmnum=" + main._bmnum
							+ "&trainpriceid=" + main._trainpriceid
							+ "&ycmethod=03&cartypeid=01&carid=&ReleaseCarID=&"
							+ array[i] + main._sessionid, main._cookie, 0);
			post.run();
			System.out.println("loginType=2&method=yueche&stuid="
					+ main._userid + "&lesstypeid=02&id=1&bmnum=" + main._bmnum
					+ "&trainpriceid=" + main._trainpriceid
					+ "&ycmethod=03&cartypeid=01&carid=&ReleaseCarID=&"
					+ array[i] + main._sessionid);
			System.out.println(post._GetStatus());
			if (post._GetStatus() == "success")
				jTextField1
						.setText(jTextField1.getText() + array[i] + "预约成功\n");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		_GetDate();
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
			post = new _POST("http://111.204.39.58:8080/Ajax/StuHdl.ashx",
					"loginType=2&method=yueche&stuid=" + main._userid
							+ "&lesstypeid=02&id=1&bmnum=" + main._bmnum
							+ "&trainpriceid=" + main._trainpriceid
							+ "&ycmethod=03&cartypeid=01&carid=&ReleaseCarID=&"
							+ array[i] + main._sessionid, main._cookie, 0);
			post.run();
			System.out.println("loginType=2&method=yueche&stuid="
					+ main._userid + "&lesstypeid=02&id=1&bmnum=" + main._bmnum
					+ "&trainpriceid=" + main._trainpriceid
					+ "&ycmethod=03&cartypeid=01&carid=&ReleaseCarID=&"
					+ array[i] + main._sessionid);
			System.out.println(post._GetStatus());
			if (post._GetStatus() == "success")
				jTextField1
						.setText(jTextField1.getText() + array[i] + "预约成功\n");
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// 约车信息
		if (jComboBox1.getSelectedItem().toString() == "散段") {
			post = new _POST("http://111.204.39.58:8080/Ajax/StuHdl.ashx",
					"loginType=2&method=Browser&stuid=" + main._userid
							+ "&lessonid=001&cartypeid=01&carid=",
					main._cookie, 0);
			main._sessionid = "&lessionid=001";
		} else if (jComboBox1.getSelectedItem().toString() == "模拟机") {
			post = new _POST("http://111.204.39.58:8080/Ajax/StuHdl.ashx",
					"loginType=2&method=Browser&stuid=" + main._userid
							+ "&lessonid=006&cartypeid=01&carid=",
					main._cookie, 0);
			main._sessionid = "&lessionid=006";
		} else if (jComboBox1.getSelectedItem().toString() == "综合训练") {
			post = new _POST("http://111.204.39.58:8080/Ajax/StuHdl.ashx",
					"loginType=2&method=Browser&stuid=" + main._userid
							+ "&lessonid=007&cartypeid=01&carid=",
					main._cookie, 0);
			main._sessionid = "&lessionid=007";
		}
		post.run();
		String[] dataarr = post._GetStatus().split("\\|\\|");
		_JSON json_stu = new _JSON(dataarr[2]);
		data_stu = json_stu._GetJsonData();
		// System.out.println(data_stu.get(0).toString());
		_GetSelectData();
	}

	private void _GetSelectData() {
		json = data_stu.get(0).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox1.setForeground(Color.BLACK);
			jCheckBox1.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox1.setForeground(Color.RED);
			jCheckBox1.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox2.setForeground(Color.BLACK);
			jCheckBox2.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox2.setForeground(Color.RED);
			jCheckBox2.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox3.setForeground(Color.BLACK);
			jCheckBox3.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox3.setForeground(Color.RED);
			jCheckBox3.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox4.setForeground(Color.BLACK);
			jCheckBox4.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox4.setForeground(Color.RED);
			jCheckBox4.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox5.setForeground(Color.BLACK);
			jCheckBox5.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox5.setForeground(Color.RED);
			jCheckBox5.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel36.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
		// System.out.println(json.get("fchrdate").toString().split("-", 2)[1]);
		json = data_stu.get(1).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox6.setForeground(Color.BLACK);
			jCheckBox6.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox6.setForeground(Color.RED);
			jCheckBox6.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox7.setForeground(Color.BLACK);
			jCheckBox7.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox7.setForeground(Color.RED);
			jCheckBox7.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox8.setForeground(Color.BLACK);
			jCheckBox8.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox8.setForeground(Color.RED);
			jCheckBox8.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox9.setForeground(Color.BLACK);
			jCheckBox9.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox9.setForeground(Color.RED);
			jCheckBox9.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox10.setForeground(Color.BLACK);
			jCheckBox10.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox10.setForeground(Color.RED);
			jCheckBox10.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel37.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
		json = data_stu.get(2).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox11.setForeground(Color.BLACK);
			jCheckBox11.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox11.setForeground(Color.RED);
			jCheckBox11.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox12.setForeground(Color.BLACK);
			jCheckBox12.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox12.setForeground(Color.RED);
			jCheckBox12.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox13.setForeground(Color.BLACK);
			jCheckBox13.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox13.setForeground(Color.RED);
			jCheckBox13.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox14.setForeground(Color.BLACK);
			jCheckBox14.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox14.setForeground(Color.RED);
			jCheckBox14.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox15.setForeground(Color.BLACK);
			jCheckBox15.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox15.setForeground(Color.RED);
			jCheckBox15.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel38.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
		json = data_stu.get(3).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox16.setForeground(Color.BLACK);
			jCheckBox16.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox16.setForeground(Color.RED);
			jCheckBox16.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox17.setForeground(Color.BLACK);
			jCheckBox17.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox17.setForeground(Color.RED);
			jCheckBox17.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox18.setForeground(Color.BLACK);
			jCheckBox18.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox18.setForeground(Color.RED);
			jCheckBox18.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox19.setForeground(Color.BLACK);
			jCheckBox19.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox19.setForeground(Color.RED);
			jCheckBox19.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox20.setForeground(Color.BLACK);
			jCheckBox20.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox20.setForeground(Color.RED);
			jCheckBox20.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel39.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
		json = data_stu.get(4).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox21.setForeground(Color.BLACK);
			jCheckBox21.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox21.setForeground(Color.RED);
			jCheckBox21.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox22.setForeground(Color.BLACK);
			jCheckBox22.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox22.setForeground(Color.RED);
			jCheckBox22.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox23.setForeground(Color.BLACK);
			jCheckBox23.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox23.setForeground(Color.RED);
			jCheckBox23.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox24.setForeground(Color.BLACK);
			jCheckBox24.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox24.setForeground(Color.RED);
			jCheckBox24.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox25.setForeground(Color.BLACK);
			jCheckBox25.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox25.setForeground(Color.RED);
			jCheckBox25.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel40.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
		json = data_stu.get(5).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox26.setForeground(Color.BLACK);
			jCheckBox26.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox26.setForeground(Color.RED);
			jCheckBox26.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox27.setForeground(Color.BLACK);
			jCheckBox27.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox27.setForeground(Color.RED);
			jCheckBox27.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox28.setForeground(Color.BLACK);
			jCheckBox28.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox28.setForeground(Color.RED);
			jCheckBox28.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox29.setForeground(Color.BLACK);
			jCheckBox29.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox29.setForeground(Color.RED);
			jCheckBox29.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox30.setForeground(Color.BLACK);
			jCheckBox30.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox30.setForeground(Color.RED);
			jCheckBox30.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel41.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
		json = data_stu.get(6).getAsJsonObject();
		if (json.get("1").toString().indexOf("/") != -1) {
			jCheckBox31.setForeground(Color.BLACK);
			jCheckBox31.setText(json.get("1").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox31.setForeground(Color.RED);
			jCheckBox31.setText(json.get("1").toString().split("\"")[1]);
		}
		if (json.get("2").toString().indexOf("/") != -1) {
			jCheckBox32.setForeground(Color.BLACK);
			jCheckBox32.setText(json.get("2").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox32.setForeground(Color.RED);
			jCheckBox32.setText(json.get("2").toString().split("\"")[1]);
		}
		if (json.get("3").toString().indexOf("/") != -1) {
			jCheckBox33.setForeground(Color.BLACK);
			jCheckBox33.setText(json.get("3").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox33.setForeground(Color.RED);
			jCheckBox33.setText(json.get("3").toString().split("\"")[1]);
		}
		if (json.get("4").toString().indexOf("/") != -1) {
			jCheckBox34.setForeground(Color.BLACK);
			jCheckBox34.setText(json.get("4").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox34.setForeground(Color.RED);
			jCheckBox34.setText(json.get("4").toString().split("\"")[1]);
		}
		if (json.get("5").toString().indexOf("/") != -1) {
			jCheckBox35.setForeground(Color.BLACK);
			jCheckBox35.setText(json.get("5").toString().split("/")[1]
					.split("\"")[0]);
		} else {
			jCheckBox35.setForeground(Color.RED);
			jCheckBox35.setText(json.get("5").toString().split("\"")[1]);
		}
		jLabel42.setText(json.get("fchrdate").toString().split("\\(", 2)[0]
				.split("\"")[1]);
	}

	private void _GetDate() {
		int num = 0;
		if (jCheckBox1.isSelected()) {
			array[num] = "date=" + jLabel36.getText().toString()
					+ "&start=7&end=9&trainsessionid=01";
			num++;
		}
		if (jCheckBox2.isSelected()) {
			array[num] = "date=" + jLabel36.getText().toString()
					+ "&start=9&end=13&trainsessionid=02";
			num++;
		}
		if (jCheckBox3.isSelected()) {
			array[num] = "date=" + jLabel36.getText().toString()
					+ "&start=13&end=17&trainsessionid=03";
			num++;
		}
		if (jCheckBox4.isSelected()) {
			array[num] = "date=" + jLabel36.getText().toString()
					+ "&start=17&end=19&trainsessionid=04";
			num++;
		}
		if (jCheckBox5.isSelected()) {
			array[num] = "date=" + jLabel36.getText().toString()
					+ "&start=19&end=21&trainsessionid=05";
			num++;
		}
		// 2
		if (jCheckBox6.isSelected()) {
			array[num] = "date=" + jLabel37.getText().toString()
					+ "&start=7&end=9&trainsessionid=01";
			num++;
		}
		if (jCheckBox7.isSelected()) {
			array[num] = "date=" + jLabel37.getText().toString()
					+ "&start=9&end=13&trainsessionid=02";
			num++;
		}
		if (jCheckBox8.isSelected()) {
			array[num] = "date=" + jLabel37.getText().toString()
					+ "&start=13&end=17&trainsessionid=03";
			num++;
		}
		if (jCheckBox9.isSelected()) {
			array[num] = "date=" + jLabel37.getText().toString()
					+ "&start=17&end=19&trainsessionid=04";
			num++;
		}
		if (jCheckBox10.isSelected()) {
			array[num] = "date=" + jLabel37.getText().toString()
					+ "&start=19&end=21&trainsessionid=05";
			num++;
		}
		// 3
		if (jCheckBox11.isSelected()) {
			array[num] = "date=" + jLabel38.getText().toString()
					+ "&start=7&end=9&trainsessionid=01";
			num++;
		}
		if (jCheckBox12.isSelected()) {
			array[num] = "date=" + jLabel38.getText().toString()
					+ "&start=9&end=13&trainsessionid=02";
			num++;
		}
		if (jCheckBox13.isSelected()) {
			array[num] = "date=" + jLabel38.getText().toString()
					+ "&start=13&end=17&trainsessionid=03";
			num++;
		}
		if (jCheckBox14.isSelected()) {
			array[num] = "date=" + jLabel38.getText().toString()
					+ "&start=17&end=19&trainsessionid=04";
			num++;
		}
		if (jCheckBox15.isSelected()) {
			array[num] = "date=" + jLabel38.getText().toString()
					+ "&start=19&end=21&trainsessionid=05";
			num++;
		}
		// 4
		if (jCheckBox16.isSelected()) {
			array[num] = "date=" + jLabel39.getText().toString()
					+ "&start=7&end=9&trainsessionid=01";
			num++;
		}
		if (jCheckBox17.isSelected()) {
			array[num] = "date=" + jLabel39.getText().toString()
					+ "&start=9&end=13&trainsessionid=02";
			num++;
		}
		if (jCheckBox18.isSelected()) {
			array[num] = "date=" + jLabel39.getText().toString()
					+ "&start=13&end=17&trainsessionid=03";
			num++;
		}
		if (jCheckBox19.isSelected()) {
			array[num] = "date=" + jLabel39.getText().toString()
					+ "&start=17&end=19&trainsessionid=04";
			num++;
		}
		if (jCheckBox20.isSelected()) {
			array[num] = "date=" + jLabel39.getText().toString()
					+ "&start=19&end=21&trainsessionid=05";
			num++;
		}
		// 5
		if (jCheckBox21.isSelected()) {
			array[num] = "date=" + jLabel40.getText().toString()
					+ "&start=7&end=9&trainsessionid=01";
			num++;
		}
		if (jCheckBox22.isSelected()) {
			array[num] = "date=" + jLabel40.getText().toString()
					+ "&start=9&end=13&trainsessionid=02";
			num++;
		}
		if (jCheckBox23.isSelected()) {
			array[num] = "date=" + jLabel40.getText().toString()
					+ "&start=13&end=17&trainsessionid=03";
			num++;
		}
		if (jCheckBox24.isSelected()) {
			array[num] = "date=" + jLabel40.getText().toString()
					+ "&start=17&end=19&trainsessionid=04";
			num++;
		}
		if (jCheckBox25.isSelected()) {
			array[num] = "date=" + jLabel40.getText().toString()
					+ "&start=19&end=21&trainsessionid=05";
			num++;
		}
		// 5
		if (jCheckBox26.isSelected()) {
			array[num] = "date=" + jLabel41.getText().toString()
					+ "&start=7&end=9&trainsessionid=01";
			num++;
		}
		if (jCheckBox27.isSelected()) {
			array[num] = "date=" + jLabel41.getText().toString()
					+ "&start=9&end=13&trainsessionid=02";
			num++;
		}
		if (jCheckBox28.isSelected()) {
			array[num] = "date=" + jLabel41.getText().toString()
					+ "&start=13&end=17&trainsessionid=03";
			num++;
		}
		if (jCheckBox29.isSelected()) {
			array[num] = "date=" + jLabel41.getText().toString()
					+ "&start=17&end=19&trainsessionid=04";
			num++;
		}
		if (jCheckBox30.isSelected()) {
			array[num] = "date=" + jLabel41.getText().toString()
					+ "&start=19&end=21&trainsessionid=05";
			num++;
		}
		// 6
		if (jCheckBox31.isSelected()) {
			array[num] = "date=" + jLabel42.getText().toString()
					+ "&start=7&end=9";
			num++;
		}
		if (jCheckBox32.isSelected()) {
			array[num] = "date=" + jLabel42.getText().toString()
					+ "&start=9&end=13";
			num++;
		}
		if (jCheckBox33.isSelected()) {
			array[num] = "date=" + jLabel42.getText().toString()
					+ "&start=13&end=17";
			num++;
		}
		if (jCheckBox34.isSelected()) {
			array[num] = "date=" + jLabel42.getText().toString()
					+ "&start=17&end=19";
			num++;
		}
		if (jCheckBox35.isSelected()) {
			array[num] = "date=" + jLabel42.getText().toString()
					+ "&start=19&end=21";
			num++;
		}
		count = num;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new _Main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox10;
	private javax.swing.JCheckBox jCheckBox11;
	private javax.swing.JCheckBox jCheckBox12;
	private javax.swing.JCheckBox jCheckBox13;
	private javax.swing.JCheckBox jCheckBox14;
	private javax.swing.JCheckBox jCheckBox15;
	private javax.swing.JCheckBox jCheckBox16;
	private javax.swing.JCheckBox jCheckBox17;
	private javax.swing.JCheckBox jCheckBox18;
	private javax.swing.JCheckBox jCheckBox19;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox20;
	private javax.swing.JCheckBox jCheckBox21;
	private javax.swing.JCheckBox jCheckBox22;
	private javax.swing.JCheckBox jCheckBox23;
	private javax.swing.JCheckBox jCheckBox24;
	private javax.swing.JCheckBox jCheckBox25;
	private javax.swing.JCheckBox jCheckBox26;
	private javax.swing.JCheckBox jCheckBox27;
	private javax.swing.JCheckBox jCheckBox28;
	private javax.swing.JCheckBox jCheckBox29;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JCheckBox jCheckBox30;
	private javax.swing.JCheckBox jCheckBox31;
	private javax.swing.JCheckBox jCheckBox32;
	private javax.swing.JCheckBox jCheckBox33;
	private javax.swing.JCheckBox jCheckBox34;
	private javax.swing.JCheckBox jCheckBox35;
	private javax.swing.JCheckBox jCheckBox4;
	private javax.swing.JCheckBox jCheckBox5;
	private javax.swing.JCheckBox jCheckBox6;
	private javax.swing.JCheckBox jCheckBox7;
	private javax.swing.JCheckBox jCheckBox8;
	private javax.swing.JCheckBox jCheckBox9;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables
}