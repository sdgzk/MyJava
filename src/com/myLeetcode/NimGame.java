package com.myLeetcode;
/*�����������ѣ�������һ���� Nim��Ϸ����������һ��ʯͷ��ÿ�����������õ� 1 �� 3 ��ʯͷ�� �õ����һ��ʯͷ���˾���ʤ���ߡ����������֡�

�����������Ǵ����ˣ����Ŷ�����ѵ���Ϸ���ԡ� ���дһ�����������ж����Ƿ�����ڸ�����ʯͷ�����������Ӯ����Ϸ��

�ȷ�˵�����������4��ʯͷ����ô����Զ����Ӯ�ñ��������������ߵ��� 1�飬2�� ���� 3�� ʯͷ�����һ��ʯͷ���ǻᱻ����������ߡ�*/
public class NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NimGame nimgame = new NimGame();
		int n =8;
		boolean flg  = nimgame.canWinNim(n);
		System.out.println(flg);
		flg  = nimgame.canWinNim1(n);
		System.out.println(flg);
		flg  = nimgame.canWinNim2(n);
		System.out.println(flg);


	}
	public boolean canWinNim(int n) {
		if ( (n-1)%4 ==0||(n-2)%4 ==0||(n-3)%4 ==0 ) {
			return	true;
		} else {
			return false;
		}
	}

	public boolean canWinNim1(int n) {
		return (n-1)%4 ==0 || (n-2)%4 ==0|| (n-3)%4 ==0;
	}
	public boolean canWinNim2(int n) {
		return n%4 !=0;
	}


}
