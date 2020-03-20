package com.yinhai; // 包路径不可修改!!!

import java.util.*;  //只能使用最高1.8版本JDK提供的API

/**
 * 题目：给定一个字符串（只包含小写英文字母），按顺序执行以下两条规则，输出计算后的字符串。
 * <p>
 * 规则 1：对于连续顺序4位及以上的字母，中间使用“~”替换。
 * 例如：ahhhhhhbcdefko, 替换后为ahhhhhhb~fko。
 * <p>
 * 规则2：对于连续重复出现3个及以上的字母，以该字母+重复的个数替换。
 * 例如：ahhhhhhbcdefko，替换后为ah6bcdefko。
 * <p>
 * 总体示例：
 * 输入字符串为：ahhhhhhbcdefko     结果为：ah6b~fko
 * 输入字符串为：ahhhhhhbcdefko     结果为：ah6b~fko
 * 输入字符串为：ammmmmnopqko       结果为：am5~qko
 * 输入字符串为：abcdefffffadfasdfa 结果为：a~f5adfasdfa
 * 输入字符串为：mnopqqqrstabs      结果为：m~q3~tabs
 * 输入字符串为：xyzabcd 			  结果为：xyza~d
 * <p>
 * 提示：
 * 1. 规则按规则1，规则2顺序执行。先执行1，后执行2。
 * 2. 请注意边界值的考虑，注意连续出现条件匹配的情况。
 * 3. 请注意字符串拼接的性能消耗。
 * 4. 请先花一定时间理清思路在再编写代码。
 * 5. 可以试着把上面总体实例中的例子跑正确后再提交。
 */
public class Template { //类名不可修改!!!
    /**
     * 程序逻辑请在该方法中完成
     * <p>
     * 注意：
     * 1. 方法名、参数个数及类型不可更改，只可修改函数体!!!
     * 2. 提交文件时，保证包路径package com.yinhai.onehour
     *
     * @param inData 参数 验证程序通过该参数传入字符串
     * @return 返回值 验证程序通过该返回值验证程序正确性
     */
    String getRuleOne(String inData) {
        String outData = "";
        char[] inDateCharArr = inData.toCharArray();
        for (int i = 0; i < inDateCharArr.length; i++) {
            int countRuleOne = 0;
            for (int j = i; j < inDateCharArr.length - 1; j++) {
                int distance = inDateCharArr[j + 1] - inDateCharArr[j];
                if (distance == 1) {
                    countRuleOne++;
                } else {
                    break;
                }
            }
            if (countRuleOne >= 4) {
                outData = outData + replaceRuleOne(inData, i, countRuleOne);
            }
            i = i + countRuleOne;
        }
        return outData;
    }
    String replaceRuleOne(String inData, int index, int count) {
        String outData = "";
        char[] inDateCharArr = inData.toCharArray();
        for (int i = 0; i < inDateCharArr.length - 1; i++) {
            if (i == index) {
                outData = outData + inDateCharArr[i] + "~";
                i = i + count + 1;
            }
            if (i >= inDateCharArr.length) {
                break;
            }
            outData = outData + inDateCharArr[i];
        }
        return outData;
    }

    String getRuleTwo(String inData) {
        char[] inDateCharArr = inData.toCharArray();
        for (int i = 0; i < inDateCharArr.length; i++) {
            int countRuleTwo = 1;
            for (int j = i; j < inDateCharArr.length - 1; j++) {
                int distance = inDateCharArr[j + 1] - inDateCharArr[j];
                if (distance == 0) {
                    countRuleTwo++;
                } else {
                    break;
                }
            }
            if (countRuleTwo >= 3) {
                inData = replaceRuletwo(inData, i, countRuleTwo);
                inData = getRuleTwo(inData);
            }
            i = i + countRuleTwo;
        }
        return inData;
    }


    String replaceRuletwo(String inData, int index, int count) {
        String outData = "";
        char[] inDateCharArr = inData.toCharArray();
        for (int i = 0; i <inDateCharArr.length; i++) {
            if (i == index) {
                outData = outData + inDateCharArr[i] + count;
                i = i+count-1;
            }else {
                outData = outData + inDateCharArr[i];
            }
        }
        return outData;
    }

    String replace(String indata) {
        String one = getRuleOne(indata);
        String two = getRuleTwo(one);
        return two;
    }

    /**
     * 可修改，验证自己的答案
     *
     * @param args
     */
    public static void main(String[] args) {
        // 用于自己校验结果
        Template template = new Template();
        long startTime = System.currentTimeMillis();
        String result = template.getRuleTwo("ea~jmmmmmssssssdfaaaadd");
//        String result = template.replace("eabcdefgjmmmmmssssssdfaaaaaaaaa");
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时(毫秒)：" + (endTime - startTime));
    }
}
