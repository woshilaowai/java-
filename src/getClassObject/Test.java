package getClassObject;

 
public class Test {
 
    public static void main(String[] args) {
            String className = "getClassObject.Hero";
//            ����ʲô;����ȡ����󣬶��ᵼ�¾�̬���Ա���ʼ��������ֻ��ִ��һ�Ρ���
//            ����ֱ��ʹ�� Class c = Hero.class ���ַ�ʽ�����ַ�ʽ���ᵼ�¾�̬���Ա���ʼ����
//                Class pClass1=Class.forName(className);
			//                hero.class���ᵼ���䱻��ʼ��
			                Class pClass2=Hero.class;
			                Class pClass3=new Hero().getClass();
			                
			//                System.out.println(pClass1);
			                System.out.println(pClass2);
			                System.out.println(pClass3);
			//                System.out.println(pClass1==pClass2);
			//                System.out.println(pClass1==pClass3);
    }
}