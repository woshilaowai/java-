package getClassObject;

 
public class Test {
 
    public static void main(String[] args) {
            String className = "getClassObject.Hero";
//            无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。（
//            除了直接使用 Class c = Hero.class 这种方式，这种方式不会导致静态属性被初始化）
//                Class pClass1=Class.forName(className);
			//                hero.class不会导致其被初始化
			                Class pClass2=Hero.class;
			                Class pClass3=new Hero().getClass();
			                
			//                System.out.println(pClass1);
			                System.out.println(pClass2);
			                System.out.println(pClass3);
			//                System.out.println(pClass1==pClass2);
			//                System.out.println(pClass1==pClass3);
    }
}