class Triangle{
double base;
double height;

Triangle(double b ,double h){
this.base=b;
this.height=h;
}

void getArea(){
double area=0.5*base*height;
System.out.println(area);
}
}
