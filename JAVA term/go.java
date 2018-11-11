import java.util.*;
import java.text.*;

public class go{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름은?");
		String name=s.next();
		System.out.print("당신의 나이는?");
		int age=s.nextInt();
		
		System.out.println("\n목표 재산은 100만원 입니다.\n");
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("오늘은 yyyy년 MM월 dd일 입니다.");
		String currtime = dateFormat.format(calendar.getTime());
		System.out.println(currtime);
		
		System.out.println("50만원을 모을 때까지 열심히 일해보자.");
		int days=1;
		
		while(I.getMyMoney()<500000){
		System.out.println("\n-"+days+"일차-\n");
		
		System.out.println("아직 손님이 없다..\n");
		I.action();
		while(store.getCntTime()<=3){
		double randomNbr=Math.random()*5;
		if (randomNbr>=2)	I.sale(customer.randomCus());
		else I.action();
		store.setCntTime(1);
		}
		System.out.println("점장님이 왔습니다.");
		owner.checkDirty(store.getDirty());
		owner.checkSaleMoney();
		owner.moneyfight();
		days++;
		store.getMoney();
		store.reset();
		I.spendMoney();
		}
		System.out.println("클리어");
	}
}


class I{
	static int myMoney=30000,tired=5,pay=25000;
	static Scanner s = new Scanner(System.in);
	
	public static void action(){
		
		System.out.println("손님이 없다.");
		
		while(true){
			System.out.println("행동을 선택하세요.");
			System.out.println("1.정리하기 2.진열하기 3.청소하기 4.가만히 있기");
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
				System.out.println("1부터 4까지의 정수를 입력해주세요.");
				continue;
			}
		}
		store.report1();
		
	}
	
	public static void organize(){//정리하기
		System.out.println("정리하기를 선택했습니다.");
		time.sleep(1000);
		System.out.println("...정리중입니다...");
		time.sleep(1000);
		System.out.println("정리완료");
		store.setDirty(-1);//더러움 -1
		setTired(1);//피로도 +1
	}
	
	public static void display(){//진열하기
		System.out.println("진열하기를 선택했습니다.");
		time.sleep(1000);
		System.out.println("상품을 진열합니다");
		time.sleep(1000);
		System.out.println("진열완료");
		setTired(1);
	}
	
	public static void clean(){
		System.out.println("청소하기를 선택했습니다.");
		time.sleep(1000);
		System.out.println("...청소중입니다...");
		time.sleep(1000);
		System.out.println("청소완료");
		store.setDirty(-1);//더러움 -1
		setTired(1);//피로도 +1
	}
	
	public static void rest(){//가만히 있기
		System.out.println("가만히 휴식을 취합니다");
		time.sleep(2000);
		System.out.println("피로가 조금 회복되었습니다.");
		setTired(-1);
	}
	
	public static void sale(int n){//손님별난이도
		if(n==0)return;
		System.out.println("손님의 계산요청");
		minigame.game_WASD(n);//호출
		if (minigame.getSell()) {
			store.setSaleMoney(5000);
			System.out.println("오늘의 누적매출 : "+store.getSaleMoney());
		}
		else System.out.println("다음 기회에..");
		
	}
	//재산설정
	public static void setMyMoney(int n){
		myMoney += n;
	}
	public static int getMyMoney(){
		return myMoney;
	}
	//피로도설정
	public static void setTired(int n){
		tired += n;
	}
	public static int getTired(){
		return tired;
	}
	//일당설정
	public static void setPay(int n){
		pay += n;
	}
	public static int getPay(){
		return pay;
	}
	public static void spendMoney(){
		System.out.println("하루 일과를 마치고");
		
		while(true){
			System.out.println("1.음식 사먹기 2.친구와 카페가기 3.친구와 술 마시러가기");
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
				System.out.println("1부터 3까지의 정수를 입력해주세요.");
				continue;
			}
		}
	}
	public static void eat(){
		String [] arr2 = {"스테이크를", "과자를", "피자를", "치킨을"};
		int y = (int)(Math.random()*4);
		System.out.printf("%s 먹었습니다.\n", arr2[y]);
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
		System.out.println("카페에 가서 친구와 수다떨었습니다.");
		setMyMoney(-3000);
		setTired(-1);
	}
	
	public static void drink(){
		String [] arr = {"오랜만에 만난 동창들과", "혼자", "룸메와", "대학 동기들과"};
		int x = (int)(Math.random()*4);
		System.out.printf("%s 술을 마셨습니다.\n", arr[x]);
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
	
	
	public static void chargeProducts(int n){//입고 상품 수
		System.out.println("현재 상품의 수 : "+getProducts()+"개");
		System.out.println("상품이 "+n+"개 입고되었습니다.");
		setProducts(n);
		System.out.println("현재 상품의 수 : "+getProducts()+"개");
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
		System.out.println("나의 현재 피로도 : "+I.getTired());
		System.out.println("더러움의 정도 : "+getDirty());
	}
	
	public static void report2(){
		System.out.println("오늘 누적 매출 : "+getSaleMoney());
		System.out.println("더러움의 정도 : "+getDirty());
	}
	public static void setCntTime(int n){
		cntTime+=n;
	}
	public static int getCntTime(){
		return cntTime;
	}
	public static void reset(){//하루지나면서 변수 초기화해주기.시간,누적매출,청결,
		setCntTime(-getCntTime());
		setSaleMoney(-getSaleMoney());
		setDirty(1);//더러움1증가;
	}
	public static void getMoney(){
		System.out.println("하루가 끝났습니다~! 일당을 받았습니다.");
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
		System.out.println("다음 문자를 5초 이내에 입력하세요!(대소문자 관계없음) "+result);
		start=System.currentTimeMillis();
		input=s.next();
		end=System.currentTimeMillis();
		if (end-start>5000) {
			System.out.println("타임오버! 판매실패..(소요시간 : "+(end-start)+"ms)");
			sell=false;
		}
		else if (input.equalsIgnoreCase(result)==true) {
			System.out.println("판매성공!");
			sell=true;
		}
		else {
			System.out.println("잘못된 입력 ! 판매실패입니다..(당신의 입력값 : "+input+")");
			sell=false;
		}
		result = "";
	}
	public static boolean getSell(){
		return sell;
	}
	//숫자맞추기
	public static void game_SF(){
		Scanner s = new Scanner(System.in);
		int r;
		int a;
		int result=0;
		String c;
		String [] b= {"1","2","3"};
		String tmp;
		boolean ans;
		System.out.print("숫자 맞추기 게임");
		while(true){
		System.out.print("1,2,3 순서를 섞어서 배열하시오,ex)123,231 : ");
		a=s.nextInt();
		if(a==123||a==132||a==213||a==231||a==312||a==321){
			
			break;
		}
		else{
			System.out.println("잘못입력했음.. 다시입력하시오");
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
		System.out.print("점장의 숫자는 : ");
		time.sleep(500);
		System.out.println(a1);
		time.sleep(500);
			if(a==a1){
				System.out.println("이겼음");
				result = 1;
			}
			
			else{
				System.out.println("졌음");
				result=2;
				}
			switch(result){//이기고지면 돈 증가감소값 설정하기
			case 1:
			I.setPay(5000);
			break;
			case 2:
			I.setPay(-5000);
			break;
				
			}
		System.out.println("당신의 일당은 : "+I.getPay()+"원 입니다.");
	}

	

	public static void game_RPS(){
		Scanner s = new Scanner(System.in);
		String input;
		int com;
		int result=0;//0비김,1짐,2이김
		boolean again=false;
		
		do{
		System.out.print("가위,바위,보 중에서 뭐 낼까? ");
		input=s.next();
		
		com=(int)(Math.random()*3);//0=가위,1=바위,2=보
		System.out.println("가위");
		time.sleep(500);
		System.out.println("바위");
		time.sleep(500);
		System.out.println("보");
		switch(input){
			case "가위":
			if (com==0) {
				System.out.println("비겼음");
				result=0;
			}
			else if(com==1) {
				System.out.println("졌음");
				result=1;
			}
			else if(com==2) {
				System.out.println("이겼음");
				result=2;
			}
			break;
			
			case "바위":
			if (com==0) {
				System.out.println("이겼음");
				result=2;
			}
			else if(com==1) {
				System.out.println("비겼음");
				result=0;
			}
			else if(com==2) {
				System.out.println("졌음");
				result=1;
			}
			break;
			
			case "보":
			if (com==0) {
				System.out.println("졌음");
				result=1;
			}
			else if(com==1) {
				System.out.println("이겼음");
				result=2;
			}
			else if(com==2) {
				System.out.println("비겼음");
				result=0;
			}
			break;
			
			default :
			System.out.println("잘못냈다..다시입력하세요");
			again=true;
			continue;
		}
		time.sleep(500);
		switch(result){//이기고지면 돈 증가감소값 설정하기
			case 1:
			I.setPay(-5000);
			System.out.println("현재일당: "+I.getPay()+"원");
			break;
			case 2:
			I.setPay(5000);
			System.out.println("현재일당: "+I.getPay()+"원");
			break;
		}
		
		if(result!=0) {
			System.out.println("또 할거면 \"한다\"를 입력하고, 아니면 아무거나 입력하세요..");
			input=s.next();
			switch(input){
				case "한다":
				again=true;
				break;
				
				default:
				again=false;
				break;
			}
		}
		else again=true;
		
		
		}while(again);
		System.out.println("당신의 일당은 : "+I.getPay()+"원 입니다.");
		
	}
}

class owner{
	static int mood;
	public static void checkDirty(int n){
		if (n>8) {
			System.out.println("매장 꼴이 이게 뭐냐, 돈받고 일하는거면 제대로해야지. 청소좀해!");
			I.setPay(-5000);
		}
		else System.out.println("매장 관리 제대로 잘 하고있구나, 청소 잘 해놨는데?");
	}
	
	public static void checkSaleMoney(){
		System.out.println("매출이 얼마나 되는지 확인해볼까.. : "+store.getSaleMoney()+"원 이면 적당히 장사가 되고 있구만!");
	}
	
	public static void moneyfight(){
		int a=(int)(Math.random()*2);
		System.out.println("일당이 마음에 안드는가본데? 얘기 좀 해볼까? (현재 일당 : "+I.getPay()+"원)");
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
	
	static void customer0(){//일반손님
		System.out.println("일반 손님입니다");
		n=5;
	}
	
	static void customer1(){
		System.out.println("야생의 취객이 나타났다!");
		time.sleep(1000);
		int r = (int)(Math.random()*3);//취객 모드 3가지
		if (r==0){
			System.out.println("다행히 그냥 나간다.");
			n=0;
		}
		else if(r==1){//토를 한다->이는 청소로 깨끗이 해야함
			System.out.println("취객이 토를 한다ㅏㅏ!!!!!!!!!!!");
			time.sleep(1000);
			System.out.println("그리고 나갔다...");
			n=0;
		}
		else {//물건을 산다
			System.out.println("취객이 [숙취해소제]를 구매합니다.");
			n=3;
		}		
	}
	
	static void customer2(){//직장인
		System.out.println("매우 피곤해 보이는 직장인입니다.");
		time.sleep(500);
		System.out.println("직장인이 [커피]를 구매합니다.");
		n=2;
	}
	
	static void customer3(){//물건을 많이 사는 손님
		System.out.println("손님입니다.");
		time.sleep(200);
		System.out.println("손님이 상품을 고르는 중입니다...");
		time.sleep(1500);
		System.out.println("계산대 위에 상품이 잔뜩 올라와있습니다.");
		n=6;
	}
	
	static void customer4(){//진상 손님
		System.out.println("심상치 않은 기운을 풍기는 손님입니다.");
		time.sleep(500);
		System.out.println("물건을 사러 온건지 짜증을 내러 온건지 손님이 큰소리로 투덜거립니다.");
		time.sleep(1000);
		int r = (int)(Math.random()*2);
		if(r==0){//진상 손님 모드 2가지
			//안 삼
			System.out.println("결국 손님은 아무것도 안 사고 나갔습니다...");
			n=0;
		}
		else{//사긴 산다
			System.out.println("손님이 계산대에 상품을 올리면서 더 짜증을 냅니다.");
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