package com.myLeetcode;
/*您和您的朋友，两个人一起玩 Nim游戏：桌子上有一堆石头，每次你们轮流拿掉 1 到 3 块石头。 拿掉最后一块石头的人就是胜利者。由您来开局。

你们两个都是聪明人，相信都有最佳的游戏策略。 请编写一个函数，来判断您是否可以在给定的石头数量的情况下赢得游戏。

比方说，如果堆中有4块石头，那么你永远不会赢得比赛：无论你拿走的是 1块，2块 还是 3块 石头，最后一块石头总是会被你的朋友拿走。*/
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
