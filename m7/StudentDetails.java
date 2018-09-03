class Student {
	String name;
	String rollNumber;
	float g1,g2,g3;
    public Student(String name,String rollNumber,float g1,float g2,float g3) {
    	this.name = name;
    	this.rollNumber = rollNumber;
        this.g1 = g1;
    	this.g2 = g2;
        this.g3 = g3;
    }
    float grade() {
    	return (g1 + g2 + g3) / 3;
    } 
    public static void main(String[] args) {
        Student obj1 = new Student("Sangay", "IT201985001", 7.5f, 7.0f, 8.0f);
        System.out.format("%.1f",obj1.grade());
        System.out.println(); 
        //System.out.println(obj1.grade());
        Student obj2=new Student("Bidhya", "IT201985003", 8.5f, 6.0f, 7.5f); 
        System.out.format("%.1f",obj2.grade());
        System.out.println(); 
        //System.out.println(obj2.grade());
        Student obj3 = new Student("Kelzang", "IT201985065", 7.5f, 8.0f, 9.0f);
        System.out.format("%.1f",obj3.grade());
        //System.out.println(obj3.grade());
    }

}