package com.company.zoo.aaa.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lilei
 * @date 2020-07-02 15:20
 * @apiNote //INSTID_MERNO_YYYYMMDD_04_transcfm.txt
 */

public class Demo04 {

    static final String LINE_SEPARATOR = System.lineSeparator();
    static final String FILE_NAME_PATTERN = "%s_%s_%s_04_transcfm.txt";

    static final String FILE_FIRST_LINE = "文件版本:1|总笔数:%s|购买确认成功总笔数:%s|购买确认失败总笔数:%s|购买确认成功金额:%s|购买确认失败金额:%s" + LINE_SEPARATOR
            + "商户号|产品代码|金额|结算币种|业务流水号|机构流水号|状态|确认时间|返回码|资金到账位置|到账卡号|到账银行名称|退款日期|退款金额|下一个派息日";

    static final String FILE_DATA_LINE = "{0}|{1}|{2}|{3}|{4}|{5}|{6}|{7}|{8}|{9}|{10}|{11}|{12}|{13}|{14}";

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String date = sdf.format(new Date());
        String filename = String.format(FILE_NAME_PATTERN, "SHHR", "MY", date);
        Path filepath = Paths.get("/Users/lilei/IdeaProjects/HelloWorld/a/", date, filename);
        try {
            Files.write(filepath, (String.format(FILE_FIRST_LINE, 0, 0, 0, 0, 0) + System.lineSeparator()).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> lines = new ArrayList<>();
        String line = MessageFormat.format(FILE_DATA_LINE, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o");
        lines.add(line);

        try {
            Files.write(filepath, (String.format(FILE_FIRST_LINE, 1, 1, 2, 2, 1) + System.lineSeparator()).getBytes());
            Files.write(filepath, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
