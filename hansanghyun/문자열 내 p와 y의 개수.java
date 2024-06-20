// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

// 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

// 제한사항
// 문자열 s의 길이 : 50 이하의 자연수
// 문자열 s는 알파벳으로만 이루어져 있습니다.

class Solution {
    boolean solution(String s) {

        int cnt1 = 0;
        int cnt2 = 0;
        boolean answer = true;

        if (s.length() <= 50) {

            String str = s.toUpperCase();

            for (int i = 0; i < str.length(); i++) {

                if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {

                    if (str.charAt(i) == 'P') {
                        cnt1++;
                    } else if (str.charAt(i) == 'Y') {
                        cnt2++;
                    }

                    if (cnt1 == cnt2) {
                        answer = true;
                    } else {
                        answer = false;
                    }
                }
            }
        } else {
            System.out.println("조건에 맞게 다시 입력하세요");
        }
        return answer;
    }
}
