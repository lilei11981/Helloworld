package com.company.zoo.aaa.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-10-23
 * Time: 下午4:16
 * Description:
 * 选秀节目打分，分为专家评委和大众评委，
 * score[] 数组里面存储每个评委打的分数，
 * judgeType[] 里存储与 score[] 数组对应的评委类别，
 * judgeType[i] == 1，表示专家评委，
 * judgeType[i] == 2，表示大众评委，n表示评委总数。
 * 打分规则如下：专家评委和大众评委的分数先分别取一个平均分（平均分取整），
 * 然后，总分 = 专家评委平均分 * 0.6 + 大众评委 * 0.4，总分取整。
 * 如果没有大众评委，则 总分 = 专家评委平均分，总分取整。函数最终返回选手得分
 * 函数接口   int calScore(int score[], int judgeType[], int n)
 */

public class Test15 {
    public static void main(String[] args) {
        int[] score = {60, 70, 80, 70, 90, 60, 80};
        int[] judgeType = {1, 2, 1, 2, 2, 1, 2};
        int n = 7;
        int resultCore = calScore(score, judgeType, n);
        System.out.println("最后结果：" + resultCore);
    }

    public static int calScore(int score[], int judgeType[], int n) {
        double sumAll = 0;  // 总分
        double sumSpecialist = 0;  // 专家评分
        double sumCommon = 0;  // 大众评分
        int averageSpecialist = 0;  // 专家平均分
        int averageCommon = 0;  // 大众平均分
        int result = 0;
        List<Integer> specialistIndex = new ArrayList<Integer>();
        for (int i = 0; i < judgeType.length; i++) {
            if (judgeType[i] == 1) {
                specialistIndex.add(i);
            }
        }

        System.out.println("专家的下标：" + specialistIndex);  // 专家的下标：[0, 2, 5]

        for (int i = 0; i < specialistIndex.size(); i++) {
            for (int j = 0; j < score.length; j++) {
                if (specialistIndex.get(i) == j) {
                    sumSpecialist += score[j];
                }
            }
        }

        System.out.println("专家的总分：" + sumSpecialist);  // 专家的总分：200.0

        for (int k = 0; k < score.length; k++) {
            sumAll += score[k];
        }

        System.out.println("全部总分：" + sumAll);  // 全部总分：510.0

        sumCommon = sumAll - sumSpecialist;
        System.out.println("大众点评总分：" + sumCommon);  // 大众点评总分：310.0

        averageSpecialist = (int) (sumSpecialist / specialistIndex.size());
        System.out.println("专家平均分：" + averageSpecialist);  // 专家平均分：66

        averageCommon = (int) (sumCommon / (n - specialistIndex.size()));
        System.out.println("大众平均分：" + averageCommon);  // 大众平均分：77

        result = (int) (averageSpecialist * 0.6 + averageCommon * 0.4);

        return result;
    }
}
