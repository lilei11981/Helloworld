package com.company.zoo.aaa.demo;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

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
        // String c = "AYL888,03-02 08:30:00,25";
        String c = "ZAL888,03-02 18:27:08,34";
        list.add(a);
        list.add(b);
        list.add(c);
        printResult(num, list);
    }



    private static void printResult(int num, List<String> list){
        // System.out.println(list);
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
        // System.out.println(infoList);

        Map<Info, Integer> map = new LinkedHashMap<>();

        for (Info info : infoList) {
            int a = Integer.valueOf(info.date.substring(0, 2));
            if (a == num) {
                if (map.containsKey(info)) {
                    int count = map.get(info);
                    map.put(info, ++count);
                } else {
                    map.put(info, 1);
                }
            }
        }
        // System.out.println(map);

        PriorityQueue<Result> queue = new PriorityQueue<>(((o1, o2) -> o2.count - o1.count));
        for (Map.Entry<Info, Integer> entry : map.entrySet()) {
            queue.add(new Result(entry.getKey(), entry.getValue()));
        }
        // System.out.println(queue);
        int resultCount = Math.min(queue.size(), 5);
        for (int i = 0; i < resultCount; i++) {
            Result result = queue.poll();
            System.out.print(result.info.board + " " + result.info.date.substring(0, 6) + result.count + "\n");
        }
    }

    static class Result {
        Info info;
        int count;

        public Result(Info info, int count) {
            this.info = info;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "info=" + info +
                    ", count=" + count +
                    '}';
        }
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Info info = (Info) o;

            if (board != null ? !board.equals(info.board) : info.board != null) return false;
            return date != null ? date.substring(0, 2).equals(info.date.substring(0, 2)) : info.date == null;
        }

        @Override
        public int hashCode() {
            int result = board != null ? board.hashCode() : 0;
            result = 31 * result + (date != null ? date.substring(0, 2).hashCode() : 0);
            return result;
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
