package kaoshi;
public class person {
String name;
int age;
public  person(String name,int age){
	this.name=name;
	this.age=age;
}
public void dispaly(){
	System.out.println("������"+name+"��������"+age);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	person p =new person("aa",34);
	p.dispaly();
}
}
