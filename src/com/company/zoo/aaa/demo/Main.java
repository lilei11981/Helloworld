package com.company.zoo.aaa.demo;


import java.util.*;

public class Main {

    public static void main(String[] args) {

//        String s = "3\n" +
//                "AYL888,04-03 08:30:00,25\n" +
//                "AYL888,03-03 08:30:00,25\n" +
//                "ZAL888,03-02 18:27:08,34";
//        System.out.println(s);
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String string = "";
//        List<String> list = new ArrayList<>();
//        while (scanner.hasNextLine()) {
//            string = scanner.nextLine();
//            if (string.isEmpty()) {
//                break;
//            }
//            list.add(string);
//        }
//        int num = Integer.valueOf(s);
        int num = 3;
        List<String> list = new ArrayList<>();
        String a = "AYL888,04-03 08:30:00,25";
        String b = "AYL888,03-03 08:30:00,25";
        String c = "ZAL888,03-02 18:27:08,34";
        list.add(a);
        list.add(b);
        list.add(c);
        printResult(num, list);
    }



    private static void printResult(int num, List<String> list){
        System.out.println(list);
        List<Info> infoList = new ArrayList<>();
        for (String s : list) {
            String[] arr = s.split(",");
            String board = arr[0];
            String date = arr[1];
            String c = arr[2];
            int minute = Integer.parseInt(c);
            Info info = new Info(board, date, minute);
            infoList.add(info);
        }
        System.out.println(infoList);

//        for (Info info : infoList) {
//            if (info.date == )
//        }
    }

    static class Info {
        String board;
        String date;
        int minute;

        public Info(String board, String date, int minute) {
            this.board = board;
            this.date = date;
            this.minute = minute;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "board='" + board + '\'' +
                    ", date=" + date +
                    ", minute=" + minute +
                    '}';
        }
    }


}
