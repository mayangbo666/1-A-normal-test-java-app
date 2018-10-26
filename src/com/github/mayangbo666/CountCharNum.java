package com.github.mayangbo666;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String srcStrs = scanner.nextLine();

        Map<String, Integer> contentMap = new HashMap<>();

        for (int i = 0; i < srcStrs.length(); i++) {
            String perStr = srcStrs.substring(i, i + 1);
            if (null == contentMap.get(perStr)) {
                contentMap.put(perStr, 1);
            } else {
                Integer j = contentMap.get(perStr);
                contentMap.put(perStr, j + 1);
            }
        }

        for (String keyStr : contentMap.keySet()) {
            System.out.println(keyStr + ":" + contentMap.get(keyStr));
        }

//        for (Map.Entry<String, Integer> entry : contentMap.entrySet()){
//            System.out.println(entry.getKey() + "--->>" + entry.getValue());
//        }
    }
}
