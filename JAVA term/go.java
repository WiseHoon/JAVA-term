import java.util.*;
import java.text.*;

public class go{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����� �̸���?");
		String name=s.next();
		System.out.print("����� ���̴�?");
		int age=s.nextInt();
		
		System.out.println("\n��ǥ ����� 100���� �Դϴ�.\n");
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("������ yyyy�� MM�� dd�� �Դϴ�.");
		String currtime = dateFormat.format(calendar.getTime());
		System.out.println(currtime);
		
		System.out.println("50������ ���� ������ ������ ���غ���.");
		int days=1;
		
		while(I.getMyMoney()<500000){
		System.out.println("\n-"+days+"����-\n");
		
		System.out.println("���� �մ��� ����..\n");
		I.action();
		while(store.getCntTime()<=3){
		double randomNbr=Math.random()*5;
		if (randomNbr>=2)	I.sale(customer.randomCus());
		else I.action();
		store.setCntTime(1);
		}
		System.out.println("������� �Խ��ϴ�.");
		owner.checkDirty(store.getDirty());
		owner.checkSaleMoney();
		owner.moneyfight();
		days++;
		store.getMoney();
		store.reset();
		I.spendMoney();
		}
		System.out.println("Ŭ����");
	}
}


class I{
	static int myMoney=30000,tired=5,pay=25000;
	static Scanner s = new Scanner(System.in);
	
	public static void action(){
		
		System.out.println("�մ��� ����.");
		
		while(true){
			System.out.println("�ൿ�� �����ϼ���.");
			System.out.println("1.�����ϱ� 2.�����ϱ� 3.û���ϱ� 4.������ �ֱ�");
			int n = s.nextInt();
			if(n==1){
				organize();
				break;
			}
			else if(n==2){
				display();
				break;
			}
			else if(n==3){
				clean();
				break;
			}
			else if(n==4){
				rest();
				break;
			}
			else{
				System.out.println("1���� 4������ ������ �Է����ּ���.");
				continue;
			}
		}
		store.report1();
		
	}
	
	public static void organize(){//�����ϱ�
		System.out.println("�����ϱ⸦ �����߽��ϴ�.");
		time.sleep(1000);
		System.out.println("...�������Դϴ�...");
		time.sleep(1000);
		System.out.println("�����Ϸ�");
		store.setDirty(-1);//������ -1
		setTired(1);//�Ƿε� +1
	}
	
	public static void display(){//�����ϱ�
		System.out.println("�����ϱ⸦ �����߽��ϴ�.");
		time.sleep(1000);
		System.out.println("��ǰ�� �����մϴ�");
		time.sleep(1000);
		System.out.println("�����Ϸ�");
		setTired(1);
	}
	
	public static void clean(){
		System.out.println("û���ϱ⸦ �����߽��ϴ�.");
		time.sleep(1000);
		System.out.println("...û�����Դϴ�...");
		time.sleep(1000);
		System.out.println("û�ҿϷ�");
		store.setDirty(-1);//������ -1
		setTired(1);//�Ƿε� +1
	}
	
	public static void rest(){//������ �ֱ�
		System.out.println("������ �޽��� ���մϴ�");
		time.sleep(2000);
		System.out.println("�Ƿΰ� ���� ȸ���Ǿ����ϴ�.");
		setTired(-1);
	}
	
	public static void sale(int n){//�մԺ����̵�
		if(n==0)return;
		System.out.println("�մ��� ����û");
		minigame.game_WASD(n);//ȣ��
		if (minigame.getSell()) {
			store.setSaleMoney(5000);
			System.out.println("������ �������� : "+store.getSaleMoney());
		}
		else System.out.println("���� ��ȸ��..");
		
	}
	//��꼳��
	public static void setMyMoney(int n){
		myMoney += n;
	}
	public static int getMyMoney(){
		return myMoney;
	}
	//�Ƿε�����
	public static void setTired(int n){
		tired += n;
	}
	public static int getTired(){
		return tired;
	}
	//�ϴ缳��
	public static void setPay(int n){
		pay += n;
	}
	public static int getPay(){
		return pay;
	}
	public static void spendMoney(){
		System.out.println("�Ϸ� �ϰ��� ��ġ��");
		
		while(true){
			System.out.println("1.���� ��Ա� 2.ģ���� ī�䰡�� 3.ģ���� �� ���÷�����");
			int n = s.nextInt();
			if(n==1){
				eat();
				break;
			}
			else if(n==2){
				goCafe();
				break;
			}
			else if(n==3){
				drink();
				break;
			}
			else{
				System.out.println("1���� 3������ ������ �Է����ּ���.");
				continue;
			}
		}
	}
	public static void eat(){
		String [] arr2 = {"������ũ��", "���ڸ�", "���ڸ�", "ġŲ��"};
		int y = (int)(Math.random()*4);
		System.out.printf("%s �Ծ����ϴ�.\n", arr2[y]);
		if(y==0){
			setMyMoney(-10000);
			setTired(-3);
		}
		else if(y==1){
			setMyMoney(-3000);
			setTired(-1);
		}
		else if(y==2){
			setMyMoney(-5000);
			setTired(-1);
		}
		else {
			setMyMoney(-7000);
			setTired(-2);
		}
	}
	
	public static void goCafe(){
		System.out.println("ī�信 ���� ģ���� ���ٶ������ϴ�.");
		setMyMoney(-3000);
		setTired(-1);
	}
	
	public static void drink(){
		String [] arr = {"�������� ���� ��â���", "ȥ��", "��޿�", "���� ������"};
		int x = (int)(Math.random()*4);
		System.out.printf("%s ���� ���̽��ϴ�.\n", arr[x]);
		if(x==0){
			setMyMoney(-7000);
			setTired(-2);
		}
		else if(x==1){
			setMyMoney(-3000);
			setTired(-1);
		}
		else if(x==2){
			setMyMoney(-5000);
			setTired(-1);
		}
		else {
			setMyMoney(-6000);
			setTired(-2);
		}
	}
	
	
}

class store{
	static int saleMoney=5000,dirty=5,products=0,cntTime;
	
	
	public static void chargeProducts(int n){//�԰� ��ǰ ��
		System.out.println("���� ��ǰ�� �� : "+getProducts()+"��");
		System.out.println("��ǰ�� "+n+"�� �԰�Ǿ����ϴ�.");
		setProducts(n);
		System.out.println("���� ��ǰ�� �� : "+getProducts()+"��");
	}
	
	public static void setProducts(int n){
		products+=n;
	}
	public static int getProducts(){
		return products;
	}
	
	public static void setDirty(int n){
		dirty+=n;
	}
	public static int getDirty(){
		return dirty;
	}
	
	public static void setSaleMoney(int n){
		saleMoney+=n;
	}
	public static int getSaleMoney(){
		return saleMoney;
	}
	
	public static void report1(){
		System.out.println("���� ���� �Ƿε� : "+I.getTired());
		System.out.println("�������� ���� : "+getDirty());
	}
	
	public static void report2(){
		System.out.println("���� ���� ���� : "+getSaleMoney());
		System.out.println("�������� ���� : "+getDirty());
	}
	public static void setCntTime(int n){
		cntTime+=n;
	}
	public static int getCntTime(){
		return cntTime;
	}
	public static void reset(){//�Ϸ������鼭 ���� �ʱ�ȭ���ֱ�.�ð�,��������,û��,
		setCntTime(-getCntTime());
		setSaleMoney(-getSaleMoney());
		setDirty(1);//������1����;
	}
	public static void getMoney(){
		System.out.println("�Ϸ簡 �������ϴ�~! �ϴ��� �޾ҽ��ϴ�.");
		I.setMyMoney(I.getPay());
	}
	
}

class minigame{
	static String result="",input="";
	static long start,end;
	static boolean sell;
	
	public static void game_WASD(int n){
		Scanner s=new Scanner(System.in);
		
		if(n==0)return;
		
		int [] array = new int[n];
		for(int i=0;i<n;i++){
			array[i]=(int)(Math.random()*4+1);
		}
		for(int x:array){
			if(x==1) result+="W";
			else if(x==2) result+="A";
			else if(x==3) result+="S";
			else if(x==4) result+="D";
		}
		System.out.println("���� ���ڸ� 5�� �̳��� �Է��ϼ���!(��ҹ��� �������) "+result);
		start=System.currentTimeMillis();
		input=s.next();
		end=System.currentTimeMillis();
		if (end-start>5000) {
			System.out.println("Ÿ�ӿ���! �ǸŽ���..(�ҿ�ð� : "+(end-start)+"ms)");
			sell=false;
		}
		else if (input.equalsIgnoreCase(result)==true) {
			System.out.println("�Ǹż���!");
			sell=true;
		}
		else {
			System.out.println("�߸��� �Է� ! �ǸŽ����Դϴ�..(����� �Է°� : "+input+")");
			sell=false;
		}
		result = "";
	}
	public static boolean getSell(){
		return sell;
	}
	//���ڸ��߱�
	public static void game_SF(){
		Scanner s = new Scanner(System.in);
		int r;
		int a;
		int result=0;
		String c;
		String [] b= {"1","2","3"};
		String tmp;
		boolean ans;
		System.out.print("���� ���߱� ����");
		while(true){
		System.out.print("1,2,3 ������ ��� �迭�Ͻÿ�,ex)123,231 : ");
		a=s.nextInt();
		if(a==123||a==132||a==213||a==231||a==312||a==321){
			
			break;
		}
		else{
			System.out.println("�߸��Է�����.. �ٽ��Է��Ͻÿ�");
			continue;
		}
			
		}
		for(int i=0;i<b.length;i++){
			r=(int)(Math.random()*b.length);
			tmp = b[i];
			b[i]=b[r];
			b[r]=tmp;
		}
		
		c=b[0]+b[1]+b[2];
		int a1=Integer.parseInt(c);
		System.out.print("������ ���ڴ� : ");
		time.sleep(500);
		System.out.println(a1);
		time.sleep(500);
			if(a==a1){
				System.out.println("�̰���");
				result = 1;
			}
			
			else{
				System.out.println("����");
				result=2;
				}
			switch(result){//�̱������ �� �������Ұ� �����ϱ�
			case 1:
			I.setPay(5000);
			break;
			case 2:
			I.setPay(-5000);
			break;
				
			}
		System.out.println("����� �ϴ��� : "+I.getPay()+"�� �Դϴ�.");
	}

	

	public static void game_RPS(){
		Scanner s = new Scanner(System.in);
		String input;
		int com;
		int result=0;//0���,1��,2�̱�
		boolean again=false;
		
		do{
		System.out.print("����,����,�� �߿��� �� ����? ");
		input=s.next();
		
		com=(int)(Math.random()*3);//0=����,1=����,2=��
		System.out.println("����");
		time.sleep(500);
		System.out.println("����");
		time.sleep(500);
		System.out.println("��");
		switch(input){
			case "����":
			if (com==0) {
				System.out.println("�����");
				result=0;
			}
			else if(com==1) {
				System.out.println("����");
				result=1;
			}
			else if(com==2) {
				System.out.println("�̰���");
				result=2;
			}
			break;
			
			case "����":
			if (com==0) {
				System.out.println("�̰���");
				result=2;
			}
			else if(com==1) {
				System.out.println("�����");
				result=0;
			}
			else if(com==2) {
				System.out.println("����");
				result=1;
			}
			break;
			
			case "��":
			if (com==0) {
				System.out.println("����");
				result=1;
			}
			else if(com==1) {
				System.out.println("�̰���");
				result=2;
			}
			else if(com==2) {
				System.out.println("�����");
				result=0;
			}
			break;
			
			default :
			System.out.println("�߸��´�..�ٽ��Է��ϼ���");
			again=true;
			continue;
		}
		time.sleep(500);
		switch(result){//�̱������ �� �������Ұ� �����ϱ�
			case 1:
			I.setPay(-5000);
			System.out.println("�����ϴ�: "+I.getPay()+"��");
			break;
			case 2:
			I.setPay(5000);
			System.out.println("�����ϴ�: "+I.getPay()+"��");
			break;
		}
		
		if(result!=0) {
			System.out.println("�� �ҰŸ� \"�Ѵ�\"�� �Է��ϰ�, �ƴϸ� �ƹ��ų� �Է��ϼ���..");
			input=s.next();
			switch(input){
				case "�Ѵ�":
				again=true;
				break;
				
				default:
				again=false;
				break;
			}
		}
		else again=true;
		
		
		}while(again);
		System.out.println("����� �ϴ��� : "+I.getPay()+"�� �Դϴ�.");
		
	}
}

class owner{
	static int mood;
	public static void checkDirty(int n){
		if (n>8) {
			System.out.println("���� ���� �̰� ����, ���ް� ���ϴ°Ÿ� ������ؾ���. û������!");
			I.setPay(-5000);
		}
		else System.out.println("���� ���� ����� �� �ϰ��ֱ���, û�� �� �س��µ�?");
	}
	
	public static void checkSaleMoney(){
		System.out.println("������ �󸶳� �Ǵ��� Ȯ���غ���.. : "+store.getSaleMoney()+"�� �̸� ������ ��簡 �ǰ� �ֱ���!");
	}
	
	public static void moneyfight(){
		int a=(int)(Math.random()*2);
		System.out.println("�ϴ��� ������ �ȵ�°�����? ��� �� �غ���? (���� �ϴ� : "+I.getPay()+"��)");
		if(a==0)
		minigame.game_SF();
		else
		minigame.game_RPS();
	}
}

class customer{
	static int n;
	static int randomCus(){
		int a=(int)(Math.random()*5);
		if (a==0) customer0();
		else if (a==1) customer1();
		else if (a==2) customer2();
		else if (a==3) customer3();
		else customer4();
		return n;
	}
	
	static void customer0(){//�Ϲݼմ�
		System.out.println("�Ϲ� �մ��Դϴ�");
		n=5;
	}
	
	static void customer1(){
		System.out.println("�߻��� �밴�� ��Ÿ����!");
		time.sleep(1000);
		int r = (int)(Math.random()*3);//�밴 ��� 3����
		if (r==0){
			System.out.println("������ �׳� ������.");
			n=0;
		}
		else if(r==1){//�並 �Ѵ�->�̴� û�ҷ� ������ �ؾ���
			System.out.println("�밴�� �並 �Ѵ٤���!!!!!!!!!!!");
			time.sleep(1000);
			System.out.println("�׸��� ������...");
			n=0;
		}
		else {//������ ���
			System.out.println("�밴�� [�����ؼ���]�� �����մϴ�.");
			n=3;
		}		
	}
	
	static void customer2(){//������
		System.out.println("�ſ� �ǰ��� ���̴� �������Դϴ�.");
		time.sleep(500);
		System.out.println("�������� [Ŀ��]�� �����մϴ�.");
		n=2;
	}
	
	static void customer3(){//������ ���� ��� �մ�
		System.out.println("�մ��Դϴ�.");
		time.sleep(200);
		System.out.println("�մ��� ��ǰ�� ���� ���Դϴ�...");
		time.sleep(1500);
		System.out.println("���� ���� ��ǰ�� �ܶ� �ö���ֽ��ϴ�.");
		n=6;
	}
	
	static void customer4(){//���� �մ�
		System.out.println("�ɻ�ġ ���� ����� ǳ��� �մ��Դϴ�.");
		time.sleep(500);
		System.out.println("������ �緯 �°��� ¥���� ���� �°��� �մ��� ū�Ҹ��� �����Ÿ��ϴ�.");
		time.sleep(1000);
		int r = (int)(Math.random()*2);
		if(r==0){//���� �մ� ��� 2����
			//�� ��
			System.out.println("�ᱹ �մ��� �ƹ��͵� �� ��� �������ϴ�...");
			n=0;
		}
		else{//��� ���
			System.out.println("�մ��� ���뿡 ��ǰ�� �ø��鼭 �� ¥���� ���ϴ�.");
			n=7;
		}
	}
}
class time{
public static void sleep(int time){
	try{
		Thread.sleep(time);
	}catch(Exception e){
		e.printStackTrace();
		}
	}
}