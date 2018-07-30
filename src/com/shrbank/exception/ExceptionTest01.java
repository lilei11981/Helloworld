package com.shrbank.exception;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-07-30
 * Time: 上午11:01
 * Description:
 * 测试代码，可以通过代码DEBUG查看查看执行流程
 */

public class ExceptionTest01 {
        public ExceptionTest01()
        {
        }
        boolean testEx() throws Exception
        {
            boolean ret = true;
            try
            {
                ret =testEx1();
            }
            catch (Exception e)
            {
                System.out.println("testEx,catch exception");
                ret =false;
                throw e;
            }
            finally
            {
                System.out.println("testEx,finally; return value=" + ret);
                return ret;
            }
        }
        boolean testEx1() throws Exception
        {
            boolean ret = true;
            try
            {
                ret =testEx2();
                if(!ret)
                {
                    return false;
                }
                System.out.println("testEx1,at the end of try");
                return ret;
            }
            catch (Exception e)
            {
                System.out.println("testEx1,catch exception");
                ret =false;
                throw e;
            }
            finally
            {
                System.out.println("testEx1,finally; return value=" + ret);
                return ret;
            }
        }
        boolean testEx2() throws Exception
        {
            boolean ret = true;
            try
            {
                int b =12;
                int c;
                for(int i = 2; i >= -2; i--)
                {
                    c= b / i;
                    System.out.println("i="+ i);
                }
                return true;
            }
            catch (Exception e)
            {
                System.out.println("testEx2,catch exception");
                ret =false;
                throw e;
            }
            finally
            {
                System.out.println("testEx2,finally; return value=" + ret);
                return ret;
            }
        }
        public static void main(String[] args)
        {
            ExceptionTest01 testException1 =new ExceptionTest01();
            try
            {
                testException1.testEx();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
