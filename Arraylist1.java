import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Arraylist1 {
  public static int CountKey(ArrayList<Integer> list, int target) {
    int count = 0;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        System.out.println("indax number:   " + i);
        count++;
      }
    }
    return count;
  }
  // public static void lonlyNumber(ArrayList<Integer> list) {
  // for (int i = 0; i < list.size(); i++) {
  // for (int j = 0; j < list.size(); j++) {
  // if (i == j) {
  // return;
  // } else if (list.get(i) == list.get(j) || list.get(j) == list.get(i) - 1 ||
  // list.get(j) == list.get(i) + 1) {
  // list.remove(i);
  // break;
  // }
  // }
  // }

  // }

  // public static boolean monotone(ArrayList<Integer> list) {
  // boolean inc = true;
  // boolean dec = true;
  // for (int i = 0; i < list.size() - 1; i++) {

  // if (list.get(i) > list.get(i + 1)) {
  // inc = false;
  // } else if (list.get(i) < list.get(i + 1)) {
  // dec = false;
  // }

  // }
  // return dec || inc;
  // }

  // public static boolean pairSum2(ArrayList<Integer> list, int target) {
  // int bp = -1;
  // int n = list.size();
  // for (int i = 0; i < list.size(); i++) {
  // if (list.get(i) > list.get(i + 1)) {
  // bp = i;
  // break;
  // }
  // }

  // int lp = bp + 1;
  // int rp = bp;

  // while (lp != rp) {
  // if (list.get(rp) + list.get(lp) == target) {
  // return true;
  // } else if (list.get(rp) + list.get(lp) > target) {
  // rp = (n + rp - 1) % n;
  // } else {
  // lp = (lp + 1) % n;
  // }
  // }
  // return false;

  // }

  // public static boolean pairSum(ArrayList<Integer> list, int target) {
  // int lp = 0;
  // int rp = list.size() - 1;
  // while (lp != rp) {
  // if (list.get(lp) + list.get(rp) == target) {
  // return true;
  // } else if (list.get(lp) + list.get(rp) < target) {
  // lp++;
  // } else {
  // rp++;
  // }
  // }
  // return false;
  // }
  // for (int i = 0; i < list.size(); i++) {
  // for (int j=i+1; j < list.size(); j++) {

  // if (list.get(i) + list.get(j) == target) {
  // return true;
  // }

  // }
  // }
  // return false;
  // }

  // public static void swap(ArrayList<Integer> List, int idx1, int idx2) {

  // int temp = List.get(idx1);
  // List.set(idx1, List.get(idx2));
  // List.set(idx2, temp);

  // }

  // public static int stockWater(ArrayList<Integer> list) {
  // int maxWater = 0;
  // for (int i = 0; i < list.size(); i++) {
  // for (int j = i + 1; j < list.size(); j++) {
  // int ht = Math.min(list.get(i), list.get(j));
  // int wigth = (j - i);
  // int currWater = ht * wigth;
  // maxWater = Math.max(currWater, maxWater);
  // }

  // }
  // return maxWater;
  // }

  public static void main(String args[]) {

    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(6);
    list.add(5);
    list.add(8);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);

    int target = 8;

    System.out.println("cont of key which is present in list:   " + CountKey(list, target));

    // lonlyNumber(list);
    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list);
    // }

    // System.out.println(stockWater(list));

    // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    // ArrayList<Integer> list1 = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3 = new ArrayList<>();

    // for (int i = 1; i <= 5; i++) {
    // list1.add(i * 1);
    // list2.add(i * 2);
    // list3.add(i * 3);

    // }
    // // System.out.println(list1);
    // mainList.add(list1);
    // mainList.add(list2);
    // mainList.add(list3);
    // // System.out.println(mainList);

    // for (int i = 0; i < mainList.size(); i++) {
    // ArrayList<Integer> curList = mainList.get(i);
    // for (int j = 0; j < curList.size(); j++) {
    // System.out.print(curList.get(j) + " ");
    // }
    // System.out.println();
    // }

    // list1.add(1);
    // list1.add(2);
    // list1.add(4);
    // list1.add(5);
    // list2.add(6);
    // list2.add(7);
    // list2.add(8);
    // list2.add(9);
    // list3.add(1);
    // list3.add(2);
    // list3.add(4);
    // list3.add(5);
    // System.out.println(mainList);

    // int arr[] = { 1, 2, 5, 3, 7, 2 };

    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // ArrayList<Integer> List = new ArrayList<>();

    // List.add(20);
    // List.add(1000);
    // List.add(40);
    // List.add(50);
    // System.out.println(List);

    // Collections.sort(List);
    // System.out.println(List);

    // Collections.sort(List, Collections.reverseOrder());
    // System.out.println(List);

    // swap(List, 2, 3);
    // System.out.print(List);

    // print max in arrylist

    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < List.size(); i++) {
    // if (max < List.get(i)) {
    // max = List.get(i);
    // }

    // System.out.print(max + " ");
    // }
    // // revers arrylist

    // System.out.print(List);
    // List.set(2, 90);
    // System.out.print(List);
    // List.add(1, 80);
    // // List.remove(2);
    // System.out.print(List);

  }
}