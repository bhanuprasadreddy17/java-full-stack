Class Student{
String name;
int id;

public String getName(){
return name;
}

Student(){
name ="NotKnown";
}

Student(String name){
this.name =name;
}

public static void main(String[]args){
System.out.println("loki -In the main");


Student s1 = new Student("loki");
String s = s1.getName();
System.out.println(s);
}
}