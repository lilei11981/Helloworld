package com.company.zoo.aaa.utils;

/**
 * @author lilei
 * @date 2020-05-25 11:26
 * @apiNote
 */

public class StringUtil {
    public static void main(String[] args) {
//        String msg = "inst_serial_no,account_type,account_no,balance,ecif_cust_no,collect_account,open_account_time," +
//                "acct_status,id_photocopy_flag,id_photocopy_url,cancel_trade_no,result_info_status,result_info_code," +
//                "result_info_msg,extension,gmt_created,gmt_modified";
//        String[] msgArray = msg.split(",");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < msgArray.length; i++) {
//            result.append("#{").append(msgArray[i]).append("}").append(",");
//        }
//        System.out.println(result);

        String myAcct = "/**\n" +
                "     * 商户号 MY-分配给蚂蚁的商户号MY\n" +
                "     */\n" +
                "    String merchant_id;\n" +
                "    /**\n" +
                "     * 外部请求流水号\n" +
                "     */\n" +
                "    String trade_no;\n" +
                "    /**\n" +
                "     * 原交易流水\n" +
                "     */\n" +
                "    String org_trade_no;\n" +
                "    /**\n" +
                "     * 外部交易易时间 yyyyMMddHHmmss\n" +
                "     */\n" +
                "    Date transaction_time;\n" +
                "    /**\n" +
                "     * 姓名\n" +
                "     */\n" +
                "    String user_name;\n" +
                "    /**\n" +
                "     * 证件类型 01-身份证\n" +
                "     */\n" +
                "    String id_type;\n" +
                "    /**\n" +
                "     * 证件号码\n" +
                "     */\n" +
                "    String id_no;\n" +
                "    /**\n" +
                "     * 手机号\n" +
                "     */\n" +
                "    String mobile_phone;\n" +
                "    /**\n" +
                "     * 绑定卡号\n" +
                "     */\n" +
                "    String bank_card_no;\n" +
                "    /**\n" +
                "     * 绑定卡行名\n" +
                "     */\n" +
                "    String bind_card_name;\n" +
                "    /**\n" +
                "     * 证件有效期 格式:YYYYMMDD ;如长期有效，则传递”长期”，我们保存为99991231\n" +
                "     */\n" +
                "    String cert_expiry_date;\n" +
                "    /**\n" +
                "     * 证件起始日 格式:YYYYMMDD\n" +
                "     */\n" +
                "    String cert_origin_date;\n" +
                "    /**\n" +
                "     * 签发机关\n" +
                "     */\n" +
                "    String issuing_authority;\n" +
                "    /**\n" +
                "     * 居住地址\n" +
                "     */\n" +
                "    String address;\n" +
                "    /**\n" +
                "     * 性别 1-男，2-女\n" +
                "     */\n" +
                "    String gender;\n" +
                "    /**\n" +
                "     * 国籍 CHN\n" +
                "     */\n" +
                "    String nation;\n" +
                "    /**\n" +
                "     * 职业\n" +
                "     */\n" +
                "    String job;\n" +
                "    /**\n" +
                "     * 工作地址\n" +
                "     */\n" +
                "    String working_address;\n" +
                "    /**\n" +
                "     * 税收居民类型 1 仅为中国税收居民 （仅支持）\n" +
                "     */\n" +
                "    String tax_resd_type;\n" +
                "    /**\n" +
                "     * 设备信息\n" +
                "     */\n" +
                "    String device_info;\n" +
                "    /**\n" +
                "     * 银行响应流水号\n" +
                "     */\n" +
                "    String inst_serial_no;\n" +
                "    /**\n" +
                "     * 账户类型 2-II类户\n" +
                "     */\n" +
                "    String account_type;\n" +
                "    /**\n" +
                "     * 电子账号\n" +
                "     */\n" +
                "    String account_no;\n" +
                "\n" +
                "    /**\n" +
                "     * 考虑到资金安排，避免重复提现，考虑增加余额字段。\n" +
                "     */\n" +
                "    BigDecimal balance;\n" +
                "    /**\n" +
                "     * ECIF客户号\n" +
                "     */\n" +
                "    String ecif_cust_no;\n" +
                "    /**\n" +
                "     * 暂记户\n" +
                "     */\n" +
                "    String collect_account;\n" +
                "    /**\n" +
                "     * 开户时间 yyyyMMddHHmmss\n" +
                "     */\n" +
                "    Date open_account_time;\n" +
                "    /**\n" +
                "     * 账户状态 1-正常,2-注销\n" +
                "     */\n" +
                "    String acct_status;\n" +
                "    /**\n" +
                "     * 证件状态 0-未上传,1-已上传,2-校验通过,3-校验通过且上传影像，9-校验未通过\n" +
                "     */\n" +
                "    String id_photocopy_flag;\n" +
                "    /**\n" +
                "     * 影像流水\n" +
                "     */\n" +
                "    String id_photocopy_url;\n" +
                "    /**\n" +
                "     * 外部销户流水号\n" +
                "     */\n" +
                "    String cancel_trade_no;\n" +
                "    /**\n" +
                "     * 状态\n" +
                "     */\n" +
                "    String result_info_status;\n" +
                "    /**\n" +
                "     * 返回码\n" +
                "     */\n" +
                "    String result_info_code;\n" +
                "    /**\n" +
                "     * 返回信息\n" +
                "     */\n" +
                "    String result_info_msg;\n" +
                "    /**\n" +
                "     * 扩展字段\n" +
                "     */\n" +
                "    String extension;\n" +
                "    /**\n" +
                "     * 创建时间\n" +
                "     */\n" +
                "    Date gmt_created;\n" +
                "    /**\n" +
                "     * 修改时间\n" +
                "     */\n" +
                "    Date gmt_modified;";
        String newAcct = myAcct.replaceAll("\\*", "").replaceAll("\n", "");
        System.out.println(newAcct);
        System.out.println("-------------------------------------------");
        StringBuilder stringBuilder = new StringBuilder();
        String[] newAcctArray = newAcct.split("/");
        for (int i = 0; i < newAcctArray.length; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(newAcctArray[i]);
            }
        }

        System.out.println(stringBuilder);
        System.out.println("-------------------------------------------");
        String newString = stringBuilder.toString();
        String[] newStringArray = newString.split(" ");

        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < newStringArray.length; i++) {
            if (!newStringArray[i].isEmpty()) {
                newStringBuilder.append(newStringArray[i]).append("\n");
            }
        }
        System.out.println(newStringBuilder);
        System.out.println("-------------------------------------------");

        String a = newStringBuilder.toString();
        StringBuilder c = new StringBuilder();
        String[] b = a.split("\n");
        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 1) {
                c.append(b[i]);
            }
        }
        System.out.println(c);
        String d = c.toString();

        System.out.println("-------------------------------------------");

        String[] e = d.split(";");
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < e.length; i++) {
            f.append(e[i]).append(",");
        }
        System.out.println(f);

        System.out.println("-------------------------------------------");
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < e.length; i++) {
            g.append("#{").append(e[i]).append("}").append(",");
        }
        System.out.println(g);


    }
}
