package com.company;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author lilei
 * Hello World 输出
 * @date on 2017/6/10.
 */
public class HelloWorld {
//    public static void main(String[] args) {
//        int max = max(1,2);
//        System.out.println(max);
    // System.out.printf("Hello World!");

//        float a = 0.1432f;
//        float b = 0.2f;
//        System.out.println(a + b);

//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(a);// 0.100000024
//        System.out.println(b);// 0.099999964
//        System.out.println(a == b);// false

//        BigDecimal a = new BigDecimal("1");
//        BigDecimal b = new BigDecimal("2");
//        BigDecimal c = new BigDecimal("0.878397189378917892378917892378912738971289378192731283898989080980912389102");
//        BigDecimal x = a.subtract(b);// 0.1
//        BigDecimal z = a.divide(b);
//        BigDecimal w = z.setScale(2);
//        System.out.println(w);
//        System.out.println(x);
//        BigDecimal y = b.subtract(c);// 0.1
//        System.out.println(y);
//        System.out.println(x.equals(y)); // true
//        BigDecimal a = new BigDecimal("-80538738812075974");
//        BigDecimal b = new BigDecimal("80435758145817515");
//        BigDecimal c = new BigDecimal("12602123297335631");
//        System.out.println(a.toString().length());
//        System.out.println(b.toString().length());
//        System.out.println(c.toString().length());
//        System.out.println(a.multiply(a).multiply(a));
//        System.out.println(b.multiply(b).multiply(b));
//        System.out.println(c.multiply(c).multiply(c));
//        BigDecimal x = a.multiply(a).multiply(a);
//        BigDecimal y = b.multiply(b).multiply(b);
//        BigDecimal z = c.multiply(c).multiply(c);
//        System.out.println(x.toString().length());
//        System.out.println(y.toString().length());
//        System.out.println(z.toString().length());
//        BigDecimal j = y.add(z);
//        System.out.println("-" + j);
//        System.out.println(a.multiply(a).multiply(a));
//        BigDecimal w = x.add(y).add(z);
//        System.out.println(w);


//        BigDecimal a = new BigDecimal("1.0");
//        BigDecimal b = new BigDecimal("1.0");
//        System.out.println(a.compareTo(b));// 1
//
//        BigDecimal m = new BigDecimal("1.255433");
//        BigDecimal n = m.setScale(4, BigDecimal.ROUND_HALF_DOWN);
//        System.out.println(n);// 1.255


//        int[] myArray = { 1, 2, 3 };
//        List myList = Arrays.asList(myArray);
//        System.out.println(myList.size());//1
//        System.out.println(myList.get(0));//数组地址值
//        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
//        int [] array = (int[]) myList.get(0);
//        System.out.println(array[0]);//1

//        List myList = Arrays.asList(1, 2, 3);
//        myList.add(4);//运行时报错：UnsupportedOperationException
//        myList.remove(1);//运行时报错：UnsupportedOperationException
//        myList.clear();//运行时报错：UnsupportedOperationException

//        Integer [] myArray = { 1, 2, 3 };
//        System.out.println(arrayToList(myArray).getClass());//class java.util.ArrayList
//    }

//    static <T> List<T> arrayToList(final T[] array) {
//        final List<T> l = new ArrayList<T>(array.length);
//
//        for (final T s : array) {
//            l.add(s);
//        }
//        return (l);
//    }

    //        int i = 9;
//        switch (i) {
//            default:
//                System.out.println("default");
//            case 0:
//                System.out.println(0);
//                break;
//            case 1:
//                System.out.println(1);
//            case 2:
//                System.out.println(2);
//        }

//        int num = 50;
//        num = num++ *2;
//        System.out.println(num);

//    int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[0].length; j++) {
//            System.out.println(a[i][j]);
//        }
//    }

    /*
    public int minPathSum1(int[][] m){
		if(m==null || m.length==0 ||m[0]==null || m[0].length==0){
			return 0;
		}
		int row = m.length;
		int col = m[0].length;
		int[][] dp = new int[row][col];
		dp[0][0]=m[0][0];
		for(int i=1; i<row; i++){
			dp[i][0]=dp[i-1][0]+m[i][0];
		}
		for(int j =1; j<col; j++){
			dp[0][j]=dp[0][j-1]+m[0][j];
		}
		for(int i =1; i<col;i++){
			for(int j =1; j<row; j++){
				dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+m[i][j];
			}
		}
		return dp[row-1][col-1];
	}
     */

//    public static int getMinPath(int[][] m) {
//        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
//            return 0;
//        }
//        int row = m.length;
//        int col = m[0].length;
//        int[][] dp = new int[row][col];
//
//        for (int i = 1; i < row; i++) {
//            dp[i][0] = dp[i - 1][0] + m[i][0];
//        }
//
//        for (int i = 1; i < col; i++) {
//            dp[0][i] = dp[0][i - 1] + m[0][i];
//        }
//
//        for (int i = 1; i < col; i++) {
//            for (int j = 1; j < row; j++) {
//                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1] + m[i][j]);
//            }
//        }
//
//        return dp[row - 1][col - 1];
//    }

//    private static int num = 0;
//
//    public static int getMinPath(int[][] m) {
//        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
//            return 0;
//        }
//        int row = m.length;
//        int col = m[0].length;
//        int result = 0;
//        int i = 0;
//        int j = 0;
//        while (i != row && j != col) {
//            result += m[i][j];
//
//
//            i++;
//            j++;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[][] m = {{4, 1, 5, 3}, {3, 2, 7, 7}, {6, 5, 2, 8}, {8, 9, 4, 5}};
//        System.out.println(getMinPath(m));
//    }

//    public static int getShortRoad(int[][] m) {
//        int[][] dp = new int[m.length][m[0].length];
//        dp[0][0] = m[0][0];
//        for (int i = 1; i < m.length; i++) {
//            dp[i][0] = dp[i - 1][0] + m[i][0];
//        }
//        for (int i = 1; i < m[0].length; i++) {
//            dp[0][i] = dp[0][i - 1] + m[0][i];
//        }
//        for (int i = 1; i < m.length; i++) {
//            for (int j = 0; j < m[0].length; j++) {
//                dp[i][j] = Math.min(m[i - 1][j], m[i][j - 1]);
//            }
//        }
//        return dp[m.length - 1][m[0].length - 1];
//    }


    /*
     解法2（优化解法1）
    思路：
        解法1中使用dp数组的空间大小为M*N，其实可以对dp数组的空间压缩至N，
        定义大小为N的dp数组，对于第一行，dp[i]=dp[i-1]+m[0][i],
        在求第二行中的 dp[i] 时可以覆盖第一行 dp[i] ,第二行dp[i]=Math.min（dp[i],dp[i-1]）+m[i][j]。
    */
//    public static int shortRoad2(int[][] m) {
//        int[] dp = new int[m[0].length];
//        dp[0] = m[0][0];
//        for (int i = 1; i < dp.length; i++) {
//            //求出第一行的dp
//            dp[i] = dp[i - 1] + m[0][i];
//        }
//        for (int i = 1; i < m.length; i++) {
//            //求出每一行的第一个dp[0] 后一行的dp[0]覆盖前一行的dp[0]
//            dp[0] = m[i][0] + dp[0];
//            for (int j = 1; j < dp.length; j++) {
//                dp[j] = Math.min(dp[j - 1], dp[j]) + m[i][j];
//            }
//        }
//        return dp[dp.length - 1];
//    }
//
//    public static void main(String[] args) {
//        int[][] m = {{4, 1, 5, 3}, {3, 2, 7, 7}, {6, 5, 2, 8}, {8, 9, 4, 5}};
//        int[][] n = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
//        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(shortRoad2(a));
//        Graph graph = null;
//    }

//    private static String replaceSpace(StringBuffer str) {
//        int length = str.length();
//        StringBuffer result = new StringBuffer();
//        for (int i = 0; i < length; i++) {
//            char a = str.charAt(i);
//            if (String.valueOf(a).equals(" ")) {
//                result.append("%20");
//            } else {
//                result.append(a);
//            }
//        }
//        return result.toString();
//    }
//
//    private static String replaceSpace2(StringBuffer str) {
//        return str.toString().replaceAll(" ", "%20");
//    }
//
//    public static void main(String[] args) {
//        StringBuffer a = new StringBuffer("1 2 3 ");
//        System.out.println(replaceSpace(a));
//        System.out.println(replaceSpace2(a));
//    }


//    public static void main(String[] args) {
//        int a = 1;
//        int b = 1;
//        System.out.println(a & b);

//        int a = 0;
//        int b = 0;
//        System.out.println(a | b);

//        int a = 0;
//        int b = 1;
//        System.out.println(a^b);

//        int a = 0b1001;
//        int b = 0b1111;
//        int c = a^b;
//        System.out.println(Integer.toBinaryString(c));

//        int a = 1;
//        System.out.println(~a);

//        int a = 10;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toHexString(a));
//        System.out.println(Integer.toOctalString(a));
//        System.out.println(Integer.toUnsignedString(a));
//
//        int b = 0x10;
//        int c = 010;
//        int d = 0b10;
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        System.out.println(Integer.parseInt("0x10",16));

//        int a = 0b10;
//        System.out.println(~a);

//        int a = 0b111111;
//        int b = a<<4;
//        System.out.println(Integer.toBinaryString(b));

//        int a = 0b111111;
//        int b = a >>> 4;
//        System.out.println(Integer.toBinaryString(b));

//        int x = 0b101101;
//        int result = x >> 1;
//        System.out.println(Integer.toBinaryString(result));

//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            hashMap.put(i,i);
//        }
//        System.out.println(hashMap);
//        hashMap.remove(1);
//        System.out.println(hashMap.get(2));
//        System.out.println(hashMap);
//        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
//            System.out.println(integerIntegerEntry);
//        }

//        for (int i = 100; i < 110; i++) {
//            System.out.println(hash(i + ""));
//        }
//
//        String a = null;
//        System.out.println(hash(a));
//    }
//
//    static final int hash(Object key) {   //jdk1.8 & jdk1.7
//        int h;
//        System.out.println(key.hashCode());
//        System.out.println(key.hashCode() >>> 16);
    // h = key.hashCode() 为第一步 取hashCode值
    // h ^ (h >>> 16)  为第二步 高位参与运算
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }

//    static final int MAXIMUM_CAPACITY = 1 << 30;
//
//    public static void main(String[] args) {
//        System.out.println(tableSizeFor(MAXIMUM_CAPACITY+1));
//    }
//
//    static final int tableSizeFor(int cap) {
//        int n = cap - 1;
//        n |= n >>> 1;
//        System.out.println("n |= n >>> 1  " + Integer.toBinaryString(n));
//        n |= n >>> 2;
//        System.out.println("n |= n >>> 2  " + Integer.toBinaryString(n));
//        n |= n >>> 4;
//        System.out.println("n |= n >>> 4  " + Integer.toBinaryString(n));
//        n |= n >>> 8;
//        System.out.println("n |= n >>> 8  " + Integer.toBinaryString(n));
//        n |= n >>> 16;
//        System.out.println("n |= n >>> 16 " + Integer.toBinaryString(n));
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
//    }

//    public static void main(String[] args) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            map.put(i,i);
//        }

//    }


//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        int a = Collections.binarySearch(list,"a");
//        System.out.println(a);
//    }

//    public static void main(String[] args) {
//        int[] a = new int[10];
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        a[3] = 3;
//        System.arraycopy(a, 2, a, 3, 3);
//        a[2]=99;
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }

//    public static void main(String[] args) {
//        int[] a = new int[3];
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        int[] b = Arrays.copyOf(a, 10);
//        System.out.println("b.length：" + b.length);
//    }

//    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<Object>();
//        final int N = 10000000;
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            list.add(i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("使用ensureCapacity方法前："+(endTime - startTime));
//
//    }

//    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<Object>();
//        final int N = 10000000;
//        list = new ArrayList<Object>();
//        long startTime1 = System.currentTimeMillis();
//        list.ensureCapacity(N);
//        for (int i = 0; i < N; i++) {
//            list.add(i);
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));
//    }

//    public static void main(String[] args) {
//        int a = 8;
//        System.out.println(a>>1);
//    }

//    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//        set.add("zbc");
//        set.add("wsc");
//        set.add("abc");
//        for (String s : set) {
//            System.out.println(s);
//        }
//    }

//    public static void main(String[] args) {
//        LinkedHashSet<String> set = new LinkedHashSet<>();
//        set.add("zbc");
//        set.add("wsc");
//        set.add("abc");
//        for (String s : set) {
//            System.out.println(s);
//        }
//    }

//    public static void main(String[] args) {
//        TreeSet<String> set = new TreeSet<>();
//        set.add("zbc");
//        set.add("wsc");
//        set.add("abc");
//        System.out.println(set);
//        for (String s : set) {
//            System.out.println(s);
//        }
//
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println(set);
//    }

//    static final int MAXIMUM_CAPACITY = 1 << 30;
//
//    public static void main(String[] args) {
//        String s = "abcde";
//        int num = s.hashCode();
//        System.out.println(hash(s));
//
//        System.out.println(tableSizeFor(num));
//        System.out.println(num);
//
//        System.out.println(num % tableSizeFor(num));
//        System.out.println(num & tableSizeFor(num) - 1);
//    }
//
//
//    static final int hash(Object key) {
//        int h;
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }
//
//    static final int tableSizeFor(int cap) {
//        int n = cap - 1;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
//
//    }


//    public static void main(String[] args) {
//        HashMap map;
//        HashSet set;
//    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            int item = iterator.next();
//            if (item == 1) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//    }


//    public static void main(String[] args) {
//        // 创建并赋值 HashMap
//        Map<Integer, String> map = new HashMap();
//        map.put(1, "Java");
//        map.put(2, "JDK");
//        map.put(3, "Spring Framework");
//        map.put(4, "MyBatis framework");
//        map.put(5, "Java中文社群");
//        // 遍历
//        Iterator<Map.Entry<Integer, String>> iterator1 = map.entrySet().iterator();
//        while (iterator1.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator1.next();
//            System.out.print(entry.getKey());
//            System.out.print(entry.getValue());
//        }
//
//        System.out.println();
//        System.out.println("---------------------");
//
//        // 遍历
//        Iterator<Integer> iterator2 = map.keySet().iterator();
//        while (iterator2.hasNext()) {
//            Integer key = iterator2.next();
//            System.out.print(key);
//            System.out.print(map.get(key));
//        }
//
//        System.out.println();
//        System.out.println("---------------------");
//
//        // 遍历
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.print(entry.getKey());
//            System.out.print(entry.getValue());
//        }
//
//        System.out.println();
//        System.out.println("---------------------");
//
//
//        // 遍历
//        for (Integer key : map.keySet()) {
//            System.out.print(key);
//            System.out.print(map.get(key));
//        }
//
//        System.out.println();
//        System.out.println("---------------------");
//
//        // 遍历
//        map.forEach((key, value) -> {
//            System.out.print(key);
//            System.out.print(value);
//        });
//
//        System.out.println();
//        System.out.println("---------------------");
//
//        // 遍历
//        map.entrySet().stream().forEach((entry) -> {
//            System.out.print(entry.getKey());
//            System.out.print(entry.getValue());
//        });
//    }

//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add("abc");
//        list.add(new Object());
//        System.out.println(list);

//        ArrayList<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add("abc");
//        list.add(new Date());
//        System.out.println(list);
//    }

//    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        Object a = list1.getClass();
//        System.out.println(a);
//        System.out.println(list1.getClass() == list1.getClass());
//    }

//    public static void main(String[] args) {
//        //读取文本文件的内容
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new File("D://read.txt"));
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (scanner != null) {
//                scanner.close();
//            }
//        }
//
//        try (Scanner scan = new Scanner(new File("D://read.txt"))) {
//            while (scan.hasNext()) {
//                System.out.println(scan.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        }).start();
//
//        new Thread(() -> System.out.println("world")).start();
//    }

//    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("1", "a");
//        map.put("2", "b");
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//        System.out.println("============");
//        map.forEach((k, v) -> System.out.println(k + ":" + v));
//    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("b");
//        list.add("c");
//        list.add("a");
//        list.add("d");
//
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            if ("a".equals(iterator.next())) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//
//        list.removeIf(s -> "c".equals(s));
//        System.out.println(list);
//        list.forEach(s -> System.out.println(s));
//    }


//    public static void main(String[] args) {
//        User user = new User();
//        user.setName("aab");
//        User newUser = null;
//        Optional<User> optional = Optional.of(user);
//        System.out.println(optional.isPresent());
//        System.out.println(optional.orElse(user));
//        System.out.println(optional.get());

//        optional.ifPresent((s)-> System.out.println(s.toString()));
//        optional.orElseGet(() -> new User());
//        System.out.println();

//        optional.filter((v)-> "aaa".equals(v.getName()));
//        System.out.println(optional.get());

//        String s = optional.map(user1 -> user1.getName()).orElse("unknown");
//        System.out.println(s);
//    }

//    public static void main(String[] args) {
//        System.out.println(new Random().nextGaussian());
//    }

//    public static void main(String[] args) {
//        double e = StrictMath.E;
//        System.out.println(e);
//        System.out.println(StrictMath.log(e));
//        double a = StrictMath.log(100);
//        double b = StrictMath.log(10);
//        System.out.println(a / b);
//    }

//    public static void main(String[] args) {
//        int N = 99999;
//        int[] nums = new int[N];
//        for (int i = 0; i < N; i++) {
//            nums[i] = new Random().nextInt(1000000);
//        }
//        Arrays.sort(nums);
//        System.out.println(nums[0]);
//        System.out.println(nums[N - 1]);
//    }

//    public static void main(String[] args) {
//        AtomicLong num = new AtomicLong(10);
//        long l = num.get();
//        for (int i = 0; i < 100; i++) {
//            System.out.println(l);
//        }
//    }

//    public static void main(String[] args) {
//        String number = " 15802162331 ";
//        send(number.trim());
//        System.out.println(number);
//    }
//
//    private static void send(String number) {
//        System.out.println(number);
//    }

//    public static void main(String[] args) {
//        String a = new String("abc");
//        String b = new String("abc");
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//    }


//    public static void main(String[] args) throws NoSuchFieldException {
//        Class<String> a = String.class;
//        Field[] names = a.getDeclaredFields();
//        for (Field name : names) {
//            System.out.println(name.getName());
//        }
//        Method[] methods = a.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }
//    }

//    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("abc");
//        stringBuffer.append(123);
//        System.out.println(System.identityHashCode(stringBuffer));
//        System.out.println(stringBuffer);
//        Collections collections;
//        Arrays arrays;
//    }


//    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("1");
//        System.out.println(stringBuilder);
//        Object a = null;
//        stringBuilder.append(a);
//        System.out.println(stringBuilder);
//    }

//    public static void main(String[] args) {
//        LinkedHashMap map;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(File.separator);
//    }

//    public static void main(String[] args) {
    //        Calendar calendar1 = Calendar.getInstance();
//        Collections collections = new Collections();
//        Arrays arrays = new Arrays();
//        String a = "asd";
//        String b = new String("anc");
//        char[] d = {'a','b','c'};
//        String c = new String(d);
//        File file = new File("anc");
//        AbstractMap abstractMap = new AbstractMap() {
//            @Override
//            public Set<Entry> entrySet() {
//                return null;
//            }
//        };
//        Object o = new Object();
//        System.out.println(o.toString());
//    }


//    public static void main(String[] args) {
//        int a = 0;
//        Integer b = null;
////        System.out.println(a == b);
//        System.out.println(b instanceof Integer);
//    }

//    public static void main(String[] args) {
//        String str = null;
//        Integer itr = null;
//        Double dou = null;
//        Integer integer = (Integer) null;
//        String string = (String) null;
//        System.out.println("integer = " + integer);
//        System.out.println("string = " + string);
//    }

//    private static void abs() {
//        int a = 0;
//        System.out.println(a);
//    }
//
//    public static void main(String[] args) {
//      Integer a = null;
//      System.out.println(a.hashCode(1));
//    }

//    private static String number;

//    public static void main(String[] args) {
//            String s = String.valueOf(number);
//            System.out.println(s);
//            String string = number.toString();
//            System.out.println("string = " + string);

//        System.out.println(null == null);
//    }

//    public static void main(String[] args) {
//        Collection collection;
//        Queue queue;
//        Map map;
//        Dictionary dictionary;
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.add(1);
//        stack.add(2);
//    }

//    public static void main(String[] args) {
//        char a = '李';
//        char b = '0';
//        System.out.println(a + 1 - 1);
//        System.out.println(b + 1 - 1);
//        System.out.println(a);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Character.MAX_VALUE + 1 - 1);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Float.MAX_VALUE);
//    }


//    public static void main(String[] args) {
//        float a = 3.4F;
//        System.out.println(a);
//        float b = (float)3.4;
//        System.out.println(b);
//        short c = 1;
//        c = (short)( c + 1);
//        c += 1;
//        System.out.println(c);
//    }

//    public static void main(String[] args) {
//        int a = 0B1;
//        int b = 0B1;
//        System.out.println(a & b);
//
//        boolean c = true;
//        boolean d = false;
//        System.out.println(c & d);
//    }

//    public static void main(String[] args) {
//        Integer a = 127, b = 127, c = 128, d = 128, e = 129, f = 129;
//        System.out.println(a==b);
//        System.out.println(c==d);
//        System.out.println(e==f);
//    }

//    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<String>();
//        queue.offer("string"); // add
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
//    }

//    public static void main(String[] args) {
//        List list = new ArrayList();
//        while (true) {
//            list.add(new HelloWorld());
//        }
//    }

//    public static void main(String[] args) {
//
//        List<Integer> list1 = new CopyOnWriteArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//
//        new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                list2.add(i);
//            }
//        }).start();
//
//        new Thread(() -> {
//            if (list2.size() > 0) {
//                list2.remove(0);
//            }
//        }).start();
//
//        System.out.println(list2.size());
//
//    }


//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        test(list);
//        List<Object> objectList;
//        List<String> stringList;
//        System.out.println(list.getClass());
//    }
//
//    public static void test(List<? extends Number> list) {
//        System.out.println(list);
//    }

//    public synchronized void test1() {
//
//    }
//
//    public void test2() {
//        synchronized (this) {
//
//        }
//    }

//    public static void main(String[] args) {
//        StringBuilder stringBuilder;
//        StringBuffer stringBuffer;
//    }

//    public static void main(String[] args) {
//        HashMap map;
//        String treeify_threshold = "";
//    }

//    public static void main(String[] args) {
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//    }


//    public static void sort(int[] arrays) {
//
//        int temp;
//        //外层循环是排序的趟数
//        for (int i = 0; i < arrays.length - 1; i++) {
//            //内层循环是当前趟数需要比较的次数
//            for (int j = 0; j < arrays.length - i - 1; j++) {
//                //前一位与后一位与前一位比较，如果前一位比后一位要大，那么交换
//                if (arrays[j] > arrays[j + 1]) {
//                    temp = arrays[j];
//                    arrays[j] = arrays[j + 1];
//                    arrays[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 2, 1, 5, 6, 7, 2, 3, 9, 1, 0, 2};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }


//    final String a = "1";
//
//    public final void method() {
//
//    }
//
//    public void method(String a) {
//        this.a = a;
//    }

//    private static final String[] lastNames = {
//            "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈",
//            "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
//            "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏",
//            "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章",
//            "云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "鲁", "韦",
//            "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳",
//            "酆", "鲍", "史", "唐", "费", "廉", "岑", "薛", "雷", "贺",
//            "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常",
//            "乐", "于", "时", "傅", "皮", "卞", "齐", "康", "伍", "余",
//            "元", "卜", "顾", "孟", "平", "黄", "和", "穆", "萧", "尹"
//    };
//
//    private static final String[] firstNames = {
//            "子璇", "淼", "国栋", "夫子", "瑞堂", "甜", "敏", "尚", "国贤", "贺祥", "晨涛",
//            "昊轩", "易轩", "益辰", "益帆", "益冉", "瑾春", "瑾昆", "春齐", "杨", "文昊",
//            "东东", "雄霖", "浩晨", "熙涵", "溶溶", "冰枫", "欣欣", "宜豪", "欣慧", "建政",
//            "美欣", "淑慧", "文轩", "文杰", "欣源", "忠林", "榕润", "欣汝", "慧嘉", "新建",
//            "建林", "亦菲", "林", "冰洁", "佳欣", "涵涵", "禹辰", "淳美", "泽惠", "伟洋",
//            "涵越", "润丽", "翔", "淑华", "晶莹", "凌晶", "苒溪", "雨涵", "嘉怡", "佳毅",
//            "子辰", "佳琪", "紫轩", "瑞辰", "昕蕊", "萌", "明远", "欣宜", "泽远", "欣怡",
//            "佳怡", "佳惠", "晨茜", "晨璐", "运昊", "汝鑫", "淑君", "晶滢", "润莎", "榕汕",
//            "佳钰", "佳玉", "晓庆", "一鸣", "语晨", "添池", "添昊", "雨泽", "雅晗", "雅涵",
//            "清妍", "诗悦", "嘉乐", "晨涵", "天赫", "玥傲", "佳昊", "天昊", "萌萌", "若萌"
//    };
//
//    public static String getChineseName() {
//        int i = (int) Math.floor(Math.random() * lastNames.length);
//        String lastName = lastNames[i];
//        int j = (int) Math.floor(Math.random() * firstNames.length);
//        String firstName = firstNames[j];
//        return lastName + firstName;
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(getChineseName());
//        }
//    }

//    public static void main(String[] args) {
//
//        for (int i = 0; i < 10; i++) {
//            Random random = new Random();
//            int nextInt = random.nextInt(2);
//            System.out.println(nextInt);
//        }
//
//
//    }

//    public static void main(String[] args) {
//        System.out.println("+++++");
//    }

//    public static void main(String[] args) {
//        String s1 = new String("计算机");
//        String s2 = s1.intern();
//        String s3 = "计算机";
//        // 计算机
//        System.out.println(s2);
//        // false，因为一个是堆内存中的String对象一个是常量池中的String对象
//        System.out.println(s1 == s2);
//        // true，因为两个都是常量池中的String对象
//        System.out.println(s3 == s2);
//    }

//    public static void main(String[] args) {
//        String str1 = "str";
//        String str2 = "ing";
//
//        // 常量池中的对象
//        String str3 = "str" + "ing";
//        // 在堆上创建的新的对象
//        String str4 = str1 + str2;
//        // 常量池中的对象
//        String str5 = "string";
//        // false
//        System.out.println(str3 == str4);
//        // true
//        System.out.println(str3 == str5);
//        // false
//        System.out.println(str4 == str5);
//    }

//    public static void main(String[] args) {
//        Integer i1 = 33;
//        Integer i2 = 33;
//        // 输出true
//        System.out.println(i1 == i2);
//        Integer i11 = 333;
//        Integer i22 = 333;
//        // 输出false
//        System.out.println(i11 == i22);
//        Double i3 = 1.2;
//        Double i4 = 1.2;
//        // 输出false
//        System.out.println(i3 == i4);
//    }

//    public static void main(String[] args) {
//        Integer i1 = 40;
//        Integer i2 = new Integer(40);
//        // 输出false
//        System.out.println(i1 == i2);
//    }

//    public static void main(String[] args) {
//        Integer i1 = 40;
//        Integer i2 = 40;
//        Integer i3 = 0;
//        Integer i4 = new Integer(40);
//        Integer i5 = new Integer(40);
//        Integer i6 = new Integer(0);
//
//        System.out.println("i1=i2   " + (i1 == i2));
//        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
//        System.out.println("i1=i4   " + (i1 == i4));
//        System.out.println("i4=i5   " + (i4 == i5));
//        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));
//        System.out.println("40=i5+i6   " + (40 == i5 + i6));
//    }

//    public static void main(String[] args) {
//        System.out.println("Hello World");

//        int[] values = new int[1000];
//        for (int i = 0; i < 1000; i++) {
//            Random random = new Random();
//            int value = random.nextInt(90) + 9;
//            values[i] = value;
//        }
//        Arrays.sort(values);
//        System.out.println(values[0]);
//        System.out.println(values[999]);
//
//
//    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String format1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String format2 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String format3 = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        String format4 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);

        Instant instant = Instant.now();
        System.out.println(instant);
        Date date = new Date();
        System.out.println(date);


    }
}

