import java.awt.*;
import javax.swing.*;
public class ComponentInWindow extends JFrame{
	JTextField text;
	JButton button;
	JCheckBox checkBox1,checkBox2,checkBox3;
	JRadioButton radio1,radio2;
	ButtonGroup group;
	JComboBox comBox;
	JTextArea area;
	public ComponentInWindow(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

void init(){
	setLayout(new FlowLayout());
	add(new JLabel("�ı���:"));	//��ǩ
	text = new JTextField(10);	//�ı���
	add(text);
	add(new JLabel("��ť:"));
	button = new JButton("ȷ��");	//��ť
	add(button);
	add(new JLabel("ѡ���:"));
	checkBox1 = new JCheckBox("ϲ������");	//ѡ���
	checkBox2 = new JCheckBox("ϲ������");
	checkBox3 = new JCheckBox("ϲ������");
	add(checkBox1);
	add(checkBox2);
	add(checkBox3);
	add(new JLabel("��ѡ��ť:"));
	group = new ButtonGroup();
	radio1 = new JRadioButton("��");	//��ѡ��ť
	radio2 = new JRadioButton("Ů");
	group.add(radio1);
	group.add(radio2);
	add(radio1);
	add(radio2);
	add(new JLabel("�����б�"));
	comBox = new JComboBox();	//�����б�
	comBox.addItem("�������");
	comBox.addItem("�������");
	comBox.addItem("������԰");
	add(comBox);
	add(new JLabel("�ı���:"));
	area = new JTextArea(6,12);	//�ı���
	add(new JScrollPane(area));
	}
}