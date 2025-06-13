/*
    IS-A Relationship (Inheritance)
	
	Has-A Relationship :
	---------------------
	  Composition  -tight coupling
	  Aggregation  -loose coupilng
	
 */
 class Radio
 {
	 void playMusic(){
		 Frequncy fr =new Frequncy();
		 fr.tune();
		System.out.println("Playinhg music");
	 }
 }
 
 class Frequncy
 {
	 void tune(){
		System.out.println("Tuning at 98.7");
	 }
	 //50 
 }
class  HasARelDemo1
{
	public static void main(String[] args) 
	{
		Radio  r1=new Radio();
		r1.playMusic();
	}
}
