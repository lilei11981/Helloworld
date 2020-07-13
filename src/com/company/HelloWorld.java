package com.company;

import com.sun.corba.se.impl.orbutil.graph.Graph;

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
    public static int shortRoad2(int[][] m) {
        int[] dp = new int[m[0].length];
        dp[0] = m[0][0];
        for (int i = 1; i < dp.length; i++) {
            //求出第一行的dp
            dp[i] = dp[i - 1] + m[0][i];
        }
        for (int i = 1; i < m.length; i++) {
            //求出每一行的第一个dp[0] 后一行的dp[0]覆盖前一行的dp[0]
            dp[0] = m[i][0] + dp[0];
            for (int j = 1; j < dp.length; j++) {
                dp[j] = Math.min(dp[j - 1], dp[j]) + m[i][j];
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[][] m = {{4, 1, 5, 3}, {3, 2, 7, 7}, {6, 5, 2, 8}, {8, 9, 4, 5}};
        int[][] n = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(shortRoad2(a));
        Graph graph = null;
    }
}
