package datastructure;

import java.util.HashMap;
import java.util.Set;

//Map
//Key�� value�� �����ϱ����ؼ� ���
//key�� value�� ���� ��� Ÿ���� �����ϰ� �۾�
//servlet�� jsp���ο��� ����ϴ� ������ ���屸���� ��� Map����
public class HashMapTest {
	public static void main(String[] args) {
		//1. HashMap�� ����
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//2.�����͸� �����ϱ�
		//=>Map�� ������ ���� �ڷᱸ��,key�� ������ Map�� ����� ��ġ�� ����ؼ� �����ϹǷ� �����͸� �����ص�
		//������� �������ʴ´�.
		//=>key�� �ߺ��Ǹ� �ȵȴ�. ������Ű�� �̿��ؼ� ��Ҹ� �����ϸ� �ش� Ű�� �����Ͱ� ������Ʈ�ȴ�.
		map.put("a01", 1000);
		map.put("a02", 2000);
		map.put("a03", 3000);
		map.put("a04", 4000);
		map.put("a05", 5000);
		map.put("a06", 6000);
		
		//3.������ Ȯ��
		System.out.println("map�� ����� ����� ����:"+map.size());
		//4.Map�� ����� ��Ҹ� ������ -key�� value ����
		System.out.println("a03Ű�� ��=>"+map.get("a03"));
		System.out.println("a03Ű�� ��=>"+map.get("a06"));
		//5.Map�� ����� ��� �����͸� �ѹ��� ������
		//=>1)��� Ű�� ����
		Set<String> keylist=map.keySet();
		//=>2)��� Ű�� ��ȸ�ϸ� Ű������ ���� ��������
		for(String key:keylist) {
			System.out.println("key=>"+key+",value=>"+map.get(key));
		}
	}
}
