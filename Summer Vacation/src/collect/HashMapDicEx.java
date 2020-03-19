package collect;

import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		//���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//3���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�"); //"baby"�� key, "�Ʊ�"�� value
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//dic �÷��ǿ� ��� �ִ� ��� (key, value) �� ���
		Set<String> keys = dic.keySet(); //key ���ڿ��� ���� Set ����
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		//���� �ܾ �Է� �ް� �ѱ� �ܾ� �˻�
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<dic.size(); i++) {
			System.out.print("ã�� ���� �ܾ��? ");
			String eng = sc.next();
			System.out.println(dic.get(eng));
		}
	}

}
