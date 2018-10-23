package com.example.wulingyong.rxandroid.util;

import android.text.TextUtils;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anhdxy on 2018/6/5
 */
public class StringUtils {
    /**
     * 是否是手机号
     *
     * @param mobileNums 手机号码
     * @return 结果
     */
    public static boolean isMobileNO(String mobileNums) {
        /*
          判断字符串是否符合手机号码格式
          移动号段: 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
          联通号段: 130,131,132,145,155,156,170,171,175,176,185,186
          电信号段: 133,149,153,170,173,177,180,181,189
          @param str
         * @return 待检测的字符串
         */
        String telRegex = "1[0-9]{10}";// "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(mobileNums))
            return false;
        else
            return mobileNums.matches(telRegex);
    }

    /**
     * 是否是人名
     *
     * @param personName 人名
     * @return 结果
     */
    public static boolean isPersonName(String personName) {
        String regex = "([\\u4e00-\\u9fa5]{2,8})|([a-zA-Z]{2,16})";
        if (TextUtils.isEmpty(personName)) {
            return false;
        } else {
            return personName.matches(regex);
        }
    }

    public static boolean isAddress(String address) {
        String regex = "[\\u4e00-\\u9fa5a-zA-Z0-9- ]*";
        if (TextUtils.isEmpty(address)) {
            return false;
        } else {
            return address.matches(regex);
        }
    }

    /**
     * 判断是否是身份证号码
     *
     * @param idCard 身份证号码
     * @return 判断结果
     */
    public static boolean isIdCard(String idCard) {
        String regex = "(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$)";
        if (isEmpty(idCard)) {
            return false;
        }
        return idCard.matches(regex);
    }

    /**
     * 是否有特殊字符
     *
     * @param text 文本
     * @return 没有为true
     */
    public static boolean withoutSpecialChar(String text) {
        String regex = "^[\\u4e00-\\u9fa5a-zA-Z0-9]*$";
        if (isEmpty(text)) {
            return false;
        }
        return text.matches(regex);
    }


    public static boolean passwordIsCorrect(String password) {
        String regex = "^[a-zA-Z0-9-_ ]*$";
        if (isEmpty(password)) {
            return false;
        }
        return password.matches(regex);
    }

    /**
     * 判断银行卡号
     *
     * @param bankCard 银行卡号
     * @return 判断结果
     */
    public static boolean isBankCard(String bankCard) {
        String regex = "(^([1-9])([0-9]{14,18})$)";
        if (isEmpty(bankCard)) {
            return false;
        }
        return bankCard.matches(regex);
    }

    /**
     * 判断是否为空
     *
     * @param str 字符串
     * @return 结果
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str) || "null".equals(str);
    }

    /**
     * 是否是纯数字
     *
     * @param str 字符串
     * @return 结果
     */
    public static boolean isNumber(String str) {
        String regex = "^[0-9]*$";
        if (isEmpty(str)) {
            return false;
        }
        return str.matches(regex);
    }

    public static boolean isPrice(String string) {
        String regex = "(^(([1-9])|(0.))([0-9.]*)$)";
        if (isEmpty(string)) {
            return false;
        }
        return string.matches(regex);
    }

    /**
     * 显示密文的身份证号码
     *
     * @param idCard 身份证
     * @return 密文的身份证
     */
    public static String showHideIdCard(String idCard) {
        if (!isIdCard(idCard)) {
            return "";
        }
        return idCard.replace(idCard.substring(1, idCard.length() - 1), "******************");
    }

    /**
     * 显示不校验身份证
     *
     * @param idCard
     * @return
     */
    public static String showHideIdCard2(String idCard) {
//        if (!isIdCard(idCard)) {
//            return "";
//        }
        return idCard.replace(idCard.substring(1, idCard.length() - 1), "******************");
    }

    public static String getString(String text, String defaultText) {
        if (isEmpty(text)) {
            if (isEmpty(defaultText)) {
                return "";
            } else {
                return defaultText;
            }
        } else {
            return text;
        }
    }

    /**
     * 是否输入表情
     *
     * @param text 文本
     * @return 是 否
     */
    public static boolean isInputEmoji(String text) {
        String regex = "^[`~!@#$%^&*()-_+=|{}':;,\\[\\].<>/?！￥…（）—【】‘；：”“’。，、？a-zA-Z0-9]*$";
        return !text.matches(regex);
    }

    /**
     * 是否输入表情可以输入中文
     *
     * @param text 文本
     * @return 是 否
     */
    public static boolean isInputEmoji2(String text) {
        String regex = "^[`~!@#$%^&*()-_+=|{}':;,\\[\\].<>/?！￥…（）—【】‘；：”“’。，、？\\u4e00-\\u9fa5a-zA-Z0-9]*$";
        return !text.matches(regex);
    }

    /**
     * 格式化金额
     *
     * @return string类型的金额
     */
    public static String formatPrice(Object price) {
        if (price == null) {
            return "0";
        }
        if (price instanceof Integer) {
            if (((Integer) price) < 0) {
                return "0";
            }
            return price + "";
        } else if (price instanceof Long) {
            if (((Long) price) < 0) {
                return "0";
            }
            return price + "";
        } else if (price instanceof Double) {
            if (((Double) price) < 0) {
                return "0";
            }
            BigDecimal bigDecimal = new BigDecimal((Double) price);
            String s = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            if (s.endsWith(".00")) {
                return s.substring(0, s.length() - 3);
            } else {
                return s;
            }
        } else if (price instanceof String) {
            if (((String) price).startsWith("-")) {
                return "0";
            }
            BigDecimal bigDecimal = new BigDecimal((String) price);
            String s = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            if (s.endsWith(".00")) {
                return s.substring(0, s.length() - 3);
            } else {
                return s;
            }
        } else {
            return "0";
        }
    }

    /**
     * 格式化金额
     *
     * @return string类型的金额
     */
    public static String formatPrice2(Object price) {
        if (price == null) {
            return "0";
        }
        if (price instanceof Integer) {
            if (((Integer) price) < 0) {
                return "0";
            }
            return castPrice(price + "");
        } else if (price instanceof Long) {
            if (((Long) price) < 0) {
                return "0";
            }
            return castPrice(price + "");
        } else if (price instanceof Double) {
            if (((Double) price) < 0) {
                return "0";
            }
            BigDecimal bigDecimal = new BigDecimal((Double) price);
            String s = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            if (s.endsWith(".00")) {
                return castPrice(s.substring(0, s.length() - 3));
            } else {
                return castPrice(s);
            }
        } else if (price instanceof String) {
            if (((String) price).startsWith("-")) {
                return "0";
            }
            BigDecimal bigDecimal = new BigDecimal((String) price);
            String s = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            if (s.endsWith(".00")) {
                return castPrice(s.substring(0, s.length() - 3));
            } else {
                return castPrice(s);
            }
        } else {
            return "0";
        }
    }

    /**
     * 将金钱转成千 万 百万结尾
     */
    private static String castPrice(String price) {
        BigDecimal bigDecimal = new BigDecimal(price);
        double v = bigDecimal.doubleValue();
        if (v >= 10000 && v < 100000000) {
            return formatPrice((v / 10000)) + "万";
        } else if (v >= 100000000) {
            return formatPrice((v / 100000000)) + "亿";
        }
        return formatPrice(price);
    }


    /**
     * 银行卡前三后四
     *
     * @param id
     * @return
     */
    public static String idCardt(String id) {
        if (TextUtils.isEmpty(id) || (id.length() < 8)) {
            return id;
        }
        return id.replaceAll("(?<=\\w{4})\\w(?=\\w{4})", "*");
    }

    /**
     * 姓名
     *
     * @param
     * @return
     */
    public static String idName(String input) {

        if (input.length() == 1) {
            return input;
        } else if (input.length() == 2) {
            return input.substring(0, 1) + "*";
        } else if (input.length() == 3) {
            return input.substring(0, 1) + "**";
        } else {
            return input.substring(0, 1) + "**";
        }

    }

    /**
     * 利用正则表达式判断字符串是否是数字
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    public static boolean isValidMoney(String money) {
        Pattern pattern = Pattern.compile("^(([1-9]{1}//d*)|([0]{1}))(//.(//d){0,2})?$"); // 判断小数点后2位的数字的正则表达式
        Matcher match = pattern.matcher(money);
        return match.matches();
    }
}
