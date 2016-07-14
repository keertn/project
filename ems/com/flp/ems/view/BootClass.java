package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	public static void main(String[ ] args)
	{
		int c;
		System.out.println("1.AddEmployee\n,2.Modfy Employee\n,3.RemoveEmployee\n,4,SearchEmployee\n,5.getAllEmployee");
		Scanner in=new Scanner(System.in);
		c=in.nextInt();
		menuSelection(c);
}
	static void menuSelection(int c)
	{
		UserInteraction ui=new UserInteraction();
		switch(c)
		{
		case 1:
			ui.AddEmployee();
			break;
		case 2:
			ui.ModifyEmployee();
			break;
		case 3:
			ui.RemoveEmployee();
			break;
		case 4:
			ui.SearchEmployee();
			break;
		case 5:
			ui.getAllEmployee();
			break;
			
			default:
				break;
		}
	}
}
