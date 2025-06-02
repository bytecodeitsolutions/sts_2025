class Tiffin
{
	String item1;
	String item2;
	String item3;
	
}
class GirlFriend
{
	 Tiffin getTiffin(){
		 Tiffin  t1=new Tiffin();
		 t1.item1="Paneer";
		 t1.item2="chapati";
		 t1.item3="pulaw";
		 return t1;
	 }
}
class BoyFriend
{
	 void openTiffin(GirlFriend gf){
		Tiffin  t= gf.getTiffin();
		System.out.println(t.item1);
		System.out.println(t.item2);
		System.out.println(t.item3);
	 }
}
class NonPrimitiveReturnTypeDemo1 
{
	public static void main(String[] args) 
	{
		BoyFriend  b=new BoyFriend();
		GirlFriend  obj=new GirlFriend();
		b.openTiffin(obj);
	}
}
