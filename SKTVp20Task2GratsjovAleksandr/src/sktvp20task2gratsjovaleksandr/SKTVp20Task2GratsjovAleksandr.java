/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task2gratsjovaleksandr;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class SKTVp20Task2GratsjovAleksandr {

	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Dlya vipolneniya programmi nyjno vvesti 3 celih chisla");
		Scanner sc = new Scanner(System.in);
		System.out.print("Vvedite pervoe chislo: ");
		if(sc.hasNextInt()) {
			a = sc.nextInt();
			System.out.print("Vvedite vtoroye chislo: ");
                        if(sc.hasNextInt()) {
				b = sc.nextInt();
                        System.out.print("Vvedite tretje chislo: ");
			if(sc.hasNextInt()) {
                                c = sc.nextInt();
				d = a+b+c;
				System.out.print("Summa etih chisel = "+d);
			} 

