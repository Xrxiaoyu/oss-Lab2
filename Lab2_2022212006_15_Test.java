package com.xrxiaoyu.oss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 测试类：Lab2_2022212006_15_Test
 *
 * 本测试类通过等价类划分和边界值分析测试版本号比较功能。
 */
public class Lab2_2022212006_15_Test {

    // 测试目的：验证两个版本号完全不同，且 version1 > version2
    // 测试用例："2.3" 和 "1.9"，应当返回 1
    @Test
    public void testVersion1GreaterThanVersion2_DifferentVersions() {
        Solution solution = new Solution();
        assertEquals(1, solution.compareVersion("2.3", "1.9"));
    }

    // 测试目的：验证版本号中包含多个修订号，且 version1 < version2
    // 测试用例："1.2.3" 和 "1.2.4"，应当返回 -1
    @Test
    public void testVersion1LessThanVersion2_MultipleRevisions() {
        Solution solution = new Solution();
        assertEquals(-1, solution.compareVersion("1.2.3", "1.2.4"));
    }

    // 测试目的：验证一个版本号为全零，另一个有非零修订号
    // 测试用例："0.0.0" 和 "0.0.1"，应当返回 -1
    @Test
    public void testAllZerosVersion() {
        Solution solution = new Solution();
        assertEquals(-1, solution.compareVersion("0.0.0", "0.0.1"));
    }

    // 测试目的：验证修订号包含多个前导零但数值相等的情况
    // 测试用例："1.0002" 和 "1.2"，应当相等
    @Test
    public void testLeadingZerosInDifferentPositions() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1.0002", "1.2"));
    }

    // 测试目的：验证没有修订号的版本号和含有零修订号的版本号
    // 测试用例："1" 和 "1.0"，应当相等
    @Test
    public void testNoRevisionAndZeroRevision() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1", "1.0"));
    }
}
