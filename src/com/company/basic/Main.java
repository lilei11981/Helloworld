package com.company.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lilei
 * @date 2020-05-26 21:19
 * @apiNote
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Queue<Character> queue = new LinkedList<>();
        queue.add('a');
        queue.add('b');
        Collection[] collections = {list, set, queue};
        System.out.println(Arrays.toString(collections));
    }


    //    final void method() {
    //
    //    };

    public static void main(String[] args) {
//        String str = "abbcde";
//        String aim = "bcdb";
//        System.out.println(getIndex(str, aim));

        int possibilities = 5;
        int strMaxSize = 20;
        int aimMaxSize = 4;
        for (int i = 0; i < 500; i++) {
            String str = getRandomString(possibilities, strMaxSize);
            System.out.println(str);
            String aim = getRandomString(possibilities, aimMaxSize);
            System.out.println(aim);
            System.out.println(getIndex(str, aim));
        }
//        System.out.println(getRandomString(possibilities, maxSize));
    }

    public static String getRandomString(int possibilities, int maxSize) {
        char[] chars = new char[(int) (Math.random() * maxSize) + 1];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((int)(Math.random() * possibilities) + 'a');
        }
        return String.valueOf(chars);
    }

    private static int getIndex(String str, String aim) {
        if (str == null || aim == null || str.length() < aim.length()) {
            return -1;
        }
        int length = aim.length();
        char[] chars = aim.toCharArray();
        int[] count = new int[256];
        for (int i = 0; i < length; i++) {
            count[chars[i]]++;
        }
//        System.out.println(Arrays.toString(chars));
//        System.out.println(Arrays.toString(count));
        char[] strings = str.toCharArray();
        int strLength = str.length();
        int invalidTimes = 0;
        int index = 0;
        for (;index < length;index++) {
            if (count[strings[index]]-- <= 0) {
                invalidTimes++;
            }
        }
//        System.out.println(invalidTimes);
        for (;index < strLength;index++) {
            if (invalidTimes == 0) {
                return index - length;
            }
//            System.out.println(invalidTimes);
            if (count[strings[index]]-- <= 0) {
                invalidTimes++;
            }
            if (count[strings[index - length]]++ < 0) {
                invalidTimes--;
            }
        }
//        System.out.println(invalidTimes);
        return invalidTimes == 0 ? index - length : -1;
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String string = scanner.nextLine();
//            System.out.println(getString(string));
//        }
//        scanner.close();
//    }
//
//    private static String getString(String string) {
//        Set<Character> set = new HashSet<>();
//        int length = string.length();
//        for (int i = 0; i < length; i++) {
//
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int num = scanner.nextInt();
//            if (num != 0) {
//                System.out.println(getNum(num));
//            }
//        }
//        scanner.close();
//    }
//
//    private static int getNum(int num) {
//        if (num < 2) {
//            return 0;
//        }
//        int result = 0;
//        while (num >= 2) {
//            if (num == 2) {
//                return result + 1;
//            }
//            int newNum = num / 3;
//            int modNum = num % 3;
//            result += newNum;
//            num = newNum + modNum;
//        }
//        return result;
//    }

//    private static int getNum(int num) {
//        if (num < 2) {
//            return 0;
//        }
//        if (num == 2) {
//            return 1;
//        }
//        return num / 3 + getNum(num / 3 + num % 3);
//    }


//    final void method() {
//
//    };

    //    public static void main(String[] args){
    //        Scanner scanner = new Scanner(System.in);
    //        String a = scanner.nextLine();
    //        String[] b = a.split(" ");
    //        int len = b.length;
    //        System.out.println(b[len-1].length());
    //    }

    //public static void main(String[] args){
    //    Scanner a = new Scanner(System.in);
    //    String b = "";
    //    String c = "";
    //    b = a.nextLine();
    //    c = a.next();
    //    char[] d = b.toCharArray();
    //    int e = 0;
    //    char[] f = c.toCharArray();
    //    for(int i=0;i<d.length;i++) {
    //        if(f[0]==d[i]) {
    //            e++;
    //        }
    //    }
    //    System.out.print(e);
    //}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()){
//            int num = scanner.nextInt();
//            TreeSet<Integer> treeSet = new TreeSet<>();
//            for (int i = 0; i < num; i++) {
//                treeSet.add(scanner.nextInt());
//            }
//            for (Integer a:treeSet) {
//                System.out.println(a);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        list.add(sc.nextLine());
//        list.add(sc.nextLine());
//        for (String strings : list) {
//            if (strings.length() > 8) {
//                for (int i = 0; i < strings.length(); i += 8) {
//                    strings = strings.substring(i, i + 8);
//                    list.add(strings);
//                }
//            }
//        }
//        for (String string : list) {
//            if (string.length() < 8) {
//                while (string.length() != 8) {
//                    string = string + '0';
//                }
//                System.out.println(string);
//            } else {
//                System.out.println(string);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        for (int m = 0, n = -1; n == 0; m++, n++) {
//            n++;
//        }
//        System.out.println("---");
//    }

//    public static void main(String[] args) {
//        System.out.println(new B().getValue());
//    }
//    static class A {
//        protected int value;
//        public A (int v) {
//            setValue(v);
//        }
//        public void setValue(int value) {
//            this.value= value;
//        }
//        public int getValue() {
//            try {
//                value ++;
//                return value;
//            } finally {
//                this.setValue(value);
//                System.out.println(value);
//            }
//        }
//    }
//    static class B extends A {
//        public B () {
//            super(5);
//            setValue(getValue()- 3);
//        }
//        @Override
//        public void setValue(int value) {
//            super.setValue(2 * value);
//        }
//    }

//    public static void main(String[] args) {
//        Thread t = new Thread() {
//
//            @Override
//            public void run() {
//                my360DW();
//            }
//        };
//
//        t.run();
//        System.out.print("DW");
//
//    }
//
//    static void my360DW() {
//
//        System.out.print("360");
//
//    }

//    public static void main(String[] args) {
//        TreeSet<Integer> set = new TreeSet<Integer>();
//        TreeSet<Integer> subSet = new TreeSet<Integer>();
//        for(int i = 606;i<613;i++)
//        {
//            if (i % 2 == 0) {
//                set.add(i);
//            }
//        }
//        subSet =(TreeSet)set.subSet(608,true,611,true);
//        set.add(629);
//        System.out.println(set+" "+subSet);
//    }

//    public static void main(String[] args) {
//        long test1= 0123;
//        float f = -412;
//        double d=0x12345678;
//        System.out.println(test1);
//        System.out.println(f);
//        System.out.println(d);
//    }

//    public static void main(String[] args) {
//        String s;
//        System.out.println("s=" + s);
//    }

//    public static void main(String [] args){
//        float f=42.0f;
//        float f1[]=new float[2];
//        float f2[]=new float[2];
//        float[] f3=f1;
//        long x=42;
//        f1[0]=42.0f;
//
//        System.out.println(f1==f2);
//        System.out.println(x==f1[0]);
//        System.out.println(f1==f3);
////        System.out.println(f2==f1[1]);
//    }

//    public static void main(String[] args) {
//        try{ //加载MySql的驱动类
//            Class.forName("com.mysql.jdbc.Driver");
//        }
//        catch(ClassNotFoundException e)
//        {
//            System.out.println("找不到驱动程序类 ，加载驱动失败！");
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        Integer i01=59;
//        int i02=59;
//        Integer i03=Integer.valueOf(59);
//        Integer i04=new Integer(59);
//
//        System.out.println(i01==i02);
//        System.out.println(i01==i03);
//        System.out.println(i02==i04);
//        System.out.println(i03==i04);
//    }

//    public static void main(String args[]) {
//        int x,y;
//        x=5>>2;
//        y=x>>>2;
//        System.out.println(y);
//    }

//    public static void main(String args[]) {
//        String s = "祝你考出好成绩！";
//        System.out.println(s.length());
//    }

//    public boolean returnTest()
//    {
//        try {
//            return true;
//        } catch (Exception e) {
//          e.printStackTrace();
//        } finally {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.returnTest());
//    }


//    public static void main(String[] args) {
//        System.out.println(Math.floor(-8.5));
//    }

//    public static void main(String[] args) {
////        int a = Integer.parseInt("1024");
////        int b = Integer.valueOf("1024").intValue();
//        System.out.println(Integer.parseInt("1024"));
//        System.out.println(Integer.valueOf("1024").intValue());
//    }

//    public static void main(String[] args) {
//        int m = 12, n = 34;
//        // m++ 先输出在自加，++m 先自加在输出
//        System.out.printf("%d%d", m++, ++n);
//        System.out.printf("%d%d\n", n++, ++m);
//    }
//    public static void main(String args[]) {
//        byte a = 3;
//        byte b = 2;
//        b = a + b;
//        System.out.println(b);
//    }
//    public static int getValue(int i) {
//        int result = 0;
//        switch (i) {
//            case 1:
//                result = result + i;
//            case 2:
//                result = result + i * 2;
//            case 3:
//                result = result + i * 3;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int a = getValue(2);
//        System.out.println(a);
//    }

//    public static void main(String[] args) {
//        new Main().new Sub(5);
//    }
//
//    class Super {
//        int flag = 1;
//
//        Super() {
//            test();
//        }
//
//        void test() {
//            System.out.println("Super.test() flag=" + flag);
//        }
//    }
//
//    class Sub extends Super {
//        Sub(int i) {
//            flag = i;
//            System.out.println("Sub.Sub()flag=" + flag);
//        }
//
//        @Override
//        void test() {
//            System.out.println("Sub.test()flag=" + flag);
//        }
//    }

//    public static void main(String[] args) {
//        Connection con;
//        Statement sta = con.createStatement();
//        ResultSet rst=sta.executeQuery("select * from book");
//    }

//    public static void main(String[] args) {
//        int i = 0;
//        int j = 0;
//        if ((++i > 0) || (++j > 0)) {
//            //打印出i和j的值。
//            System.out.println(i);
//            System.out.println(j);
//        }
//    }

//    static boolean foo(char c) {
//        System.out.print(c);
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        for (foo('A'); foo('B') && (i < 2); foo('C')) {
//            i++;
//            foo('D');
//        }
//    }

//    private int count;
//    public static void main(String[] args) {
//        Main test=new Main(88);
//        System.out.println(test.count);
//    }
//    Main(int a) {
//        count=a;
//    }

//    public static String output = "";
//
//    public static void foo(int i) {
//        try {
//            if (i == 1) {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            output += "2";
//            return;
//        } finally {
//            output += "3";
//        }
//        output += "4";
//    }
//
//    public static void main(String[] args) {
//        foo(0);
//        foo(1);
//        System.out.println(output);
//    }

//    public static void main(String[] args) {
//        String str = "";
//        int num = str.split(",").length;
//        System.out.print(num);
//    }

//    public static void main(String[] args) {
//        Boolean flag = false;
//        if(flag = true){
//            System.out.println("true");
//        }else{
//
//            System.out.println("false");
//        }
//    }

//    public static void main(String[] args) {
//        byte b1=1,b2=2,b3,b6;
//        final byte b4=4,b5=6;
//        b6=b4+b5;
////        b3=(b1+b2);
////        System.out.println(b3+b6);
//        System.out.println(b6);
//    }

//    class A{}
//    class B extends A{}
//    class C extends A{}
//    class D extends B{}
//    public static void main(String[] args) {
//        A obj = new Main().new D();
//        System.out.println(obj instanceof B);
//        System.out.println(obj instanceof C);
//        System.out.println(obj instanceof D);
//        System.out.println(obj instanceof A);
//    }

//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//    }
//    public static void main(String args[]){
//        Main test = new Main();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String s = scanner.nextLine();
//            split(s);
//        }
//    }
//
//    public static void split(String s) {
//        while (s.length() >= 8) {
//            System.out.println(s.substring(0, 8));
//            s = s.substring(8);
//        }
//        if (s.length() < 8 && s.length() > 0) {
//            s = s + "00000000";
//            System.out.println(s.substring(0, 8));
//        }
//    }

//    public static void main(String[] args) {
//        String input = "123456789";
//        System.out.println(input.substring(0,8));
//        System.out.println(input.substring(8));
//    }

//    public static void main(String[] args) {
////        char a = '8';
////        int b = Integer.parseInt(String.valueOf(a));
////        System.out.println(b);
//        System.out.println(power(10,2));
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()) {
//            String input = scanner.nextLine();
//            transfer(input);
//        }
//    }
//
//    public static void transfer(String hexString) {
//        String transferHex = hexString.substring(2);
//        int dec = transferHex.length();
//        int decInt = 0;
//        for(int i = 0; i < dec; i++) {
//            decInt = decInt +  power(16, i) * parse(transferHex.charAt(dec-i-1));
//        }
//        System.out.println(decInt);
//    }
//
//    public static int power(int a, int b) {
//        int c = 1;
//        for (int i = 0; i < b; i++) {
//            c = c * a;
//        }
//        return c;
//    }
//
//
//    public static int parse(char c) {
//        switch (c) {
//            case 'A':
//                return 10;
//            case 'B':
//                return 11;
//            case 'C':
//                return 12;
//            case 'D':
//                return 13;
//            case 'E':
//                return 14;
//            case 'F' :
//                return 15;
//            default:
//                return Integer.parseInt(String.valueOf(c));
//        }
//    }

    // 180


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        long a = scanner.nextLong();
//        for (int i = 2; i <= a; i++) {
//            isEnd(a, i);
//        }
//
//    }
//
//    public static void isEnd(long a, int i) {
//        if (isPri(i) && a % i == 0) {
//            System.out.print(i + " ");
//        } else {
//            return;
//        }
//        a = a / i;
//        isEnd(a, i);
//    }
//
//
//    public static boolean isPri(int b) {
//        if (b == 2 || b == 3) {
//            return true;
//        }
//        if (b % 2 == 0) {
//            return false;
//        }
//        for (int i = 2; i <= b / i; i++) {
//            if (b % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.next();
//        if (a > 5) {
//            a = a + 1;
//        }
//        System.out.println((int)(Math.floor(a)));
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        int b = (int)a;
//        if((a-b) >= 0.5 && (a-b) < 1 ) {
//            b = b+1;
//        }
//        System.out.println(b);
//    }


//    public static void main(String[] args) {
//        int[] a = {2, 4, 6, 8, 3, 6, 9, 12};
//        doSomething(a, 0, a.length - 1);
//        for (int i = 0; i <= a.length - 1; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//
//    private static void doSomething(int[] a, int start, int end) {
//        if (start < end) {
//            int p = core(a, start, end);
//            doSomething(a, start, p - 1);
//            doSomething(a, p + 1, end);
//        }
//    }
//
//    private static int core(int[] a, int start, int end) {
//        int x = a[end];
//        int i = start;
//        for (int j = start; j <= end - 1; j++) {
//            if (a[j] >= x) {
//                swap(a, i, j);
//                //交换了几次
//                i++;
//            }
//        }
//        //把最大的放到最后
//        //把最大的放到i的位置
//        swap(a, i, end);
//        return i;
//    }
//
//    private static void swap(int[] a, int i, int j) {
//        int tmp = a[i];
//        a[i] = a[j];
//        a[j] = tmp;
//    }

//    public static void main(String[] args) {
//        Main main = new Main();
//        main.complicatedexpression_r();
//    }
//
//    public void complicatedexpression_r() {
//        int x = 20, y = 30;
//        boolean b;
//        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
//        System.out.println(b);
//    }

//    public static void main(String[] args) {
//        long a = 123L;
//        double d = 0.9239d;
//        final String s;
//        Main c = new Main();
//        System.out.println();
//    }
//
//    public final void get() {
//        final String a;
//    }

//    static boolean out(char c){
//        System.out.println(c);
//        return true;
//    }
//    public static void main(String[] argv){
//        int i = 0;
//        for(out('A');out('B') && (i<2);out('C')){
//            i++;
//            out('D');
//        }
//    }

//    public static void main(String[] args) {
//        char myChar = 'g';
//        String myStr = Character.toString(myChar);
//        System.out.println("String is: " + myStr);
//        myStr = String.valueOf(myChar);
//        System.out.println("String is: " + myStr);
//    }

//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(5);
//        list.add(3);
//        list.add(1);
//        list.add(6);
//        list.add(0,4);
//        list.remove(1);
//        System.out.println(list);
//    }

//    String str = new String("good");
//    char[ ] ch = { 'a' , 'b' , 'c' };
//    public static void main(String args[]){
//        Main ex = new Main();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
//    }
//    public void change(String str,char ch[ ]){
//        str = "test ok";
//        ch[0] = 'g';
//    }

//    public static void main(String[] args) {
//        int a = '2';
//        System.out.println(a);
//    }


//    public static void main(String[] args) {
//        int a = 1;
//        float b = 2;
//        System.out.println(a/b);
//    }

//    public static void main(String[] args) {
//        java.util.HashMap map=new java.util.HashMap();
//        map.put("name",null);
//        map.put("name","Jack");
//        System.out.println(map.size());
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String b = sc.nextLine();
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        String[] c = b.split(" ");
//        int d = Integer.parseInt(c[0]);
//        int e = Integer.parseInt(c[1]);
//        if (hashMap.containsKey(d)) {
//            e += hashMap.get(d);
//        }
//        hashMap.put(d,e);
//        System.out.println(hashMap);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        int num = Integer.parseInt(a);
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < num; i++) {
//            String b = sc.nextLine();
//            String[] c = b.split(" ");
//            int d = Integer.parseInt(c[0]);
//            int e = Integer.parseInt(c[1]);
//            if (hashMap.containsKey(d)) {
//                e += hashMap.get(d);
//            }
//            hashMap.put(d,e);
//        }
//        Set keySet = hashMap.keySet();
//        Iterator<Integer> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            int key = iterator.next();
//            int value = hashMap.get(key);
//            System.out.println(key+ " " + value);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        int num = Integer.parseInt(a);
//        Map<Integer,Integer> map = new TreeMap<>();
//        for (int i = 0; i < num; i++) {
//            String b = sc.nextLine();
//            String[] c = b.split(" ");
//            int d = Integer.parseInt(c[0]);
//            int f = Integer.parseInt(c[1]);
//            if (map.containsKey(d)) {
//                map.put(d,map.get(d) + f);
//            } else {
//                map.put(d,f);
//            }
//        }
//        sc.close();
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }

//    public static void main(String[] args) {
//        Scanner str = new Scanner(System.in);
//        SortedMap<Integer,Integer> map = new TreeMap<>();
//        int n = Integer.parseInt(str.nextLine());
//        for (int i = 0;i<n;i++){
//            String[] mid = str.nextLine().split("\\s+");
//            addPare(map,mid);
//        }
//        System.out.println(mapToString(map));
//    }
//
//    private static String mapToString(SortedMap<Integer, Integer> map) {
//        StringBuilder builder = new StringBuilder();
//        for(SortedMap.Entry<Integer,Integer>e:map.entrySet()){
//            builder.append(e.getKey()).append(" ").append(e.getValue()).append("\r");
//        }
//        return builder.toString();
//    }
//
//    private static void addPare(SortedMap<Integer, Integer> map, String[] mid) {
//        int key = Integer.parseInt(mid[0]);
//        int value = Integer.parseInt(mid[1]);
//        if(map.containsKey(key)){
//            map.put(key, map.get(key) + value);
//        }else{
//            map.put(key, value);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split("");
//        ArrayList<String> list = new ArrayList();
//        for (int i = b.length - 1; i >= 0; i--) {
//            if (!list.contains(b[i])) {
//                list.add(b[i]);
//            }
//        }
//        for(String c : list) {
//            System.out.print(c);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        char[] b = a.toCharArray();
//        ArrayList list = new ArrayList();
//        int num = 0;
//        for (int i = 0; i < b.length; i++) {
//            if (!list.contains(b[i]) && b[i] <= 127 ) {
//                list.add(b[i]);
//                num++;
//            }
//        }
//        System.out.println(num);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split("");
//        ArrayList<String> list = new ArrayList();
//        for (int i = b.length - 1; i >= 0; i--) {
//            list.add(b[i]);
//        }
//        for(String c : list) {
//            System.out.print(c);
//        }
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split("");
////        HashSet set = new HashSet();
////        TreeSet set = new TreeSet();
//        LinkedHashSet set = new LinkedHashSet();
//        for (int i = 0; i < b.length; i++) {
//            set.add(b[i]);
//        }
//        System.out.println(set);
//    }

//    public static void main(String[] args) {
//        // 73892173891279837129
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split("");
//        // {0=7, 1=3, 2=8, 3=9, 4=2, 5=1, 6=7, 7=3, 8=8, 9=9, 10=1, 11=2, 12=7, 13=9, 14=8, 15=3, 16=7, 17=1, 18=2, 19=9}
////        HashMap map = new HashMap();
//        // {19=9, 18=2, 17=1, 16=7, 15=3, 14=8, 13=9, 12=7, 11=2, 10=1, 9=9, 8=8, 7=3, 6=7, 5=1, 4=2, 3=9, 2=8, 1=3, 0=7}
////        Hashtable map = new Hashtable();
//        // {0=7, 1=3, 2=8, 3=9, 4=2, 5=1, 6=7, 7=3, 8=8, 9=9, 10=1, 11=2, 12=7, 13=9, 14=8, 15=3, 16=7, 17=1, 18=2, 19=9}
////        ConcurrentHashMap map = new ConcurrentHashMap();
//        // {0=7, 1=3, 2=8, 3=9, 4=2, 5=1, 6=7, 7=3, 8=8, 9=9, 10=1, 11=2, 12=7, 13=9, 14=8, 15=3, 16=7, 17=1, 18=2, 19=9}
//        ConcurrentMap map = new ConcurrentHashMap();
//        for (int i = 0; i < b.length; i++) {
//            map.put(i,b[i]);
//        }
//        System.out.println(map);
//    }

//    public static void main(String[] args) {
//        // 783271893721
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split("");
//        // [7, 8, 3, 2, 7, 1, 8, 9, 3, 7, 2, 1]
//        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
////        ConcurrentLinkedDeque queue = new ConcurrentLinkedDeque();
//        for (int i = 0; i < b.length; i++) {
//            queue.add(b[i]);
//        }
//        System.out.println(queue.peek());
//        System.out.println(queue);
//    }

//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(new File("/Users/lilei/IdeaProjects/luckymoney/HELP.md"))) {
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String[] b = a.split("");
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = b.length - 1; i >= 0; i--) {
//            list.add(b[i]);
//        }
//        for(String c : list) {
//            System.out.print(c);
//        }
//        sc.close();
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        System.out.println(reverse(a));
//    }
//
//    public static String reverse(String sentence) {
//        ArrayList<String> list = new ArrayList<>();
//        String[] a = sentence.split(" ");
//        for (int i = a.length - 1; i >= 0; i--) {
//            list.add(a[i]);
//        }
//        StringBuilder b = new StringBuilder();
//        for(String c : list) {
//            b.append(c).append(" ");
//        }
//        return b.toString();
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        int b = Integer.parseInt(a);
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < b; i++) {
//            list.add(scanner.nextLine());
//        }
//        scanner.close();
//        Collections.sort(list);
//        for (String c : list) {
//            System.out.println(c);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(calculate(a));
//    }
//
//    public static int calculate(int a) {
//        int b = 0;
//        if (a % 2 == 1) {
//            b++;
//        }
//        a = a / 2;
//        if (a != 0) {
//            int c = calculate(a);
//            b += c;
//        }
//        return b;
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split(" ");
//        int N = Integer.parseInt(b[0]);
//        int m = Integer.parseInt(b[1]);
//        int[] v = new int[m];
//        int[] p = new int[m];
//        String[] q = new String[m];
//        for (int i = 0; i < m; i++) {
//            String c = scanner.nextLine();
//            String[] d = c.split(" ");
//            v[i] = Integer.parseInt(d[0]);
//            p[i] = Integer.parseInt(d[1]);
//            q[i] = d[2];
//        }
//        scanner.close();
//        ArrayList<Integer> list = new ArrayList<>();
//        int M = 0;
//        for (int i = 0; i < m; i++) {
//            if (("0").equals(q[i])) {
//                if (v[i] <= N) {
//                    list.add(v[i] * p[i]);
//                }
//            }
//            if (("1").equals(q[i])) {
//                if (("1").equals(q[i-1])) {
//                    list.add(v[i] * p[i] + v[i-1] * p[i-1] + v[i-2] * p[i-2]);
//                }
//                list.add(v[i] * p[i] + v[i-1] * p[i-1]);
//            }
//        }
//        list.add(M);
//        Collections.sort(list);
//        System.out.println(list.get(list.size()-1));
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String[] b = a.split(" ");
//        int n = Integer.parseInt(b[0]) / 10;
//        int m = Integer.parseInt(b[1]);
//        int[] v = new int[m+1];
//        int[] p = new int[m+1];
//        int[] q = new int[m+1];
//        for (int i = 1; i <= m; i++) {
//            String c = scanner.nextLine();
//            String[] d = c.split(" ");
//            v[i] = Integer.parseInt(d[0]) / 10;
//            p[i] = Integer.parseInt(d[1]) * v[i];
//            q[i] = Integer.parseInt(d[2]);
//        }
//        scanner.close();
//        int[][] res = new int[m+1][n+1];
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (q[i] == 0) {
//                    if (v[i] <= j) {
//                        res[i][j] = Math.max(res[i-1][j], res[i-1][j-v[i]] + p[i]);
//                    }
//                } else {
//                    if(v[i] + v[q[i]] <= j){
//                        res[i][j] = Math.max(res[i-1][j], res[i-1][j-v[i]] + p[i]);
//                    }
//                }
//            }
//        }
//        System.out.println(res[m][n] * 10);
//    }

//    public static void main(String args[]) {
//        int i = 7;
//        do {
//            System.out.println(--i);
//            --i;
//        } while (i == 0);
//        System.out.println(i);
//    }

//    private static final String MESSAGE="taobao";
//    public static void main(String [] args) {
//        String a ="tao"+"bao";
//        String b="tao";
//        String c="bao";
//        System.out.println(a==MESSAGE);
//        System.out.println((b+c)==MESSAGE);
//    }

//    public static void main(String[] args) {
//        String classFile = "com.jd.".replaceAll("\\.", "/") + "MyClass.class";
//        System.out.println(classFile);
//        System.out.println(classFile);
//        System.out.println(classFile);
//        System.out.println(classFile);
//        System.out.println(classFile);
//        System.out.println(classFile);
//        System.out.println(classFile);
//    }

//    void waitForSignal() throws InterruptedException {
//        Object obj = new Object();
//        synchronized (Thread.currentThread()) {
//            obj.wait();
//            obj.notify();
//
//        }
//    }

//    public static void main(String [] args){
//        List list=new ArrayList();
//        list.add("a");
//        list.add("b");
//        list.add("a");
//        Set set=new HashSet();
//        set.add("a");
//        set.add("b");
//        set.add("a");
//        System.out.println(list.size()+","+set.size());
//    }

//    public static void main(String[] args) {
//        char a = '1';
//        System.out.println((byte)(a));
//        byte b = 40;
//        System.out.println((char)b);
//        byte c = 0x40;
//        System.out.println((char)c);
//        char d = 'A';
//        System.out.println((int)(d));
//        char e = 'a';
//        System.out.println((int)(e));
//        char f = Character.toUpperCase(e);
//        System.out.println(f);
//        char z = 'z';
//        System.out.println((int)(z));
//        StringBuilder str = new StringBuilder();
//        while (a < 128) {
//            str.append(a);
//            a++;
//        }
//        System.out.println(str);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String a = sc.nextLine();
//            char[] b = a.toCharArray();
//            StringBuffer stringBuffer = new StringBuffer();
//            for (int i = 0; i < 26; i++) {
//                for (char c : b) {
//                    if ((int) c == 65 + i || (int) c == 97 + i) {
//                        stringBuffer.append(c);
//                    }
//                }
//            }
//            for (int j = 0; j < b.length; j++) {
//                boolean c = (int) (b[j]) < 65 || (int) (b[j]) > 122 || ((int) (b[j]) > 90 && (int) (b[j]) < 97);
//                if (c) {
//                    stringBuffer.insert(j,b[j]);
//                }
//            }
//            System.out.println(stringBuffer);
//        }
//        sc.close();
//    }


//    public static void main(String[]args) {
//        final Object obj = new Object();
//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//                synchronized (obj) {
//                    try {
//                        obj.wait();
//                        System.out.println("Thread 1 wake up.");
//                    } catch (InterruptedException e) {
//                    }
//                }
//            }
//        };
//        t1.start();
//        //We assume thread 1 must start up within 1 sec.
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Thread t2 = new Thread() {
//            @Override
//            public void run() {
//                synchronized (obj) {
//                    obj.notifyAll();
//                    System.out.println("Thread 2 sent notify.");
//                }
//            }
//        };
//        t2.start();
//    }


//    public static void main(String[] args) {
//        double a = -5 + 1/4 + 2*-3 + 5.0;
//        System.out.println(1/4);
//        System.out.println(2*-3);
//        System.out.println(a);
//    }


//    public static void main(String args[]) {
//        List Listlist1 = new ArrayList();
//        Listlist1.add(0);
//        List Listlist2 = Listlist1;
//        System.out.println(Listlist1.get(0) instanceof Integer);
//        System.out.println(Listlist2.get(0) instanceof Integer);
//    }

//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }

//    public static void main(String args[]) {
//        int x = -5;
//        int y = -12;
//        System.out.println(y % x);
//    }

//    String str = new String("hello");
//    char[] ch = {'a', 'b', 'c'};
//
//    public static void main(String[] args) {
//        Main test1 = new Main();
//        test1.fun(test1.str, test1.ch);
//        System.out.print(test1.str + " and ");
//        System.out.print(test1.ch);
//    }
//
//    public void fun(String str, char ch[]) {
//        str = "world";
//        ch[0] = 'd';
//    }

//    public static void main(String[] args) {
//        double a = 5.3e12;
//        float b = 11.1f;
//        int c = 0;
//        double d = 3;
//    }

//    public static void main(String[] args) {
//        float t = 5.1f;
//        int i = (byte)t;
//    }

//    private static int j = 0;
//
//    private static Boolean methodB(int k) {
//        j += k;
//        return true;
//    }
//
//    public static void methodA(int i) {
//        boolean b;
//        b = i < 10 | methodB(4);
//        b = i < 10 || methodB(8);
//
//    }
//
//    public static void main(String args[]) {
//        methodA(0);
//        System.out.println(j);
//    }

//    public static void main(String args[]) {
//        System.out.println(14^3);
//        System.out.println(true | false);
//    }

//    PreparedStatement preparedStatement;
//    CallableStatement callableStatement;
//    BufferedInputStream bufferedInputStream;
//
//    public static String sRet = "";
//
//    public static void func(int i) {
//        try {
//            if (i % 2 == 0) {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            sRet += "0";
//            return;
//        } finally {
//            sRet += "1";
//        }
//        sRet += "2";
//    }
//
//    public static void main(String[] args) {
//        func(1);
//        func(2);
//        System.out.println(sRet);
//    }

//    public static Main t1 = new Main();
//
//    static {
//        System.out.println("blockB");
//    }
//
//    {
//        System.out.println("blockA");
//    }
//
//    public static void main(String[] args) {
//        Main t2 = new Main();
//    }

//    public static void main(String[] args) throws IOException {
//        List<String> arrayList = new ArrayList<>();
//        BufferedReader in = new BufferedReader(new FileReader("/Users/lilei/GitHub/lilei11981/中华人民共和国民法典.md"));
//        String fileContent;
//        while ((fileContent = in.readLine()) != null) {
//            arrayList.add(fileContent);
//        }
//        in.close();
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i).length() > 3) {
//                if ("第".equals(arrayList.get(i).substring(3, 4)) && "编".equals(arrayList.get(i).substring(5, 6))) {
//                    arrayList.set(i, arrayList.get(i).substring(1));
//                    System.out.println(arrayList.get(i));
//                }
//                if ("第".equals(arrayList.get(i).substring(0, 1)) && "章".equals(arrayList.get(i).substring(4, 5))) {
//                    arrayList.set(i, "### " + arrayList.get(i));
//                }
//                if ("第".equals(arrayList.get(i).substring(0, 1)) && "节".equals(arrayList.get(i).substring(4, 5))) {
//                    arrayList.set(i, "#### " + arrayList.get(i));
//                }
//            }
//        }
//        BufferedWriter out = new BufferedWriter(new FileWriter("/Users/lilei/GitHub/lilei11981/中华人民共和国民法典.md"));
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String output : arrayList) {
//            stringBuilder.append(output).append("\n");
//        }
//        out.write(stringBuilder.toString());
//        out.close();
//    }

//    public static void main(String[] args) {
//        Collection<?>[] collections =
//                {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
//        Super subToSuper = new Sub();
//        for (Collection<?> collection : collections) {
//            System.out.println(Super.getType(collection));
//        }
//    }
//
//    abstract static class Super {
//        public static String getType(Collection<?> collection) {
//            return "Super:collection";
//        }
//
//        public static String getType(List<?> list) {
//            return "Super:list";
//        }
//
//        public static String getType(Set<?> set) {
//            return "Super:set";
//        }
//
//        public String getType(ArrayList<?> list) {
//            return "Super:arrayList";
//        }
//
//        public String getType(HashSet<?> set) {
//            return "Super:hashSet";
//        }
//    }
//
//    static class Sub extends Super {
//        public static String getType(Collection<?> collection) {
//            return "Sub";
//        }
//    }

//    public static void main(String[] args) {
//        String a = new String("myString");
//        String b = "myString";
//        String c = "my" + "String";
//        String d = c;
//        System.out.print(a == b);
//        System.out.print(a == c);
//        System.out.print(b == c);
//        System.out.print(b == d);
//
//        Integer s=new Integer(9);
//        Integer t=new Integer(9);
//        Long u=new Long(9);
////        System.out.println(s==u);
////        System.out.println(s==t);
//        System.out.println(s.equals(t));
//        System.out.println(s.equals(9));
//        System.out.println(s.equals(new Integer(9)));
//        String str = "Hello";
//        System.out.println(str+=9);
//        System.out.println(str == "9");
//    }

//    public Main() {
//        System.out.println("构造方法调用");
//    }
//
//    public static void cook() {
//        System.out.println("一盘菜");
//    }
//
//    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Main main1 = (Main) Class.forName("com.company.basic.Main").newInstance();
//        Constructor constructor = Main.class.getConstructor();
//        Main main2 = (Main) constructor.newInstance();
//    }

//    public static void main(String[] args) {
//        Integer a=new Integer(9);
//        Integer b = new Integer(9);
//        Integer c = 9;
//        Integer d = 9;
//        Integer e = 999;
//        Integer f = 999;
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        System.out.println(c==d);
//        System.out.println(c.equals(d));
//        System.out.println(e==f);
//        System.out.println(e.equals(f));
//    }

//    public static void main(String[] args) {
//        try {
//            System.out.println(1);
//        } catch (RuntimeException e) {
//            System.out.println(2);
//        } catch (Exception e) {
//            System.out.println(4);
//        } finally {
//            System.exit(0);
//            System.out.println(3);
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("10.129.34.192",8080);
//    }

//    String str = new String("hello");
//    char[] ch = {'a', 'b'};
//
//    public static void main(String args[]) {
//        Main ex = new Main();
//        ex.change(ex.str, ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
//    }
//
//    public void change(String str, char ch[]) {
//        str = "test ok";
//        ch[0] = 'c';
//    }

//    public static void main(String[] args) {
//        int x = -5;
//        int y = -12;
//        System.out.println(y % x);
//    }

//    static int x = 10;
//
//    static {
//        x += 5;
//    }
//
//    static {
//        x /= 3;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("x = " + Main.x);
//    }


//    public static void main(String[] args) {
//        String str = new String("hello");
//        if (str == "hello") {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }

//    public Main(int a) {
//        System.out.println(a);
//    }
//
//    public Main() {
//        this(0);
//    }
//
//    public static void main(String[] args) {
//        Main main1 = new Main();
//        Main main2 = new Main(0);
//    }

//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.print("2");
//            }
//        });
//        t.start();
//
//        t.join();
//        System.out.print("1");
//    }

//    private static int a;
//
//    private static void f() {
//        System.out.println(1);
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(Main.a);
//        Main.f();
//    }


//    public static void main(String[] args) {
//        String a = "https://www.tensorflow.org/";
//        System.out.println(a.replaceAll("[a-z]+://[a-z.]+/", "1"));
//        System.out.println(a.replaceAll("https[:/]+[/]www[.]tensorflow[.]org[/]","2"));
//        System.out.println(a.replaceAll("[htps]+://www.tensorflow.org/","3"));
//        System.out.println(a.replaceAll("[a-zA-Z.:/]+","4"));
//    }

//    public static void main(String[] args) {
////        String content = "I am noob from runoob.com.";
////        String pattern = ".*runoob.*";
//
//        String content = "A21";
////        String content = "1";
//        String pattern = "[ADWS]\\d\\d";
//
////        String content = "this    is text";
////        String pattern = "this\\s+is\\stext";
//
////        String content = "24343.5667";
////        String pattern = "^\\d+(\\.\\d+)?";
//
//        System.out.println(Pattern.matches(pattern, content));
//    }

//    public static void main(String[] args) {
//        byte a = (byte) 128;
//        int b = 128;
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            String[] c = a.split(";");
//            String pattern = "[ADWS]\\d+";
//            int[] d = {0, 0};
//            ArrayList<String> arrayList = new ArrayList<>();
//            for (String s : c) {
//                if (Pattern.matches(pattern, s)) {
//                    arrayList.add(s);
//                }
//            }
//            for (String e : arrayList) {
//                switch (e.substring(0, 1)) {
//                    case "A":
//                        d[0] -= Integer.parseInt(e.substring(1));
//                        break;
//                    case "D":
//                        d[0] += Integer.parseInt(e.substring(1));
//                        break;
//                    case "W":
//                        d[1] += Integer.parseInt(e.substring(1));
//                        break;
//                    default:
//                    case "S":
//                        d[1] -= Integer.parseInt(e.substring(1));
//                        break;
//                }
//            }
//            System.out.println(d[0] + "," + d[1]);
//        }
//    }
    // A37;S1;S72;S41;W21;W32;A45;A98;D97;D69;W57;W11;S41;S0;S24;S83;A75;W77;S32;D18;A24;D20;A65;D95;S18;W56;A84;W30;S3;S50;D64;S84;D82;A86;A36;S85;S94;W64;W62;A12;W12;S84;W29;A52;A73;W55;W71;D43;D76;D49;W19;S56;W63;W56;A68;D68;D40;A48;W5;A12;S84;A2;S44;A93;D51;D64;S4;W32;W27;W15;W70;A47;S77;S88;A25;D51;D8;A34;A71;A5;D83;S36;S72;A34;D46;S29;S5;W57;W16;S42;A23;A30;D43;S0;W62;A34;D60;D31;W89;W91;S87;A15;S15;S18;W83;S82;W87;W73;D42;A92;D48;A65;D36;A11;W50;W38;W2;A0;D65;W29;D56;S64;D31;W8;A56;A45;A56;W54;A97;D97;A90;S72;A95;A89;S78;A35;A31;W68;W42;A73;S73;A24;S28;D69;W53;S54;D80;D27;W24;S86;A17;A36;A41;A1;D19;S53;S96;A31;A52;A63;A18;S54;A35;A82;W95;D8;W48;S75;W11;S9;W60;D68;A92;A96;W32;S30;D26;W61;S0;D10;S89;W31;D4;W37;S49;D79;S56;A87;S61;A61;D96;W86;S81;D50;S91;A68;A82;A36;A16;S6;W25;D76;D94;A20;A37;D91;S58;A54;S77;S27;A35;S6;A88;A14;S72;D12;A95;W93;W1;A73;A55;A13;S55;W43;W6;D37;W19;W79;W56;S26;A36;W85;A6;W94;A54;A12;S0;A13;D18;W14;A52;W44;D83;W17;W73;A72;D56;A63;S14;A64;A84;S54;D67;A92;D46;A51;D99;W42;W2;D22;S14;D96;A79;A41;S65;D8;S41;D30;S61;D77;A52;W2;S11;W26;D47;A65;S11;D2;W98;A30;D36;W26;S41;S71;D65;D76;D28;D25;S24;S24;S58;W13;D80;A58;S64;S52;W54;S51;S40;W20;D54;W13;A7;D37;D93;A74;D24;S0;A5;W52;D86;D22;W22;S13;D56;S99;D67;S34;S5;D47;D87;D41;S15;S66;W10;D55;A63;S57;W12;S96;W28;W96;S33;D70;D75;S20;W76;D83;A34;W29;S24;A7;W11;W81;S85;W1;W71;W73;D20;A62;S2;W43;S22;D18;W35;A15;S72;W12;S12;D93;S37;S55;D33;D52;S85;W97;A88;W47;A17;A50;A40;D9;A0;D13;A16;S87;S61;D12;D8;D69;S59;S71;A7;W99;D81;W6;D48;A92;D23;D47;W37;W30;A5;S96;D28;A13;D53;D17;D9;D58;S78;S26;W17;D88;A11;W87;W94;D45;D60;W52;S71;S71;D35;D60;W60;D73;A42;D57;A25;W87;A4;W74;W70;A50;S22;S63;W15;A62;S70;A15;W58;D19;D56;A80;S95;S57;D75;A16;S8;D88;S33;S94;A43;D97;S11;D53;W55;S52;W59;S92;D39;D40;W34;W33;D52;D19;S87;A21;D94;W5;W42;A50;D27;A29;D47;W12;D5;S70;D47;S16;W52;W30;D2;A48;S1;D68;W82;A47;S84;S56;S60;S14;W64;W8;A41;W8;S4;D80;A49;D72;
    //对应输出应该为:
    //689,-852
    //你的输出为:
    //675,-852

    //W49;W92;A84;W33;A32;A52;D97;S14;S33;D79;A14;W25;D97;D21;D31;A66;S67;S4;A59;S62;W40;S26;S65;A58;S17;A67;D48;W23;D68;S99;S97;W63;W27;D12;D83;W8;S3;W6;A88;D23;W30;S91;D58;W74;D45;W3;D19;S72;D8;S79;S76;S49;W16;A29;W93;W99;W92;D82;A10;A4;D25;A90;D83;W45;W20;S68;D59;S48;A18;S0;W24;S48;W75;A39;W29;S28;W76;W78;D94;A57;A5;D51;S61;A39;W77;S70;A2;D8;S58;D51;S86;W30;A27;S62;D56;A51;D0;S58;W34;S39;A64;A68;A96;D37;S91;S16;A17;D35;A85;W88;S57;S61;A28;D12;A87;S39;A85;W22;D65;D72;A5;A78;A59;D75;D57;S66;A55;D84;D72;W87;S46;W64;D49;S46;W34;D60;S39;A30;W86;D20;W93;D25;W44;W86;A16;D4;A86;S86;S27;W7;W89;W93;S17;S39;W66;W72;D81;W93;A88;D46;S57;W45;S84;S57;D27;A11;D54;S8;W15;A50;A69;A4;D19;D69;A3;A28;D47;W18;A39;D47;W14;D77;W59;S84;A32;D56;S16;D99;A33;A51;A24;D65;W37;D98;A13;W6;D94;D28;A12;S18;W40;S23;W76;D6;S40;D26;W97;W7;W90;W75;S12;A89;S46;S36;D96;A49;A73;S53;D84;A87;D75;D48;W84;S14;W65;W79;W51;S9;S77;D51;S76;W16;W77;A90;S96;D78;S7;W71;D17;W10;W4;D96;S58;A88;S89;D41;W47;W13;S75;S85;W63;W87;S19;S80;W92;W95;W73;D43;D35;W60;S31;D72;A73;W90;S51;A55;S82;W81;S56;W83;W41;A77;S37;D63;A72;D44;W81;S26;S53;W32;A24;S90;S83;W34;D10;S53;D69;A87;W84;S32;D72;S63;D97;W27;D23;D25;D18;W86;D74;D42;A31;S1;D98;D76;S46;D67;W94;S6;S97;S40;W71;W12;D62;W57;A92;W59;W59;D15;A16;D21;S33;S45;S83;D89;W77;A93;S60;S6;W24;S93;D69;D79;S13;S8;W63;D99;S36;D35;W53;S5;S44;S19;D76;S14;A86;A86;W43;W65;D20;S19;W66;A54;A98;A17;D2;W98;W2;D77;A90;S8;S55;S67;W88;W19;S59;D9;S75;S56;W75;W54;A61;W47;S19;D67;S39;D55;S6;A89;A5;W58;W7;W88;W92;D85;S32;S32;A27;S42;D52;A55;S26;D27;W40;D76;A55;D38;W13;A71;D79;W59;A76;A33;A12;D1;D63;W63;W62;D7;W48;A84;D27;A80;D42;D27;D49;D4;D71;W90;W39;D24;W71;D16;S1;W88;W88;D25;D66;S39;S43;A99;A92;W19;W20;A90;A31;A6;A79;D4;D80;A77;D71;D36;S64;
    //对应输出应该为:
    //1207,1244
    //你的输出为:
    //空.请检查一下你的代码，有没有循环输入处理多个case.点击查看如何处理多个case

//    public static void main(String[] args) {
//        String content = "15802162331";
//        String pattern = "^158\\d{8}";
//        System.out.println(Pattern.matches(pattern,content));
//    }

//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(12);
//        Class<? extends ArrayList> clazz = list.getClass();
//        Method add = clazz.getDeclaredMethod("add",Object.class);
//        add.invoke(list,"a");
//        System.out.println(list);
//        System.out.println(Arrays.toString(list.toArray()));
//    }

//    public static <E> void printArray(E[] inputArray) {
//        for (E element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        String[] a = {"a","b","c"};
//        Integer[] b = {1, 2, 3, 4};
//        Float[] c = {1.1f,2.3f,3.4f};
//        Character[] d = {'q','w'};
//        printArray(a);
//        printArray(b);
//        printArray(c);
//        printArray(d);
//    }

//    public static void main(String[] args) {
//        int a = 3;
//        int b = 3;
//        String c = "1";
//        String d = "1";
//        System.out.println(c.equals(d));
//        System.out.println();
//    }


//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //这样调用 add 方法只能存储整形，因为泛型类型的实例为 Integer
//        list.add(1);
//        // 通过反射添加其它类型元素
//        list.getClass().getMethod("add", Object.class).invoke(list, "asd");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }

//    public static void main(String[] args) {
//        String a = "123";
//        String b = new String("123");
//        System.out.println(a.equals(b));
//        System.out.println(a == b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//    }


//    public static void main(String[] args) {
//        byte a = (byte)129;
//        char b = (char)65;
//        System.out.println(a);
//        System.out.println(b);
//    }

//    public static void main(String[] args) {
//
//        String content = "252";
//        String pattern = "(254|252|248|240|224|192|128|0)";
//        System.out.println(Pattern.matches(pattern,content));
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = 0, b = 0, c = 0, d = 0, e = 0, err = 0, pri = 0;
//        String string;
//        while (scanner.hasNextLine()) {
//            string = scanner.nextLine();
//            if ("".equals(string)) {
//                break;
//            }
//            String[] strings = string.split("~");
//            if (checkMask(strings[1])) {
//                if (checkIp(strings[0])) {
//                    String[] ip = strings[0].split("\\.");
//                    int i = Integer.parseInt(ip[0]);
//                    if (i >= 1 && i <= 126) {
//                        a++;
//                        if (i == 10) {
//                            pri++;
//                        }
//                    }
//                    if (i >= 128 && i <= 191) {
//                        b++;
//                        if (i == 172 && Integer.parseInt(ip[1]) >= 16 && Integer.parseInt(ip[1]) <= 31) {
//                            pri++;
//                        }
//                    }
//                    if (i >= 192 && i <= 223) {
//                        c++;
//                        if (i == 192 && Integer.parseInt(ip[1]) == 168) {
//                            pri++;
//                        }
//                    }
//                    if (i >= 224 && i <= 239) {
//                        d++;
//                    }
//                    if (i >= 240 && i <= 255) {
//                        e++;
//                    }
//                } else {
//                    err++;
//                }
//            } else {
//                err++;
//            }
//        }
//        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + err + " " + pri);
//        scanner.close();
//    }
//
//    private static boolean checkIp(String ip) {
//        String[] ipArray = ip.split("\\.");
//        if (ipArray.length == 4) {
//            for (int i = 0; i < 4; i++) {
//                try {
//                    if (Integer.parseInt(ipArray[i]) < 0 || Integer.parseInt(ipArray[i]) > 255) {
//                        return false;
//                    }
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private static boolean checkMask(String mask) {
//        String[] maskArray = mask.split("\\.");
//        String pattern = "(254|252|248|240|224|192|128|0)";
//        if ("255".equals(maskArray[0])) {
//            if ("255".equals(maskArray[1])) {
//                if ("255".equals(maskArray[2])) {
//                    return (Pattern.matches(pattern, maskArray[3]));
//                } else if (Pattern.matches(pattern, maskArray[2])) {
//                    return ("0".equals(maskArray[3]));
//                }
//            } else if (Pattern.matches(pattern, maskArray[1])) {
//                return ("0".equals(maskArray[2]) && "0".equals(maskArray[3]));
//            }
//        } else if (Pattern.matches(pattern, maskArray[0])) {
//            return ("0".equals(maskArray[1]) && "0".equals(maskArray[2]) && "0".equals(maskArray[3]));
//        }
//        return false;
//    }


    // 206.76.161.30~255.0.0.0 159.70.213.68~255.0.0.0 181.131.118.0~255.255.255.0 80.164.71.44~255.255.255.255 12.208.232.42~255.255.0.0 150.24.121.174~255.0.102.0 131.221.165.68~255.0.0.0 160.126.59.101~255.0.75.0 236.239.205.137~255.255.0.0 89.124.33.74~255.0.0.159 233.174.151.221~255.255.0.0 218.140.130.246~255.255.255.255 13.13.219.143~255.0.0.0 232.95.224.67~255.255.255.255 2.108.39.131~255.0.0.0 161.217.200.192~255.0.0.0 123.170.177.162~255.0.0.0 239.64.91.24~255.0.0.0 241.199.108.210~255.255.255.0 117.0.169.232~255.255.255.255 122.49.165.60~255.255.242.255 71.148.13.251~255.0.0.32 199.22.216.173~255.254.27.0 58.24.55.101~255.132.255.0 68.128.113.136~255.0.0.0 197.234.247.46~255.255.255.0 79.22.71.93~255.255.0.0 250.217.239.76~255.0.8.0 153.96.7.235~255.255.0.0 237.173.48.19~255.0.0.0 140.48.84.23~255.255.255.0 107.222.50.243~255.0.0.0 189.224.126.176~255.255.255.0 111.9.155.102~255.0.0.0 117.4.142.205~255.255.255.255 59.0.177.100~255.255.0.0 60.70.81.248~255.255.255.255 72.85.2.100~255.255.125.0 74.15.130.23~255.0.0.0 37.51.172.97~255.255.255.149 51.58.149.175~255.0.0.0 76.106.99.1~255.255.0.0 198.102.96.87~255.255.0.0 97.170.76.38~255.0.214.0 42.115.213.173~255.255.0.0 95.115.180.128~255.255.0.0 192.240.88.125~255.0.0.47 148.36.118.39~255.0.0.0 237.211.17.109~255.255.255.255 161.230.133.200~255.0.0.0 163.139.243.139~255.0.0.0 249.174.134.36~255.255.255.0 148.64.179.63~255.0.0.0 59.156.109.132~255.0.0.0 42.50.113.7~255.0.0.0 225.95.158.160~255.0.0.0 133.17.112.129~255.0.152.0 212.183.133.49~255.255.0.0 183.12.213.169~255.255.255.255 7.144.20.194~255.255.0.0 106.46.24.252~255.255.255.255 51.181.112.115~255.0.0.0 47.243.149.186~255.255.255.0 174.11.159.234~255.0.0.0 8.83.231.207~255.0.0.0 212.211.51.229~255.0.0.0 6.13.59.212~255.255.119.0 131.151.60.159~255.0.0.0 47.21.57.12~255.0.0.0 136.242.238.159~255.0.0.0 249.200.157.157~255.255.255.0 150.2.21.239~255.0.0.0 26.100.58.90~255.226.0.0 7.167.169.193~255.255.255.0 48.49.16.45~255.132.0.0 67.244.5.142~255.0.189.0 239.170.232.59~255.0.0.0 223.138.166.166~255.0.0.103 199.65.124.179~255.255.0.0 231.121.177.81~255.255.186.193 30.247.220.230~255.255.255.0 227.72.33.192~255.255.255.255 126.189.96.104~255.255.167.255


//    public static void main(String[] args) {
//        String a = "206.76.161.30~255.0.0.0 159.70.213.68~255.0.0.0 181.131.118.0~255.255.255.0 80.164.71.44~255.255.255.255 12.208.232.42~255.255.0.0 150.24.121.174~255.0.102.0 131.221.165.68~255.0.0.0 160.126.59.101~255.0.75.0 236.239.205.137~255.255.0.0 89.124.33.74~255.0.0.159 233.174.151.221~255.255.0.0 218.140.130.246~255.255.255.255 13.13.219.143~255.0.0.0 232.95.224.67~255.255.255.255 2.108.39.131~255.0.0.0 161.217.200.192~255.0.0.0 123.170.177.162~255.0.0.0 239.64.91.24~255.0.0.0 241.199.108.210~255.255.255.0 117.0.169.232~255.255.255.255 122.49.165.60~255.255.242.255 71.148.13.251~255.0.0.32 199.22.216.173~255.254.27.0 58.24.55.101~255.132.255.0 68.128.113.136~255.0.0.0 197.234.247.46~255.255.255.0 79.22.71.93~255.255.0.0 250.217.239.76~255.0.8.0 153.96.7.235~255.255.0.0 237.173.48.19~255.0.0.0 140.48.84.23~255.255.255.0 107.222.50.243~255.0.0.0 189.224.126.176~255.255.255.0 111.9.155.102~255.0.0.0 117.4.142.205~255.255.255.255 59.0.177.100~255.255.0.0 60.70.81.248~255.255.255.255 72.85.2.100~255.255.125.0 74.15.130.23~255.0.0.0 37.51.172.97~255.255.255.149 51.58.149.175~255.0.0.0 76.106.99.1~255.255.0.0 198.102.96.87~255.255.0.0 97.170.76.38~255.0.214.0 42.115.213.173~255.255.0.0 95.115.180.128~255.255.0.0 192.240.88.125~255.0.0.47 148.36.118.39~255.0.0.0 237.211.17.109~255.255.255.255 161.230.133.200~255.0.0.0 163.139.243.139~255.0.0.0 249.174.134.36~255.255.255.0 148.64.179.63~255.0.0.0 59.156.109.132~255.0.0.0 42.50.113.7~255.0.0.0 225.95.158.160~255.0.0.0 133.17.112.129~255.0.152.0 212.183.133.49~255.255.0.0 183.12.213.169~255.255.255.255 7.144.20.194~255.255.0.0 106.46.24.252~255.255.255.255 51.181.112.115~255.0.0.0 47.243.149.186~255.255.255.0 174.11.159.234~255.0.0.0 8.83.231.207~255.0.0.0 212.211.51.229~255.0.0.0 6.13.59.212~255.255.119.0 131.151.60.159~255.0.0.0 47.21.57.12~255.0.0.0 136.242.238.159~255.0.0.0 249.200.157.157~255.255.255.0 150.2.21.239~255.0.0.0 26.100.58.90~255.226.0.0 7.167.169.193~255.255.255.0 48.49.16.45~255.132.0.0 67.244.5.142~255.0.189.0 239.170.232.59~255.0.0.0 223.138.166.166~255.0.0.103 199.65.124.179~255.255.0.0 231.121.177.81~255.255.186.193 30.247.220.230~255.255.255.0 227.72.33.192~255.255.255.255 126.189.96.104~255.255.167.255";
//        String[] b = a.split(" ");
//        for (String c : b) {
//            System.out.println(c);
//        }
//    }

    // /Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/tools.jar:/Users/lilei/IdeaProjects/luckymoney/target/classes:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.2.1.RELEASE/spring-boot-starter-web-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter/2.2.1.RELEASE/spring-boot-starter-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot/2.2.1.RELEASE/spring-boot-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.2.1.RELEASE/spring-boot-autoconfigure-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.2.1.RELEASE/spring-boot-starter-logging-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/lilei/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/lilei/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.12.1/log4j-to-slf4j-2.12.1.jar:/Users/lilei/.m2/repository/org/apache/logging/log4j/log4j-api/2.12.1/log4j-api-2.12.1.jar:/Users/lilei/.m2/repository/org/slf4j/jul-to-slf4j/1.7.29/jul-to-slf4j-1.7.29.jar:/Users/lilei/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/lilei/.m2/repository/org/yaml/snakeyaml/1.25/snakeyaml-1.25.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.2.1.RELEASE/spring-boot-starter-json-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.10.0/jackson-databind-2.10.0.jar:/Users/lilei/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.10.0/jackson-annotations-2.10.0.jar:/Users/lilei/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.10.0/jackson-core-2.10.0.jar:/Users/lilei/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.10.0/jackson-datatype-jdk8-2.10.0.jar:/Users/lilei/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.10.0/jackson-datatype-jsr310-2.10.0.jar:/Users/lilei/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.10.0/jackson-module-parameter-names-2.10.0.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.2.1.RELEASE/spring-boot-starter-tomcat-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.27/tomcat-embed-core-9.0.27.jar:/Users/lilei/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.27/tomcat-embed-el-9.0.27.jar:/Users/lilei/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.27/tomcat-embed-websocket-9.0.27.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.2.1.RELEASE/spring-boot-starter-validation-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.1/jakarta.validation-api-2.0.1.jar:/Users/lilei/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.18.Final/hibernate-validator-6.0.18.Final.jar:/Users/lilei/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:/Users/lilei/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/Users/lilei/.m2/repository/org/springframework/spring-web/5.2.1.RELEASE/spring-web-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-webmvc/5.2.1.RELEASE/spring-webmvc-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-aop/5.2.1.RELEASE/spring-aop-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-context/5.2.1.RELEASE/spring-context-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-expression/5.2.1.RELEASE/spring-expression-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/apache/httpcomponents/httpclient/4.5.12/httpclient-4.5.12.jar:/Users/lilei/.m2/repository/org/apache/httpcomponents/httpcore/4.4.12/httpcore-4.4.12.jar:/Users/lilei/.m2/repository/commons-codec/commons-codec/1.13/commons-codec-1.13.jar:/Users/lilei/.m2/repository/org/projectlombok/lombok/1.18.10/lombok-1.18.10.jar:/Users/lilei/.m2/repository/com/alibaba/fastjson/1.2.47/fastjson-1.2.47.jar:/Users/lilei/.m2/repository/io/swagger/swagger-annotations/1.5.9/swagger-annotations-1.5.9.jar:/Users/lilei/.m2/repository/javax/persistence/javax.persistence-api/2.2/javax.persistence-api-2.2.jar:/Users/lilei/.m2/repository/org/springframework/data/spring-data-commons/2.0.8.RELEASE/spring-data-commons-2.0.8.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-core/5.2.1.RELEASE/spring-core-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-jcl/5.2.1.RELEASE/spring-jcl-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-beans/5.2.1.RELEASE/spring-beans-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/slf4j/slf4j-api/1.7.29/slf4j-api-1.7.29.jar:/Users/lilei/.m2/repository/org/mybatis/mybatis/3.5.3/mybatis-3.5.3.jar:/Users/lilei/.m2/repository/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar:/Users/lilei/.m2/repository/mysql/mysql-connector-java/5.1.40/mysql-connector-java-5.1.40.jar:/Users/lilei/.m2/repository/org/mybatis/spring/boot/mybatis-spring-boot-starter/1.3.2/mybatis-spring-boot-starter-1.3.2.jar:/Users/lilei/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.2.1.RELEASE/spring-boot-starter-jdbc-2.2.1.RELEASE.jar:/Users/lilei/.m2/repository/com/zaxxer/HikariCP/3.4.1/HikariCP-3.4.1.jar:/Users/lilei/.m2/repository/org/springframework/spring-jdbc/5.2.1.RELEASE/spring-jdbc-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/springframework/spring-tx/5.2.1.RELEASE/spring-tx-5.2.1.RELEASE.jar:/Users/lilei/.m2/repository/org/mybatis/spring/boot/mybatis-spring-boot-autoconfigure/1.3.2/mybatis-spring-boot-autoconfigure-1.3.2.jar:/Users/lilei/.m2/repository/org/mybatis/mybatis-spring/1.3.2/mybatis-spring-1.3.2.jar com.company.basic.Main
    //206.76.161.30~255.0.0.0
    //159.70.213.68~255.0.0.0
    //181.131.118.0~255.255.255.0
    //80.164.71.44~255.255.255.255
    //12.208.232.42~255.255.0.0
    //150.24.121.174~255.0.102.0
    //131.221.165.68~255.0.0.0
    //160.126.59.101~255.0.75.0
    //236.239.205.137~255.255.0.0
    //89.124.33.74~255.0.0.159
    //233.174.151.221~255.255.0.0
    //218.140.130.246~255.255.255.255
    //13.13.219.143~255.0.0.0
    //232.95.224.67~255.255.255.255
    //2.108.39.131~255.0.0.0
    //161.217.200.192~255.0.0.0
    //123.170.177.162~255.0.0.0
    //239.64.91.24~255.0.0.0
    //241.199.108.210~255.255.255.0
    //117.0.169.232~255.255.255.255
    //122.49.165.60~255.255.242.255
    //71.148.13.251~255.0.0.32
    //199.22.216.173~255.254.27.0
    //58.24.55.101~255.132.255.0
    //68.128.113.136~255.0.0.0
    //197.234.247.46~255.255.255.0
    //79.22.71.93~255.255.0.0
    //250.217.239.76~255.0.8.0
    //153.96.7.235~255.255.0.0
    //237.173.48.19~255.0.0.0
    //140.48.84.23~255.255.255.0
    //107.222.50.243~255.0.0.0
    //189.224.126.176~255.255.255.0
    //111.9.155.102~255.0.0.0
    //117.4.142.205~255.255.255.255
    //59.0.177.100~255.255.0.0
    //60.70.81.248~255.255.255.255
    //72.85.2.100~255.255.125.0
    //74.15.130.23~255.0.0.0
    //37.51.172.97~255.255.255.149
    //51.58.149.175~255.0.0.0
    //76.106.99.1~255.255.0.0
    //198.102.96.87~255.255.0.0
    //97.170.76.38~255.0.214.0
    //42.115.213.173~255.255.0.0
    //95.115.180.128~255.255.0.0
    //192.240.88.125~255.0.0.47
    //148.36.118.39~255.0.0.0
    //237.211.17.109~255.255.255.255
    //161.230.133.200~255.0.0.0
    //163.139.243.139~255.0.0.0
    //249.174.134.36~255.255.255.0
    //148.64.179.63~255.0.0.0
    //59.156.109.132~255.0.0.0
    //42.50.113.7~255.0.0.0
    //225.95.158.160~255.0.0.0
    //133.17.112.129~255.0.152.0
    //212.183.133.49~255.255.0.0
    //183.12.213.169~255.255.255.255
    //7.144.20.194~255.255.0.0
    //106.46.24.252~255.255.255.255
    //51.181.112.115~255.0.0.0
    //47.243.149.186~255.255.255.0
    //174.11.159.234~255.0.0.0
    //8.83.231.207~255.0.0.0
    //212.211.51.229~255.0.0.0
    //6.13.59.212~255.255.119.0
    //131.151.60.159~255.0.0.0
    //47.21.57.12~255.0.0.0
    //136.242.238.159~255.0.0.0
    //249.200.157.157~255.255.255.0
    //150.2.21.239~255.0.0.0
    //26.100.58.90~255.226.0.0
    //7.167.169.193~255.255.255.0
    //48.49.16.45~255.132.0.0
    //67.244.5.142~255.0.189.0
    //239.170.232.59~255.0.0.0
    //223.138.166.166~255.0.0.103
    //199.65.124.179~255.255.0.0
    //231.121.177.81~255.255.186.193
    //30.247.220.230~255.255.255.0
    //227.72.33.192~255.255.255.255
    //126.189.96.104~255.255.167.255
    //
    //Process finished with exit code 0

//    public static void main(String[] args) {
//        BigInteger a = new BigInteger(String.valueOf(256));
//        BigInteger b = a.multiply(a).multiply(a).multiply(a);
//        BigInteger c = new BigInteger("2");
//        BigInteger d = c.pow(64);
//        System.out.println(b);
//        System.out.println(d);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            String[] b = a.split("\\s+");
//            int[] c = new int[4];
//            for (int i = 0; i < 4; i++) {
//                c[i] = transferToInt(b[i]);
//            }
//            if (c[0] == -1 || c[1] == -1 || c[2] == -1 || c[3] == -1) {
//                System.out.println("ERROR");
//                continue;
//            }
//            getAllComp(c);
//        }
//    }
//
//    private static int transferToInt(String a) {
//        int b;
//        switch (a.toUpperCase()) {
//            case "J":
//                b = 11;
//                break;
//            case "Q":
//                b = 12;
//                break;
//            case "K":
//                b = 13;
//                break;
//            case "A":
//                b = 1;
//                break;
//            case "JOKER":
//                b = -1;
//                break;
//            default:
//                b = Integer.parseInt(a);
//        }
//        return b;
//
//    }
//
//    private static String transferToString(int a) {
//        String b;
//        switch (a) {
//            case 11:
//                b = "J";
//                break;
//            case 12 :
//                b = "Q";
//                break;
//            case 13:
//                b = "K";
//                break;
//            case 1:
//                b = "A";
//                break;
//            default:
//                b = String.valueOf(a);
//        }
//        return b;
//    }
//
////    public static void main(String[] args) {
////        for (int i = 0; i < 64; i++) {
////            for (int j = 0; j < 3; j++) {
////                System.out.println(getAllSign()[i][j]);
////            }
////        }
////    }
//
//    private static void getAllComp(int[] c) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                for (int k = 0; k < 4; k++) {
//                    for (int l = 0; l < 4; l++) {
//                        if ((i != j) && (j != k) && k != l && (i != k) && (i != l) && (j!=l)) {
//                            char[][] allSign = getAllSign();
//                            for (char[] chars : allSign) {
//                                double sum = cal(c[i], c[j], chars[0]);
//                                sum = cal(sum, c[k], chars[1]);
//                                sum = cal(sum, c[l], chars[2]);
//                                if (Double.compare(sum, 24) == 0) {
//                                    String a = transferToString(c[i]);
//                                    String b = transferToString(c[j]);
//                                    String x = transferToString(c[k]);
//                                    String y = transferToString(c[l]);
//                                    System.out.println(a + chars[0] + b + chars[1] + x + chars[2] + y);
//                                    return;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("NONE");
//    }
//
//    private static char[] operations = {'+','-','*','/'};
//
//    private static char[][] getAllSign() {
//        char[][] chars = new char[64][3];
//        int w = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                for (int k = 0; k < 4; k++) {
//                    chars[w++] = new char[]{operations[i],operations[j],operations[k]};
//                }
//            }
//        }
//        return chars;
//    }
//
//    private static double cal(double a, double b, char c) {
//        double result = 0;
//        switch (c) {
//            case '+':
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '/':
//                result = a / b;
//                break;
//            default:
//                break;
//        }
//        return result;
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
//        while (sc.hasNextLine()) {
//            int i = 1;
//            String a = sc.nextLine();
//            if ("".equals(a)) {
//                break;
//            }
//            String[] b = a.split("\\s+");
//            String[] c = b[0].split("\\\\");
//            String filename = c[c.length - 1];
//            if (filename.length() > 16) {
//                filename = filename.substring(filename.length() - 16);
//            }
//            String key = filename + " " + b[1];
//            if (hashMap.containsKey(key)) {
//                i += hashMap.get(key);
//                hashMap.put(key, i);
//            } else {
//                hashMap.put(key, i);
//            }
//        }
//        int count = 0;
//        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
//            count++;
//            if (count > (hashMap.size() - 8)) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
//        }
//    }

//    public static void main(String[] args) {
//        LinkedHashMap<String,String> map = new LinkedHashMap();
//        map.put("1","2");
//        map.put("2","3");
//        map.put("1","3");
//        for (String key : map.keySet()) {
//            System.out.println(key+ " "  +map.get(key));
//        }
//    }

//    public static void main(String[] args) {
//        String a = "C:\\gtu\\vcy\\jk\\zwthkipl 636 G:\\rsle\\lsax\\yalcxu\\vwhysms 637 F:\\fzqz 640 E:\\lswb\\styce\\thjnbxdvg 645 F:\\up\\qflvvayylipvj 635 C:\\pivw\\rkd 644 E:\\tlkbjb\\pcvnvm\\qh\\fzqz 633 E:\\ezke\\xvrdkuesnjerakzhs 641 E:\\qflvvayylipvj 639 F:\\ybpxk 644 G:\\rfdr\\faxpyhyznsssbo 630 E:\\xktax\\osekgaqy 646 C:\\te 633 G:\\albed\\ffc\\jclzfq\\h 631 F:\\zsshil\\pkue\\mazocurlwufmkkrw 635 E:\\dmj\\uefo\\syabgm\\qflvvayylipvj 643 F:\\pgdiwvceluyzft 634 D:\\xiqck\\dta\\lnh 639 E:\\nu\\nz\\wwjpch\\fzqz 650 E:\\gfsahypjzwfglvou 644 G:\\qh\\thjnbxdvg 641 C:\\cp\\voause\\mf\\hebgpyzpyyybiywpv 632 E:\\de\\vet\\vdooytekbghohqz 631 E:\\cox\\pvg\\tlrlr 640 G:\\hkc\\fllkwmwlgiqahxbfs 638 E:\\apjnogffvkwnv 637 E:\\nldefh\\ar\\oqsb\\uyobrilaabapini 630 F:\\wgotle\\ar\\wgh\\hebgpyzpyyybiywpv 639 G:\\nrekjavm 634 C:\\mvngfg\\lfjnvz\\xvrdkuesnjerakzhs 634 F:\\exne\\vh\\kqh\\fzqz 641 F:\\lepvz 642 G:\\qg\\hcbh\\uknyte\\pgdiwvceluyzft 636 F:\\ho\\cn\\uyobrilaabapini 637 E:\\xbc\\fzqz 642 G:\\ju\\nmdd\\fzqz 643 G:\\lzpmdx\\rxp\\ybpxk 629 D:\\fc\\lnh 629 D:\\dsgvo\\zwthkipl 631 G:\\pujc\\cgorfjzkqmnjathbiip 640 G:\\vfhyp\\cs\\rrt 638 F:\\oteh\\ti\\urajfw\\tlrlr 636 C:\\crdp\\qwptjlorrmnv 642 D:\\kcl\\fqzs\\zlm\\pgdiwvceluyzft 640 G:\\faxpyhyznsssbo 639 D:\\swnhezhgdcwwbmkyqt 637 D:\\azo\\sry\\faxpyhyznsssbo 633 C:\\beqt\\eh\\dm\\dlhehjccfdgrrzyj 642 F:\\lepvz 635";
//        String[] b = a.split(" ");
//        for (int i = 0; i < b.length; i += 2) {
//            System.out.println(b[i] + " " + b[i + 1]);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String a = sc.nextLine();
//            System.out.println(verify(a));
//        }
//    }
//
//    private static String verify(String a) {
//        if (a.length() <= 8) {
//            return "NG";
//        }
//        char[] b = a.toCharArray();
//        int x = 0,y=0,z=0;
//        for (char c : b) {
//            if ((byte)c >= 48 && (byte)c <= 57) {
//                x++;
//            }
//            if ((byte)c >= 65 && (byte)c <= 90) {
//                y++;
//            }
//            if ((byte)c >=97 && (byte)c <= 122) {
//                z++;
//            }
//        }
//
//        if (!judgeTwoZero(x,y,z,b.length -x-y-z)) {
//            return "NG";
//        }
//
//        String d = "";
//
//        for (int i = 2; i < a.length(); i++) {
//            for (int j = 0; j < i; j++) {
//                d = a.substring(j,i);
//                if (d.length() > 2 && a.indexOf(d) !=j) {
//                    return "NG";
//                }
//            }
//        }
//        return "OK";
//    }
//
//    private static boolean judgeTwoZero(int a,int b,int c,int d) {
//        if (a==0 && b==0) {
//            return false;
//        } else if (a==0 && c==0) {
//            return false;
//        } else if (a==0 && d==0) {
//            return false;
//        } else if (b==0 && c==0) {
//            return false;
//        } else if (c==0 && d==0) {
//            return false;
//        } else {
//            return true;
//        }
//    }

//    public static void main(String[] args) {
//        char a = '0';
//        char b = '9';
//        char c = 'a';
//        char d = 'z';
//        char e = 'A';
//        char f = 'Z';
//        System.out.println((byte)a);;
//        System.out.println((byte)b);
//        System.out.println((byte)c);
//        System.out.println((byte)d);
//        System.out.println((byte)e);
//        System.out.println((byte)f);
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            if (a.length() <8) {
//                System.out.println("不安全");
//            }
//            char[] b = a.toCharArray();
//            int[] d = new int[4];
//            for (char c : b) {
//                if (c >= '0' && c <= '9') {
//                    System.out.println("数字"+c);
//                    d[0] = 1;
//                } else if (c>='A' && c<= 'Z') {
//                    System.out.println("大写"+c);
//                    d[1] = 1;
//                } else if (c>='a' && c <= 'z') {
//                    System.out.println("小写"+c);
//                    d[2] = 1;
//                } else {
//                    System.out.println("字符" + c);
//                    d[3] = 1;
//                }
//            }
//            if ((d[0] + d[1] + d[2] + d[3]) >= 3) {
//                System.out.println("安全");
//            } else {
//                System.out.println("不安全");
//            }
//        }
//    }

//    public static double getCubeRoot(double input) {
//        double output = 0d;
//        for (output = 0; output < input; output += 0.1) {
//            double a = output * output * output - input;
//            double b = ((output + 0.1)* (output + 0.1)* (output + 0.1)) -input;
//            if (a ==0) {
//                return output;
//            } else if (b==0) {
//                return output + 0.1;
//            } else if (a<0 && b>0) {
//                if ( b > -a) {
//                    return output;
//                } else {
//                    return output + 0.1;
//                }
//            }
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            int x = Integer.parseInt(a);
//            System.out.printf("%.1f\n" ,getCubeRoot(x));
//        }
//    }

    // %c        单个字符
    //
    //%d        十进制整数
    //
    //%f        十进制浮点数
    //
    //%o        八进制数
    //
    //%s        字符串
    //
    //%u        无符号十进制数
    //
    //%x        十六进制数
    //
    //%%        输出百分号%
    //
    //%b        输出逻辑状态值（true或false）
    //
    //printf的常用格式控制：
    //
    //% 0m.n格式字符
    //
    //下面对组成格式说明的各项加以说明：
    //
    // % 格式说明的起始符号，不可缺少。
    //
    // 0 有0表示指定空位填0,如省略表示指定空位不填。
    //
    // m.n  m指域宽，即对应的输出项在输出设备上所占的字符数。n指精度。用于说明输出的实型数的小数位数。未指定n时，隐含的精度为n=6位。例如：%.2f，m位默认位数，小数保留2位；%9.2f，意思是位数为9位，小数保留2位；%09.2f，意思是位数为9位，小数保留2位，位数不足的用0补齐。


//    public static void main(String[] args) throws Exception {
//        int a = 15;
//        float b = 3.141592653f;
//        System.out.printf("%o\n",a);
//        System.out.printf("%X\n",a);
//        System.out.printf("%x\n",a);
//        System.out.printf("%s\t %s\t %s\n",a,a,a);
//        System.out.printf("%1.2f",b);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String a = sc.nextLine();
//            char[] b = a.toCharArray();
//            for (char c: b) {
//                System.out.print(transferChar(c));
//            }
//            System.out.println();
//        }
//    }
//
//    private static char transferChar(char c) {
//        char a = '\u0000';
//        if (c >= 'A' && c <= 'Z') {
//            if(c =='Z') {
//                a = 'a';
//            } else {
//                a = (char)(c + 33);
//            }
//        } else {
//            switch (c) {
//                case 'a':
//                case 'b':
//                case 'c':
//                    a='2';
//                    break;
//                case 'd':
//                case 'e':
//                case 'f':
//                    a='3';
//                    break;
//                case 'g':
//                case 'h':
//                case 'i':
//                    a='4';
//                    break;
//                case 'j':
//                case 'k':
//                case 'l':
//                    a='5';
//                    break;
//                case 'm':
//                case 'n':
//                case 'o':
//                    a='6';
//                    break;
//                case 'p':
//                case 'q':
//                case 'r':
//                case 's':
//                    a='7';
//                    break;
//                case 't':
//                case 'u':
//                case 'v':
//                    a='8';
//                    break;
//                case 'w':
//                case 'x':
//                case 'y':
//                case 'z':
//                    a='9';
//                    break;
//                default:
//                    a=c;
//            }
//        }
//        return a;
//    }

//    public static void main(String[] args) {
//        String a = "1234567890";
//        int length = a.length();
//        int num = length / 4;
//        int count = length % 4;
//        if ((num == 1 && count==0) || num==0) {
//            System.out.println(outputBefore(a));
//        } else if (num == 1) {
//            System.out.println(outputBefore(a.substring(0,length-4)) + "万" + outputBefore(a.substring(length-4)));
//        } else if (num == 2) {
//            System.out.println(outputBefore(a.substring(0,length-8)) + "亿" + outputBefore(a.substring(length-8,length-4)) + "万" + outputBefore(a.substring(length-4)));
//        }
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            String[] b = a.split(" ");
//            String x = b[0];
//            String y = b[1];
//            char[] chars = x.toCharArray();
//            ArrayList<Character> arrayList = new ArrayList();
//            for (char c : chars) {
//                arrayList.add(c);
//            }
//            ArrayList<Character> arrayList1 = new ArrayList();
//            if ("1".equals(y)) {
//                for (int i = chars.length - 1; i >= 0; i--) {
//                    if (chars[i] >= 'a' && chars[i] <= 'z') {
//                        arrayList1.add(chars[i]);
//                    }
//                }
//                int num = 0;
//                for (int i = 0; i < chars.length; i++) {
//                    if (chars[i] >= 'a' && chars[i] <= 'z') {
//                        arrayList.set(i, arrayList1.get(num));
//                        num++;
//                    }
//                }
//                for (char c : arrayList) {
//                    System.out.print(c);
//                }
//            }
//            if ("2".equals(y)) {
//                for (int i = chars.length - 1; i >= 0; i--) {
//                    if (chars[i] >= 'A' && chars[i] <= 'Z') {
//                        arrayList1.add(chars[i]);
//                    }
//                }
//                int num = 0;
//                for (int i = 0; i < chars.length; i++) {
//                    if (chars[i] >= 'A' && chars[i] <= 'Z') {
//                        arrayList.set(i, arrayList1.get(num));
//                        num++;
//                    }
//                }
//                for (char c : arrayList) {
//                    System.out.print(c);
//                }
//            }
//
//            if ("3".equals(y)) {
//                for (int i = chars.length - 1; i >= 0; i--) {
//                    if (chars[i] >= '0' && chars[i] <= '9') {
//                        arrayList1.add(chars[i]);
//                    }
//                }
//                int num = 0;
//                for (int i = 0; i < chars.length; i++) {
//                    if (chars[i] >= '0' && chars[i] <= '9') {
//                        arrayList.set(i, arrayList1.get(num));
//                        num++;
//                    }
//                }
//                for (char c : arrayList) {
//                    System.out.print(c);
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        int c = scanner.nextInt();
//        String[] array1 = a.split(" ");
//        int[] x = new int[array1.length - 1];
//        for (int i = 0; i < array1.length - 1; i++) {
//            x[i] = Integer.parseInt(array1[i + 1]);
//        }
//        String[] array2 = b.split(" ");
//        int[] y = new int[array2.length - 1];
//        for (int i = 0; i < array2.length - 1; i++) {
//            y[i] = Integer.parseInt(array2[i + 1]);
//        }
//        Arrays.sort(x);
//        Arrays.sort(y);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < y.length; j++) {
//                arrayList.add(x[i] + y[j]);
//            }
//        }
//        Collections.sort(arrayList);
//        int sum = 0;
//        for (int i = 0; i < c; i++) {
//            sum += arrayList.get(i);
//        }
//        System.out.println(sum);
//    }

//    public static String regex = "([aeiouAEIOU])";
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String string = scanner.nextLine();
//        int flaw = Integer.parseInt(a);
//        String b = "";
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = 0; j <= i; j++) {
//                b = string.substring(j, i);
//                System.out.println(b);
//                if (b.length() > 0 && getFlaw(b) == flaw && isGood(b)) {
//                    arrayList.add(b.length());
//                }
//                if (getFlaw(b) == flaw && isGood(b)) {
//                    arrayList.add(a.length());
//                }
//            }
//        }
//
//        Collections.sort(arrayList);
//        if (arrayList.size() != 0) {
//            System.out.println(arrayList.get(arrayList.size() - 1));
//        } else {
//            System.out.println(0);
//        }
//    }
//
//    public static boolean isGood(String b) {
//        if (b.length() < 1) {
//            return false;
//        } else if (b.length() == 1) {
//            return Pattern.matches(regex, b.substring(0, 1));
//        } else {
//            return Pattern.matches(regex, b.substring(0, 1)) && Pattern.matches(regex, b.substring(b.length() - 1));
//        }
//    }
//
//    private static int getFlaw(String string) {
//        int num = 0;
//        String[] strings = string.split("");
//        for (int i = 0; i < strings.length; i++) {
//            if (!Pattern.matches(regex, strings[i])) {
//                num++;
//            }
//        }
//        return num;
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.next();
//            ArrayList<String> arrayList = new ArrayList<>();
//            for (int i = 0; i < a.length()+1; i++) {
//                for (int j = 0; j < a.length()+1; j++) {
//                    if (i<j) {
//                        arrayList.add(a.substring(i,j));
//                    }
//                }
//            }
//            System.out.println(arrayList + " " + arrayList.size());
//        }
//        scanner.close();
//    }


//    ActionListener actionListener;
//    Runnable runnable;
//    Comparable comparable;


//    public static void main(String[] args) {
//        String a = "Hello";
//        String b = "world";
//        System.out.println(a.charAt(1));
//        System.out.println(a.toUpperCase());
//        System.out.println(a.toLowerCase());
//        System.out.println(a.concat(b));
//        System.out.println(a.equals(b));
//        System.out.println((byte)'H');
//        System.out.println((byte)'w');
//        System.out.println(a.compareTo(b));
//        System.out.println(a.startsWith("He"));
//        System.out.println(b.endsWith("ld"));
//        System.out.println(a.indexOf('l'));
//        System.out.println(a.lastIndexOf('l'));
//        System.out.println(a.lastIndexOf("ll"));
//        System.out.println(a.replaceAll("ll", "oo"));
//        System.out.println(b.replace("orl","or"));
//        System.out.println(a.intern());
//        System.out.println();
//    }

//    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("hello");
//        stringBuffer.insert(0,"j");
//        System.out.println(stringBuffer);
//        stringBuffer.delete(0,1);
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.reverse());
//        System.out.println(stringBuffer.append(1));
//        synchronized (stringBuffer) {
//            System.out.println(stringBuffer.append(2));
//        }
//    }


//    public static void main(String[] args) {
//        String[] a = {"d","a","a","b","c"};
//        String[] c = Arrays.copyOf(a,5);
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(c));
//        Arrays.sort(c);
//        System.out.println(Arrays.equals(a, c));
//    }

//    public static void main(String[] args) {
//        byte a = 123;
//        short b = 1234;
//        int c = 12345;
//        short d = (short) 123456;
//        Byte e = new Byte("1");
//        Short s = new Short("1");
//        System.out.println(d);
//        System.out.println(a+b+c+d);
//    }


//    public static void main(String[] args) {
//        JDBCType a = JDBCType.BIGINT;
//        PreparedStatement preparedStatement;
//    }


//    public static void main(String[] args) {
//        for (int i = 1; i <= 13; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%2s * %-2s = %-3s ", j ,i ,i * j);
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        Integer a = 128;
//        Integer b = 128;
//        Integer c = 127;
//        Integer d = 127;
//        int e = 128;
//        int f = 128;
//        System.out.println(e==f);
//        System.out.println(c==d);
//        System.out.println(a==b);
//    }

//    public static void main(String[] args) {
//        int 已 = 1;
//        System.out.println(已);
//    }

//    private static String d = "123";
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.d);
//
//        String string = "371287893279833333333333333333333333333333333333333444444444ffffffffffffffffeeeeee55555555555";
//        String a = "null";
//        switch (a) {
//            case "null":
//                System.out.println("null");
//                break;
//            default:
//                System.out.println("default");
//        }
//    }


//    public static void main(String[] args) {
//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(a);
//        System.out.println(b);
//        String c = String.valueOf(a);
//        String d = String.valueOf(b);
//        Float x = Float.valueOf(c);
//        Float y = Float.valueOf(d);
//        System.out.println(x);
//        System.out.println(y);
//    }

//    public static void main(String[] args) {
//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        float diff = 1e-6f;
//        System.out.println(Math.abs(a - b) < diff);
//    }

//    public static void main(String[] args) {
//        BigDecimal a = new BigDecimal("1.0");
//        BigDecimal b = new BigDecimal("0.9");
//        BigDecimal c = new BigDecimal("0.8");
//
//        System.out.println(a.subtract(b).equals(b.subtract(c)));
//
//    }

//    public static void main(String[] args) {
//        BigDecimal a = new BigDecimal("2");
//        System.out.println(a.pow(16));
//    }

//    public static void main(String[] args) {
//        StringBuilder a = new StringBuilder("hello");
//        for (int i = 0; i < 65536; i++) {
//            a.append("world").append(i);
//        }
//        System.out.println(a);
//    }


//    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1");
//        arrayList.add("3");
//
//        List<String> list = arrayList.subList(1,2);
//        list.set(0,"2");
//        ArrayList<String> newList = (ArrayList<String>)list;
//        System.out.println(newList);
//        System.out.println(list);
//        arrayList.remove("1");
//        System.out.println(list);
//        System.out.println(arrayList);
//    }

//    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1");
//        arrayList.add("3");
//        String[] array = new String[arrayList.size()];
//        arrayList.toArray(array);
//        System.out.println(Arrays.toString(array));
//    }

//    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(null);
//        ArrayList arrayList1 = new ArrayList();
//        arrayList1.add(null);
//        arrayList.addAll(arrayList1);
//        System.out.println(arrayList);
//        System.out.println(Arrays.toString(arrayList.toArray()));
//    }

//    public static void main(String[] args) {
//        String[] a = new String[] {"a","b","c"};
//        List list = Arrays.asList(a);
//        System.out.println(list.get(0));
//    }

//    public static void main(String[] args) {
//        List<String> list = null;
//        List list1 = new ArrayList(10);
//        list1.add(new Object());
//        list1.add(new Integer(1));
//        System.out.println(list);
//        System.out.println(list1);
//    }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String string = iterator.next();
//            if ("a".equals(string)) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("a");
//        list1.add("b");
//        list1.add("ab");
//        list1.add("ba");
//        list1.removeIf("ab"::equals);
//        System.out.println(list1);
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("a");
//        list2.add("b");
//        for (String c:list2) {
//            if ("b".equals(c)) {
//                list2.remove(c);
//            }
//        }
//        System.out.println(list2);
//    }


//    public static void main(String[] args) {
//        HashMap<String,String> map = new HashMap<>(10);
//        for (int i = 0; i < 10; i++) {
//            map.put(String.valueOf(i),String.valueOf((char)('a' + i)));
//        }
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        for (Map.Entry<String,String> entry:map.entrySet()) {
//            list1.add(entry.getKey());
//            list2.add(entry.getValue());
//        }
//        System.out.println(map);
//        System.out.println(list1);
//        System.out.println(list2);
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Math.random());
//        }
//    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            System.out.println(random.nextInt());
//        }
//    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 500; i++) {
//            arrayList.add(random.nextInt(100));
//        }
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//    }

//    public static void main(String[] args) {
//        String pattern = "YYYY-MM-dd HH:mm:ss";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        System.out.println(simpleDateFormat.format(new Date()));
//    }

//    public static void main(String[] args) {
//        System.out.println(Instant.now());
//    }


//    public static void main(String[] args) {
//        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(10);
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//            System.out.println(linkedBlockingQueue.remainingCapacity()+" " + linkedBlockingQueue.size());
////            linkedBlockingQueue.add("" + i);
//            System.out.println(linkedBlockingQueue.offer(""+i));
//            System.out.println(i);
//        }
//
//        System.out.println(linkedBlockingQueue);
//
//        for (int i = 0; i < 20; i++) {
//            String a = linkedBlockingQueue.poll();
//            System.out.println(a);
//        }
//
//        System.out.println(linkedBlockingQueue);
//
//    }

//    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
////        for (int i = 0; i < 100; i++) {
////            stack.add("" + i);
//////            System.out.println(i);
////        }
////        System.out.println(stack);
////        System.out.println(stack.peek());
////
////        for (int i = 0; i < 100; i++) {
////            System.out.println(stack.pop());
////            System.out.println(stack);
////        }
//
//        for (int i = 0; i < 10; i++) {
//            stack.add(""+i);
////            System.out.println(stack.push("" + i));
////            System.out.println(stack);
//        }
//
//        System.out.println(stack.size());
//        System.out.println(stack);
//    }

//    public static void main(String[] args) {
//        Set<Integer> set1 = new HashSet<>();
//        Random random = new Random();
//        long a1 = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
//            set1.add(random.nextInt(10));
//        }
//        long b1 = System.currentTimeMillis();
//        System.out.println(b1-a1);
//        System.out.println(set1.size());
//
//        Set<Integer> set2 = new TreeSet<>();
//        long a2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
//            set2.add(random.nextInt(10));
//        }
//        long b2 = System.currentTimeMillis();
//        System.out.println(b2-a2);
//        System.out.println(set2.size());
//    }


//    public static void main(String[] args) {
//        Main main = new Main();
//        main.method1();
//        main.method2();
//        System.out.println(a);
//    }
//     //  fd36647f55a61ef26023e91d9b4794fb8c65a14a
//
//    public void method1() {
//        synchronized (this) {
//            System.out.println("synchronized 代码块");
//        }
//    }
//
//    public synchronized void method2() {
//        System.out.println("synchronized 代码块");
//    }
//
//    private volatile static String a = "123";


//    public static void main(String[] args) {
//        File file = new File("/Users/lilei/IdeaProjects/luckymoney/src/main/java/com/company/zoo/abc/");
//        File[] files = file.listFiles();
//        if (files == null) {
//            System.out.println(0);
//        } else if (files.length < 1){
//            System.out.println(0);
//        } else {
//            System.out.println(1);
//        }
//    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        System.out.println(list);
//
//        Vector<String> vector = new Vector<>();
//        vector.add("2");
//        System.out.println(vector);
//    }

//    public static void main(String[] args) {
//        HashMap<String,Object> hashMap = new HashMap<>();
//    }

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationfile.xml");
//        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
//    }

//    public Main() {
//        super();
//    }
//
//    private String name;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static String getStaticName() {
//        Main main = new Main();
//        System.out.println(main.getName());
//        return main.name;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Main.getStaticName());
//    }


//    AbstractQueuedSynchronizer abstractQueuedSynchronizer;
//


//    public static void main(String[] args) {
//        Main main = new Main();
//        main.getNum(1);
//    }
//
//    public void getNum(int a) {
//        this.getNum(a);
//    }

//    public static void main(String[] args) {
//        AbstractCollection abstractCollection;
//    }


//    private static transient int a = 123455;
//
//    public static void main(String[] args) {
//        System.out.println(a);
//    }


//    public static void main(String[] args) {
//        ThreadMXBean threadMxBean = ManagementFactory.getThreadMXBean();
//        ThreadInfo[] threadInfos = threadMxBean.dumpAllThreads(false,false);
//        for (ThreadInfo threadInfo : threadInfos) {
//            System.out.println("["+ threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
//        }
//    }


    /**
     * 1. 互斥条件：任一时刻只能有一个资源占用
     * 2. 请求与保持条件：一个进程因请求资源而阻塞时对已获取的资源保持不放
     * 3. 不剥夺条件：线程已获得资源在未使用完之前，不能被其他线程强行剥夺，只有自己使用完毕后才释放资源
     * 4. 循环等待条件：若干进程之间形成一种头尾相接的循环等待资源关系
     */

//    private static Object resource1 = new Object();
//    private static Object resource2 = new Object();
//
//    public static void main(String[] args) {
//        new Thread(() -> {
//            synchronized (resource1) {
//                System.out.println(Thread.currentThread().getName() + " 获取线程1");
//                try {
//                    resource1.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " 等待获取线程2");
//            }
//        }, "线程1").start();

//        new Thread(() -> {
//            synchronized (resource1) {
//                System.out.println(Thread.currentThread().getName() + " 获取线程1");
//                try {
//                    resource1.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " 等待获取线程2");
//                synchronized (resource2) {
//                    System.out.println(Thread.currentThread().getName() + " 获取线程2");
//                }
//                resource1.notify();
//            }
//        }, "线程2").start();

//        new Thread(() -> {
//            synchronized (resource2) {
//                System.out.println(Thread.currentThread().getName() + " 获取线程2");
//                resource1.notify();
//                System.out.println(Thread.currentThread().getName() + " 等待获取线程1");
//            }
//        }, "线程2").start();
//    }
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        System.out.println(list);
//    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//    public static void main(String[] args) {
//        Condition condition = (Condition) new ReentrantLock();
//    }
//    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        TreeMap treeMap;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.next();
//            char[] b = a.toCharArray();
//            int num = 0;
//            for (int i = 0; i < b.length; i++) {
//                num += getNum(b[i]) * Math.pow(26, b.length - i - 1);
//            }
//            System.out.println(num);
//        }
//    }
//
//    public static int getNum(char a) {
//        return (char) a - 64;
//    }

//    public static void main(String[] args) {
//        System.out.println(getNum('Z'));
//    }


//    int[] a = new int[1];
//    private int size = 0;
//
//    public synchronized void push(int b) {
//        if (size >= a.length) {
//            int[] c= resize(a);
//            a = c;
//        }
//        a[size++] = b;
//    }
//
//    public synchronized int[] resize(int[] a) {
//        int[] b = new int[size+1];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//        return b;
//    }
//
//    public int peek() {
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
//        return a[size-1];
//    }
//
//    public int pop(int i) {
//        if (size > 0) {
//            int b = a[size-1];
//            a[size-1] = 0;
//            size--;
//            return b;
//        } else {
//            throw new EmptyStackException();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        for (int i = 0; i < 4; i++) {
//            new Thread() {
//                @Override
//                public void run() {
//                    for (int i = 11; i < 20; i++) {
//                        main.push(i);
//                        System.out.println(Arrays.toString(main.a));
//                        System.out.println(main.peek());
//                    }
//                }
//            }.start();
//        }

//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println("hello" + ":" + i);
//                }
//            }
//        }) {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println("world" + ":" + i);
//                }
//            }
//        }.start();
//    }


//    public static void main(String[] args) {
//        System.out.println(1);
//    }


//    public static void main(String[] args) {
//        long s = System.nanoTime();
//        long s1 = System.currentTimeMillis();
//        BigDecimal s2 = new BigDecimal(String.valueOf(s1));
//        System.out.println("s2:" +s2);
//        System.out.println(s);
//        System.out.println(isOdd(123456718));
//        long e = System.nanoTime();
//        long e1 = System.currentTimeMillis();
//        BigDecimal e2 = new BigDecimal(String.valueOf(e1));
//        System.out.println("e2:" +e2);
//        System.out.println(e);
//        System.out.println(e1-s1);
//        System.out.println(e-s);
//
//        BigDecimal s3 = e2.subtract(s2);
//        System.out.println(s3);
//    }
//
//    public static boolean isOdd(int a) {
//        return a % 2 != 0;
//    }


//    public static void sort(int[] a, int low, int high) {
//        int i, j, index;
//        if (low > high) {
//            return;
//        }
//        i = low;
//        j = high;
//        // 用子表的第一个记录做基准
//        index = a[i];
//        // 从表的两端交替向中间扫描
//        while (i < j) {
//            while (i < j && a[j] >= index) {
//                j--;
//            }
//            if (i < j) {
//                // 用比基准小的记录替换低位记录
//                a[i++] = a[j];
//            }
//            while (i < j && a[i] < index) {
//                i++;
//            }
//            if (i < j) {
//                // 用比基准大的记录替换高位记录
//                a[j--] = a[i];
//            }
//        }
//        // 将基准数值替换回 a[i]
//        a[i] = index;
//        // 对低子表进行递归排序
//        sort(a, low, i - 1);
//        // 对高子表进行递归排序
//        sort(a, i + 1, high);
//
//    }
//
//    public static void quickSort(int[] a) {
//        sort(a, 0, a.length - 1);
//    }
//
//    public static void main(String[] args) {
//        int[] a = new int[10000000];
//        Random random = new Random();
//        for (int i = 0; i < 10000000; i++) {
//            a[i] = random.nextInt(1000000000);
//        }
//        long s1 = System.currentTimeMillis();
//        quickSort(a);
//        long e1 = System.currentTimeMillis();
//        System.out.println(e1-s1);
//    }


//    public static void main(String[] args) {
//
//        String a = "abcabcde";
//
//        String b = "abcde";
//
//        System.out.println(a.indexOf(b));
//
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            String[] b = a.split("");
//            for (int i = b.length - 1; i >= 0 ; i--) {
//                System.out.print(b[i]);
//            }
//        }
//        scanner.close();
//    }


//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 7};
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println("===================");
//
//        for (int i = a.length - 1; i >= 0; i--) {
//            System.out.println(a[i]);
//        }
//        System.out.println("===================");
//
//        for (int i : a) {
//            System.out.println(i);
//        }
//    }


//    public static class ListNode {
//        int val;
//        ListNode next;
//        public ListNode(int val) {
//            this.val = val;
//        }
//
//        @Override
//        public String toString() {
//            return "ListNode{" +
//                    "val=" + val +
//                    ", next=" + next +
//                    '}';
//        }
//    }
//
//    public static ListNode addTwoList(ListNode l1, ListNode l2) {
//        ListNode listNode = new ListNode(0);
//        ListNode a = l1, b = l2, result = listNode;
//        int ten = 0;
//        while (a != null || b != null) {
//            int x = (a != null) ? a.val : 0;
//            int y = (b != null) ? b.val : 0;
//            int sum = x + y + ten;
//            ten = sum / 10;
//            result.next = new ListNode(sum % 10);
//            result = result.next;
//            if (a != null) {
//                a = a.next;
//            }
//            if (b != null) {
//                b = b.next;
//            }
//        }
//        if (ten != 0) {
//            result.next = new ListNode(ten);
//        }
//        return listNode.next;
//    }
//
//
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(4);
//        l1.next = new ListNode(5);
//        l1.next.next = new ListNode(8);
//
//        System.out.println(l1);
//
//        ListNode l2 = new ListNode(7);
//        l2.next = new ListNode(2);
//        l2.next.next = new ListNode(3);
//
//        System.out.println(l2);
//
//        System.out.println(addTwoList(l1, l2));
//
//
//    }


//    public static boolean judge(String s) {
//        if (s == null || s.length() == 0 || s.length() % 2 != 0) {
//            return false;
//        }
//        HashMap<Character, Character> hashMap = new HashMap<>();
//        hashMap.put('(', ')');
//        hashMap.put('[', ']');
//        hashMap.put('{', '}');
//        char[] chars = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//        if (!hashMap.containsKey(chars[0])) {
//            return false;
//        }
//        stack.push(chars[0]);
//        for (int i = 1; i < chars.length; i++) {
//            if (hashMap.containsKey(chars[i])) {
//                stack.push(chars[i]);
//            } else if (!stack.empty() && chars[i] == hashMap.get(stack.peek())) {
//                stack.pop();
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(judge(null));
//    }

//    public static int getNum(String s) {
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        int newNum = 0, oldNum = 0;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            ArrayList<Character> list = new ArrayList<>();
//            for (int j = i; j < chars.length; j++) {
//                if (!list.contains(chars[j])) {
//                    list.add(chars[j]);
//                    newNum = list.size();
//                } else {
//                    break;
//                }
//                if (oldNum < newNum) {
//                    oldNum = newNum;
    //                }
    //            }
    //        }
    //        return oldNum;
    //    }
    //
    //    public static void main(String[] args) {
    //        System.out.println(getNum("123445"));
    //    }
    //     public static void main(String[] args) {
    //         String s;
    //     }


}





